package com.example.thirteenstones.activities;

import static androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY;
import static androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.example.thirteenstones.R;
import com.example.thirteenstones.lib.Utils;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(Build.VERSION.SDK_INT < 28 ? MODE_NIGHT_AUTO_BATTERY :
                        MODE_NIGHT_FOLLOW_SYSTEM);
        PreferenceManager.setDefaultValues(getApplicationContext(), "PREFS",
                MODE_PRIVATE, R.xml.root_preferences, false);
        Utils.setNightModeOnOffFromPreferenceValue(getApplicationContext(), getString(R.string.night_mode_key));

        startActivity (new Intent(getApplicationContext (), MainActivity.class));
        finish();
    }
}