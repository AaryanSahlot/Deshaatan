package com.example.deshaathan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity9 extends AppCompatActivity {
    TextView textView9_name;
    TextView textView9_number;
//    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        textView9_name=findViewById(R.id.textView9_name);
        textView9_number=findViewById(R.id.textView9_number);
//        Intent intent9_7_1=getIntent();
//        Intent intent9_7_2=getIntent();

        String aapka_naam=getIntent().getStringExtra(MainActivity7.AAPKA_NAAM);
        String aapka_nambar=getIntent().getStringExtra(MainActivity7.KITNE_LOG);
        textView9_name.setText(aapka_naam);
        textView9_number.setText(aapka_nambar+" People.");
    }
    public void setTY(View v12){
        Toast.makeText(this, "Thank You.", Toast.LENGTH_SHORT).show();
    }

}