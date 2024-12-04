package com.example.freshvibes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
    Button trainerChatButton;
    Button chatBackButton;
    Button secondTrainingButton;
    Button secondMenuButton;
    Button menuBackButton;
    Button menuButton;
    Button secondChatButton;

    ImageView diaryScreen;
    ImageView mainScreen;
    ImageView summaryScreen;
    ImageView trainingScreen;
    ImageView weighLossScreen;
    ImageView chatScreen;
    ImageView vitaminsScreen;
    ImageView WLRunningScreen;
    ImageView trainerChat;
    ImageView menuScreen;



    EditText preferenceText;
    EditText preferenceText2;
    EditText cal1;
    EditText cal2;
    EditText cal3;

    Button imtired;

    ImageView introductionScreen;
    ImageView pref1;
    ImageView pref2;
    ImageView pref3;
    ImageView pref4;

    ImageView introductionTrainingScreen;

    boolean a = true;
    boolean a2 = true;
    boolean a3 = true;
    boolean a4 = true;

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
        trainerChat = findViewById(R.id.trainerChat);
        trainerChatButton = findViewById(R.id.trainerChatButton);
        chatBackButton = findViewById(R.id.chatBackButton);
        secondTrainingButton = findViewById(R.id.secondTrainingButton);
        menuScreen = findViewById(R.id.menuScreen);
        secondMenuButton = findViewById(R.id.secondMenuButton);
        menuBackButton = findViewById(R.id.menuBackButton);
        menuButton = findViewById(R.id.menuButton);
        secondChatButton = findViewById(R.id.secondChatButton);


        preferenceText = findViewById(R.id.preferenceText);
        preferenceText2 = findViewById(R.id.preferenceText2);
        cal1 = findViewById(R.id.cal1);
        cal2 = findViewById(R.id.cal2);
        cal3 = findViewById(R.id.cal3);

        imtired = findViewById(R.id.imtired);

        introductionScreen = findViewById(R.id.introductionScreen);
        pref1 = findViewById(R.id.pref1);
        pref2 = findViewById(R.id.pref2);
        pref3 = findViewById(R.id.pref3);
        pref4 = findViewById(R.id.pref4);
        introductionTrainingScreen = findViewById(R.id.introductionTrainingScreen);


        //5 main buttons

        diaryButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            diaryScreen.setVisibility(View.VISIBLE);
            menuButton.setVisibility(View.VISIBLE);

            mainScreen.setVisibility(View.GONE);
            summaryScreen.setVisibility(View.GONE);
            trainingScreen.setVisibility(View.GONE);
            chatScreen.setVisibility(View.GONE);
        });

        homeButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            mainScreen.setVisibility(View.VISIBLE);
            vitaminsButton.setVisibility(View.VISIBLE);
            secondTrainingButton.setVisibility(View.VISIBLE);
            secondMenuButton.setVisibility(View.VISIBLE);
            secondChatButton.setVisibility(View.VISIBLE);


            diaryScreen.setVisibility(View.GONE);
            summaryScreen.setVisibility(View.GONE);
            trainingScreen.setVisibility(View.GONE);
            chatScreen.setVisibility(View.GONE);
        });

        summaryButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            summaryScreen.setVisibility(View.VISIBLE);

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
            hideSecondaryGUI();
            chatScreen.setVisibility(View.VISIBLE);
            trainerChatButton.setVisibility(View.VISIBLE);

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
            hideMainGUI();
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
            hideMainGUI();
            vitaminsScreen.setVisibility(View.VISIBLE);
            vitaminsBackButton.setVisibility(View.VISIBLE);
        });

        vitaminsBackButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            showMainGUI();
            vitaminsButton.setVisibility(View.VISIBLE);
            mainScreen.setVisibility(View.VISIBLE);
            secondTrainingButton.setVisibility(View.VISIBLE);
            secondMenuButton.setVisibility(View.VISIBLE);
        });

        trainerChatButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            hideMainGUI();
            trainerChat.setVisibility(View.VISIBLE);
            chatBackButton.setVisibility(View.VISIBLE);

        });

        chatBackButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            showMainGUI();
            chatScreen.setVisibility(View.VISIBLE);
            trainerChatButton.setVisibility(View.VISIBLE);
        });

        secondTrainingButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            trainingScreen.setVisibility(View.VISIBLE);
            weighLossButton.setVisibility(View.VISIBLE);

            diaryScreen.setVisibility(View.GONE);
            mainScreen.setVisibility(View.GONE);
            summaryScreen.setVisibility(View.GONE);
            chatScreen.setVisibility(View.GONE);
        });

        secondMenuButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            hideMainGUI();
            menuScreen.setVisibility(View.VISIBLE);
            menuBackButton.setVisibility(View.VISIBLE);
        });

        menuBackButton.setOnClickListener(v -> {
            showMainGUI();
            hideSecondaryGUI();
            diaryScreen.setVisibility(View.VISIBLE);
            menuButton.setVisibility(View.VISIBLE);

            mainScreen.setVisibility(View.GONE);
            summaryScreen.setVisibility(View.GONE);
            trainingScreen.setVisibility(View.GONE);
            chatScreen.setVisibility(View.GONE);
        });

        menuButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            hideMainGUI();
            menuScreen.setVisibility(View.VISIBLE);
            menuBackButton.setVisibility(View.VISIBLE);
        });

        secondChatButton.setOnClickListener(v -> {
            hideSecondaryGUI();
            chatScreen.setVisibility(View.VISIBLE);
            trainerChatButton.setVisibility(View.VISIBLE);

            diaryScreen.setVisibility(View.GONE);
            mainScreen.setVisibility(View.GONE);
            summaryScreen.setVisibility(View.GONE);
            trainingScreen.setVisibility(View.GONE);
        });


        imtired.setOnClickListener(v -> {
            preferenceText.setVisibility(View.GONE);
            preferenceText2.setVisibility(View.GONE);
            cal1.setVisibility(View.GONE);
            cal2.setVisibility(View.GONE);
            cal3.setVisibility(View.GONE);
            imtired.setVisibility(View.GONE);
            introductionScreen.setVisibility(View.GONE);
            pref1.setVisibility(View.GONE);
            pref2.setVisibility(View.GONE);
            pref3.setVisibility(View.GONE);
            pref4.setVisibility(View.GONE);
            introductionTrainingScreen.setVisibility(View.GONE);


            showMainGUI();
            mainScreen.setVisibility(View.VISIBLE);
            vitaminsButton.setVisibility(View.VISIBLE);
            secondTrainingButton.setVisibility(View.VISIBLE);
            secondMenuButton.setVisibility(View.VISIBLE);
            secondChatButton.setVisibility(View.VISIBLE);

        });

        pref1.setOnClickListener(v -> {
            if (a) {
                pref1.setImageResource(R.drawable.buttonon);
            } else {
                pref1.setImageResource(R.drawable.buttonoff);
            }
            a = !a;
        });

        pref2.setOnClickListener(v -> {
            if (a2) {
                pref2.setImageResource(R.drawable.buttonon);
            } else {
                pref2.setImageResource(R.drawable.buttonoff);
            }
            a2 = !a2;
        });

        pref3.setOnClickListener(v -> {
            if (a3) {
                pref3.setImageResource(R.drawable.buttonon);
            } else {
                pref3.setImageResource(R.drawable.buttonoff);
            }
            a3 = !a3;
        });

        pref4.setOnClickListener(v -> {
            if (a4) {
                pref4.setImageResource(R.drawable.buttonon);
            } else {
                pref4.setImageResource(R.drawable.buttonoff);
            }
            a4 = !a4;
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
        trainerChatButton.setVisibility(View.GONE);
        trainerChat.setVisibility(View.GONE);
        chatBackButton.setVisibility(View.GONE);
        secondTrainingButton.setVisibility(View.GONE);
        secondMenuButton.setVisibility(View.GONE);
        menuBackButton.setVisibility(View.GONE);
        menuScreen.setVisibility(View.GONE);
        menuButton.setVisibility(View.GONE);
        secondChatButton.setVisibility(View.GONE);
    }


}
