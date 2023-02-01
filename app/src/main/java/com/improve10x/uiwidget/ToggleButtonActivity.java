package com.improve10x.uiwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
       handleStatus();
    }
    private  void handleStatus(){
        ToggleButton toggleButton = findViewById(R.id.toggle_btn);
        ToggleButton toggleButton1 = findViewById(R.id.toggle1_btn);
        Button submitBtn = findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(v -> {
            String toggle1Status = toggleButton.getText().toString();
            String toggle2Status = toggleButton1.getText().toString();
            String result = getStatus(toggle1Status,toggle2Status);
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });
    }
    private String getStatus (String toggle1Status,String toggle2Status){
        StringBuilder result = new StringBuilder();
        result.append("ToggleButton1 :");
        result.append(toggle1Status);
        result.append("\nToggleButton2 :").append(toggle2Status);
        return String.valueOf(result);
    }

}