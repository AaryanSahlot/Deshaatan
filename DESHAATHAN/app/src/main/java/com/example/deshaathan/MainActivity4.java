package com.example.deshaathan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    Button bnbuttonjk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void onClickOnbnbuttonjk(View v6) {

        Intent intent7_4 = new Intent(this, MainActivity7.class);
        startActivity(intent7_4);
    }

}