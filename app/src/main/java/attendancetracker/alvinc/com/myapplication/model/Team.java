package attendancetracker.alvinc.com.myapplication.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.net.Uri;

import java.util.List;

public class Team extends BaseObservable {

    private List<Member> members;
    private Uri imageUri;
    private String name;
    private String id;

    public Team(List<Member> members, Uri imageUri, String name, String id) {
        this.members = members;
        this.imageUri = imageUri;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Bindable
    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    @Bindable
    public Uri getImageUri() {
        return imageUri;
    }

    public void setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "members=" + members +
                ", imageUri='" + imageUri + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
