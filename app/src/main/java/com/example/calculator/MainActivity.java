package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    private TextView tvResult;
    private double first, second;
    private Boolean isOperationClick;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);

    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_0:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                } else if (isOperationClick) {
                    tvResult.setText("0");
                } else {
                    tvResult.append("0");
                }
                isOperationClick = false;
                break;

            case R.id.btn_9:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                } else if (isOperationClick) {
                    tvResult.setText("9");
                } else {
                    tvResult.append("9");
                }
                isOperationClick = false;
                break;

            case R.id.btn_8:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("8");
                } else if (isOperationClick) {
                    tvResult.setText("8");
                } else {
                    tvResult.append("8");

                }
                isOperationClick = false;
                break;


            case R.id.btn_7:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("7");
                } else if (isOperationClick) {
                    tvResult.setText("7");
                } else {
                    tvResult.append("7");
                }
                isOperationClick = false;
                break;

            case R.id.btn_6:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                } else if (isOperationClick) {
                    tvResult.setText("6");
                } else {
                    tvResult.append("6");
                }
                isOperationClick = false;
                break;

            case R.id.btn_5:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else if (isOperationClick) {
                    tvResult.setText("5");
                } else {
                    tvResult.append("5");
                }
                isOperationClick = false;
                break;

            case R.id.btn_4:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("4");
                } else if (isOperationClick) {
                    tvResult.setText("4");
                } else {
                    tvResult.append("4");
                }
                isOperationClick = false;
                break;


            case R.id.btn_3:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                } else if (isOperationClick) {
                    tvResult.setText("3");
                } else {
                    tvResult.append("3");
                }
                isOperationClick = false;
                break;

            case R.id.btn_1:
                //нажал на единицу
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else if (isOperationClick) {
                    tvResult.setText("1");
                } else {
                    tvResult.append("1");
                }
                isOperationClick = false;
                break;
            case R.id.btn_2:
                //нажал на двойку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else if (isOperationClick) {
                    tvResult.setText("2");
                } else {
                    tvResult.append("2");
                }
                isOperationClick = false;
                break;
            case R.id.btn_tochka:{
                if (!tvResult.getText().toString().contains(".")){
                    tvResult.append(".");
                }
                break;

            }
            case R.id.btn_AC:
                tvResult.setText("0");
                first = 0;
                second = 0;
                break;
        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {

            case R.id.btn_plus:
                first = Double.parseDouble(tvResult.getText().toString());
                isOperationClick = true;
                operation = "+";
                break;
            case R.id.btn_umnojenie:
                first = Double.parseDouble(tvResult.getText().toString());
                isOperationClick = true;
                operation = "*";
                break;
            case R.id.btn_minus:
                first = Double.parseDouble(tvResult.getText().toString());
                isOperationClick = true;
                operation = "-";
                break;
            case R.id.btn_delenie:
                first = Double.parseDouble(tvResult.getText().toString());
                isOperationClick = true;
                operation = "/";
                break;

            case R.id.btn_equal:
                second = Double.parseDouble(tvResult.getText().toString());
                double result = 0;
                switch (operation) {
                    case "+":
                        result = first + second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        result = first / second;
                        break;
                }
                String resulte = String.valueOf(result);
                tvResult.setText(resulte);
                isOperationClick = true;
                break;
        }
    }
}