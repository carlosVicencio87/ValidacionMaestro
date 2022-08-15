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

public class ProductosAcademicos extends AppCompatActivity {
    private ScrollView formulario_datosBasicos,formulario_formaDocente,formulario_formaCapaDocente,
            formulario_actuaDisci,formulario_gestioAcademica,formulario_productosAcademicos,formulario_expProfeNoAcade,
            formulario_expDiseñoIng,formulario_logrosProfeNoAca,formulario_partColeCam,formulario_premDist,
            formulario_aportacionPe;

    private LinearLayout caja_edit_desProdAca,caja_desProdAca_final,caja_edit_desProdAca2,
            caja_desProdAca2_final,caja_edit_desProdAca3,caja_desProdAca3_final,caja_edit_desProdAca4,
            caja_desProdAca4_final,caja_edit_desProdAca5,caja_desProdAca5_final,caja_edit_desProdAca6,
            caja_desProdAca6_final,caja_edit_desProdAca7,caja_desProdAca7_final,caja_edit_desProdAca8,
            caja_desProdAca8_final;

    private EditText desProdAca_texto,desProdAca2_texto,
            desProdAca3_texto,desProdAca4_texto,desProdAca5_texto,desProdAca6_texto,desProdAca7_texto,
            desProdAca8_texto;


    private ImageView guardar_desProdAca,
            cambiar_desProdAca,guardar_desProdAca2,cambiar_desProdAca2,guardar_desProdAca3,
            cambiar_desProdAca3,guardar_desProdAca4,cambiar_desProdAca4,guardar_desProdAca5,
            cambiar_desProdAca5,guardar_desProdAca6,cambiar_desProdAca6,guardar_desProdAca7,
            cambiar_desProdAca7,guardar_desProdAca8,cambiar_desProdAca8;

    private TextView desProdAca,desProdAca2,desProdAca3,desProdAca4,desProdAca5,
            desProdAca6,desProdAca7,desProdAca8;

    private String nuevo_desProdAca,nuevo_desProdAca2,
            nuevo_desProdAca3,nuevo_desProdAca4,nuevo_desProdAca5,nuevo_desProdAca6,nuevo_desProdAca7,nuevo_desProdAca8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_productos_academicos);

        guardar_desProdAca= findViewById(R.id.guardar_desProdAca);
        desProdAca_texto= findViewById(R.id.desProdAca_texto);
        desProdAca= findViewById(R.id.desProdAca);
        caja_edit_desProdAca= findViewById(R.id.caja_edit_desProdAca);
        caja_desProdAca2_final= findViewById(R.id.caja_desProdAca2_final);
        cambiar_desProdAca= findViewById(R.id.cambiar_desProdAca);

        guardar_desProdAca2 = findViewById(R.id.guardar_desProdAca2);
        desProdAca2_texto= findViewById(R.id.desProdAca2_texto);
        desProdAca2= findViewById(R.id.desProdAca2);
        caja_edit_desProdAca2= findViewById(R.id.caja_edit_desProdAca2);
        caja_desProdAca_final= findViewById(R.id.caja_desProdAca_final);
        cambiar_desProdAca2= findViewById(R.id.cambiar_desProdAca2);

        guardar_desProdAca3 = findViewById(R.id.guardar_desProdAca3);
        desProdAca3_texto= findViewById(R.id.desProdAca3_texto);
        desProdAca3= findViewById(R.id.desProdAca3);
        caja_edit_desProdAca3= findViewById(R.id.caja_edit_desProdAca3);
        caja_desProdAca3_final= findViewById(R.id.caja_desProdAca3_final);
        cambiar_desProdAca3= findViewById(R.id.cambiar_desProdAca3);

        guardar_desProdAca4= findViewById(R.id.guardar_desProdAca4);
        desProdAca4_texto= findViewById(R.id.desProdAca4_texto);
        desProdAca4 = findViewById(R.id.desProdAca4);
        caja_edit_desProdAca4 = findViewById(R.id.caja_edit_desProdAca4);
        caja_desProdAca4_final = findViewById(R.id.caja_desProdAca4_final);
        cambiar_desProdAca4= findViewById(R.id.cambiar_desProdAca4);

        guardar_desProdAca5 = findViewById(R.id.guardar_desProdAca5);
        desProdAca5_texto= findViewById(R.id.desProdAca5_texto);
        desProdAca5= findViewById(R.id.desProdAca5);
        caja_edit_desProdAca5= findViewById(R.id.caja_edit_desProdAca5);
        caja_desProdAca5_final= findViewById(R.id.caja_desProdAca5_final);
        cambiar_desProdAca5= findViewById(R.id.cambiar_desProdAca5);

        guardar_desProdAca6= findViewById(R.id.guardar_desProdAca6);
        desProdAca6_texto= findViewById(R.id.desProdAca6_texto);
        desProdAca6 = findViewById(R.id.desProdAca6);
        caja_edit_desProdAca6= findViewById(R.id.caja_edit_desProdAca6);
        caja_desProdAca6_final= findViewById(R.id.caja_desProdAca6_final);
        cambiar_desProdAca6= findViewById(R.id.cambiar_desProdAca6);

        guardar_desProdAca7= findViewById(R.id.guardar_desProdAca7);
        desProdAca7_texto = findViewById(R.id.desProdAca7_texto);
        desProdAca7= findViewById(R.id.desProdAca7);
        caja_edit_desProdAca7= findViewById(R.id.caja_edit_desProdAca7);
        caja_desProdAca7_final = findViewById(R.id.caja_desProdAca7_final);
        cambiar_desProdAca7= findViewById(R.id.cambiar_desProdAca7);

        guardar_desProdAca8= findViewById(R.id.guardar_desProdAca8);
        desProdAca8_texto = findViewById(R.id.desProdAca8_texto);
        desProdAca8= findViewById(R.id.desProdAca8);
        caja_edit_desProdAca8= findViewById(R.id.caja_edit_desProdAca8);
        caja_desProdAca8_final= findViewById(R.id.caja_desProdAca8_final);
        cambiar_desProdAca8= findViewById(R.id.cambiar_desProdAca8);

        formulario_productosAcademicos = findViewById(R.id.formulario_productosAcademicos);


        guardar_desProdAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca= desProdAca_texto.getText().toString();
                desProdAca.setText(nuevo_desProdAca);
                if (!nuevo_desProdAca.trim().equals("")) {
                    caja_edit_desProdAca.setVisibility(View.GONE);
                    caja_desProdAca_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca.setVisibility(View.VISIBLE);
                caja_desProdAca_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca2 = desProdAca2_texto.getText().toString();
                desProdAca2.setText(nuevo_desProdAca2);
                if (!nuevo_desProdAca2.trim().equals("")) {
                    caja_edit_desProdAca2.setVisibility(View.GONE);
                    caja_desProdAca2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca2.setVisibility(View.VISIBLE);
                caja_desProdAca2_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca3 = desProdAca3_texto.getText().toString();
                desProdAca3.setText(nuevo_desProdAca3);
                if (!nuevo_desProdAca3.trim().equals("")) {
                    caja_edit_desProdAca3.setVisibility(View.GONE);
                    caja_desProdAca3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca3.setVisibility(View.VISIBLE);
                caja_desProdAca3_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca4=desProdAca4_texto.getText().toString();
                desProdAca4.setText(nuevo_desProdAca4);
                if (!nuevo_desProdAca4.trim().equals("")) {
                    caja_edit_desProdAca4.setVisibility(View.GONE);
                    caja_desProdAca4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca4.setVisibility(View.VISIBLE);
                caja_desProdAca4_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca5= desProdAca5_texto.getText().toString();
                desProdAca5.setText(nuevo_desProdAca5);
                if (!nuevo_desProdAca5.trim().equals("")) {
                    caja_edit_desProdAca5.setVisibility(View.GONE);
                    caja_desProdAca5_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca5.setVisibility(View.VISIBLE);
                caja_desProdAca5_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca6 = desProdAca6_texto.getText().toString();
                desProdAca6.setText(nuevo_desProdAca6);
                if (!nuevo_desProdAca6.trim().equals("")) {
                    caja_edit_desProdAca6.setVisibility(View.GONE);
                    caja_desProdAca6_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca6.setVisibility(View.VISIBLE);
                caja_desProdAca6_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca7 = desProdAca7_texto.getText().toString();
                desProdAca7.setText(nuevo_desProdAca7);
                if (!nuevo_desProdAca7.trim().equals("")) {
                    caja_edit_desProdAca7.setVisibility(View.GONE);
                    caja_desProdAca7_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca7.setVisibility(View.VISIBLE);
                caja_desProdAca7_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca8= desProdAca8_texto.getText().toString();
                desProdAca8.setText(nuevo_desProdAca8);
                if (!nuevo_desProdAca8.trim().equals("")) {
                    caja_edit_desProdAca8.setVisibility(View.GONE);
                    caja_desProdAca8_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca8.setVisibility(View.VISIBLE);
                caja_desProdAca8_final.setVisibility(View.GONE);

            }
        });
    }
}