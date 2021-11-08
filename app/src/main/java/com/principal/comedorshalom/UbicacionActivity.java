package com.principal.comedorshalom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UbicacionActivity extends AppCompatActivity {

    String url;
    TextView tvLinkUbicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);

        inicializar();
    }

    public void inicializar(){
        tvLinkUbicacion = (TextView) findViewById(R.id.tvLinkUbicacion);
    }

    public void irLink(View v){
        Uri uri = Uri.parse("https://www.google.com/maps/place/Comedor+Shalom/@13.72235,-88.936358,17z/data=!3m1!4b1!4m5!3m4!1s0x8f6351a294240c9d:0x37b6fe358a9616ed!8m2!3d13.7223448!4d-88.9341693");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
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
