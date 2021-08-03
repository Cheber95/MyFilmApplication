package ru.chebertests.myfilmapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.chebertests.myfilmapplication.R;
import ru.chebertests.myfilmapplication.view.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}