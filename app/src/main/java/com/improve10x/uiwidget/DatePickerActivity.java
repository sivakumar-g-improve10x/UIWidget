package com.improve10x.uiwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends AppCompatActivity {
    DatePicker pickerDp;
    TextView dateTxt;
    Button changeDateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        pickerDp = findViewById(R.id.date_picker);
        dateTxt = findViewById(R.id.current_txt);
        changeDateBtn = findViewById(R.id.change_btn);
        showCurrentDate();
        handleChangeDateBtn();
    }

    private void handleChangeDateBtn() {
        changeDateBtn.setOnClickListener(v -> {
            String selectedDate = getSelectedDate();
            dateTxt.setText("Change Date :" + selectedDate);
        });
    }

    private void showCurrentDate() {
        String selectedDate = getSelectedDate();
        dateTxt.setText("Current Date:" + selectedDate);
    }

    public String getSelectedDate() {
        int day = pickerDp.getDayOfMonth();
        int month = pickerDp.getMonth() + 1;
        int year = pickerDp.getYear();
        String selectedDate = createDate(day, month, year);
        return selectedDate;
    }

    public String createDate(int date, int month, int year) {
        return date + "/" + month + "/" + year;
    }
}