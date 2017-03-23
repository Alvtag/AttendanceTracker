package attendancetracker.alvinc.com.myapplication.model;

import android.support.v7.app.AppCompatActivity;

import java.util.Hashtable;

public class EventAttendee extends AppCompatActivity {
    private Member member;
    private Event event;
    private Hashtable<String, String> attributes;

    public EventAttendee(Member member, Event event) {
        this.member = member;
        this.event = event;
        this.attributes = new Hashtable<>();
    }

    public Member getMember() {
        return member;
    }

    public Event getEvent() {
        return event;
    }

    public Hashtable<String, String> getAttributes() {
        return attributes;
    }
}
