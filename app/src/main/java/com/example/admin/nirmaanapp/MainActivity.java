package com.example.admin.nirmaanapp;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {

        private static int time = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            new Handler().postDelayed(new Runnable(){
                @Override
               public void run(){
                    Intent homeIntent = new Intent(MainActivity.this, ScrollingActivity.class);
                    startActivity(homeIntent);
                    finish();
                }

            },time);


    }

}
