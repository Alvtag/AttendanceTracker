package attendancetracker.alvinc.com.myapplication.roster;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import attendancetracker.alvinc.com.myapplication.Constants;
import attendancetracker.alvinc.com.myapplication.databinding.ItemRosterTeamBinding;
import attendancetracker.alvinc.com.myapplication.model.Team;

/**
 * binding see {@see layout/item_roster_team.xml}
 */

public class TeamViewHolder extends RecyclerView.ViewHolder {

    private ItemRosterTeamBinding rosterTeamBinding;
    private View.OnClickListener teamClickListener;

    public TeamViewHolder(View view) {
        super(view);
        rosterTeamBinding = DataBindingUtil.getBinding(view);

    }

    public void populateHolder(Team team){
        rosterTeamBinding.setTeam(team);

        rosterTeamBinding.teamAvatar.setImageURI(team.getImageUri());
        rosterTeamBinding.teamEdit.setOnClickListener(new TeamClickListener(team));

    }

    private static class TeamClickListener  implements View.OnClickListener{
        Team team;

        public TeamClickListener(Team team) {
            this.team = team;
        }

        @Override
        public void onClick(View view) {
            Context context = view.getContext();
            Intent intent = new Intent(context, TeamDetailsActivity.class);
            intent.putExtra(Constants.EXTRAS_TEAM_ID, team.getId());
            context.startActivity(intent);
        }
    }

}
