package com.example.cs408lab1b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView titleText;
    private TextView responseText;
    private Button getHelp;

    private String[] helpfulResponses;

    private Random randomNum = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helpfulResponses = getResources().getStringArray(R.array.helpfulResponses);

        titleText = findViewById(R.id.titleText);
        responseText = findViewById(R.id.responseText);
        getHelp = findViewById(R.id.getHelp);

        titleText.setText("Press the button to get help...");
        responseText.setText(" ");
        getHelp.setText("GET HELP");

        findViewById(R.id.getHelp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                responseText.setText(helpfulResponses[randomNum.nextInt(18)]);
            }
        });

    }
}