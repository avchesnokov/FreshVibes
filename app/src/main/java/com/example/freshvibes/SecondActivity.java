package com.example.freshvibes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    Button diaryButton;
    Button homeButton;
    Button summaryButton;
    Button trainingButton;
    Button weighLossButton;
    Button WLrunningButton;

    ImageView diaryScreen;
    ImageView mainScreen;
    ImageView summaryScreen;
    ImageView trainingScreen;
    ImageView weighLossScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        diaryButton = findViewById(R.id.diaryButton);
        mainScreen = findViewById(R.id.mainScreen);
        diaryScreen = findViewById(R.id.diaryScreen);
        homeButton = findViewById(R.id.homeButton);
        trainingButton = findViewById(R.id.trainingButton);
        summaryButton = findViewById(R.id.summaryButton);
        summaryScreen = findViewById(R.id.summaryScreen);
        trainingScreen = findViewById(R.id.trainingScreen);
        weighLossButton = findViewById(R.id.weighLossButton);
        weighLossScreen = findViewById(R.id.weighLossScreen);
        WLrunningButton = findViewById(R.id.WLrunningButton);

        //5 main buttons

        diaryButton.setOnClickListener(v -> {
            diaryScreen.setVisibility(View.VISIBLE);
            hideAllGUI();

            mainScreen.setVisibility(View.GONE);
            summaryScreen.setVisibility(View.GONE);
            trainingScreen.setVisibility(View.GONE);
        });

        homeButton.setOnClickListener(v -> {
            mainScreen.setVisibility(View.VISIBLE);
            hideAllGUI();

            diaryScreen.setVisibility(View.GONE);
            summaryScreen.setVisibility(View.GONE);
            trainingScreen.setVisibility(View.GONE);
        });

        summaryButton.setOnClickListener(v -> {
            summaryScreen.setVisibility(View.VISIBLE);
            hideAllGUI();

            diaryScreen.setVisibility(View.GONE);
            mainScreen.setVisibility(View.GONE);
            trainingScreen.setVisibility(View.GONE);
        });

        trainingButton.setOnClickListener(v -> {
            trainingScreen.setVisibility(View.VISIBLE);
            weighLossButton.setVisibility(View.VISIBLE);

            diaryScreen.setVisibility(View.GONE);
            mainScreen.setVisibility(View.GONE);
            summaryScreen.setVisibility(View.GONE);
        });

        weighLossButton.setOnClickListener(v -> {
            hideMainGUI();
            weighLossScreen.setVisibility(View.VISIBLE);
            WLrunningButton.setVisibility(View.VISIBLE);

        });
    }

    public void hideMainGUI(){
        diaryButton.setVisibility(View.GONE);
        homeButton.setVisibility(View.GONE);
        trainingButton.setVisibility(View.GONE);
        summaryButton.setVisibility(View.GONE);
    }

    public void hideAllGUI(){
        weighLossScreen.setVisibility(View.GONE);
        WLrunningButton.setVisibility(View.GONE);
        weighLossButton.setVisibility(View.GONE);
    }
}
