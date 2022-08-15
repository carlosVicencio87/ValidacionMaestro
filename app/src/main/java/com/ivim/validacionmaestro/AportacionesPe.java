package com.ivim.validacionmaestro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class AportacionesPe extends AppCompatActivity {
    private ScrollView formulario_aportacionPe;

    private LinearLayout caja_edit_aportacionPE,caja_aportacionPE_final;

    private EditText aportacionPE_texto;


    private ImageView guardar_aportacionPE,cambiar_aportacionPE;

    private TextView aportacionPE;

    private String nuevo_aportacionPE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_aportaciones_pe);

        guardar_aportacionPE= findViewById(R.id.guardar_aportacionPE);
        aportacionPE_texto= findViewById(R.id.aportacionPE_texto);
        aportacionPE= findViewById(R.id.aportacionPE);
        caja_edit_aportacionPE= findViewById(R.id.caja_edit_aportacionPE);
        caja_aportacionPE_final= findViewById(R.id.caja_aportacionPE_final);
        cambiar_aportacionPE= findViewById(R.id.cambiar_aportacionPE);

        guardar_aportacionPE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_aportacionPE= aportacionPE_texto.getText().toString();
                aportacionPE.setText(nuevo_aportacionPE);
                if (!nuevo_aportacionPE.trim().equals("")) {
                    caja_edit_aportacionPE.setVisibility(View.GONE);
                    caja_aportacionPE_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_aportacionPE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_aportacionPE.setVisibility(View.VISIBLE);
                caja_aportacionPE_final.setVisibility(View.GONE);

            }
        });
    }
}