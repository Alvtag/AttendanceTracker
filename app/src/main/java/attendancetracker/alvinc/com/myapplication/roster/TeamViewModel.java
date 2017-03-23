package attendancetracker.alvinc.com.myapplication.roster;

import android.databinding.DataBindingUtil;

import attendancetracker.alvinc.com.myapplication.model.Team;

/**
 * binding see {@see layout/item_roster_team.xml}
 */

public class TeamViewModel{
    Team team;

    public TeamViewModel(Team team) {
        super();
        this.team = team;
        //TODO: register for team mofification events?
    }

}
