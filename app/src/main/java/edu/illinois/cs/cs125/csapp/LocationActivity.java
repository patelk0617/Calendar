package edu.illinois.cs.cs125.csapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocationActivity extends AppCompatActivity {
    Button goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        goBack = (Button) findViewById(R.id.goBack);

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBack();
            }
        });
    }

    public void openBack() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
