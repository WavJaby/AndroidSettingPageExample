package com.app.settingpage;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        getSupportActionBar().setTitle("Settings");

        if(findViewById(R.id.fragment_container) != null){
            if(savedInstanceState != null)
                return;
            getFragmentManager().beginTransaction().add(R.id.fragment_container,new SettingsFragment()).commit();
        }
    }


}
