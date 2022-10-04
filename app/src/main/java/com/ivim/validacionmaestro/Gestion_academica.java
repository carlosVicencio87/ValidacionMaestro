package com.ivim.validacionmaestro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Gestion_academica extends AppCompatActivity {
    private ScrollView formulario_gestioAcademica;

    private LinearLayout caja_borrar_otraGesAca4,caja_agregar_otraGesAca3,caja_edit_tiemGesAcaA4,caja_anuncio_tiemGesAcaA4,caja_edit_intGesAca4,
            caja_agregar_otraGesAca2,caja_edit_tiemGesAcaA3,caja_anuncio_tiemGesAcaA3,caja_tiemGesAca3,caja_anuncio_tiemGesAca3,caja_edit_intGesAca3,caja_anuncio_intGesAca3,caja_actiPues3,
            caja_anuncio_actiPues3,caja_agregar_otraGesAca,caja_edit_tiemGesAcaA2,caja_anuncio_tiemGesAcaA2,caja_anuncio_tiemGesAca2,caja_edit_intGesAca2,caja_anuncio_intGesAca2,
            caja_edit_actiPues2,caja_anuncio_actiPues2,caja_edit_tiemGesAca2,caja_tiemGesAca4,caja_anuncio_tiemGesAca4,
            caja_anuncio_intGesAca4,caja_actiPues4,caja_anuncio_actiPues4,caja_edit_actiPuesto,caja_actiPuesto_final,caja_edit_instGesAca,
            caja_instGesAca_final,caja_edit_tiemGesAca,caja_tiemGesAca_final,caja_edit_tiemGesAcaA,
            caja_tiemGesAcaA_final,caja_actiPues2_final,caja_intGesAca2_final,caja_tiemGesAca2_final,
            caja_tiemGesAcaA2_final,caja_actiPues3_final,caja_intGesAca3_final,caja_tiemGesAca3_final,
            caja_tiemGesAcaA3_final,caja_actiPues4_final,caja_intGesAca4_final,caja_tiemGesAca4_final,
            caja_tiemGesAcaA4_final;

    private EditText actiPuesto_texto,
            instGesAca_texto,tiemGesAca_texto,tiemGesAcaA_texto,actiPues2_texto,
            intGesAca2_texto,tiemGesAca2_texto,tiemGesAcaA2_texto,actiPues3_texto,
            intGesAca3_texto,tiemGesAca3_texto,tiemGesAcaA3_texto,actiPues4_texto,
            intGesAca4_texto,tiemGesAca4_texto,tiemGesAcaA4_texto;


    private ImageView guardar_actiPuesto,cambiar_actiPuesto,guardar_instGesAca,
            cambiar_instGesAca,guardar_tiemGesAca,cambiar_tiemGesAca,guardar_tiemGesAcaA,
            cambiar_tiemGesAcaA,guardar_actiPues2,cambiar_actiPues2,guardar_intGesAca2,cambiar_intGesAca2,
            guardar_tiemGesAca2,cambiar_tiemGesAca2,guardar_tiemGesAcaA2,cambiar_tiemGesAcaA2,
            guardar_actiPues3,cambiar_actiPues3,guardar_intGesAca3,cambiar_intGesAca3,
            guardar_tiemGesAca3,cambiar_tiemGesAca3,guardar_tiemGesAcaA3,cambiar_tiemGesAcaA3,
            guardar_actiPues4,cambiar_actiPues4,guardar_intGesAca4,cambiar_intGesAca4,
            guardar_tiemGesAca4,cambiar_tiemGesAca4,guardar_tiemGesAcaA4,cambiar_tiemGesAcaA4;

    private TextView borrar_otraGesAca4,agregar_otraGesAca3,borrar_otraGesAca3,agregar_otraGesAca2,
            borrar_otraGesAca2,agregar_otraGesAca,actiPuesto,instGesAca,tiemGesAca,tiemGesAcaA,actiPues2,intGesAca2,tiemGesAca2,tiemGesAcaA2,actiPues3,
            intGesAca3,tiemGesAca3_vista,tiemGesAcaA3,actiPues4,intGesAca4,tiemGesAca4_vista,tiemGesAcaA4,actuaGes;

    private String nuevo_actiPuesto,
            nuevo_instGesAca,nuevo_tiemGesAca,nuevo_tiemGesAcaA,nuevo_actiPues2,nuevo_intGesAca2,
            nuevo_tiemGesAca2,nuevo_tiemGesAcaA2,nuevo_actiPues3,nuevo_intGesAca3,nuevo_tiemGesAca3,
            nuevo_tiemGesAcaA3,nuevo_actiPues4,nuevo_intGesAca4,nuevo_tiemGesAca4,nuevo_tiemGesAcaA4, gestAcade_totales,id_SesionUsuer,id_usuer,gestioAca_Usuer;
    private JSONArray json_datos_actuaDisci;
    private ExecutorService executorService;
    private static String SERVIDOR_CONTROLADOR;
    private SharedPreferences idSher,id_SesionSher,gestioAca_sher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_gestion_academica);
        guardar_actiPuesto= findViewById(R.id.guardar_actiPuesto);
        actiPuesto_texto = findViewById(R.id.actiPuesto_texto);
        actiPuesto = findViewById(R.id.actiPuesto);
        caja_edit_actiPuesto = findViewById(R.id.caja_edit_actiPuesto);
        caja_actiPuesto_final = findViewById(R.id.caja_actiPuesto_final);
        cambiar_actiPuesto = findViewById(R.id.cambiar_actiPuesto);

        guardar_instGesAca = findViewById(R.id.guardar_instGesAca);
        instGesAca_texto = findViewById(R.id.instGesAca_texto);
        instGesAca = findViewById(R.id.instGesAca);
        caja_edit_instGesAca = findViewById(R.id.caja_edit_instGesAca);
        caja_instGesAca_final = findViewById(R.id.caja_instGesAca_final);
        cambiar_instGesAca = findViewById(R.id.cambiar_instGesAca);

        guardar_tiemGesAca = findViewById(R.id.guardar_tiemGesAca);
        tiemGesAca_texto = findViewById(R.id.tiemGesAca_texto);
        tiemGesAca = findViewById(R.id.tiemGesAca);
        caja_edit_tiemGesAca = findViewById(R.id.caja_edit_tiemGesAca);
        caja_tiemGesAca_final = findViewById(R.id.caja_tiemGesAca_final);
        cambiar_tiemGesAca = findViewById(R.id.cambiar_tiemGesAca);


        guardar_tiemGesAcaA = findViewById(R.id.guardar_tiemGesAcaA);
        tiemGesAcaA_texto = findViewById(R.id.tiemGesAcaA_texto);
        tiemGesAcaA = findViewById(R.id.tiemGesAcaA);
        caja_edit_tiemGesAcaA = findViewById(R.id.caja_edit_tiemGesAcaA);
        caja_tiemGesAcaA_final = findViewById(R.id.caja_tiemGesAcaA_final);
        cambiar_tiemGesAcaA = findViewById(R.id.cambiar_tiemGesAcaA);


        guardar_actiPues2 = findViewById(R.id.guardar_actiPues2);
        actiPues2_texto = findViewById(R.id.actiPues2_texto);
        actiPues2 = findViewById(R.id.actiPues2);
        caja_actiPues2_final = findViewById(R.id.caja_actiPues2_final);
        cambiar_actiPues2 = findViewById(R.id.cambiar_actiPues2);


        guardar_intGesAca2 = findViewById(R.id.guardar_intGesAca2);
        intGesAca2_texto = findViewById(R.id.intGesAca2_texto);
        intGesAca2 = findViewById(R.id.intGesAca2);
        caja_intGesAca2_final = findViewById(R.id.caja_intGesAca2_final);
        cambiar_intGesAca2 = findViewById(R.id.cambiar_intGesAca2);


        guardar_tiemGesAca2 = findViewById(R.id.guardar_tiemGesAca2);
        tiemGesAca2_texto = findViewById(R.id.tiemGesAca2_texto);
        tiemGesAca2 = findViewById(R.id.tiemGesAca2);
        caja_tiemGesAca2_final = findViewById(R.id.caja_tiemGesAca2_final);
        cambiar_tiemGesAca2 = findViewById(R.id.cambiar_tiemGesAca2);

        guardar_tiemGesAcaA2 = findViewById(R.id.guardar_tiemGesAcaA2);
        tiemGesAcaA2_texto = findViewById(R.id.tiemGesAcaA2_texto);
        tiemGesAcaA2 = findViewById(R.id.tiemGesAcaA2);
        caja_tiemGesAcaA2_final = findViewById(R.id.caja_tiemGesAcaA2_final);
        cambiar_tiemGesAcaA2 = findViewById(R.id.cambiar_tiemGesAcaA2);

        guardar_actiPues3 = findViewById(R.id.guardar_actiPues3);
        actiPues3_texto = findViewById(R.id.actiPues3_texto);
        actiPues3 = findViewById(R.id.actiPues3);
        caja_actiPues3_final = findViewById(R.id.caja_actiPues3_final);
        cambiar_actiPues3 = findViewById(R.id.cambiar_actiPues3);

        guardar_intGesAca3 = findViewById(R.id.guardar_intGesAca3);
        intGesAca3_texto = findViewById(R.id.intGesAca3_texto);
        intGesAca3 = findViewById(R.id.intGesAca3);
        caja_intGesAca3_final = findViewById(R.id.caja_intGesAca3_final);
        cambiar_intGesAca3 = findViewById(R.id.cambiar_intGesAca3);

        guardar_tiemGesAca3 = findViewById(R.id.guardar_tiemGesAca3);
        tiemGesAca3_texto = findViewById(R.id.tiemGesAca3_texto);
        tiemGesAca3_vista = findViewById(R.id.tiemGesAca3_vista);
        caja_tiemGesAca3_final = findViewById(R.id.caja_tiemGesAca3_final);
        cambiar_tiemGesAca3 = findViewById(R.id.cambiar_tiemGesAca3);


        guardar_tiemGesAcaA3 = findViewById(R.id.guardar_tiemGesAcaA3);
        tiemGesAcaA3_texto = findViewById(R.id.tiemGesAcaA3_texto);
        tiemGesAcaA3 = findViewById(R.id.tiemGesAcaA3);
        caja_tiemGesAcaA3_final = findViewById(R.id.caja_tiemGesAcaA3_final);
        cambiar_tiemGesAcaA3 = findViewById(R.id.cambiar_tiemGesAcaA3);


        guardar_actiPues4 = findViewById(R.id.guardar_actiPues4);
        actiPues4_texto = findViewById(R.id.actiPues4_texto);
        actiPues4 = findViewById(R.id.actiPues4);
        caja_actiPues4_final = findViewById(R.id.caja_actiPues4_final);
        cambiar_actiPues4 = findViewById(R.id.cambiar_actiPues4);

        guardar_intGesAca4 = findViewById(R.id.guardar_intGesAca4);
        intGesAca4_texto = findViewById(R.id.intGesAca4_texto);
        intGesAca4 = findViewById(R.id.intGesAca4);
        caja_intGesAca4_final = findViewById(R.id.caja_intGesAca4_final);
        cambiar_intGesAca4 = findViewById(R.id.cambiar_intGesAca4);

        guardar_tiemGesAca4 = findViewById(R.id.guardar_tiemGesAca4);
        tiemGesAca4_texto = findViewById(R.id.tiemGesAca4_texto);
        tiemGesAca4_vista = findViewById(R.id.tiemGesAca4_vista);
        caja_tiemGesAca4_final = findViewById(R.id.caja_tiemGesAca4_final);
        cambiar_tiemGesAca4 = findViewById(R.id.cambiar_tiemGesAca4);

        guardar_tiemGesAcaA4 = findViewById(R.id.guardar_tiemGesAcaA4);
        tiemGesAcaA4_texto = findViewById(R.id.tiemGesAcaA4_texto);
        tiemGesAcaA4 = findViewById(R.id.tiemGesAcaA4);
        caja_tiemGesAcaA4_final = findViewById(R.id.caja_tiemGesAcaA4_final);
        cambiar_tiemGesAcaA4 = findViewById(R.id.cambiar_tiemGesAcaA4);

        caja_agregar_otraGesAca = findViewById(R.id.caja_agregar_otraGesAca);
        agregar_otraGesAca = findViewById(R.id.agregar_otraGesAca);
        caja_anuncio_actiPues2 = findViewById(R.id.caja_anuncio_actiPues2);
        caja_edit_actiPues2 = findViewById(R.id.caja_edit_actiPues2);
        caja_anuncio_intGesAca2 = findViewById(R.id.caja_anuncio_intGesAca2);
        caja_edit_intGesAca2 = findViewById(R.id.caja_edit_intGesAca2);
        caja_anuncio_tiemGesAca2 = findViewById(R.id.caja_anuncio_tiemGesAca2);
        caja_edit_tiemGesAca2 = findViewById(R.id.caja_edit_tiemGesAca2);
        caja_anuncio_tiemGesAcaA2 = findViewById(R.id.caja_anuncio_tiemGesAcaA2);
        caja_edit_tiemGesAcaA2 = findViewById(R.id.caja_edit_tiemGesAcaA2);
        caja_agregar_otraGesAca2 = findViewById(R.id.caja_agregar_otraGesAca2);
        agregar_otraGesAca2 = findViewById(R.id.agregar_otraGesAca2);
        borrar_otraGesAca2 = findViewById(R.id.borrar_otraGesAca2);
        caja_anuncio_actiPues3 = findViewById(R.id.caja_anuncio_actiPues3);
        caja_actiPues3 = findViewById(R.id.caja_actiPues3);
        caja_anuncio_intGesAca3 = findViewById(R.id.caja_anuncio_intGesAca3);
        caja_edit_intGesAca3 = findViewById(R.id.caja_edit_intGesAca3);
        caja_anuncio_tiemGesAca3 = findViewById(R.id.caja_anuncio_tiemGesAca3);
        caja_tiemGesAca3 = findViewById(R.id.caja_tiemGesAca3);
        caja_anuncio_tiemGesAcaA3 = findViewById(R.id.caja_anuncio_tiemGesAcaA3);
        caja_edit_tiemGesAcaA3 = findViewById(R.id.caja_edit_tiemGesAcaA3);
        caja_agregar_otraGesAca3 = findViewById(R.id.caja_agregar_otraGesAca3);
        borrar_otraGesAca3 = findViewById(R.id.borrar_otraGesAca3);
        agregar_otraGesAca3 = findViewById(R.id.agregar_otraGesAca3);
        caja_anuncio_actiPues4 = findViewById(R.id.caja_anuncio_actiPues4);
        caja_actiPues4 = findViewById(R.id.caja_actiPues4);
        caja_anuncio_intGesAca4 = findViewById(R.id.caja_anuncio_intGesAca4);
        caja_edit_intGesAca4 = findViewById(R.id.caja_edit_intGesAca4);
        caja_anuncio_tiemGesAca4 = findViewById(R.id.caja_anuncio_tiemGesAca4);
        caja_tiemGesAca4 = findViewById(R.id.caja_tiemGesAca4);
        caja_anuncio_tiemGesAcaA4 = findViewById(R.id.caja_anuncio_tiemGesAcaA4);
        caja_edit_tiemGesAcaA4 = findViewById(R.id.caja_edit_tiemGesAcaA4);
        caja_borrar_otraGesAca4 = findViewById(R.id.caja_borrar_otraGesAca4);
        borrar_otraGesAca4 = findViewById(R.id.borrar_otraGesAca4);
        actuaGes=findViewById(R.id.actuaGes);
        executorService= Executors.newSingleThreadExecutor();
        SERVIDOR_CONTROLADOR = new Servidor().local;
        idSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_usuer =idSher.getString("id","no");
        Log.e("ID",""+ gestAcade_totales);
        id_SesionSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_SesionUsuer=id_SesionSher.getString("id_sesion","no");
        Log.e("ID",""+id_SesionUsuer);
        gestioAca_sher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        gestioAca_Usuer=gestioAca_sher.getString("gestion_academica","no");
        Log.e("gest",""+gestioAca_Usuer);
        pedir_gesAca();
        guardar_actiPuesto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPuesto = actiPuesto_texto.getText().toString();
                actiPuesto.setText(nuevo_actiPuesto);
                if (!nuevo_actiPuesto.trim().equals("")) {
                    caja_edit_actiPuesto.setVisibility(View.GONE);
                    caja_actiPuesto_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPuesto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_actiPuesto.setVisibility(View.VISIBLE);
                caja_actiPuesto_final.setVisibility(View.GONE);

            }
        });
        guardar_instGesAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instGesAca = instGesAca_texto.getText().toString();
                instGesAca.setText(nuevo_instGesAca);
                if (!nuevo_instGesAca.trim().equals("")) {
                    caja_edit_instGesAca.setVisibility(View.GONE);
                    caja_instGesAca_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instGesAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instGesAca.setVisibility(View.VISIBLE);
                caja_instGesAca_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAca = tiemGesAca_texto.getText().toString();
                tiemGesAca.setText(nuevo_tiemGesAca);
                if (!nuevo_tiemGesAca.trim().equals("")) {
                    caja_edit_tiemGesAca.setVisibility(View.GONE);
                    caja_tiemGesAca_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de inicio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemGesAca.setVisibility(View.VISIBLE);
                caja_tiemGesAca_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAcaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAcaA = tiemGesAcaA_texto.getText().toString();
                tiemGesAcaA.setText(nuevo_tiemGesAcaA);
                if (!nuevo_tiemGesAcaA.trim().equals("")) {
                    caja_edit_tiemGesAcaA.setVisibility(View.GONE);
                    caja_tiemGesAcaA_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAcaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemGesAcaA.setVisibility(View.VISIBLE);
                caja_tiemGesAcaA_final.setVisibility(View.GONE);

            }
        });
        agregar_otraGesAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues2.setVisibility(View.VISIBLE);
                caja_edit_actiPues2.setVisibility(View.VISIBLE);
                actiPues2_texto.setText("");

                caja_anuncio_intGesAca2.setVisibility(View.VISIBLE);
                caja_edit_intGesAca2.setVisibility(View.VISIBLE);
                intGesAca2_texto.setText("");

                caja_anuncio_tiemGesAca2.setVisibility(View.VISIBLE);
                caja_edit_tiemGesAca2.setVisibility(View.VISIBLE);
                tiemGesAca2_texto.setText("");

                caja_anuncio_tiemGesAcaA2.setVisibility(View.VISIBLE);
                caja_edit_tiemGesAcaA2.setVisibility(View.VISIBLE);
                tiemGesAcaA2_texto.setText("");

                caja_agregar_otraGesAca.setVisibility(View.GONE);
                caja_agregar_otraGesAca2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues2.setVisibility(View.GONE);
                caja_edit_actiPues2.setVisibility(View.GONE);
                caja_actiPues2_final.setVisibility(View.GONE);
                actiPues2.setText("");


                caja_anuncio_intGesAca2.setVisibility(View.GONE);
                caja_edit_intGesAca2.setVisibility(View.GONE);
                caja_intGesAca2_final.setVisibility(View.GONE);
                intGesAca2.setText("");


                caja_anuncio_tiemGesAca2.setVisibility(View.GONE);
                caja_edit_tiemGesAca2.setVisibility(View.GONE);
                caja_tiemGesAca2_final.setVisibility(View.GONE);
                tiemGesAcaA3.setText("");


                caja_anuncio_tiemGesAcaA2.setVisibility(View.GONE);
                caja_edit_tiemGesAcaA2.setVisibility(View.GONE);
                caja_tiemGesAcaA2_final.setVisibility(View.GONE);
                tiemGesAcaA2.setText("");


                caja_agregar_otraGesAca.setVisibility(View.VISIBLE);
                caja_agregar_otraGesAca2.setVisibility(View.GONE);


            }
        });
        guardar_actiPues2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPues2 = actiPues2_texto.getText().toString();
                actiPues2.setText(nuevo_actiPues2);
                if (!nuevo_actiPues2.trim().equals("")) {
                    caja_edit_actiPues2.setVisibility(View.GONE);
                    caja_actiPues2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPues2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_actiPues2.setVisibility(View.VISIBLE);
                caja_actiPues2_final.setVisibility(View.GONE);

            }
        });
        guardar_intGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_intGesAca2= intGesAca2_texto.getText().toString();
                intGesAca2.setText(nuevo_intGesAca2);
                if (!nuevo_intGesAca2.trim().equals("")) {
                    caja_edit_intGesAca2.setVisibility(View.GONE);
                    caja_intGesAca2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_intGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_intGesAca2.setVisibility(View.VISIBLE);
                caja_intGesAca2_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAca2 = tiemGesAca2_texto.getText().toString();
                tiemGesAca2.setText(nuevo_tiemGesAca2);
                if (!nuevo_tiemGesAca2.trim().equals("")) {
                    caja_edit_tiemGesAca2.setVisibility(View.GONE);
                    caja_tiemGesAca2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de inicio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemGesAca2.setVisibility(View.VISIBLE);
                caja_tiemGesAca2_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAcaA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAcaA2 = tiemGesAcaA2_texto.getText().toString();
                tiemGesAcaA2.setText(nuevo_tiemGesAcaA2);
                if (!nuevo_tiemGesAcaA2.trim().equals("")) {
                    caja_edit_tiemGesAcaA2.setVisibility(View.GONE);
                    caja_tiemGesAcaA2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAcaA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemGesAcaA2.setVisibility(View.VISIBLE);
                caja_tiemGesAcaA2_final.setVisibility(View.GONE);

            }
        });


        agregar_otraGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues3.setVisibility(View.VISIBLE);
                caja_actiPues3.setVisibility(View.VISIBLE);
                actiPues3_texto.setText("");

                caja_anuncio_intGesAca3.setVisibility(View.VISIBLE);
                caja_edit_intGesAca3.setVisibility(View.VISIBLE);
                intGesAca3_texto.setText("");

                caja_anuncio_tiemGesAca3.setVisibility(View.VISIBLE);
                caja_tiemGesAca3.setVisibility(View.VISIBLE);
                tiemGesAca3_texto.setText("");

                caja_anuncio_tiemGesAcaA3.setVisibility(View.VISIBLE);
                caja_edit_tiemGesAcaA3.setVisibility(View.VISIBLE);
                tiemGesAcaA3_texto.setText("");

                caja_agregar_otraGesAca2.setVisibility(View.GONE);
                caja_agregar_otraGesAca3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues3.setVisibility(View.GONE);
                caja_actiPues3.setVisibility(View.GONE);
                caja_actiPues3_final.setVisibility(View.GONE);
                actiPues3.setText("");

                caja_anuncio_intGesAca3.setVisibility(View.GONE);
                caja_edit_intGesAca3.setVisibility(View.GONE);
                caja_intGesAca3_final.setVisibility(View.GONE);
                intGesAca3.setText("");

                caja_anuncio_tiemGesAca3.setVisibility(View.GONE);
                caja_tiemGesAca3.setVisibility(View.GONE);
                caja_tiemGesAca3_final.setVisibility(View.GONE);
                tiemGesAca3_vista.setText("");

                caja_anuncio_tiemGesAcaA3.setVisibility(View.GONE);
                caja_edit_tiemGesAcaA3.setVisibility(View.GONE);
                caja_tiemGesAcaA3_final.setVisibility(View.GONE);
                tiemGesAcaA3.setText("");

                caja_agregar_otraGesAca2.setVisibility(View.VISIBLE);
                caja_agregar_otraGesAca3.setVisibility(View.GONE);


            }
        });
        guardar_actiPues3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPues3 = actiPues3_texto.getText().toString();
                actiPues3.setText(nuevo_actiPues3);
                if (!nuevo_actiPues3.trim().equals("")) {
                    caja_actiPues3.setVisibility(View.GONE);
                    caja_actiPues3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPues3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_actiPues3.setVisibility(View.VISIBLE);
                caja_actiPues3_final.setVisibility(View.GONE);

            }
        });
        guardar_intGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_intGesAca3 = intGesAca3_texto.getText().toString();
                intGesAca3.setText(nuevo_intGesAca3);
                if (!nuevo_intGesAca3.trim().equals("")) {
                    caja_edit_intGesAca3.setVisibility(View.GONE);
                    caja_intGesAca3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_intGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_intGesAca3.setVisibility(View.VISIBLE);
                caja_intGesAca3_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAca3 = tiemGesAca3_texto.getText().toString();
                tiemGesAca3_vista.setText(nuevo_tiemGesAca3);
                if (!nuevo_tiemGesAca3.trim().equals("")) {
                    caja_tiemGesAca3.setVisibility(View.GONE);
                    caja_tiemGesAca3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de inicio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_tiemGesAca3.setVisibility(View.VISIBLE);
                caja_tiemGesAca3_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAcaA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAcaA3= tiemGesAcaA3_texto.getText().toString();
                tiemGesAcaA3.setText(nuevo_tiemGesAcaA3);
                if (!nuevo_tiemGesAcaA3.trim().equals("")) {
                    caja_edit_tiemGesAcaA3.setVisibility(View.GONE);
                    caja_tiemGesAcaA3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAcaA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemGesAcaA3.setVisibility(View.VISIBLE);
                caja_tiemGesAcaA3_final.setVisibility(View.GONE);

            }
        });
        agregar_otraGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues4.setVisibility(View.VISIBLE);
                caja_actiPues4.setVisibility(View.VISIBLE);
                actiPues4_texto.setText("");

                caja_anuncio_intGesAca4.setVisibility(View.VISIBLE);
                caja_edit_intGesAca4.setVisibility(View.VISIBLE);
                intGesAca4_texto.setText("");

                caja_anuncio_tiemGesAca4.setVisibility(View.VISIBLE);
                caja_tiemGesAca4.setVisibility(View.VISIBLE);
                tiemGesAca4_texto.setText("");

                caja_anuncio_tiemGesAcaA4.setVisibility(View.VISIBLE);
                caja_edit_tiemGesAcaA4.setVisibility(View.VISIBLE);
                tiemGesAcaA4_texto.setText("");
                caja_agregar_otraGesAca3.setVisibility(View.GONE);
                caja_borrar_otraGesAca4.setVisibility(View.VISIBLE);


            }
        });

        borrar_otraGesAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues4.setVisibility(View.GONE);
                caja_actiPues4.setVisibility(View.GONE);
                caja_actiPues4_final.setVisibility(View.GONE);
                actiPues4.setText("");

                caja_anuncio_intGesAca4.setVisibility(View.GONE);
                caja_edit_intGesAca4.setVisibility(View.GONE);
                caja_intGesAca4_final.setVisibility(View.GONE);
                intGesAca4.setText("");

                caja_anuncio_tiemGesAca4.setVisibility(View.GONE);
                caja_tiemGesAca4.setVisibility(View.GONE);
                caja_tiemGesAca4_final.setVisibility(View.GONE);
                tiemGesAca4_vista.setText("");

                caja_anuncio_tiemGesAcaA4.setVisibility(View.GONE);
                caja_edit_tiemGesAcaA4.setVisibility(View.GONE);
                caja_tiemGesAcaA4_final.setVisibility(View.GONE);
                tiemGesAcaA4.setText("");

                caja_agregar_otraGesAca3.setVisibility(View.VISIBLE);
                caja_borrar_otraGesAca4.setVisibility(View.GONE);


            }
        });
        guardar_actiPues4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPues4= actiPues4_texto.getText().toString();
                actiPues4.setText(nuevo_actiPues4);
                if (!nuevo_actiPues4.trim().equals("")) {
                    caja_actiPues4.setVisibility(View.GONE);
                    caja_actiPues4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPues4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_actiPues4.setVisibility(View.VISIBLE);
                caja_actiPues4_final.setVisibility(View.GONE);

            }
        });
        guardar_intGesAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_intGesAca4 = intGesAca4_texto.getText().toString();
                intGesAca4.setText(nuevo_intGesAca4);
                if (!nuevo_intGesAca4.trim().equals("")) {
                    caja_edit_intGesAca4.setVisibility(View.GONE);
                    caja_intGesAca4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_intGesAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_intGesAca4.setVisibility(View.VISIBLE);
                caja_intGesAca4_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAca4 = tiemGesAca4_texto.getText().toString();
                tiemGesAca4_vista.setText(nuevo_tiemGesAca4);
                if (!nuevo_tiemGesAca4.trim().equals("")) {
                    caja_tiemGesAca4.setVisibility(View.GONE);
                    caja_tiemGesAca4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de incio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_tiemGesAca4.setVisibility(View.VISIBLE);
                caja_tiemGesAca4_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAcaA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAcaA4= tiemGesAcaA4_texto.getText().toString();
                tiemGesAcaA4.setText(nuevo_tiemGesAcaA4);
                if (!nuevo_tiemGesAcaA4.trim().equals("")) {
                    caja_edit_tiemGesAcaA4.setVisibility(View.GONE);
                    caja_tiemGesAcaA4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAcaA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemGesAcaA4.setVisibility(View.VISIBLE);
                caja_tiemGesAcaA4_final.setVisibility(View.GONE);

            }
        });
        actuaGes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                nuevo_actiPuesto = actiPuesto.getText().toString();
                nuevo_instGesAca = instGesAca.getText().toString();
                nuevo_tiemGesAca =tiemGesAca.getText().toString();
                nuevo_tiemGesAcaA = tiemGesAcaA.getText().toString();
                nuevo_actiPues2 = actiPues2.getText().toString();
                nuevo_intGesAca2= intGesAca2.getText().toString();
                nuevo_tiemGesAca2 = tiemGesAca2.getText().toString();
                nuevo_tiemGesAcaA2 = tiemGesAcaA2.getText().toString();
                nuevo_actiPues3 = actiPues3.getText().toString();
                nuevo_intGesAca3 = intGesAca3.getText().toString();
                nuevo_tiemGesAca3 = tiemGesAca3_vista.getText().toString();
                nuevo_tiemGesAcaA3= tiemGesAcaA3.getText().toString();
                nuevo_actiPues4= actiPues4.getText().toString();
                nuevo_intGesAca4 = intGesAca4.getText().toString();
                nuevo_tiemGesAca4 = tiemGesAca4_vista.getText().toString();
                nuevo_tiemGesAcaA4= tiemGesAcaA4.getText().toString();

                if (nuevo_actiPuesto.trim().equals("")){
                    nuevo_actiPuesto=" ";
                }
                if (nuevo_instGesAca.trim().equals("")){
                    nuevo_instGesAca=" ";
                }
                if (nuevo_tiemGesAca.trim().equals("")){
                    nuevo_tiemGesAca=" ";
                }
                if (nuevo_tiemGesAcaA.trim().equals("")){
                    nuevo_tiemGesAcaA=" ";
                }
                if (nuevo_actiPues2.trim().equals("")){
                    nuevo_actiPues2=" ";
                }
                if (nuevo_intGesAca2.trim().equals("")){
                    nuevo_intGesAca2=" ";
                }
                if (nuevo_tiemGesAca2.trim().equals("")){
                    nuevo_tiemGesAca2=" ";
                }
                if (nuevo_tiemGesAcaA2.trim().equals("")){
                    nuevo_tiemGesAcaA2=" ";
                }
                if (nuevo_actiPues3.trim().equals("")){
                    nuevo_actiPues3=" ";
                }
                if (nuevo_intGesAca3.trim().equals("")){
                    nuevo_intGesAca3=" ";
                }
                if (nuevo_tiemGesAca3.trim().equals("")){
                    nuevo_tiemGesAca3=" ";
                }
                if (nuevo_tiemGesAcaA3.trim().equals("")){
                    nuevo_tiemGesAcaA3=" ";
                }
                if (nuevo_actiPues4.trim().equals("")){
                    nuevo_actiPues4=" ";
                }
                if (nuevo_intGesAca4.trim().equals("")){
                    nuevo_intGesAca4=" ";
                }
                if (nuevo_tiemGesAca4.trim().equals("")){
                    nuevo_tiemGesAca4=" ";
                }
                if (nuevo_tiemGesAcaA4.trim().equals("")){
                    nuevo_tiemGesAcaA4=" ";
                }
                JSONObject jsonObject=new JSONObject();
                json_datos_actuaDisci =new JSONArray();
                try {
                    jsonObject.put("nuevo_actiPuesto",nuevo_actiPuesto);
                    jsonObject.put("nuevo_instGesAca",nuevo_instGesAca);
                    jsonObject.put("nuevo_tiemGesAca",nuevo_tiemGesAca);
                    jsonObject.put("nuevo_tiemGesAcaA",nuevo_tiemGesAcaA);
                    jsonObject.put("nuevo_actiPues2",nuevo_actiPues2);
                    jsonObject.put("nuevo_intGesAca2",nuevo_intGesAca2);
                    jsonObject.put("nuevo_tiemGesAca2",nuevo_tiemGesAca2);
                    jsonObject.put("nuevo_tiemGesAcaA2",nuevo_tiemGesAcaA2);
                    jsonObject.put("nuevo_actiPues3",nuevo_actiPues3);
                    jsonObject.put("nuevo_intGesAca3",nuevo_intGesAca3);
                    jsonObject.put("nuevo_tiemGesAca3",nuevo_tiemGesAca3);
                    jsonObject.put("nuevo_tiemGesAcaA3",nuevo_tiemGesAcaA3);
                    jsonObject.put("nuevo_actiPues4",nuevo_actiPues4);
                    jsonObject.put("nuevo_intGesAca4",nuevo_intGesAca4);
                    jsonObject.put("nuevo_tiemGesAca4",nuevo_tiemGesAca4);
                    jsonObject.put("nuevo_tiemGesAcaA4",nuevo_tiemGesAcaA4);
                    json_datos_actuaDisci.put(jsonObject);
                    Log.e("1", String.valueOf(jsonObject));
                    Log.e("2", String.valueOf(json_datos_actuaDisci));
                    for(int i = 0; i< json_datos_actuaDisci.length(); i++){
                        try {JSONObject jsoSacandoPro= json_datos_actuaDisci.getJSONObject(i);
                            String strnuevo_actiPuesto=jsoSacandoPro.get("nuevo_actiPuesto").toString();
                            String strnuevo_instGesAca=jsoSacandoPro.get("nuevo_instGesAca").toString();
                            String strnuevo_tiemGesAca=jsoSacandoPro.get("nuevo_tiemGesAca").toString();
                            String strnuevo_tiemGesAcaA=jsoSacandoPro.get("nuevo_tiemGesAcaA").toString();
                            String strnuevo_actiPues2=jsoSacandoPro.get("nuevo_actiPues2").toString();
                            String strnuevo_intGesAca2=jsoSacandoPro.get("nuevo_intGesAca2").toString();
                            String strnuevo_tiemGesAca2=jsoSacandoPro.get("nuevo_tiemGesAca2").toString();
                            String strnuevo_tiemGesAcaA2=jsoSacandoPro.get("nuevo_tiemGesAcaA2").toString();
                            String strnuevo_actiPues3=jsoSacandoPro.get("nuevo_actiPues3").toString();
                            String strnuevo_intGesAca3=jsoSacandoPro.get("nuevo_intGesAca3").toString();
                            String strnuevo_tiemGesAca3=jsoSacandoPro.get("nuevo_tiemGesAca3").toString();
                            String strnuevo_tiemGesAcaA3=jsoSacandoPro.get("nuevo_tiemGesAcaA3").toString();
                            String strnuevo_actiPues4=jsoSacandoPro.get("nuevo_actiPues4").toString();
                            String strnuevo_intGesAca4=jsoSacandoPro.get("nuevo_intGesAca4").toString();
                            String strnuevo_tiemGesAca4=jsoSacandoPro.get("nuevo_tiemGesAca4").toString();
                            String strnuevo_tiemGesAcaA4=jsoSacandoPro.get("nuevo_tiemGesAcaA4").toString();

                            gestAcade_totales =strnuevo_actiPuesto+" /*-*/ "+strnuevo_instGesAca+" /*-*/ "+strnuevo_tiemGesAca+" /*-*/ "+strnuevo_tiemGesAcaA
                                    +" /*-*/ "+strnuevo_actiPues2+" /*-*/ "+strnuevo_intGesAca2+" /*-*/ "+strnuevo_tiemGesAca2+
                                    " /*-*/ "+strnuevo_tiemGesAcaA2+" /*-*/ "+strnuevo_actiPues3+" /*-*/ "+strnuevo_intGesAca3+" /*-*/ "+strnuevo_tiemGesAca3
                                    +" /*-*/ "+strnuevo_tiemGesAcaA3+" /*-*/ "+strnuevo_actiPues4+" /*-*/ "+strnuevo_intGesAca4+
                                    " /*-*/ "+strnuevo_tiemGesAca4+" /*-*/ "+strnuevo_tiemGesAcaA4;
                            if(!gestAcade_totales.trim().equals("")){
                                executorService.execute(new Runnable() {
                                    @Override
                                    public void run() {
                                        guardando_gestAcadem();
                                        Intent intent = new Intent(Gestion_academica.this,Login.class);
                                        startActivity(intent);
                                    }
                                });
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
    }
    public void guardando_gestAcadem(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"gestion_academica.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("respuesta:",response);
                        if (response.equals("no_existe")) {

                        }
                        else
                        {

                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e( "error", "error: " +error.getMessage());
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> map = new HashMap<>();
                map.put("gestion_academica",gestAcade_totales);
                map.put("id",id_usuer);
                map.put("id_sesion",id_SesionUsuer);
                return map;
            }
        };
        requestQueue.add(request);
    }
    public void pedir_gesAca(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"pedir_gestion_academica.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("respuesta:",response);

                        JSONObject jsonObject = null;
                        try {
                            jsonObject = new JSONObject(response);
                            String str_gestion_academica = jsonObject.getString("gestion_academica");

                            if(!str_gestion_academica.equals("")){
                                Log.e("respuesta_frag",""+str_gestion_academica);
                                String[] gestionAca_fragmentada=str_gestion_academica.split(" /\\*-\\*/ ");
                                Log.e("respuesta_frag",""+gestionAca_fragmentada);

                                if(!gestionAca_fragmentada[0].equals(" ")){


                                    nuevo_actiPuesto=gestionAca_fragmentada[0];
                                    nuevo_instGesAca=gestionAca_fragmentada[1];
                                    nuevo_tiemGesAca=gestionAca_fragmentada[2];
                                    nuevo_tiemGesAcaA=gestionAca_fragmentada[3];

                                    Log.e("Nuevalic",""+nuevo_actiPuesto);
                                    actiPuesto.setText(nuevo_actiPuesto);
                                    instGesAca.setText(nuevo_instGesAca);
                                    tiemGesAca.setText(nuevo_tiemGesAca);
                                    tiemGesAcaA.setText(nuevo_tiemGesAcaA);
                                    caja_edit_actiPuesto.setVisibility(View.GONE);
                                    caja_actiPuesto_final.setVisibility(View.VISIBLE);

                                    caja_edit_instGesAca.setVisibility(View.GONE);
                                    caja_instGesAca_final.setVisibility(View.VISIBLE);

                                    caja_edit_tiemGesAca.setVisibility(View.GONE);
                                    caja_tiemGesAca_final.setVisibility(View.VISIBLE);

                                    caja_edit_tiemGesAcaA.setVisibility(View.GONE);
                                    caja_tiemGesAcaA_final.setVisibility(View.VISIBLE);


                                    if(!gestionAca_fragmentada[4].equals(" ")){

                                        nuevo_actiPues2=gestionAca_fragmentada[4];
                                        nuevo_intGesAca2=gestionAca_fragmentada[5];
                                        nuevo_tiemGesAca2=gestionAca_fragmentada[6];
                                        nuevo_tiemGesAcaA2=gestionAca_fragmentada[7];
                                        Log.e("Nuevalic",""+nuevo_actiPues2);
                                        actiPues2.setText(nuevo_actiPues2);
                                        intGesAca2.setText(nuevo_intGesAca2);
                                        tiemGesAca2.setText(nuevo_tiemGesAca2);
                                        tiemGesAcaA2.setText(nuevo_tiemGesAcaA2);

                                        caja_edit_actiPues2.setVisibility(View.GONE);
                                        caja_actiPues2_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_actiPues2.setVisibility(View.VISIBLE);


                                        caja_edit_intGesAca2.setVisibility(View.GONE);
                                        caja_intGesAca2_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_intGesAca2.setVisibility(View.VISIBLE);


                                        caja_edit_tiemGesAca2.setVisibility(View.GONE);
                                        caja_tiemGesAca2_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_tiemGesAca2.setVisibility(View.VISIBLE);


                                        caja_edit_tiemGesAcaA2.setVisibility(View.GONE);
                                        caja_tiemGesAcaA2_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_tiemGesAcaA2.setVisibility(View.VISIBLE);


                                        caja_agregar_otraGesAca.setVisibility(View.GONE);
                                        caja_agregar_otraGesAca2.setVisibility(View.VISIBLE);


                                    }
                                    if(!gestionAca_fragmentada[8].equals(" ")){

                                        nuevo_actiPues3=gestionAca_fragmentada[8];
                                        nuevo_intGesAca3=gestionAca_fragmentada[9];
                                        nuevo_tiemGesAca3=gestionAca_fragmentada[10];
                                        nuevo_tiemGesAcaA3=gestionAca_fragmentada[11];

                                        Log.e("Nuevalic3",""+nuevo_actiPues3);
                                        actiPues3.setText(nuevo_actiPues3);
                                        intGesAca3.setText(nuevo_intGesAca3);
                                        tiemGesAca3_vista.setText(nuevo_tiemGesAca3);
                                        tiemGesAcaA3.setText(nuevo_tiemGesAcaA3);

                                        caja_actiPues3.setVisibility(View.GONE);
                                        caja_actiPues3_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_actiPues3.setVisibility(View.VISIBLE);


                                        caja_edit_intGesAca3.setVisibility(View.GONE);
                                        caja_intGesAca3_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_intGesAca3.setVisibility(View.VISIBLE);


                                        caja_tiemGesAca3.setVisibility(View.GONE);
                                        caja_tiemGesAca3_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_tiemGesAca3.setVisibility(View.VISIBLE);


                                        caja_edit_tiemGesAcaA3.setVisibility(View.GONE);
                                        caja_tiemGesAcaA3_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_tiemGesAcaA3.setVisibility(View.VISIBLE);


                                        caja_agregar_otraGesAca2.setVisibility(View.GONE);
                                        caja_agregar_otraGesAca3.setVisibility(View.VISIBLE);


                                    }
                                    if(!gestionAca_fragmentada[12].equals(" ")){

                                        nuevo_actiPues4=gestionAca_fragmentada[12];
                                        nuevo_intGesAca4=gestionAca_fragmentada[13];
                                        nuevo_tiemGesAca4=gestionAca_fragmentada[14];
                                        nuevo_tiemGesAcaA4=gestionAca_fragmentada[15];
                                        Log.e("Nuevalic4",""+nuevo_actiPues4);
                                        actiPues4.setText(nuevo_actiPues4);
                                        intGesAca4.setText(nuevo_intGesAca4);
                                        tiemGesAca4_vista.setText(nuevo_tiemGesAca4);
                                        tiemGesAcaA4.setText(nuevo_tiemGesAcaA4);

                                        caja_actiPues4.setVisibility(View.GONE);
                                        caja_actiPues4_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_actiPues4.setVisibility(View.VISIBLE);

                                        caja_edit_intGesAca4.setVisibility(View.GONE);
                                        caja_intGesAca4_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_intGesAca4.setVisibility(View.VISIBLE);

                                        caja_tiemGesAca4.setVisibility(View.GONE);
                                        caja_tiemGesAca4_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_tiemGesAca4.setVisibility(View.VISIBLE);

                                        caja_edit_tiemGesAcaA4.setVisibility(View.GONE);
                                        caja_tiemGesAcaA4_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_tiemGesAcaA4.setVisibility(View.VISIBLE);


                                        caja_agregar_otraGesAca3.setVisibility(View.GONE);
                                        caja_borrar_otraGesAca4.setVisibility(View.VISIBLE);
                                    }

                                }







                            }


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e( "error", "error: " +error.getMessage());
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> map = new HashMap<>();
                map.put("id",id_usuer);
                map.put("id_sesion",id_SesionUsuer);
                return map;
            }
        };
        requestQueue.add(request);
    }
}