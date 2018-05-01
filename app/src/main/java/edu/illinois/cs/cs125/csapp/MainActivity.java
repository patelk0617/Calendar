package edu.illinois.cs.cs125.csapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button getCalendar;
    Button getLocal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getCalendar = (Button) findViewById(R.id.getCalendar);
        getLocal = (Button) findViewById(R.id.getLocal);

        getCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalendar();
            }
        });

        getLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLocation();

            }
        });
    }

    public void openCalendar() {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }

    public void openLocation() {
        Intent intent = new Intent(this, LocationActivity.class);
        startActivity(intent);
    }
}
