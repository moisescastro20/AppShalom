package com.principal.comedorshalom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.principal.comedorshalom.FragmentsSN.AllFragment;
import com.principal.comedorshalom.FragmentsSN.FragmentMision;
import com.principal.comedorshalom.FragmentsSN.FragmentVision;
import com.principal.comedorshalom.FragmentsSN.FragmentContactos;
import com.principal.comedorshalom.FragmentsSN.FragmentHorario;

public class SobreNosotrosActivity extends AppCompatActivity {

    AllFragment allFragment;
    FragmentMision fragmentMision;
    FragmentVision fragmentVision;
    FragmentContactos fragmentContactos;
    FragmentHorario fragmentHorario;

    Button btnTodo;
    Button btnMision;
    Button btnVision;
    Button btnContactos;
    Button btnHorario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_nosotros);

        inicializar();
    }

    public void inicializar() {
        allFragment = new AllFragment();
        fragmentMision = new FragmentMision();
        fragmentVision = new FragmentVision();
        fragmentContactos = new FragmentContactos();
        fragmentHorario = new FragmentHorario();

        btnTodo = (Button) findViewById(R.id.btnTodo);
        btnMision = (Button) findViewById(R.id.btnMision);
        btnVision = (Button) findViewById(R.id.btnVision);
        btnContactos = (Button) findViewById(R.id.btnContactos);
        btnHorario = (Button) findViewById(R.id.btnHorario);
        btnTodo.setTextColor(Color.parseColor("#FFFFFF"));
        btnTodo.setBackgroundColor(Color.parseColor("#BF083750"));
        btnMision.setBackgroundResource(android.R.drawable.btn_default);
        btnVision.setBackgroundResource(android.R.drawable.btn_default);
        btnContactos.setBackgroundResource(android.R.drawable.btn_default);
        btnHorario.setBackgroundResource(android.R.drawable.btn_default);

        getSupportFragmentManager().beginTransaction().add(R.id.frContenedorSN, allFragment).commit();
    }

    public void onClick(View v) {
        FragmentTransaction frTransaction = getSupportFragmentManager().beginTransaction();

        switch (v.getId()) {
            case R.id.btnMision:
                frTransaction.replace(R.id.frContenedorSN, fragmentMision);
                mision();
                break;
            case R.id.btnVision:
                frTransaction.replace(R.id.frContenedorSN, fragmentVision);
                vision();
                break;
            case R.id.btnContactos:
                frTransaction.replace(R.id.frContenedorSN, fragmentContactos);
                contactos();
                break;
            case R.id.btnHorario:
                frTransaction.replace(R.id.frContenedorSN, fragmentHorario);
                horario();
                break;
            case R.id.btnTodo:
                frTransaction.replace(R.id.frContenedorSN, allFragment);
                todo();
                break;
        }

        frTransaction.commit();
    }

    public void mision() {
        btnTodo.setBackgroundResource(android.R.drawable.btn_default);
        btnVision.setBackgroundResource(android.R.drawable.btn_default);
        btnContactos.setBackgroundResource(android.R.drawable.btn_default);
        btnHorario.setBackgroundResource(android.R.drawable.btn_default);
        btnTodo.setTextColor(Color.parseColor("#000000"));
        btnVision.setTextColor(Color.parseColor("#000000"));
        btnContactos.setTextColor(Color.parseColor("#000000"));
        btnHorario.setTextColor(Color.parseColor("#000000"));
        btnMision.setTextColor(Color.parseColor("#FFFFFF"));
        btnMision.setBackgroundColor(Color.parseColor("#BF083750"));
    }

    public void vision() {
        btnTodo.setBackgroundResource(android.R.drawable.btn_default);
        btnMision.setBackgroundResource(android.R.drawable.btn_default);
        btnContactos.setBackgroundResource(android.R.drawable.btn_default);
        btnHorario.setBackgroundResource(android.R.drawable.btn_default);
        btnTodo.setTextColor(Color.parseColor("#000000"));
        btnMision.setTextColor(Color.parseColor("#000000"));
        btnContactos.setTextColor(Color.parseColor("#000000"));
        btnHorario.setTextColor(Color.parseColor("#000000"));
        btnVision.setTextColor(Color.parseColor("#FFFFFF"));
        btnVision.setBackgroundColor(Color.parseColor("#BF083750"));
    }

    public void contactos() {
        btnTodo.setBackgroundResource(android.R.drawable.btn_default);
        btnMision.setBackgroundResource(android.R.drawable.btn_default);
        btnVision.setBackgroundResource(android.R.drawable.btn_default);
        btnHorario.setBackgroundResource(android.R.drawable.btn_default);
        btnTodo.setTextColor(Color.parseColor("#000000"));
        btnMision.setTextColor(Color.parseColor("#000000"));
        btnVision.setTextColor(Color.parseColor("#000000"));
        btnHorario.setTextColor(Color.parseColor("#000000"));
        btnContactos.setTextColor(Color.parseColor("#FFFFFF"));
        btnContactos.setBackgroundColor(Color.parseColor("#BF083750"));
    }

    public void horario() {
        btnTodo.setBackgroundResource(android.R.drawable.btn_default);
        btnMision.setBackgroundResource(android.R.drawable.btn_default);
        btnVision.setBackgroundResource(android.R.drawable.btn_default);
        btnContactos.setBackgroundResource(android.R.drawable.btn_default);
        btnTodo.setTextColor(Color.parseColor("#000000"));
        btnMision.setTextColor(Color.parseColor("#000000"));
        btnVision.setTextColor(Color.parseColor("#000000"));
        btnContactos.setTextColor(Color.parseColor("#000000"));
        btnHorario.setTextColor(Color.parseColor("#FFFFFF"));
        btnHorario.setBackgroundColor(Color.parseColor("#BF083750"));
    }

    public void todo() {
        btnHorario.setBackgroundResource(android.R.drawable.btn_default);
        btnMision.setBackgroundResource(android.R.drawable.btn_default);
        btnVision.setBackgroundResource(android.R.drawable.btn_default);
        btnContactos.setBackgroundResource(android.R.drawable.btn_default);
        btnHorario.setTextColor(Color.parseColor("#000000"));
        btnMision.setTextColor(Color.parseColor("#000000"));
        btnVision.setTextColor(Color.parseColor("#000000"));
        btnContactos.setTextColor(Color.parseColor("#000000"));
        btnTodo.setTextColor(Color.parseColor("#FFFFFF"));
        btnTodo.setBackgroundColor(Color.parseColor("#BF083750"));
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
