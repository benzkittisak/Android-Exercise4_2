/*
* 6206021621082
* กิตติศักดิ์ ปานเหลือ
* */

package com.bbgun.exercise4_2s6206021621082;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView countText;
    Button btnCountDown, btnReset, btnCountUp;

    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countText = (TextView) findViewById(R.id.countText);
        btnCountUp = (Button) findViewById(R.id.btnCountUp);
        btnCountDown = (Button) findViewById(R.id.btnCountDown);
        btnReset = (Button) findViewById(R.id.btnReset);

        btnCountUp.setOnClickListener(this);
        btnCountDown.setOnClickListener(this);
        btnReset.setOnClickListener(this);

    }

    public void modFive() {
        if (count > 0 || count < 0) {
            if (count % 5 == 0) {
                Toast.makeText(this, "ตัวเลข " + count + " หาร 5 ลงตัว", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnCountUp) {
            count += 1;
            countText.setText(Integer.toString(count));
            modFive();
        } else if (view.getId() == R.id.btnCountDown) {
            count -= 1;
            countText.setText(Integer.toString(count));
            modFive();
        } else if (view.getId() == R.id.btnReset) {
            count = 0;
            countText.setText(Integer.toString(count));
        }
    }


}