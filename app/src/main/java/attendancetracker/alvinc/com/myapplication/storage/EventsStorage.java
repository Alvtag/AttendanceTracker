package attendancetracker.alvinc.com.myapplication.storage;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import attendancetracker.alvinc.com.myapplication.model.Member;

/**
 * holds a local list of events and is responsible for syncing this list with
 * local/ cloud attendancetracker.alvinc.com.myapplication.storage
 */
public class EventsStorage extends AppCompatActivity {
    private Date date;
    private List<Member> memberList;

    public EventsStorage(Date date) {
        this.date = date;
        this.memberList = new ArrayList<>();
    }

    public Date getDate() {
        return date;
    }

    public List<Member> getMemberList() {
        return memberList;
    }
}
