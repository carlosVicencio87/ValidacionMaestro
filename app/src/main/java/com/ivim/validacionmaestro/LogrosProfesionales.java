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

public class LogrosProfesionales extends AppCompatActivity {
    private ScrollView formulario_datosBasicos,formulario_formaDocente,formulario_formaCapaDocente,
            formulario_actuaDisci,formulario_gestioAcademica,formulario_productosAcademicos,formulario_expProfeNoAcade,
            formulario_expDiseñoIng,formulario_logrosProfeNoAca,formulario_partColeCam,formulario_premDist,
            formulario_aportacionPe;

    private LinearLayout
            caja_edit_desLogAca,caja_desLogAca_final,caja_edit_desLogAca2,caja_desLogAca2_final,caja_edit_desLogAca3,
            caja_desLogAca3_final,caja_edit_desLogAca4,caja_desLogAca4_final,caja_edit_desLogAca5,caja_desLogAca5_final;

    private EditText desLogAca_texto,desLogAca2_texto,desLogAca3_texto,desLogAca4_texto,
            desLogAca5_texto;


    private ImageView guardar_desLogAca,
            cambiar_desLogAca,guardar_desLogAca2,cambiar_desLogAca2,guardar_desLogAca3,cambiar_desLogAca3,guardar_desLogAca4,
            cambiar_desLogAca4,guardar_desLogAca5,cambiar_desLogAca5;

    private TextView desLogAca,desLogAca2,
            desLogAca3,desLogAca4,desLogAca5;

    private String nuevo_desLogAca,nuevo_desLogAca2,
            nuevo_desLogAca3,nuevo_desLogAca4,nuevo_desLogAca5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_logros_profesionales);
        guardar_desLogAca = findViewById(R.id.guardar_desLogAca);
        desLogAca_texto = findViewById(R.id.desLogAca_texto);
        desLogAca= findViewById(R.id.desLogAca);
        caja_edit_desLogAca= findViewById(R.id.caja_edit_desLogAca);
        caja_desLogAca_final= findViewById(R.id.caja_desLogAca_final);
        cambiar_desLogAca = findViewById(R.id.cambiar_desLogAca);

        guardar_desLogAca2= findViewById(R.id.guardar_desLogAca2);
        desLogAca2_texto= findViewById(R.id.desLogAca2_texto);
        desLogAca2 = findViewById(R.id.desLogAca2);
        caja_edit_desLogAca2 = findViewById(R.id.caja_edit_desLogAca2);
        caja_desLogAca2_final= findViewById(R.id.caja_desLogAca2_final);
        cambiar_desLogAca2= findViewById(R.id.cambiar_desLogAca2);

        guardar_desLogAca3= findViewById(R.id.guardar_desLogAca3);
        desLogAca3_texto = findViewById(R.id.desLogAca3_texto);
        desLogAca3= findViewById(R.id.desLogAca3);
        caja_edit_desLogAca3= findViewById(R.id.caja_edit_desLogAca3);
        caja_desLogAca3_final = findViewById(R.id.caja_desLogAca3_final);
        cambiar_desLogAca3 = findViewById(R.id.cambiar_desLogAca3);

        guardar_desLogAca4 = findViewById(R.id.guardar_desLogAca4);
        desLogAca4_texto = findViewById(R.id.desLogAca4_texto);
        desLogAca4= findViewById(R.id.desLogAca4);
        caja_edit_desLogAca4 = findViewById(R.id.caja_edit_desLogAca4);
        caja_desLogAca4_final= findViewById(R.id.caja_desLogAca4_final);
        cambiar_desLogAca4 = findViewById(R.id.cambiar_desLogAca4);

        guardar_desLogAca5= findViewById(R.id.guardar_desLogAca5);
        desLogAca5_texto= findViewById(R.id.desLogAca5_texto);
        desLogAca5= findViewById(R.id.desLogAca5);
        caja_edit_desLogAca5 = findViewById(R.id.caja_edit_desLogAca5);
        caja_desLogAca5_final= findViewById(R.id.caja_desLogAca5_final);
        cambiar_desLogAca5= findViewById(R.id.cambiar_desLogAca5);
        guardar_desLogAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca= desLogAca_texto.getText().toString();
                desLogAca.setText(nuevo_desLogAca);
                if (!nuevo_desLogAca.trim().equals("")) {
                    caja_edit_desLogAca.setVisibility(View.GONE);
                    caja_desLogAca_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca.setVisibility(View.VISIBLE);
                caja_desLogAca_final.setVisibility(View.GONE);

            }
        });
        guardar_desLogAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca2 = desLogAca2_texto.getText().toString();
                desLogAca2.setText(nuevo_desLogAca2);
                if (!nuevo_desLogAca2.trim().equals("")) {
                    caja_edit_desLogAca2.setVisibility(View.GONE);
                    caja_desLogAca2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca2.setVisibility(View.VISIBLE);
                caja_desLogAca2_final.setVisibility(View.GONE);

            }
        });
        guardar_desLogAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca3 = desLogAca3_texto.getText().toString();
                desLogAca3.setText(nuevo_desLogAca3);
                if (!nuevo_desLogAca3.trim().equals("")) {
                    caja_edit_desLogAca3.setVisibility(View.GONE);
                    caja_desLogAca3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca3.setVisibility(View.VISIBLE);
                caja_desLogAca3_final.setVisibility(View.GONE);

            }
        });
        guardar_desLogAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca4=desLogAca4_texto.getText().toString();
                desLogAca4.setText(nuevo_desLogAca4);
                if (!nuevo_desLogAca4.trim().equals("")) {
                    caja_edit_desLogAca4.setVisibility(View.GONE);
                    caja_desLogAca4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca4.setVisibility(View.VISIBLE);
                caja_desLogAca4_final.setVisibility(View.GONE);

            }
        });
        guardar_desLogAca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca5= desLogAca5_texto.getText().toString();
                desLogAca5.setText(nuevo_desLogAca5);
                if (!nuevo_desLogAca5.trim().equals("")) {
                    caja_edit_desLogAca5.setVisibility(View.GONE);
                    caja_desLogAca5_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca5.setVisibility(View.VISIBLE);
                caja_desLogAca5_final.setVisibility(View.GONE);

            }
        });
    }
}