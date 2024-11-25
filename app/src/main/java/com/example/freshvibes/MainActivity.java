package com.example.freshvibes;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText emailText;
EditText passwordText;
EditText passwordRegisterText;
EditText emailRegisterText;
EditText passwordRepeatRegisterText;
EditText birthDateText;
EditText nameText;
ImageView loginButton;
ImageView titleScreen;
ImageView loginScreen;
ImageView registerScreen;
Button registerButton;
Button registrationFinishButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        loginScreen = findViewById(R.id.loginScreen);
        registerScreen = findViewById(R.id.registerScreen);
        passwordText = findViewById(R.id.passwordText);
        emailText = findViewById(R.id.emailText);

        registerButton = findViewById(R.id.registerButton);
        passwordRegisterText = findViewById(R.id.passwordRegisterText);
        emailRegisterText = findViewById(R.id.emailRegisterText);
        passwordRepeatRegisterText = findViewById(R.id.passwordRepeatRegisterText);
        birthDateText = findViewById(R.id.birthDateText);
        nameText = findViewById(R.id.nameText);
        registrationFinishButton = findViewById(R.id.registrationFinishButton);


        registerButton.setOnClickListener(v -> {
            registerScreen.setVisibility(View.VISIBLE);
            passwordRegisterText.setVisibility(View.VISIBLE);
            emailRegisterText.setVisibility(View.VISIBLE);
            passwordRepeatRegisterText.setVisibility(View.VISIBLE);
            birthDateText.setVisibility(View.VISIBLE);
            nameText.setVisibility(View.VISIBLE);
            registrationFinishButton.setVisibility(View.VISIBLE);
            loginScreen.setVisibility(View.GONE);
            loginButton.setVisibility(View.GONE);
            emailText.setVisibility(View.GONE);
            passwordText.setVisibility(View.GONE);
        });

        registrationFinishButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        titleScreen = findViewById(R.id.titleScreen);
        fadeOutAndHideImage(titleScreen);

    }
    void gotoUrl(String link){
        try{
            Uri uri = Uri.parse(link);
            startActivity(new Intent(Intent.ACTION_VIEW, uri));
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),"No website found.", Toast.LENGTH_SHORT).show();
        }
    }


    private void fadeOutAndHideImage(final ImageView img)
    {
        Animation wait = new AlphaAnimation(1, 1);
        wait.setDuration(2000);
        wait.setAnimationListener(new Animation.AnimationListener()
        {
            public void onAnimationEnd(Animation animation)
            {
                Animation fadeOut = new AlphaAnimation(1, 0);
                fadeOut.setInterpolator(new AccelerateInterpolator());
                fadeOut.setDuration(200);
                fadeOut.setAnimationListener(new Animation.AnimationListener()
                {
                    public void onAnimationEnd(Animation animation)
                    {
                        img.setVisibility(View.GONE);
                    }
                    public void onAnimationRepeat(Animation animation) {}
                    public void onAnimationStart(Animation animation) {}
                });
                img.startAnimation(fadeOut);
            }
            public void onAnimationRepeat(Animation animation) {}
            public void onAnimationStart(Animation animation) {}
        });
        img.startAnimation(wait);



    }


}