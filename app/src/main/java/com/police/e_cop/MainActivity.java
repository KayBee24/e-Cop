package com.police.e_cop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Launch();
    }

    public void Launch() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent SignIN = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(SignIN);
                finish();
            }
        }, 2500);

    }
}
