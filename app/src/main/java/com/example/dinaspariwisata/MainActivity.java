package com.example.dinaspariwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void NextSlide (View view) {
        startActivity(new Intent(MainActivity.this,RegistryActivity.class));
    }
    public void klikRegistrasi (View view){
        startActivity(new Intent(MainActivity.this,RegistryActivity.class));
    }
    public void klikLupapassword (View view) {
        startActivity(new Intent(MainActivity.this,LupaPasswordPage.class));
    }
}