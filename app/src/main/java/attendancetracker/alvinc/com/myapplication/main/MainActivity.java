package attendancetracker.alvinc.com.myapplication.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.lang.ref.WeakReference;

import attendancetracker.alvinc.com.myapplication.R;
import attendancetracker.alvinc.com.myapplication.databinding.ActivityMainBinding;
import attendancetracker.alvinc.com.myapplication.model.Member;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    public MainViewModel mainViewModel;
    TextWatcher editorTextWatcher;

    public TextWatcher getTextWatcher() {
        return editorTextWatcher;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainViewModel = new MainViewModel();
        binding.setView(this);
        binding.setViewModel(mainViewModel);

//        mainViewModel.member.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
//            @Override
//            public void onPropertyChanged(Observable observable, int i) {
//                Log.d("ALVTAG", "onPropertyChanged");
//                switch (i){
//                    case Member.FIELD:
//                        rosterTeamBinding.setUser(mainViewModel.member.get());
//                        return;
//                }
//            }
//        });

        this.editorTextWatcher = new EditorTextWatcher(this);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        ImageButton fab = (ImageButton) findViewById(R.id.fab_add_team);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                Toast.makeText(MainActivity.this, "lol", Toast.LENGTH_SHORT).show();
//                            }
//                        }).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void afterTextChanged(@NonNull final Editable editable) {
        Log.d("ALVTAG", "MainAct - afterTextChanged:"+editable.toString());
        mainViewModel.afterTextChanged(editable.toString());
    }

    public void onButtonClick(View view){
        mainViewModel.onButtonClicked();
    }

    /**
     * private inner class to prevent context leaks
     */
    static class EditorTextWatcher implements TextWatcher {
        WeakReference<MainActivity> mainActivityRef;

        EditorTextWatcher(MainActivity mainActivity) {
            this.mainActivityRef = new WeakReference<>(mainActivity);
        }

        @Override
        public void afterTextChanged(@NonNull final Editable editable) {
            MainActivity mainActivity = mainActivityRef.get();
            if (mainActivity == null) return;
            mainActivity.afterTextChanged(editable);
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }
    }
}
