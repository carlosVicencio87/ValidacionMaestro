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

public class ParticipacionColCam extends AppCompatActivity {
    private ScrollView formulario_partColeCam;

    private LinearLayout caja_borrar_otraPart3,caja_agregar_otraPart3,caja_nivelPart4,caja_anuncio_nivelPart4,caja_edit_periColeCam4
            ,caja_anuncio_periColeCam4,caja_orgColeCam4,caja_anuncio_orgColeCam4,caja_agregar_otraPart2,
            caja_nivelPart3,caja_anuncio_nivelPart3,caja_edit_periColeCam3,caja_anuncio_periColeCam3,caja_orgColeCam3,
            caja_anuncio_orgColeCam3,caja_agregar_otraPart,caja_edit_nivelPart2,caja_anuncio_nivelPart2,
            caja_edit_periColeCam2,caja_anuncio_periColeCam2,caja_edit_orgColeCam2,caja_anuncio_orgColeCam2,
            caja_edit_orgColeCam,caja_orgColeCam_final,caja_edit_periColeCam,caja_periColeCam_final,caja_edit_nivelPart,
            caja_nivelPart_final,caja_orgColeCam2_final,caja_periColeCam2_final,caja_nivelPart2_final,caja_orgColeCam3_final,
            caja_periColeCam3_final,caja_nivelPart3_final,caja_orgColeCam4_final,caja_periColeCam4_final,
            caja_nivelPart4_final;

    private EditText orgColeCam_texto,periColeCam_texto,nivelPart_texto,orgColeCam2_texto,periColeCam2_texto,nivelPart2_texto,
            orgColeCam3_texto,periColeCam3_texto,nivelPart3_texto,orgColeCam4_texto,periColeCam4_texto,nivelPart4_texto;


    private ImageView guardar_orgColeCam,cambiar_orgColeCam,
            guardar_periColeCam,cambiar_periColeCam,guardar_nivelPart,cambiar_nivelPart,
            guardar_orgColeCam2,cambiar_orgColeCam2,guardar_periColeCam2,cambiar_periColeCam2,guardar_nivelPart2,
            cambiar_nivelPart2,guardar_orgColeCam3,cambiar_orgColeCam3,guardar_periColeCam3,cambiar_periColeCam3,
            guardar_nivelPart3,cambiar_nivelPart3,guardar_orgColeCam4,cambiar_orgColeCam4,guardar_periColeCam4,
            cambiar_periColeCam4,guardar_nivelPart4,cambiar_nivelPart4;

    private TextView borrar_otraPart3,agregar_otraPart3,borrar_otraPart2,
            agregar_otraPart2,borrar_otraPart,agregar_otraPart,orgColeCam,
            periColeCam,nivelPart,orgColeCam2,periColeCam2,nivelPart2,orgColeCam3,periColeCam3,nivelPart3_vista,
            orgColeCam4,periColeCam4,nivelPart4_vista;

    private String nuevo_orgColeCam,nuevo_periColeCam,nuevo_nivelPart,nuevo_orgColeCam2,
            nuevo_periColeCam2,nuevo_nivelPart2,nuevo_orgColeCam3,nuevo_periColeCam3,nuevo_nivelPart3,nuevo_orgColeCam4,
            nuevo_periColeCam4,nuevo_nivelPart4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_participacion_col_cam);
        guardar_orgColeCam= findViewById(R.id.guardar_orgColeCam);
        orgColeCam_texto= findViewById(R.id.orgColeCam_texto);
        orgColeCam= findViewById(R.id.orgColeCam);
        caja_edit_orgColeCam= findViewById(R.id.caja_edit_orgColeCam);
        caja_orgColeCam_final = findViewById(R.id.caja_orgColeCam_final);
        cambiar_orgColeCam= findViewById(R.id.cambiar_orgColeCam);

        guardar_periColeCam = findViewById(R.id.guardar_periColeCam);
        periColeCam_texto= findViewById(R.id.periColeCam_texto);
        periColeCam= findViewById(R.id.periColeCam);
        caja_edit_periColeCam = findViewById(R.id.caja_edit_periColeCam);
        caja_periColeCam_final = findViewById(R.id.caja_periColeCam_final);
        cambiar_periColeCam = findViewById(R.id.cambiar_periColeCam);

        guardar_nivelPart = findViewById(R.id.guardar_nivelPart);
        nivelPart_texto= findViewById(R.id.nivelPart_texto);
        nivelPart= findViewById(R.id.nivelPart);
        caja_edit_nivelPart= findViewById(R.id.caja_edit_nivelPart);
        caja_nivelPart_final= findViewById(R.id.caja_nivelPart_final);
        cambiar_nivelPart= findViewById(R.id.cambiar_nivelPart);


        guardar_orgColeCam2= findViewById(R.id.guardar_orgColeCam2);
        orgColeCam2_texto = findViewById(R.id.orgColeCam2_texto);
        orgColeCam2 = findViewById(R.id.orgColeCam2);
        caja_orgColeCam2_final= findViewById(R.id.caja_orgColeCam2_final);
        cambiar_orgColeCam2= findViewById(R.id.cambiar_orgColeCam2);



        guardar_periColeCam2= findViewById(R.id.guardar_periColeCam2);
        periColeCam2_texto= findViewById(R.id.periColeCam2_texto);
        periColeCam2= findViewById(R.id.periColeCam2);
        caja_periColeCam2_final= findViewById(R.id.caja_periColeCam2_final);
        cambiar_periColeCam2= findViewById(R.id.cambiar_periColeCam2);


        guardar_nivelPart2 = findViewById(R.id.guardar_nivelPart2);
        nivelPart2_texto= findViewById(R.id.nivelPart2_texto);
        nivelPart2 = findViewById(R.id.nivelPart2);
        caja_nivelPart2_final= findViewById(R.id.caja_nivelPart2_final);
        cambiar_nivelPart2= findViewById(R.id.cambiar_nivelPart2);


        guardar_orgColeCam3= findViewById(R.id.guardar_orgColeCam3);
        orgColeCam3_texto = findViewById(R.id.orgColeCam3_texto);
        orgColeCam3= findViewById(R.id.orgColeCam3);
        caja_orgColeCam3_final= findViewById(R.id.caja_orgColeCam3_final);
        cambiar_orgColeCam3= findViewById(R.id.cambiar_orgColeCam3);

        guardar_periColeCam3= findViewById(R.id.guardar_periColeCam3);
        periColeCam3_texto= findViewById(R.id.periColeCam3_texto);
        periColeCam3 = findViewById(R.id.periColeCam3);
        caja_periColeCam3_final= findViewById(R.id.caja_periColeCam3_final);
        cambiar_periColeCam3 = findViewById(R.id.cambiar_periColeCam3);

        guardar_nivelPart3= findViewById(R.id.guardar_nivelPart3);
        nivelPart3_texto = findViewById(R.id.nivelPart3_texto);
        nivelPart3_vista= findViewById(R.id.nivelPart3_vista);
        caja_nivelPart3_final = findViewById(R.id.caja_nivelPart3_final);
        cambiar_nivelPart3= findViewById(R.id.cambiar_nivelPart3);

        guardar_orgColeCam4 = findViewById(R.id.guardar_orgColeCam4);
        orgColeCam4_texto= findViewById(R.id.orgColeCam4_texto);
        orgColeCam4= findViewById(R.id.orgColeCam4);
        caja_orgColeCam4_final= findViewById(R.id.caja_organismo4_final);
        cambiar_orgColeCam4= findViewById(R.id.cambiar_orgColeCam4);

        guardar_periColeCam4 = findViewById(R.id.guardar_periColeCam4);
        periColeCam4_texto = findViewById(R.id.periColeCam4_texto);
        periColeCam4= findViewById(R.id.periColeCam4);
        caja_periColeCam4_final= findViewById(R.id.caja_periColeCam4_final);
        cambiar_periColeCam4= findViewById(R.id.cambiar_periColeCam4);


        guardar_nivelPart4= findViewById(R.id.guardar_nivelPart4);
        nivelPart4_texto = findViewById(R.id.nivelPart4_texto);
        nivelPart4_vista= findViewById(R.id.nivelPart4_vista);
        caja_nivelPart4_final= findViewById(R.id.caja_nivelPart4_final);
        cambiar_nivelPart4= findViewById(R.id.cambiar_nivelPart4);

        formulario_partColeCam = findViewById(R.id.formulario_partColeCam);

        caja_agregar_otraPart = findViewById(R.id.caja_agregar_otraPart);
        agregar_otraPart = findViewById(R.id.agregar_otraPart);
        caja_anuncio_orgColeCam2 = findViewById(R.id.caja_anuncio_orgColeCam2);
        caja_edit_orgColeCam2 = findViewById(R.id.caja_edit_orgColeCam2);
        caja_anuncio_periColeCam2 = findViewById(R.id.caja_anuncio_periColeCam2);
        caja_edit_periColeCam2 = findViewById(R.id.caja_edit_periColeCam2);
        caja_anuncio_nivelPart2 = findViewById(R.id.caja_anuncio_nivelPart2);
        caja_edit_nivelPart2 = findViewById(R.id.caja_edit_nivelPart2);
        caja_agregar_otraPart2 = findViewById(R.id.caja_agregar_otraPart2);
        borrar_otraPart = findViewById(R.id.borrar_otraPart);

        agregar_otraPart2 = findViewById(R.id.agregar_otraPart2);
        caja_anuncio_orgColeCam3 = findViewById(R.id.caja_anuncio_orgColeCam3);
        caja_orgColeCam3 = findViewById(R.id.caja_orgColeCam3);
        caja_anuncio_periColeCam3 = findViewById(R.id.caja_anuncio_periColeCam3);
        caja_edit_periColeCam3 = findViewById(R.id.caja_edit_periColeCam3);
        caja_anuncio_nivelPart3 = findViewById(R.id.caja_anuncio_nivelPart3);
        caja_nivelPart3 = findViewById(R.id.caja_nivelPart3);
        caja_agregar_otraPart3 = findViewById(R.id.caja_agregar_otraPart3);
        agregar_otraPart3 = findViewById(R.id.agregar_otraPart3);
        borrar_otraPart2 = findViewById(R.id.borrar_otraPart2);

        caja_anuncio_orgColeCam4 = findViewById(R.id.caja_anuncio_orgColeCam4);
        caja_orgColeCam4 = findViewById(R.id.caja_orgColeCam4);
        caja_anuncio_periColeCam4 = findViewById(R.id.caja_anuncio_periColeCam4);
        caja_edit_periColeCam4 = findViewById(R.id.caja_edit_periColeCam4);
        caja_anuncio_nivelPart4 = findViewById(R.id.caja_anuncio_nivelPart4);
        caja_nivelPart4 = findViewById(R.id.caja_nivelPart4);
        borrar_otraPart3 = findViewById(R.id.borrar_otraPart3);
        caja_borrar_otraPart3 = findViewById(R.id.caja_borrar_otraPart3);
        guardar_orgColeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_orgColeCam=orgColeCam_texto.getText().toString();
                orgColeCam.setText(nuevo_orgColeCam);
                if (!nuevo_orgColeCam.trim().equals("")) {
                    caja_edit_orgColeCam.setVisibility(View.GONE);
                    caja_orgColeCam_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del organismo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_orgColeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_orgColeCam.setVisibility(View.VISIBLE);
                caja_orgColeCam_final.setVisibility(View.GONE);

            }
        });
        guardar_periColeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_periColeCam= periColeCam_texto.getText().toString();
                periColeCam.setText(nuevo_periColeCam);
                if (!nuevo_periColeCam.trim().equals("")) {
                    caja_edit_periColeCam.setVisibility(View.GONE);
                    caja_periColeCam_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El periodo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_periColeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_periColeCam.setVisibility(View.VISIBLE);
                caja_periColeCam_final.setVisibility(View.GONE);

            }
        });
        guardar_nivelPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_nivelPart= nivelPart_texto.getText().toString();
                nivelPart.setText(nuevo_nivelPart);
                if (!nuevo_nivelPart.trim().equals("")) {
                    caja_edit_nivelPart.setVisibility(View.GONE);
                    caja_nivelPart_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_nivelPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_nivelPart.setVisibility(View.VISIBLE);
                caja_nivelPart_final.setVisibility(View.GONE);

            }
        });
        agregar_otraPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam2.setVisibility(View.VISIBLE);
                caja_edit_orgColeCam2.setVisibility(View.VISIBLE);
                orgColeCam2_texto.setText("");
                caja_anuncio_periColeCam2.setVisibility(View.VISIBLE);
                caja_edit_periColeCam2.setVisibility(View.VISIBLE);
                periColeCam2_texto.setText("");
                caja_anuncio_nivelPart2.setVisibility(View.VISIBLE);
                caja_edit_nivelPart2.setVisibility(View.VISIBLE);
                nivelPart2_texto.setText("");



                caja_agregar_otraPart.setVisibility(View.GONE);
                caja_agregar_otraPart2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam2.setVisibility(View.GONE);
                caja_edit_orgColeCam2.setVisibility(View.GONE);
                caja_orgColeCam2_final.setVisibility(View.GONE);

                caja_anuncio_periColeCam2.setVisibility(View.GONE);
                caja_edit_periColeCam2.setVisibility(View.GONE);
                caja_periColeCam2_final.setVisibility(View.GONE);


                caja_anuncio_nivelPart2.setVisibility(View.GONE);
                caja_edit_nivelPart2.setVisibility(View.GONE);
                caja_nivelPart2_final.setVisibility(View.GONE);


                caja_agregar_otraPart.setVisibility(View.VISIBLE);
                caja_agregar_otraPart2.setVisibility(View.GONE);


            }
        });
        guardar_orgColeCam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_orgColeCam2=orgColeCam2_texto.getText().toString();
                orgColeCam2.setText(nuevo_orgColeCam2);
                if (!nuevo_orgColeCam2.trim().equals("")) {
                    caja_edit_orgColeCam2.setVisibility(View.GONE);
                    caja_orgColeCam2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del organismo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_orgColeCam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_orgColeCam2.setVisibility(View.VISIBLE);
                caja_orgColeCam2_final.setVisibility(View.GONE);

            }
        });
        guardar_periColeCam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_periColeCam2= periColeCam2_texto.getText().toString();
                periColeCam2.setText(nuevo_periColeCam2);
                if (!nuevo_periColeCam2.trim().equals("")) {
                    caja_edit_periColeCam2.setVisibility(View.GONE);
                    caja_periColeCam2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El periodo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_periColeCam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_periColeCam2.setVisibility(View.VISIBLE);
                caja_periColeCam2_final.setVisibility(View.GONE);

            }
        });
        guardar_nivelPart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_nivelPart2= nivelPart2_texto.getText().toString();
                nivelPart2.setText(nuevo_nivelPart2);
                if (!nuevo_nivelPart2.trim().equals("")) {
                    caja_edit_nivelPart2.setVisibility(View.GONE);
                    caja_nivelPart2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_nivelPart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_nivelPart2.setVisibility(View.VISIBLE);
                caja_nivelPart2_final.setVisibility(View.GONE);

            }
        });
        agregar_otraPart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam3.setVisibility(View.VISIBLE);
                caja_orgColeCam3.setVisibility(View.VISIBLE);
                orgColeCam3_texto.setText("");


                caja_anuncio_periColeCam3.setVisibility(View.VISIBLE);
                caja_edit_periColeCam3.setVisibility(View.VISIBLE);
                periColeCam3_texto.setText("");

                caja_anuncio_nivelPart3.setVisibility(View.VISIBLE);
                caja_nivelPart3.setVisibility(View.VISIBLE);
                nivelPart3_texto.setText("");


                caja_agregar_otraPart2.setVisibility(View.GONE);
                caja_agregar_otraPart3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraPart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam3.setVisibility(View.GONE);
                caja_orgColeCam3.setVisibility(View.GONE);
                caja_orgColeCam3_final.setVisibility(View.GONE);


                caja_anuncio_periColeCam3.setVisibility(View.GONE);
                caja_edit_periColeCam3.setVisibility(View.GONE);
                caja_periColeCam3_final.setVisibility(View.GONE);


                caja_anuncio_nivelPart3.setVisibility(View.GONE);
                caja_nivelPart3.setVisibility(View.GONE);
                caja_nivelPart3_final.setVisibility(View.GONE);

                caja_agregar_otraPart2.setVisibility(View.VISIBLE);
                caja_agregar_otraPart3.setVisibility(View.GONE);


            }
        });
        guardar_orgColeCam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_orgColeCam3=orgColeCam3_texto.getText().toString();
                orgColeCam3.setText(nuevo_orgColeCam3);
                if (!nuevo_orgColeCam3.trim().equals("")) {
                    caja_orgColeCam3.setVisibility(View.GONE);
                    caja_orgColeCam3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del organismo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_orgColeCam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_orgColeCam3.setVisibility(View.VISIBLE);
                caja_orgColeCam3_final.setVisibility(View.GONE);

            }
        });
        guardar_periColeCam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_periColeCam3= periColeCam3_texto.getText().toString();
                periColeCam3.setText(nuevo_periColeCam3);
                if (!nuevo_periColeCam3.trim().equals("")) {
                    caja_edit_periColeCam3.setVisibility(View.GONE);
                    caja_periColeCam3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El periodo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_periColeCam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_periColeCam3.setVisibility(View.VISIBLE);
                caja_periColeCam3_final.setVisibility(View.GONE);

            }
        });
        guardar_nivelPart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_nivelPart3= nivelPart3_texto.getText().toString();
                nivelPart3_vista.setText(nuevo_nivelPart3);
                if (!nuevo_nivelPart3.trim().equals("")) {
                    caja_nivelPart3.setVisibility(View.GONE);
                    caja_nivelPart3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_nivelPart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_nivelPart3.setVisibility(View.VISIBLE);
                caja_nivelPart3_final.setVisibility(View.GONE);

            }
        });

        agregar_otraPart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam4.setVisibility(View.VISIBLE);
                caja_orgColeCam4.setVisibility(View.VISIBLE);
                orgColeCam4_texto.setText("");
                caja_anuncio_periColeCam4.setVisibility(View.VISIBLE);
                caja_edit_periColeCam4.setVisibility(View.VISIBLE);
                periColeCam4_texto.setText("");

                caja_anuncio_nivelPart4.setVisibility(View.VISIBLE);
                caja_nivelPart4.setVisibility(View.VISIBLE);
                nivelPart4_texto.setText("");



                caja_agregar_otraPart3.setVisibility(View.GONE);
                caja_borrar_otraPart3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraPart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam4.setVisibility(View.GONE);
                caja_orgColeCam4.setVisibility(View.GONE);
                caja_orgColeCam4_final.setVisibility(View.GONE);

                caja_anuncio_periColeCam4.setVisibility(View.GONE);
                caja_edit_periColeCam4.setVisibility(View.GONE);
                caja_periColeCam4_final.setVisibility(View.GONE);

                caja_anuncio_nivelPart4.setVisibility(View.GONE);
                caja_nivelPart4.setVisibility(View.GONE);
                caja_nivelPart4_final.setVisibility(View.GONE);



                caja_agregar_otraPart3.setVisibility(View.VISIBLE);
                caja_borrar_otraPart3.setVisibility(View.GONE);


            }
        });
        guardar_orgColeCam4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_orgColeCam4=orgColeCam4_texto.getText().toString();
                orgColeCam4.setText(nuevo_orgColeCam4);
                if (!nuevo_orgColeCam4.trim().equals("")) {
                    caja_orgColeCam4.setVisibility(View.GONE);
                    caja_orgColeCam4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del organismo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_orgColeCam4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_orgColeCam4.setVisibility(View.VISIBLE);
                caja_orgColeCam4_final.setVisibility(View.GONE);

            }
        });
        guardar_periColeCam4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_periColeCam4= periColeCam4_texto.getText().toString();
                periColeCam4.setText(nuevo_periColeCam4);
                if (!nuevo_periColeCam4.trim().equals("")) {
                    caja_edit_periColeCam4.setVisibility(View.GONE);
                    caja_periColeCam4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El periodo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_periColeCam4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_periColeCam4.setVisibility(View.VISIBLE);
                caja_periColeCam4_final.setVisibility(View.GONE);

            }
        });
        guardar_nivelPart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_nivelPart4= nivelPart4_texto.getText().toString();
                nivelPart4_vista.setText(nuevo_nivelPart4);
                if (!nuevo_nivelPart4.trim().equals("")) {
                    caja_nivelPart4.setVisibility(View.GONE);
                    caja_nivelPart4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_nivelPart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_nivelPart4.setVisibility(View.VISIBLE);
                caja_nivelPart4_final.setVisibility(View.GONE);

            }
        });
    }
}