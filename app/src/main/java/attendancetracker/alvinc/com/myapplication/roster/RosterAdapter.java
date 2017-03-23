package attendancetracker.alvinc.com.myapplication.roster;

import android.support.annotation.IntDef;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import attendancetracker.alvinc.com.myapplication.R;
import attendancetracker.alvinc.com.myapplication.model.Member;
import attendancetracker.alvinc.com.myapplication.model.Team;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Member} and makes a call to the
 * TODO: Replace the implementation with code for your data type.
 */
public class RosterAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @Retention(RetentionPolicy.SOURCE)
    @IntDef({TYPE_TEAM, TYPE_MEMBER})
    private @interface type {
    }

    private static final int TYPE_TEAM = 0;
    private static final int TYPE_MEMBER = 1;

    private List<Team> teams;

    public RosterAdapter(List<Team> items) {
        teams = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType){
            case TYPE_MEMBER:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_roster_member, parent, false);
                return new MemberViewHolder(view);
            case TYPE_TEAM:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_roster_team, parent, false);
                return new TeamViewHolder(view);
            default:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_roster_empty, parent, false);
                return new TeamViewHolder(view);
        }
    }

    @SuppressWarnings("ConstantConditions")
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        int index = position;
        for (Team team : teams) {
            int teamSizeWithHeader = team.getMembers().size() + 1;
            if (index < (teamSizeWithHeader)) {
                if (index == 0) {
                    ((TeamViewHolder) holder).populateHolder(team);
                } else {
                    ((MemberViewHolder) holder).populateHolder(team.getMembers().get(index - 1));
                }
            }
            index -= teamSizeWithHeader;
        }
        throw new ArrayIndexOutOfBoundsException(getOutOfBoundsMessage(position));
    }

    @Override
    public int getItemCount() {
        @SuppressWarnings("unused")
        int size = 0;
        for (Team team : teams) {
            size++;
            size += team.getMembers().size();
        }
        return teams.size();
    }

    @Override
    @type
    public int getItemViewType(int position) {
        int index = position;
        for (Team team : teams) {

            int teamSizeWithHeader = team.getMembers().size() + 1;
            if (index < (teamSizeWithHeader)) {
                if (index == 0) {
                    return TYPE_TEAM;
                } else {
                    return TYPE_MEMBER;
                }
            }
            index -= teamSizeWithHeader;
        }
        throw new ArrayIndexOutOfBoundsException(getOutOfBoundsMessage(position));
    }

    private String getOutOfBoundsMessage(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("out of bounds! position:");
        builder.append(position);
        builder.append("not found for team structure:{");
        for (Team team : teams) {
            builder.append("(");
            builder.append(team.getName());
            builder.append(",");
            builder.append(team.getMembers().size());
            builder.append(")");
            builder.append(",");
        }
        builder.append("}");
        return builder.toString();
    }
}
