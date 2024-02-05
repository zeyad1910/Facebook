package com.route.assginment5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = findViewById(R.id.but_login);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this,FbTimelineActivity.class);
            startActivity(intent);
        });
    }
}