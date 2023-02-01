package com.improve10x.uiwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        handleButton();
    }
    private void handleButton(){
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(v -> {
            EditText number1Txt = findViewById(R.id.numberone_txt);
            EditText number2Txt = findViewById(R.id.numbertwo_txt);
            String number1 = number1Txt.getText().toString();
            String number2 = number2Txt.getText().toString();
            String result = add(number1,number2);
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });
    }

    private String add(String number1, String number2) {
        int numberOne = Integer.parseInt(number1);
        int numberTwo = Integer.parseInt(number2);
        int sum = numberOne + numberTwo;
        return String.valueOf(sum);
    }
}
