package com.example.deshaathan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button bnbuttonuk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void onClickOnbnbuttonuk(View v5) {

        Intent intent7_3 = new Intent(this, MainActivity7.class);
        startActivity(intent7_3);
    }

}