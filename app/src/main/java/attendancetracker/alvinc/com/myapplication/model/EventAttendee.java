package attendancetracker.alvinc.com.myapplication.model;

import android.support.v7.app.AppCompatActivity;

import java.util.Dictionary;
import java.util.Hashtable;

public class EventAttendee extends AppCompatActivity {
    private Attendee attendee;
    private Event event;
    private Hashtable<String, String> attributes;

    public EventAttendee(Attendee attendee, Event event) {
        this.attendee = attendee;
        this.event = event;
        this.attributes = new Hashtable<>();
    }

    public Attendee getAttendee() {
        return attendee;
    }

    public Event getEvent() {
        return event;
    }

    public Hashtable<String, String> getAttributes() {
        return attributes;
    }
}
