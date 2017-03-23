package attendancetracker.alvinc.com.myapplication.eventslist;

import java.util.List;

import attendancetracker.alvinc.com.myapplication.model.Event;
import attendancetracker.alvinc.com.myapplication.model.Member;

/**
 * binding see {@see layout/item_roster_team.xml}
 */

public class EventsViewModel {
    Event event;
    List<Member> attendees;

    public EventsViewModel(Event event, List<Member> members) {
        super();
        this.event = event;
        this.attendees = members;
    }

}
