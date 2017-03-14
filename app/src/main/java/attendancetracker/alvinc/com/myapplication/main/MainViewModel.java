package attendancetracker.alvinc.com.myapplication.main;

import android.support.annotation.NonNull;

import attendancetracker.alvinc.com.myapplication.model.Attendee;

public class MainViewModel {
    final Attendee attendee; // final for observables

    public Attendee getAttendee() {
        return attendee;
    }

    public MainViewModel() {
        this.attendee = new Attendee("initValue", "id", "email", "phone", "sixer");
    }

    public void afterTextChanged(@NonNull final String string) {
        attendee.setName(string);
    }
}
