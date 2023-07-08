package com.example.deshaathan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goToActivityTwoOne(View v){
//        Toast.makeText(this, "CONTINUE", Toast.LENGTH_SHORT).show();
        Intent intent1=new Intent(this,MainActivity2.class);
        startActivity(intent1);
    }
}