package com.example.deshaathan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    Button bnbuttonhp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void onClickOnbnbuttonhp(View v8) {

        Intent intent7_6 = new Intent(this, MainActivity7.class);
        startActivity(intent7_6);
    }

}