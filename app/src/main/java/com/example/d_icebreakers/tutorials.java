package com.example.d_icebreakers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tutorials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);
    }

    public void on_button_click (View view) {

        Intent Abass = new Intent (this, MainActivity.class);
        startActivity(Abass);
    }
}
