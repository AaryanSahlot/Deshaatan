package com.example.deshaathan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    private Button buttonProceed;
    private Button buttonPay;
    private Button buttonContinue;
    private TextView textViewPay;
    private EditText editTextName;
    public static final String AAPKA_NAAM="kuch bhi likh sakte hai just ek key he to banani hai aur jo iski value hogi vo editTextName k aandar ka naam hoga";

    private EditText editTextAddress;
    private EditText editTextDistrict;
    private EditText editTextState;
    private EditText editTextNumber;
    public static final String KITNE_LOG="number of persons";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        buttonProceed=findViewById(R.id.buttonProceed);
        buttonPay=findViewById(R.id.buttonPay);
        buttonContinue=findViewById(R.id.buttonContinue);
        textViewPay=findViewById(R.id.textViewPay);
        editTextName=findViewById(R.id.editTextName);
        editTextAddress=findViewById(R.id.editTextAddress);
        editTextDistrict=findViewById(R.id.editTextDistrict);
        editTextState=findViewById(R.id.editTextState);
        editTextNumber=findViewById(R.id.editTextNumber);
    }
    public void setButtonProceed(View view){
        String s1=editTextNumber.getText().toString();
        int n1=Integer.parseInt(s1);
        int totalPay=n1*20000;
        textViewPay.setText("₹"+totalPay);
        Toast.makeText(this, "Please Pay the\nReservation Fee", Toast.LENGTH_SHORT).show();
    }
    public void setButtonPay(View v6) {
        Toast.makeText(this, "You Have Successfully Paid\nThe Reservation Fee", Toast.LENGTH_SHORT).show();
        Intent intent8_7= new Intent(this, MainActivity8.class);
        startActivity(intent8_7);
    }
    public void setButtonContinue(View v7){

        String naam=editTextName.getText().toString();
        String nambar=editTextNumber.getText().toString();
        Intent intent9_7_1= new Intent(this, MainActivity9.class);
//        Intent intent9_7_2= new Intent(this, MainActivity9.class);
        Bundle bundle= new Bundle();
//        intent9_7_1.putExtra(AAPKA_NAAM, naam);
//        intent9_7_2.putExtra(KITNE_LOG, nambar);

        bundle.putString(AAPKA_NAAM,naam);
        bundle.putString(KITNE_LOG,nambar);
        intent9_7_1.putExtras(bundle);
        startActivity(intent9_7_1);
//        startActivity(intent9_7_2);
    }
    public void setTCR(View v10){
        Toast.makeText(this, "Terms, Conditions and Requirements", Toast.LENGTH_SHORT).show();
        Intent intent10_9=new Intent(this,MainActivity10.class);
        startActivity(intent10_9);
    }
}