package edu.illinois.cs.cs125.csapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KalendarActivity extends AppCompatActivity {
    Button normalMode;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalendar);

        normalMode = (Button) findViewById(R.id.normalMode);
        normalMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNormal();
            }
        });

        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBack();
            }
        });


    }

    public void openNormal() {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }

    public void openBack() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
