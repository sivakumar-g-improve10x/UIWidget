package com.improve10x.uiwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        handleOrder();
    }
    private void handleOrder(){
        Button orderBtn = findViewById(R.id.order_btn);
        orderBtn.setOnClickListener(v -> {
            CheckBox checkBox = findViewById(R.id.checkbox_btn);
            CheckBox checkBox1 = findViewById(R.id.checkbox1_btn);
            CheckBox checkBox2 = findViewById(R.id.checkbox2_btn);
            boolean isPizzaChecked = checkBox.isChecked();
            boolean isCoffeeChecked = checkBox1.isChecked();
            boolean isBurgerChecked = checkBox2.isChecked();
            String orderDetails = placeorder(isPizzaChecked,isCoffeeChecked,isBurgerChecked);
            Toast.makeText(this, orderDetails, Toast.LENGTH_SHORT).show();
        });
    }

    private String placeorder(boolean isPizzaChecked, boolean isCoffeeChecked, boolean isBurgerChecked) {
        int billamout = 0;
        String result = "Selected items";
        if (isPizzaChecked) {
            billamout += 100;
            result += "\n pizza RS.100";
        }
        if (isCoffeeChecked) {
            billamout += 50;
            result += "\n Coffee Rs.50";
        }
        if (isBurgerChecked){
            billamout+=120;
            result+="\n Burger Rs.120";
    }
        result+="\n Total: "+ billamout;
        return result;
    }
}