package com.principal.comedorshalom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MenuDelDiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_del_dia);
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
