package com.principal.comedorshalom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.principal.comedorshalom.FragmentosPDV.AllVFragment;
import com.principal.comedorshalom.FragmentosPDV.FragmentPdv2;
import com.principal.comedorshalom.FragmentosPDV.FragmentPdv3;
import com.principal.comedorshalom.FragmentosPDV.FragmentPdv4;
import com.principal.comedorshalom.FragmentosPDV.FragmentPdv5;
import com.principal.comedorshalom.FragmentosPDV.FragmentPdv6;

public class PanDeVidaActivity extends AppCompatActivity {

    AllVFragment allVFragment;
    FragmentPdv2 fragment2;
    FragmentPdv3 fragment3;
    FragmentPdv4 fragment4;
    FragmentPdv5 fragment5;
    FragmentPdv6 fragment6;

    Button btnTodo;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pan_de_vida);

        inicializar();
    }

    public void inicializar() {
        allVFragment = new AllVFragment();
        fragment2 = new FragmentPdv2();
        fragment3 = new FragmentPdv3();
        fragment4 = new FragmentPdv4();
        fragment5 = new FragmentPdv5();
        fragment6 = new FragmentPdv6();

        btnTodo = (Button) findViewById(R.id.btnTodo);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btnTodo.setTextColor(Color.parseColor("#FFFFFF"));
        btnTodo.setBackgroundColor(Color.parseColor("#BF083750"));
        btn2.setBackgroundResource(android.R.drawable.btn_default);
        btn3.setBackgroundResource(android.R.drawable.btn_default);
        btn4.setBackgroundResource(android.R.drawable.btn_default);
        btn5.setBackgroundResource(android.R.drawable.btn_default);
        btn6.setBackgroundResource(android.R.drawable.btn_default);

        getSupportFragmentManager().beginTransaction().add(R.id.frContenedorPDV, allVFragment).commit();
    }

    public void onClick(View v) {
        FragmentTransaction frTransaction = getSupportFragmentManager().beginTransaction();

        switch (v.getId()) {
            case R.id.btn2:
                frTransaction.replace(R.id.frContenedorPDV, fragment2);
                versiculo2();
                break;
            case R.id.btn3:
                frTransaction.replace(R.id.frContenedorPDV, fragment3);
                versiculo3();
                break;
            case R.id.btn4:
                frTransaction.replace(R.id.frContenedorPDV, fragment4);
                versiculo4();
                break;
            case R.id.btn5:
                frTransaction.replace(R.id.frContenedorPDV, fragment5);
                versiculo5();
                break;
            case R.id.btn6:
                frTransaction.replace(R.id.frContenedorPDV, fragment6);
                versiculo6();
                break;
            case R.id.btnTodo:
                frTransaction.replace(R.id.frContenedorPDV, allVFragment);
                todo();
                break;
        }

        frTransaction.commit();
    }

    public void todo () {
        btn5.setBackgroundResource(android.R.drawable.btn_default);
        btn2.setBackgroundResource(android.R.drawable.btn_default);
        btn3.setBackgroundResource(android.R.drawable.btn_default);
        btn4.setBackgroundResource(android.R.drawable.btn_default);
        btn6.setBackgroundResource(android.R.drawable.btn_default);
        btn5.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn6.setTextColor(Color.parseColor("#000000"));
        btnTodo.setTextColor(Color.parseColor("#FFFFFF"));
        btnTodo.setBackgroundColor(Color.parseColor("#BF083750"));
    }

    public void versiculo2() {
        btnTodo.setBackgroundResource(android.R.drawable.btn_default);
        btn3.setBackgroundResource(android.R.drawable.btn_default);
        btn4.setBackgroundResource(android.R.drawable.btn_default);
        btn5.setBackgroundResource(android.R.drawable.btn_default);
        btn6.setBackgroundResource(android.R.drawable.btn_default);
        btnTodo.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn5.setTextColor(Color.parseColor("#000000"));
        btn6.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#FFFFFF"));
        btn2.setBackgroundColor(Color.parseColor("#BF083750"));
    }

    public void versiculo3() {
        btnTodo.setBackgroundResource(android.R.drawable.btn_default);
        btn2.setBackgroundResource(android.R.drawable.btn_default);
        btn4.setBackgroundResource(android.R.drawable.btn_default);
        btn5.setBackgroundResource(android.R.drawable.btn_default);
        btn6.setBackgroundResource(android.R.drawable.btn_default);
        btnTodo.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn5.setTextColor(Color.parseColor("#000000"));
        btn6.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#FFFFFF"));
        btn3.setBackgroundColor(Color.parseColor("#BF083750"));
    }

    public void versiculo4() {
        btnTodo.setBackgroundResource(android.R.drawable.btn_default);
        btn2.setBackgroundResource(android.R.drawable.btn_default);
        btn3.setBackgroundResource(android.R.drawable.btn_default);
        btn5.setBackgroundResource(android.R.drawable.btn_default);
        btn6.setBackgroundResource(android.R.drawable.btn_default);
        btnTodo.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn5.setTextColor(Color.parseColor("#000000"));
        btn6.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#FFFFFF"));
        btn4.setBackgroundColor(Color.parseColor("#BF083750"));
    }

    public void versiculo5() {
        btnTodo.setBackgroundResource(android.R.drawable.btn_default);
        btn2.setBackgroundResource(android.R.drawable.btn_default);
        btn3.setBackgroundResource(android.R.drawable.btn_default);
        btn4.setBackgroundResource(android.R.drawable.btn_default);
        btn6.setBackgroundResource(android.R.drawable.btn_default);
        btnTodo.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn6.setTextColor(Color.parseColor("#000000"));
        btn5.setTextColor(Color.parseColor("#FFFFFF"));
        btn5.setBackgroundColor(Color.parseColor("#BF083750"));
    }

    public void versiculo6() {
        btnTodo.setBackgroundResource(android.R.drawable.btn_default);
        btn2.setBackgroundResource(android.R.drawable.btn_default);
        btn3.setBackgroundResource(android.R.drawable.btn_default);
        btn4.setBackgroundResource(android.R.drawable.btn_default);
        btn5.setBackgroundResource(android.R.drawable.btn_default);
        btnTodo.setTextColor(Color.parseColor("#000000"));
        btn2.setTextColor(Color.parseColor("#000000"));
        btn3.setTextColor(Color.parseColor("#000000"));
        btn4.setTextColor(Color.parseColor("#000000"));
        btn5.setTextColor(Color.parseColor("#000000"));
        btn6.setTextColor(Color.parseColor("#FFFFFF"));
        btn6.setBackgroundColor(Color.parseColor("#BF083750"));
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
