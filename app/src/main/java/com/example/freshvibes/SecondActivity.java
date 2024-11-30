package com.example.freshvibes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button diaryButton;
    Button homeButton;
    Button summaryButton;
    Button trainingButton;
    Button weighLossButton;
    Button WLrunningButton;
    Button vitaminsButton;
    Button chatButton;
    Button trainingBackButton;
    Button WLtrainingBackButton;
    Button vitaminsBackButton;

    ImageView diaryScreen;
    ImageView mainScreen;
    ImageView summaryScreen;
    ImageView trainingScreen;
    ImageView weighLossScreen;
    ImageView chatScreen;
    ImageView vitaminsScreen;
    ImageView WLRunningScreen;

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
        chatButton = findViewById(R.id.chatButton);
        WLtrainingBackButton = findViewById(R.id.WLtrainingBackButton);
        summaryScreen = findViewById(R.id.summaryScreen);
        trainingScreen = findViewById(R.id.trainingScreen);
        chatScreen = findViewById(R.id.chatScreen);
        weighLossButton = findViewById(R.id.weighLossButton);
        weighLossScreen = findViewById(R.id.weighLossScreen);
        WLrunningButton = findViewById(R.id.WLrunningButton);
        vitaminsButton = findViewById(R.id.vitaminsButton);
        vitaminsScreen = findViewById(R.id.vitaminsScreen);
        WLRunningScreen = findViewById(R.id.WLrunningScreen);
        trainingBackButton = findViewById(R.id.trainingBackButton);
        vitaminsBackButton = findViewById(R.id.vitaminsBackButton);


        //5 main buttons

        diaryButton.setOnClickListener(v -> {
            diaryScreen.setVisibility(View.VISIBLE);
            hideSecondaryGUI();

            mainScreen.setVisibility(View.GONE);
            summaryScreen.setVisibility(View.GONE);
            trainingScreen.setVisibility(View.GONE);
            chatScreen.setVisibility(View.GONE);
        });

        homeButton.setOnClickListener(v -> {
            mainScreen.setVisibility(View.VISIBLE);
            hideSecondaryGUI();
            vitaminsButton.setVisibility(View.VISIBLE);


            diaryScreen.setVisibility(View.GONE);
            summaryScreen.setVisibility(View.GONE);
            trainingScreen.setVisibility(View.GONE);
            chatScreen.setVisibility(View.GONE);
        });

        summaryButton.setOnClickListener(v -> {
            summaryScreen.setVisibility(View.VISIBLE);
            hideSecondaryGUI();

            diaryScreen.setVisibility(View.GONE);
            mainScreen.setVisibility(View.GONE);
            trainingScreen.setVisibility(View.GONE);
            chatScreen.setVisibility(View.GONE);
        });

        trainingButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            trainingScreen.setVisibility(View.VISIBLE);
            weighLossButton.setVisibility(View.VISIBLE);

            diaryScreen.setVisibility(View.GONE);
            mainScreen.setVisibility(View.GONE);
            summaryScreen.setVisibility(View.GONE);
            chatScreen.setVisibility(View.GONE);
        });

        chatButton.setOnClickListener(v ->{
            chatScreen.setVisibility(View.VISIBLE);

            diaryScreen.setVisibility(View.GONE);
            mainScreen.setVisibility(View.GONE);
            summaryScreen.setVisibility(View.GONE);
            trainingScreen.setVisibility(View.GONE);
        });

        //extra buttons on each page
        weighLossButton.setOnClickListener(v -> {
            hideMainGUI();
            hideSecondaryGUI();
            weighLossScreen.setVisibility(View.VISIBLE);
            WLrunningButton.setVisibility(View.VISIBLE);
            trainingBackButton.setVisibility(View.VISIBLE);

        });

        WLrunningButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            WLRunningScreen.setVisibility(View.VISIBLE);
            WLtrainingBackButton.setVisibility(View.VISIBLE);
        });

        WLtrainingBackButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            weighLossScreen.setVisibility(View.VISIBLE);
            WLrunningButton.setVisibility(View.VISIBLE);
            trainingBackButton.setVisibility(View.VISIBLE);
        });

        trainingBackButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            showMainGUI();
            trainingScreen.setVisibility(View.VISIBLE);
            weighLossButton.setVisibility(View.VISIBLE);
        });

        vitaminsButton.setOnClickListener(V -> {
            hideSecondaryGUI();
            vitaminsScreen.setVisibility(View.VISIBLE);
            vitaminsBackButton.setVisibility(View.VISIBLE);
        });

        vitaminsBackButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            showMainGUI();
            vitaminsButton.setVisibility(View.VISIBLE);
            mainScreen.setVisibility(View.VISIBLE);
        });
    }


    public void hideMainGUI(){
        diaryButton.setVisibility(View.GONE);
        homeButton.setVisibility(View.GONE);
        trainingButton.setVisibility(View.GONE);
        summaryButton.setVisibility(View.GONE);
        chatButton.setVisibility(View.GONE);

    }

    public void showMainGUI(){
        diaryButton.setVisibility(View.VISIBLE);
        homeButton.setVisibility(View.VISIBLE);
        trainingButton.setVisibility(View.VISIBLE);
        summaryButton.setVisibility(View.VISIBLE);
        chatButton.setVisibility(View.VISIBLE);
    }

    public void hideSecondaryGUI(){
        weighLossScreen.setVisibility(View.GONE);
        WLrunningButton.setVisibility(View.GONE);
        weighLossButton.setVisibility(View.GONE);
        vitaminsButton.setVisibility(View.GONE);
        vitaminsScreen.setVisibility(View.GONE);
        WLRunningScreen.setVisibility(View.GONE);
        WLtrainingBackButton.setVisibility(View.GONE);
        trainingBackButton.setVisibility(View.GONE);
        vitaminsBackButton.setVisibility(View.GONE);
    }


}
