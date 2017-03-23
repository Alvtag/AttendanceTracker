package attendancetracker.alvinc.com.myapplication.model;

import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event extends AppCompatActivity {
    private static final String ATTRIBUTE_TYPE_STRING = "string";
    private static final String ATTRIBUTE_TYPE_INTEGER = "integer";
    private static final String ATTRIBUTE_TYPE_BOOLEAN= "boolean";

    private Date date;
    private List<Member> memberList;
    private List<Pair<String, String>> attributesList;

    public Event(Date date) {
        this.date = date;
        this.memberList = new ArrayList<>();
        this.attributesList = new ArrayList<>();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public List<Pair<String, String>> getAttributesList() {
        return attributesList;
    }

    public void setAttributesList(List<Pair<String, String>> attributesList) {
        this.attributesList = attributesList;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date=" + date +
                ", memberList=" + memberList +
                ", attributesList=" + attributesList +
                '}';
    }
}
