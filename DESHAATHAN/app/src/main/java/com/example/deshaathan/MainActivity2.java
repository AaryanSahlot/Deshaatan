package com.example.deshaathan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button ukbutton;
    Button jkbutton;
    Button upbutton;
    Button hpbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onClickOnUKButton(View v1){
        Toast.makeText(this, "UttaraKhand", Toast.LENGTH_SHORT).show();
        Intent intent3_2=new Intent(this,MainActivity3.class);
        startActivity(intent3_2);
    }
    public void onClickOnJKButton(View v2){
        Toast.makeText(this, "Jammu and Kashmir", Toast.LENGTH_SHORT).show();
        Intent intent4_2=new Intent(this,MainActivity4.class);
        startActivity(intent4_2);
    }
    public void onClickOnUPButton(View v3){
        Toast.makeText(this, "Uttar Pradesh", Toast.LENGTH_SHORT).show();
        Intent intent5_2=new Intent(this,MainActivity5.class);
        startActivity(intent5_2);
    }
    public void onClickOnHPButton(View v4){
        Toast.makeText(this, "Himachal Pradesh", Toast.LENGTH_SHORT).show();
        Intent intent6_2=new Intent(this,MainActivity6.class);
        startActivity(intent6_2);
    }
}