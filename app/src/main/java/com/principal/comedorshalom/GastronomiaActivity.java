package com.principal.comedorshalom;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GastronomiaActivity extends AppCompatActivity {

    Button btnTodo;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastronomia);

        inicializar();
    }

    public void inicializar() {
        btnTodo = (Button) findViewById(R.id.btnTodo);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btnTodo.setTextColor(Color.parseColor("#FFFFFF"));
        btnTodo.setBackgroundColor(Color.parseColor("#BF083750"));
        btn2.setBackgroundResource(android.R.drawable.btn_default);
        btn3.setBackgroundResource(android.R.drawable.btn_default);
        btn4.setBackgroundResource(android.R.drawable.btn_default);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2:
                versiculo2();
                break;
            case R.id.btn3:
                versiculo3();
                break;
            case R.id.btn4:
                versiculo4();
                break;
            case R.id.btnTodo:
                todo();
                break;
        }
    }

    public void todo () {
        btn2.setBackgroundResource(android.R.drawable.btn_default);
        btn3.setBackgroundResource(android.R.drawable.btn_default);
        btn4.setBackgroundResource(android.R.drawable.btn_default);
        btn2.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btnTodo.setTextColor(Color.parseColor("#FFFFFF"));
        btnTodo.setBackgroundColor(Color.parseColor("#BF083750"));
    }

    public void versiculo2() {
        btnTodo.setBackgroundResource(android.R.drawable.btn_default);
        btn3.setBackgroundResource(android.R.drawable.btn_default);
        btn4.setBackgroundResource(android.R.drawable.btn_default);
        btnTodo.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#FFFFFF"));
        btn2.setBackgroundColor(Color.parseColor("#BF083750"));
    }

    public void versiculo3() {
        btnTodo.setBackgroundResource(android.R.drawable.btn_default);
        btn2.setBackgroundResource(android.R.drawable.btn_default);
        btn4.setBackgroundResource(android.R.drawable.btn_default);
        btnTodo.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#FFFFFF"));
        btn3.setBackgroundColor(Color.parseColor("#BF083750"));
    }

    public void versiculo4() {
        btnTodo.setBackgroundResource(android.R.drawable.btn_default);
        btn2.setBackgroundResource(android.R.drawable.btn_default);
        btn3.setBackgroundResource(android.R.drawable.btn_default);
        btnTodo.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#FFFFFF"));
        btn4.setBackgroundColor(Color.parseColor("#BF083750"));
    }

    public void back(View v) {
        finish();
        overridePendingTransition(R.transition.fade_back_in, R.transition.fade_back_out);
    }

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.transition.fade_back_in, R.transition.fade_back_out);
    }
}
