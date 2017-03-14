package attendancetracker.alvinc.com.myapplication.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import attendancetracker.alvinc.com.myapplication.BR;

public class Attendee extends BaseObservable  {

    private String name, id, email, phone, label;

    @Bindable
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Attendee(String name, String id, String email, String phone, String label) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.label = label;
    }

    @Override
    public String toString() {
        return "attendee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
