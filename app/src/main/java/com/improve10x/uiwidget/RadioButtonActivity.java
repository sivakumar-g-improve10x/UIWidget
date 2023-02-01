package com.improve10x.uiwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        radioButton();
    }

    private void radioButton() {
        Button submitBtn = findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(v -> {
            RadioGroup genderRg = findViewById(R.id.gender_rg);
            int selectedId = genderRg.getCheckedRadioButtonId();
            RadioButton selectedGenderRb = findViewById(selectedId);
            String gender = selectedGenderRb.getText().toString();
            Toast.makeText(this, gender, Toast.LENGTH_SHORT).show();
        });
    }

}

