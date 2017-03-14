package attendancetracker.alvinc.com.myapplication.model;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event extends AppCompatActivity {
    private Date date;
    private List<Attendee> attendeeList;

    public Event(Date date) {
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
