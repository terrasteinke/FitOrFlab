package com.ubiquitousapps.fitorflab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseTitle = (TextView)findViewById(R.id.exerciseTitle);
        ImageView exerciseImage = (ImageView)findViewById(R.id.exerciseImage);
    }
}
