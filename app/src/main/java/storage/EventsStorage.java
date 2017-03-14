package storage;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import attendancetracker.alvinc.com.myapplication.model.Attendee;

/**
 * holds a local list of events and is responsible for syncing this list with
 * local/ cloud storage
 */
public class EventsStorage extends AppCompatActivity {
    private Date date;
    private List<Attendee> attendeeList;

    public EventsStorage(Date date) {
        this.date = date;
        this.attendeeList = new ArrayList<>();
    }

    public Date getDate() {
        return date;
    }

    public List<Attendee> getAttendeeList() {
        return attendeeList;
    }
}
