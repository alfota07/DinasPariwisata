package com.example.dinaspariwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {
    Thread timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        timer =  new Thread(){
            @Override
            public void run(){
                try {
                    synchronized (this){
                        wait(4500);
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
    @Override
    protected  void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Hello!!", Toast.LENGTH_SHORT).show();

    }
}