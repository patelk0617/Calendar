package edu.illinois.cs.cs125.csapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarActivity extends AppCompatActivity {

    Button back;
    Button kaleMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBack();
            }
        });

        kaleMode = (Button) findViewById(R.id.kaleMode);
        kaleMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKale();
            }
        });
    }

    public void openKale() {
        Intent intent = new Intent(this, KalendarActivity.class);
        startActivity(intent);
    }

    public void openBack() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
