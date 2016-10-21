package com.ubiquitousapps.fitorflab;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class detailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseText = (TextView)findViewById(R.id.exerciseTitle);
        ImageView exerciseImage = (ImageView)findViewById(R.id.exerciseImage);
        LinearLayout mainBG = (LinearLayout)findViewById(R.id.mainBg);
        Button settingsBtn = (Button)findViewById(R.id.settingsBtn);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        exerciseText.setText(exerciseTitle);

        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));
        } else {
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#52AD56"));
        }

        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadSettingsActivity();
            }
        });

    }

    private void loadSettingsActivity() {
        Intent intent = new Intent(detailsActivity.this, settingsActivity.class);
        startActivity(intent);

    }
};
