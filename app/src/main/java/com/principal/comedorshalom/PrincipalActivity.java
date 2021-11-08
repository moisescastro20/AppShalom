package com.principal.comedorshalom;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class PrincipalActivity extends AppCompatActivity {

    ImageView btnLogin;
    Button btnEntrar, btnCrear, btnRegistrarse;
    ImageButton ibBack;
    TextView tvMarquee;
    EditText etUsuario, etContraseña;
    EditText etUsuarioR, etContraseñaR, etNombre, etApellido, etCel, etDireccion, etEdad;
    CheckBox check_mostrar, check_mostrarR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializar();
    }

    public void inicializar() {
        btnLogin = (ImageView) findViewById(R.id.ivLogin);
        tvMarquee = (TextView) findViewById(R.id.tvMarquee);
        tvMarquee.setSelected(true);
        login();
    }

    public void actMenuDelDia(View v) {
        Intent i = new Intent(this, MenuDelDiaActivity.class);
        startActivity(i);
        overridePendingTransition(R.transition.zoom_forward_in, R.transition.zoom_forward_out);
    }

    public void actGastronomia(View v) {
        Intent i = new Intent(this, GastronomiaActivity.class);
        startActivity(i);
        overridePendingTransition(R.transition.zoom_forward_in, R.transition.zoom_forward_out);
    }

    public void actUbicacion(View v) {
        Intent i = new Intent(this, UbicacionActivity.class);
        startActivity(i);
        overridePendingTransition(R.transition.zoom_forward_in, R.transition.zoom_forward_out);
    }

    public void actSobreNosotros(View v) {
        Intent i = new Intent(this, SobreNosotrosActivity.class);
        startActivity(i);
        overridePendingTransition(R.transition.zoom_forward_in, R.transition.zoom_forward_out);
    }

    public void actPanDeVida(View v) {
        Intent i = new Intent(this, PanDeVidaActivity.class);
        startActivity(i);
        overridePendingTransition(R.transition.zoom_forward_in, R.transition.zoom_forward_out);
    }

    public void actContactanos(View v) {
        Intent i = new Intent(this, ContactanosActivity.class);
        startActivity(i);
        overridePendingTransition(R.transition.zoom_forward_in, R.transition.zoom_forward_out);
    }

    public void actAcercaDe(View v) {
        Intent i = new Intent(this, AcercaDeActivity.class);
        startActivity(i);
        overridePendingTransition(R.transition.zoom_forward_in, R.transition.zoom_forward_out);
    }

    // Diálogo personalizado (dialog_login) que se muestra para iniciar sesion
    public void login() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    dialogLogin();
                    // Acción del botón Entrar del layout dialog_login
                    btnCrear.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialogRegistro(v);
                        }
                    });
                } catch (Exception e) {
                    // vacio
                }
            }
        });
    }

    // Diálogo personalizado (dialog_login)
    public void dialogLogin(){
        AlertDialog.Builder mBuilderL = new AlertDialog.Builder(PrincipalActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.dialog_login, null);

        // Inicializando elementos del layout dialog_login
        btnCrear = (Button) mView.findViewById(R.id.btnCrearCuenta);
        btnEntrar = (Button) mView.findViewById(R.id.btnEntrar);
        etUsuario = (EditText) mView.findViewById(R.id.etUsuario);
        etContraseña = (EditText) mView.findViewById(R.id.etContraseña);
        check_mostrar = (CheckBox) mView.findViewById(R.id.check_mostrar);

        // Acción del botón Entrar del layout dialog_login
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = etUsuario.getText().toString();
                String pass = etContraseña.getText().toString();
                // Validando campos completos
                if (user.equals("") || pass.equals("")) {
                    Snackbar.make(v, "Campos incompletos", Snackbar.LENGTH_SHORT).setDuration(700)
                            .show();
                } else {
                    Intent i = new Intent(PrincipalActivity.this, PrincipalActivity.class);
                    finish();
                    startActivity(i);
                }
            }
        });

        mBuilderL.setView(mView);
        AlertDialog dialog = mBuilderL.create();
        dialog.show();
    }

    // Diálogo personalizado (dialog_registro) que se muestra para registrar un usuario
    public void dialogRegistro(View v) {
        try {
            final AlertDialog.Builder mBuilderR = new AlertDialog.Builder(PrincipalActivity.this);
            final View mView = getLayoutInflater().inflate(R.layout.dialog_registro, null);

            // Inicializando elementos del layout dialog_registro
            btnRegistrarse = (Button) mView.findViewById(R.id.btnRegistrarse);
            etUsuarioR = (EditText) mView.findViewById(R.id.etUsuarioR);
            etContraseñaR = (EditText) mView.findViewById(R.id.etContraseñaR);
            etNombre = (EditText) mView.findViewById(R.id.etNombre);
            etApellido = (EditText) mView.findViewById(R.id.etApellido);
            etCel = (EditText) mView.findViewById(R.id.etCel);
            etDireccion = (EditText) mView.findViewById(R.id.etDireccion);
            etEdad = (EditText) mView.findViewById(R.id.etEdad);
            check_mostrarR = (CheckBox) mView.findViewById(R.id.check_mostrarR);
            ibBack = (ImageButton) mView.findViewById(R.id.ibBack);

            // Acción del botón Entrar del layout dialog_registro
            btnRegistrarse.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String nombre = etNombre.getText().toString();
                    String apellido = etApellido.getText().toString();
                    String usuario = etUsuarioR.getText().toString();
                    String contraseña = etContraseñaR.getText().toString();
                    String direccion = etDireccion.getText().toString();
                    String celular = etCel.getText().toString();
                    String edad = etEdad.getText().toString();
                    if (nombre.equals("") || apellido.equals("") || usuario.equals("") || contraseña.equals("") ||
                              direccion.equals("") || celular.equals("") || edad.equals("")) {
                        Snackbar.make(v, "Campos incompletos", Snackbar.LENGTH_SHORT).setDuration(700)
                                .show();
                    } else {
                        ejecutarServicio("http://192.168.0.14/comedorshalom/insertar_usuario.php",
                                nombre, apellido, usuario, contraseña, direccion, celular, edad);
                    }
                }
            });

            mBuilderR.setView(mView);
            final AlertDialog dialog = mBuilderR.create();
            dialog.show();

            // Regresar al dialogo anterior
            ibBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.cancel();
                }
            });
        } catch (Exception e) {
            // vacio
        }
    }

    private void ejecutarServicio(String URL, final String nombre, final String apellido, final String usuario, final String contraseña, final String direccion, final String celular, final String edad){
        StringRequest stringR = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(),"¡Usuario creado exitosamente!", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros = new HashMap<String, String>();
                parametros.put("nombre", nombre);
                parametros.put("apellido", apellido);
                parametros.put("usuario", usuario);
                parametros.put("clave", contraseña);
                parametros.put("direccion", direccion);
                parametros.put("celular", celular);
                parametros.put("edad", edad);
                parametros.put("rol_usuario", "client");
                return parametros;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringR);

    }

    public void showPassword(View v) {
        if (check_mostrar.isChecked()) {
            etContraseña.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
        } else {
            etContraseña.setInputType(129);
        }
    }

    public void showPasswordR(View v) {
        if (check_mostrarR.isChecked()) {
            etContraseñaR.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
        } else {
            etContraseñaR.setInputType(129);
        }
    }

    private static final int INTERVALO = 2000; //2 segundos para salir
    private long tiempoPrimerClick;

    @Override
    public void onBackPressed() {
        if (tiempoPrimerClick + INTERVALO > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            Toast.makeText(this, "Vuelve a presionar para salir", Toast.LENGTH_SHORT).show();
        }
        tiempoPrimerClick = System.currentTimeMillis();
    }

}
