package com.principal.comedorshalom;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class ContactanosActivity extends AppCompatActivity {

    Button btnEnviar;
    EditText etNombre;
    EditText etCorreo;
    EditText etTelefono;
    EditText etMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactanos);

        inicializar();
    }

    public void inicializar() {
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnEnviar.setBackgroundColor(Color.parseColor("#BF083750"));
        btnEnviar.setBackgroundResource(android.R.drawable.btn_default);

        etNombre = (EditText) findViewById(R.id.etNombre);
        etCorreo = (EditText) findViewById(R.id.etCorreo);
        etTelefono = (EditText) findViewById(R.id.etTelefono);
        etMensaje = (EditText) findViewById(R.id.etMensaje);
    }

    public void acEnviar(View v) {
        String nombre = etNombre.getText().toString();
        String correo = etCorreo.getText().toString();
        String telefono = etTelefono.getText().toString();
        String mensaje = etMensaje.getText().toString();
        if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty() || mensaje.isEmpty()) {
            Snackbar.make(v, "Campos incompletos", Snackbar.LENGTH_SHORT).setDuration(700)
                    .show();
        } else {
            Snackbar.make(v, "Gracias por comunicarte con nosotros!", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
    }

    public void back (View v){
        finish();
        overridePendingTransition(R.transition.fade_back_in, R.transition.fade_back_out);
    }

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.transition.fade_back_in, R.transition.fade_back_out);
    }

}
