package attendancetracker.alvinc.com.myapplication.main;

import android.support.annotation.NonNull;

import attendancetracker.alvinc.com.myapplication.model.Member;

public class MainViewModel {
    final Member member; // final for observables

    MainViewModel() {
        this.member = new Member("initValue", "id", "email", "phone", "sixer");
    }

    public Member getMember() {
        return member;
    }

    void afterTextChanged(@NonNull final String string) {
        member.setName(string);
    }

    void onButtonClicked() {
        member.setName("");
    }
}