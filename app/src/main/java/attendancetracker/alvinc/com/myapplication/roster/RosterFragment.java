package attendancetracker.alvinc.com.myapplication.roster;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import attendancetracker.alvinc.com.myapplication.R;
import attendancetracker.alvinc.com.myapplication.Utils;
import attendancetracker.alvinc.com.myapplication.databinding.FragmentRosterBinding;
import attendancetracker.alvinc.com.myapplication.model.Member;
import attendancetracker.alvinc.com.myapplication.model.Team;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link
 * interface.
 */
public class RosterFragment extends Fragment {

    FragmentRosterBinding fragmentRosterBinding;
    // TODO: Customize parame

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_roster, container, false);

        fragmentRosterBinding = DataBindingUtil.getBinding(view);

        RecyclerView recyclerView = fragmentRosterBinding.list;

        //fake data
        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Member> redMembers = new ArrayList<>();
        ArrayList<Member> greenMembers = new ArrayList<>();
        Team redTeam = new Team(redMembers,
                Uri.parse("http://icons.iconarchive.com/icons/hopstarter/scrap/256/Aqua-Ball-Red-icon.png"),
                "red six", Utils.nextId());
        Team blueTeam = new Team(redMembers,
                Uri.parse("https://2.bp.blogspot.com/-ac4aPDKGGaQ/UioKNymEX-I/AAAAAAAAAJs/25LBEktMEVg/s1600/green.png"),
                "red six", Utils.nextId());
        redMembers.add(new Member("Bob Wong", Utils.nextId(), "bob@a.com","1234567" ,"cub"));
        redMembers.add(new Member("Alice Smith", Utils.nextId(), "ali@sm.com","2345678" ,"sixer"));
        redMembers.add(new Member("Eva Singh", Utils.nextId(), "eva@s.com","345678" ,"second"));
        greenMembers.add(new Member("Charlie Wong", Utils.nextId(), "charlieee@a.com","456789" ,"second"));
        greenMembers.add(new Member("Allison Smith", Utils.nextId(), "asszn@a.com","5678" ,"sixer"));
        greenMembers.add(new Member("David Modi", Utils.nextId(), "dmdi@a.com","6789" ,"cub"));

        recyclerView.setAdapter(new RosterAdapter(teams));

        return view;
    }

}
