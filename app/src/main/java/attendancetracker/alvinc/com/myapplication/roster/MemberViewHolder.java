package attendancetracker.alvinc.com.myapplication.roster;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import attendancetracker.alvinc.com.myapplication.Constants;
import attendancetracker.alvinc.com.myapplication.databinding.ItemRosterMemberBinding;
import attendancetracker.alvinc.com.myapplication.databinding.ItemRosterTeamBinding;
import attendancetracker.alvinc.com.myapplication.model.Member;
import attendancetracker.alvinc.com.myapplication.model.Team;

/**
 * binding see {@see layout/item_roster_member.xml}
 */

public class MemberViewHolder extends RecyclerView.ViewHolder {

    private ItemRosterMemberBinding memberBinding;

    public MemberViewHolder(View view) {
        super(view);
        memberBinding = DataBindingUtil.getBinding(view);

    }

    public void populateHolder(Member member){
        memberBinding.setMember(member);
    }

    private static class MemberClickListener implements View.OnClickListener{
        Member member;

        public MemberClickListener(Member member) {
            this.member = member;
        }

        @Override
        public void onClick(View view) {
            Context context = view.getContext();
            Intent intent = new Intent(context, MemberDetailsActivity.class);
            intent.putExtra(Constants.EXTRAS_TEAM_ID, member.getId());
            context.startActivity(intent);
        }
    }

}
