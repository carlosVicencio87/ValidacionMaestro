package com.ivim.validacionmaestro;

import androidx.appcompat.app.AppCompatActivity;

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
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Actualizacion_disciplinar extends AppCompatActivity {
    private ScrollView formulario_datosBasicos,formulario_formaDocente,formulario_formaCapaDocente,
            formulario_actuaDisci,formulario_gestioAcademica,formulario_productosAcademicos,formulario_expProfeNoAcade,
            formulario_expDiseñoIng,formulario_logrosProfeNoAca,formulario_partColeCam,formulario_premDist,
            formulario_aportacionPe;

    private LinearLayout caja_borrar_otraActua,caja_agregar_otraActua,caja_edit_horaActua2,
            caja_anuncio_horaActua2,caja_edit_anoActua2,caja_anuncio_anoActua2,caja_edit_instPaisActua2,
            caja_anuncio_actuaInts2,caja_edit_actua2,caja_anuncio_tipoActua2,caja_agregar_otraactua3
            ,caja_edit_horaactua3,caja_anuncio_horaactua3,caja_anoactua3,caja_anuncio_anoactua3,caja_edit_intactua3,
            caja_anuncio_instActua3,caja_actua3,caja_anuncio_actua3,caja_anuncio_actua4,caja_actua4,caja_anuncio_instactua4,
            caja_edit_instactua4,caja_anuncio_anoactua4,caja_anuncio_horasactua4,caja_edit_horaactua4,caja_borrar_otraactua4,
            caja_anoactua4,caja_edit_tipoActua,
            caja_tipoActua_final,caja_edit_instPaisActua,caja_instPaisActua_final,
            caja_edit_anoObtencionActua,caja_anoObtencionActua_final,caja_edit_horasActua,
            caja_horasActua_final,caja_actua2_final,caja_instPaisActua2_final,caja_anoActua2_final,
            caja_horaActua2_final,caja_actua3_final,caja_instactua3_final,caja_anoactua3_final,
            caja_horaactua3_final,caja_actua4_final,caja_instactua4_final,caja_anoactua4_final,
            caja_horaactua4_final;

    private EditText tipoActua_texto,instPaisActua_texto,anoObtencionActua_texto,
            horasActua_texto,actua2_texto,instPaisActua2_texto,anoActua2_texto,horaActua2_texto,
            actua3_texto,instactua3_texto,anoactua3_texto,horaactua3_texto,actua4_texto,
            instactua4_texto,anoactua4_texto,horaactua4_texto;


    private ImageView guardar_tipoActua,cambiar_tipoActua,guardar_instPaisActua,cambiar_instPaisActua,
            guardar_anoObtencionActua,cambiar_anoObtencionActua,guardar_horasActua,cambiar_horasActua,
            guardar_actua2,cambiar_actua2,guardar_instPaisActua2,cambiar_instPaisActua2,guardar_anoActua2,
            cambiar_anoActua2,guardar_horaActua2,cambiar_horaActua2,guardar_actua3,cambiar_actua3,
            guardar_instactua3,cambiar_instactua3,guardar_anoactua3,cambiar_anoactua3,guardar_horaactua3,
            cambiar_horaactua3,guardar_actua4,cambiar_actua4,guardar_instactua4,cambiar_instactua4,
            guardar_anoactua4,cambiar_anoactua4,guardar_horaactua4,cambiar_horaactua4;

    private TextView agregar_otraActua,borrar_otraActua,agregar_otraActua2,borrar_otraactua3,agregar_otraactua3,borrar_otraactua4,tipoActua,instPaisActua,anoObtencionActua,horasActua,
            actua2,instPaisActua2,anoActua2,horaActua2,actua3,instactua3,anoactua3_vista,horaactua3,actua4,
            instactua4,anoactua4_vista,horaactua4,actua_disciplinar;

    private String nuevo_tipoActua,
            nuevo_instPaisActua,nuevo_anoObtencionActua,nuevo_horasActua,nuevo_actua2,nuevo_instPaisActua2,
            nuevo_anoActua2,nuevo_horaActua2,nuevo_actua3,nuevo_instactua3,nuevo_anoactua3,nuevo_horaactua3,
            nuevo_actua4,nuevo_instactua4,nuevo_anoactua4,nuevo_horaactua4, actuaDisci_totales,id_usuer,id_SesionUsuer;
    private JSONArray json_datos_actuaDisci;
    private ExecutorService executorService;
    private static String SERVIDOR_CONTROLADOR;
    private SharedPreferences idSher,id_SesionSher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_actualizacion_disciplinar);


        caja_anuncio_tipoActua2 = findViewById(R.id.caja_anuncio_tipoActua2);
        caja_edit_actua2 = findViewById(R.id.caja_edit_actua2);
        caja_anuncio_actuaInts2 = findViewById(R.id.caja_anuncio_actuaInts2);
        caja_edit_instPaisActua2 = findViewById(R.id.caja_edit_instPaisActua2);
        caja_anuncio_anoActua2 = findViewById(R.id.caja_anuncio_anoActua2);
        caja_edit_anoActua2 = findViewById(R.id.caja_edit_anoActua2);
        caja_anuncio_horaActua2 = findViewById(R.id.caja_anuncio_horaActua2);
        caja_edit_horaActua2 = findViewById(R.id.caja_edit_horaActua2);
        caja_agregar_otraActua = findViewById(R.id.caja_agregar_otraActua);
        agregar_otraActua = findViewById(R.id.agregar_otraActua);
        caja_borrar_otraActua = findViewById(R.id.caja_borrar_otraActua);
        borrar_otraActua = findViewById(R.id.borrar_otraActua);
        agregar_otraActua2 = findViewById(R.id.agregar_otraActua2);
        caja_anuncio_actua3 = findViewById(R.id.caja_anuncio_actua3);
        caja_actua3 = findViewById(R.id.caja_actua3);
        caja_anuncio_instActua3 = findViewById(R.id.caja_anuncio_instActua3);
        caja_edit_intactua3 = findViewById(R.id.caja_edit_intactua3);
        caja_anuncio_anoactua3 = findViewById(R.id.caja_anuncio_anoactua3);
        caja_anoactua3 = findViewById(R.id.caja_anoactua3);
        caja_anuncio_horaactua3 = findViewById(R.id.caja_anuncio_horaactua3);
        caja_edit_horaactua3 = findViewById(R.id.caja_edit_horaactua3);
        caja_agregar_otraactua3 = findViewById(R.id.caja_agregar_otraactua3);
        borrar_otraactua3 = findViewById(R.id.borrar_otraactua3);
        agregar_otraactua3 = findViewById(R.id.agregar_otraactua3);
        caja_anuncio_actua4 = findViewById(R.id.caja_anuncio_actua4);
        caja_actua4 = findViewById(R.id.caja_actua4);
        caja_anuncio_instactua4 = findViewById(R.id.caja_anuncio_instactua4);
        caja_edit_instactua4 = findViewById(R.id.caja_edit_instactua4);
        caja_anuncio_anoactua4 = findViewById(R.id.caja_anuncio_anoactua4);
        caja_anoactua4 = findViewById(R.id.caja_anoactua4);
        caja_anuncio_horasactua4 = findViewById(R.id.caja_anuncio_horasactua4);
        caja_edit_horaactua4 = findViewById(R.id.caja_edit_horaactua4);
        caja_borrar_otraactua4 = findViewById(R.id.caja_borrar_otraactua4);
        borrar_otraactua4 = findViewById(R.id.borrar_otraactua4);

        guardar_tipoActua= findViewById(R.id.guardar_tipoActua);
        tipoActua_texto= findViewById(R.id.tipoActua_texto);
        tipoActua= findViewById(R.id.tipoActua);
        caja_edit_tipoActua= findViewById(R.id.caja_edit_tipoActua);
        caja_tipoActua_final = findViewById(R.id.caja_tipoActua_final);
        cambiar_tipoActua = findViewById(R.id.cambiar_tipoActua);

        guardar_instPaisActua= findViewById(R.id.guardar_instPaisActua);
        instPaisActua_texto= findViewById(R.id.instPaisActua_texto);
        instPaisActua = findViewById(R.id.instPaisActua);
        caja_edit_instPaisActua= findViewById(R.id.caja_edit_instPaisActua);
        caja_instPaisActua_final = findViewById(R.id.caja_instPaisActua_final);
        cambiar_instPaisActua = findViewById(R.id.cambiar_instPaisActua);


        guardar_anoObtencionActua= findViewById(R.id.guardar_anoObtencionActua);
        anoObtencionActua_texto = findViewById(R.id.anoObtencionActua_texto);
        anoObtencionActua= findViewById(R.id.anoObtencionActua);
        caja_edit_anoObtencionActua= findViewById(R.id.caja_edit_anoObtencionActua);
        caja_anoObtencionActua_final= findViewById(R.id.caja_anoObtencionActua_final);
        cambiar_anoObtencionActua= findViewById(R.id.cambiar_anoObtencionActua);

        guardar_horasActua= findViewById(R.id.guardar_horasActua);
        horasActua_texto= findViewById(R.id.horasActua_texto);
        horasActua= findViewById(R.id.horasActua);
        caja_edit_horasActua= findViewById(R.id.caja_edit_horasActua);
        caja_horasActua_final= findViewById(R.id.caja_horasActua_final);
        cambiar_horasActua= findViewById(R.id.cambiar_horasActua);

        guardar_actua2= findViewById(R.id.guardar_actua2);
        actua2_texto= findViewById(R.id.actua2_texto);
        actua2 = findViewById(R.id.actua2);
        caja_actua2_final= findViewById(R.id.caja_actua2_final);
        cambiar_actua2= findViewById(R.id.cambiar_actua2);


        guardar_instPaisActua2= findViewById(R.id.guardar_instPaisActua2);
        instPaisActua2_texto = findViewById(R.id.instPaisActua2_texto);
        instPaisActua2 = findViewById(R.id.instPaisActua2);
        caja_instPaisActua2_final = findViewById(R.id.caja_instPaisActua2_final);
        cambiar_instPaisActua2= findViewById(R.id.cambiar_instPaisActua2);


        guardar_anoActua2= findViewById(R.id.guardar_anoActua2);
        anoActua2_texto= findViewById(R.id.anoActua2_texto);
        anoActua2= findViewById(R.id.anoActua2);
        caja_anoActua2_final= findViewById(R.id.caja_anoActua2_final);
        cambiar_anoActua2= findViewById(R.id.cambiar_anoActua2);

        guardar_horaActua2= findViewById(R.id.guardar_horaActua2);
        horaActua2_texto= findViewById(R.id.horaActua2_texto);
        horaActua2= findViewById(R.id.horaActua2);
        caja_horaActua2_final= findViewById(R.id.caja_horaActua2_final);
        cambiar_horaActua2 = findViewById(R.id.cambiar_horaActua2);

        guardar_actua3= findViewById(R.id.guardar_actua3);
        actua3_texto = findViewById(R.id.actua3_texto);
        actua3= findViewById(R.id.actua3);
        caja_actua3_final = findViewById(R.id.caja_actua3_final);
        cambiar_actua3= findViewById(R.id.cambiar_actua3);

        guardar_instactua3= findViewById(R.id.guardar_instactua3);
        instactua3_texto= findViewById(R.id.instactua3_texto);
        instactua3= findViewById(R.id.instactua3);
        caja_instactua3_final = findViewById(R.id.caja_instactua3_final);
        cambiar_instactua3 = findViewById(R.id.cambiar_instactua3);

        guardar_anoactua3 = findViewById(R.id.guardar_anoactua3);
        anoactua3_texto= findViewById(R.id.anoactua3_texto);
        anoactua3_vista = findViewById(R.id.anoactua3_vista);
        caja_anoactua3_final= findViewById(R.id.caja_anoactua3_final);
        cambiar_anoactua3 = findViewById(R.id.cambiar_anoactua3);


        guardar_horaactua3= findViewById(R.id.guardar_horaactua3);
        horaactua3_texto = findViewById(R.id.horaactua3_texto);
        horaactua3 = findViewById(R.id.horaactua3);
        caja_horaactua3_final= findViewById(R.id.caja_horaactua3_final);
        cambiar_horaactua3= findViewById(R.id.cambiar_horaactua3);


        guardar_actua4= findViewById(R.id.guardar_actua4);
        actua4_texto = findViewById(R.id.actua4_texto);
        actua4= findViewById(R.id.actua4);
        caja_actua4_final = findViewById(R.id.caja_actua4_final);
        cambiar_actua4 = findViewById(R.id.cambiar_actua4);

        guardar_instactua4= findViewById(R.id.guardar_instactua4);
        instactua4_texto= findViewById(R.id.instactua4_texto);
        instactua4= findViewById(R.id.instactua4);
        caja_instactua4_final= findViewById(R.id.caja_instactua4_final);
        cambiar_instactua4= findViewById(R.id.cambiar_instactua4);

        guardar_anoactua4= findViewById(R.id.guardar_anoactua4);
        anoactua4_texto= findViewById(R.id.anoactua4_texto);
        anoactua4_vista = findViewById(R.id.anoactua4_vista);
        caja_anoactua4_final= findViewById(R.id.caja_anoactua4_final);
        cambiar_anoactua4 = findViewById(R.id.cambiar_anoactua4);

        guardar_horaactua4= findViewById(R.id.guardar_horaactua4);
        horaactua4_texto= findViewById(R.id.horaactua4_texto);
        horaactua4= findViewById(R.id.horaactua4);
        caja_horaactua4_final= findViewById(R.id.caja_horaactua4_final);
        cambiar_horaactua4= findViewById(R.id.cambiar_horaactua4);
        actua_disciplinar=findViewById(R.id.actua_disciplinar);

        executorService= Executors.newSingleThreadExecutor();
        SERVIDOR_CONTROLADOR = new Servidor().local;
        idSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_usuer=idSher.getString("id","no");
        Log.e("ID",""+id_usuer);
        id_SesionSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_SesionUsuer=id_SesionSher.getString("id_sesion","no");
        Log.e("ID",""+id_SesionUsuer);

        guardar_tipoActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tipoActua = tipoActua_texto.getText().toString();
                tipoActua.setText(nuevo_tipoActua);
                if (!nuevo_tipoActua.trim().equals("")) {
                    caja_edit_tipoActua.setVisibility(View.GONE);
                    caja_tipoActua_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tipoActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tipoActua.setVisibility(View.VISIBLE);
                caja_tipoActua_final.setVisibility(View.GONE);

            }
        });
        guardar_instPaisActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instPaisActua = instPaisActua_texto.getText().toString();
                instPaisActua.setText(nuevo_instPaisActua);
                if (!nuevo_instPaisActua.trim().equals("")) {
                    caja_edit_instPaisActua.setVisibility(View.GONE);
                    caja_instPaisActua_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instPaisActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instPaisActua.setVisibility(View.VISIBLE);
                caja_instPaisActua_final.setVisibility(View.GONE);

            }
        });
        guardar_anoObtencionActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoObtencionActua = anoObtencionActua_texto.getText().toString();
                anoObtencionActua.setText(nuevo_anoObtencionActua);
                if (!nuevo_anoObtencionActua.trim().equals("")) {
                    caja_edit_anoObtencionActua.setVisibility(View.GONE);
                    caja_anoObtencionActua_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoObtencionActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_anoObtencionActua.setVisibility(View.VISIBLE);
                caja_anoObtencionActua_final.setVisibility(View.GONE);

            }
        });
        guardar_horasActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horasActua = horasActua_texto.getText().toString();
                horasActua.setText(nuevo_horasActua);
                if (!nuevo_horasActua.trim().equals("")) {
                    caja_edit_horasActua.setVisibility(View.GONE);
                    caja_horasActua_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de la actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horasActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horasActua.setVisibility(View.VISIBLE);
                caja_horasActua_final.setVisibility(View.GONE);

            }
        });

        agregar_otraActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_tipoActua2.setVisibility(View.VISIBLE);
                caja_edit_actua2.setVisibility(View.VISIBLE);
                actua2_texto.setText("");

                caja_anuncio_actuaInts2.setVisibility(View.VISIBLE);
                caja_edit_instPaisActua2.setVisibility(View.VISIBLE);
                instPaisActua2_texto.setText("");

                caja_anuncio_anoActua2.setVisibility(View.VISIBLE);
                caja_edit_anoActua2.setVisibility(View.VISIBLE);
                anoActua2_texto.setText("");

                caja_anuncio_horaActua2.setVisibility(View.VISIBLE);
                caja_edit_horaActua2.setVisibility(View.VISIBLE);
                horaActua2_texto.setText("");

                caja_agregar_otraActua.setVisibility(View.GONE);
                caja_borrar_otraActua.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_tipoActua2.setVisibility(View.GONE);
                caja_edit_actua2.setVisibility(View.GONE);
                caja_actua2_final.setVisibility(View.GONE);

                caja_anuncio_actuaInts2.setVisibility(View.GONE);
                caja_edit_instPaisActua2.setVisibility(View.GONE);
                caja_instPaisActua2_final.setVisibility(View.GONE);

                caja_anuncio_anoActua2.setVisibility(View.GONE);
                caja_edit_anoActua2.setVisibility(View.GONE);
                caja_anoActua2_final.setVisibility(View.GONE);

                caja_anuncio_horaActua2.setVisibility(View.GONE);
                caja_edit_horaActua2.setVisibility(View.GONE);
                caja_horaActua2_final.setVisibility(View.GONE);

                caja_agregar_otraActua.setVisibility(View.VISIBLE);
                caja_borrar_otraActua.setVisibility(View.GONE);


            }
        });
        guardar_actua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actua2 = actua2_texto.getText().toString();
                actua2.setText(nuevo_actua2);
                if (!nuevo_actua2.trim().equals("")) {
                    caja_edit_actua2.setVisibility(View.GONE);
                    caja_actua2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_actua2.setVisibility(View.VISIBLE);
                caja_actua2_final.setVisibility(View.GONE);

            }
        });
        guardar_instPaisActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instPaisActua2= instPaisActua2_texto.getText().toString();
                instPaisActua2.setText(nuevo_instPaisActua2);
                if (!nuevo_instPaisActua2.trim().equals("")) {
                    caja_edit_instPaisActua2.setVisibility(View.GONE);
                    caja_instPaisActua2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instPaisActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instPaisActua2.setVisibility(View.VISIBLE);
                caja_instPaisActua2_final.setVisibility(View.GONE);

            }
        });
        guardar_anoActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoActua2 = anoActua2_texto.getText().toString();
                anoActua2.setText(nuevo_anoActua2);
                if (!nuevo_anoActua2.trim().equals("")) {
                    caja_edit_anoActua2.setVisibility(View.GONE);
                    caja_anoActua2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_anoActua2.setVisibility(View.VISIBLE);
                caja_anoActua2_final.setVisibility(View.GONE);

            }
        });
        guardar_horaActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horaActua2 = horaActua2_texto.getText().toString();
                horaActua2.setText(nuevo_horaActua2);
                if (!nuevo_horaActua2.trim().equals("")) {
                    caja_edit_horaActua2.setVisibility(View.GONE);
                    caja_horaActua2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horaActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horaActua2.setVisibility(View.VISIBLE);
                caja_horaActua2_final.setVisibility(View.GONE);

            }
        });

        agregar_otraActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actua3.setVisibility(View.VISIBLE);
                caja_actua3.setVisibility(View.VISIBLE);
                actua3_texto.setText("");

                caja_anuncio_instActua3.setVisibility(View.VISIBLE);
                caja_edit_intactua3.setVisibility(View.VISIBLE);
                instactua3_texto.setText("");

                caja_anuncio_anoactua3.setVisibility(View.VISIBLE);
                caja_anoactua3.setVisibility(View.VISIBLE);
                anoactua3_texto.setText("");

                caja_anuncio_horaactua3.setVisibility(View.VISIBLE);
                caja_edit_horaactua3.setVisibility(View.VISIBLE);
                horaactua3_texto.setText("");

                caja_borrar_otraActua.setVisibility(View.GONE);
                caja_agregar_otraactua3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actua3.setVisibility(View.GONE);
                caja_actua3.setVisibility(View.GONE);
                caja_actua3_final.setVisibility(View.GONE);

                caja_anuncio_instActua3.setVisibility(View.GONE);
                caja_edit_intactua3.setVisibility(View.GONE);
                caja_instactua3_final.setVisibility(View.GONE);

                caja_anuncio_anoactua3.setVisibility(View.GONE);
                caja_anoactua3.setVisibility(View.GONE);
                caja_anoactua3_final.setVisibility(View.GONE);

                caja_anuncio_horaactua3.setVisibility(View.GONE);
                caja_edit_horaactua3.setVisibility(View.GONE);
                caja_horaactua3_final.setVisibility(View.GONE);

                caja_borrar_otraActua.setVisibility(View.VISIBLE);
                caja_agregar_otraactua3.setVisibility(View.GONE);


            }
        });
        guardar_actua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actua3 = actua3_texto.getText().toString();
                actua3.setText(nuevo_actua3);
                if (!nuevo_actua3.trim().equals("")) {
                    caja_actua3.setVisibility(View.GONE);
                    caja_actua3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_actua3.setVisibility(View.VISIBLE);
                caja_actua3_final.setVisibility(View.GONE);

            }
        });
        guardar_instactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instactua3= instactua3_texto.getText().toString();
                instactua3.setText(nuevo_instactua3);
                if (!nuevo_instactua3.trim().equals("")) {
                    caja_edit_intactua3.setVisibility(View.GONE);
                    caja_instactua3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_intactua3.setVisibility(View.VISIBLE);
                caja_instactua3_final.setVisibility(View.GONE);

            }
        });
        guardar_anoactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoactua3 = anoactua3_texto.getText().toString();
                anoactua3_vista.setText(nuevo_anoactua3);
                if (!nuevo_anoactua3.trim().equals("")) {
                    caja_anoactua3.setVisibility(View.GONE);
                    caja_anoactua3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoactua3.setVisibility(View.VISIBLE);
                caja_anoactua3_final.setVisibility(View.GONE);

            }
        });
        guardar_horaactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horaactua3 = horaactua3_texto.getText().toString();
                horaactua3.setText(nuevo_horaactua3);
                if (!nuevo_horaactua3.trim().equals("")) {
                    caja_edit_horaactua3.setVisibility(View.GONE);
                    caja_horaactua3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horaactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horaactua3.setVisibility(View.VISIBLE);
                caja_horaactua3_final.setVisibility(View.GONE);

            }
        });
        agregar_otraactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actua4.setVisibility(View.VISIBLE);
                caja_actua4.setVisibility(View.VISIBLE);
                actua4_texto.setText("");

                caja_anuncio_instactua4.setVisibility(View.VISIBLE);
                caja_edit_instactua4.setVisibility(View.VISIBLE);
                instactua4_texto.setText("");

                caja_anuncio_anoactua4.setVisibility(View.VISIBLE);
                caja_anoactua4.setVisibility(View.VISIBLE);
                anoactua4_texto.setText("");

                caja_anuncio_horasactua4.setVisibility(View.VISIBLE);
                caja_edit_horaactua4.setVisibility(View.VISIBLE);
                horaactua4_texto.setText("");

                caja_agregar_otraactua3.setVisibility(View.GONE);
                caja_borrar_otraactua4.setVisibility(View.VISIBLE);


            }
        });

        borrar_otraactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actua4.setVisibility(View.GONE);
                caja_actua4.setVisibility(View.GONE);
                caja_actua4_final.setVisibility(View.GONE);
                caja_anuncio_instactua4.setVisibility(View.GONE);
                caja_edit_instactua4.setVisibility(View.GONE);
                caja_instactua4_final.setVisibility(View.GONE);

                caja_anuncio_anoactua4.setVisibility(View.GONE);
                caja_anoactua4.setVisibility(View.GONE);
                caja_anoactua4_final.setVisibility(View.GONE);


                caja_anuncio_horasactua4.setVisibility(View.GONE);
                caja_edit_horaactua4.setVisibility(View.GONE);
                caja_horaactua4_final.setVisibility(View.GONE);

                caja_agregar_otraactua3.setVisibility(View.VISIBLE);
                caja_borrar_otraactua4.setVisibility(View.GONE);


            }
        });
        guardar_actua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actua4 = actua4_texto.getText().toString();
                actua4.setText(nuevo_actua4);
                if (!nuevo_actua4.trim().equals("")) {
                    caja_actua4.setVisibility(View.GONE);
                    caja_actua4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_actua4.setVisibility(View.VISIBLE);
                caja_actua4_final.setVisibility(View.GONE);

            }
        });
        guardar_instactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instactua4= instactua4_texto.getText().toString();
                instactua4.setText(nuevo_instactua4);
                if (!nuevo_instactua4.trim().equals("")) {
                    caja_edit_instactua4.setVisibility(View.GONE);
                    caja_instactua4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instactua4.setVisibility(View.VISIBLE);
                caja_instactua4_final.setVisibility(View.GONE);

            }
        });
        guardar_anoactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoactua4 = anoactua4_texto.getText().toString();
                anoactua4_vista.setText(nuevo_anoactua4);
                if (!nuevo_anoactua4.trim().equals("")) {
                    caja_anoactua4.setVisibility(View.GONE);
                    caja_anoactua4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoactua4.setVisibility(View.VISIBLE);
                caja_anoactua4_final.setVisibility(View.GONE);

            }
        });
        guardar_horaactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horaactua4 = horaactua4_texto.getText().toString();
                horaactua4.setText(nuevo_horaactua4);
                if (!nuevo_horaactua4.trim().equals("")) {
                    caja_edit_horaactua4.setVisibility(View.GONE);
                    caja_horaactua4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horaactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horaactua4.setVisibility(View.VISIBLE);
                caja_horaactua4_final.setVisibility(View.GONE);

            }
        });
        actua_disciplinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nuevo_tipoActua = tipoActua_texto.getText().toString();
                nuevo_instPaisActua = instPaisActua_texto.getText().toString();
                nuevo_anoObtencionActua = anoObtencionActua_texto.getText().toString();
                nuevo_horasActua = horasActua_texto.getText().toString();
                nuevo_actua2 = actua2_texto.getText().toString();
                nuevo_instPaisActua2= instPaisActua2_texto.getText().toString();
                nuevo_anoActua2 = anoActua2_texto.getText().toString();
                nuevo_horaActua2 = horaActua2_texto.getText().toString();
                nuevo_actua3 = actua3_texto.getText().toString();
                nuevo_instactua3= instactua3_texto.getText().toString();
                nuevo_anoactua3 = anoactua3_texto.getText().toString();
                nuevo_horaactua3 = horaactua3_texto.getText().toString();
                nuevo_actua4 = actua4_texto.getText().toString();
                nuevo_instactua4= instactua4_texto.getText().toString();
                nuevo_anoactua4 = anoactua4_texto.getText().toString();
                nuevo_horaactua4 = horaactua4_texto.getText().toString();


                if (nuevo_tipoActua.trim().equals("")){
                    nuevo_tipoActua.equals(" ");
                }
                if (nuevo_instPaisActua.trim().equals("")){
                    nuevo_instPaisActua.equals(" ");
                }
                if (nuevo_anoObtencionActua.trim().equals("")){
                    nuevo_anoObtencionActua.equals(" ");
                }
                if (nuevo_horasActua.trim().equals("")){
                    nuevo_horasActua.equals(" ");
                }
                if (nuevo_actua2.trim().equals("")){
                    nuevo_actua2.equals(" ");
                }
                if (nuevo_instPaisActua2.trim().equals("")){
                    nuevo_instPaisActua2.equals(" ");
                }
                if (nuevo_anoActua2.trim().equals("")){
                    nuevo_anoActua2.equals(" ");
                }
                if (nuevo_horaActua2.trim().equals("")){
                    nuevo_horaActua2.equals(" ");
                }
                if (nuevo_actua3.trim().equals("")){
                    nuevo_actua3.equals(" ");
                }
                if (nuevo_instactua3.trim().equals("")){
                    nuevo_instactua3.equals(" ");
                }
                if (nuevo_anoactua3.trim().equals("")){
                    nuevo_anoactua3.equals(" ");
                }
                if (nuevo_horaactua3.trim().equals("")){
                    nuevo_horaactua3.equals(" ");
                }
                if (nuevo_actua4.trim().equals("")){
                    nuevo_actua4.equals(" ");
                }
                if (nuevo_instactua4.trim().equals("")){
                    nuevo_instactua4.equals(" ");
                }
                if (nuevo_anoactua4.trim().equals("")){
                    nuevo_anoactua4.equals(" ");
                }
                if (nuevo_horaactua4.trim().equals("")){
                    nuevo_horaactua4.equals(" ");
                }
                JSONObject jsonObject=new JSONObject();
                json_datos_actuaDisci =new JSONArray();
                try {
                    jsonObject.put("nuevo_tipoActua",nuevo_tipoActua);
                    jsonObject.put("nuevo_instPaisActua",nuevo_instPaisActua);
                    jsonObject.put("nuevo_anoObtencionActua",nuevo_anoObtencionActua);
                    jsonObject.put("nuevo_horasActua",nuevo_horasActua);
                    jsonObject.put("nuevo_actua2",nuevo_actua2);
                    jsonObject.put("nuevo_instPaisActua2",nuevo_instPaisActua2);
                    jsonObject.put("nuevo_anoActua2",nuevo_anoActua2);
                    jsonObject.put("nuevo_horaActua2",nuevo_horaActua2);
                    jsonObject.put("nuevo_actua3",nuevo_actua3);
                    jsonObject.put("nuevo_instactua3",nuevo_instactua3);
                    jsonObject.put("nuevo_anoactua3",nuevo_anoactua3);
                    jsonObject.put("nuevo_horaactua3",nuevo_horaactua3);
                    jsonObject.put("nuevo_actua4",nuevo_actua4);
                    jsonObject.put("nuevo_instactua4",nuevo_instactua4);
                    jsonObject.put("nuevo_anoactua4",nuevo_anoactua4);
                    jsonObject.put("nuevo_horaactua4",nuevo_horaactua4);
                    json_datos_actuaDisci.put(jsonObject);
                    Log.e("1", String.valueOf(jsonObject));
                    Log.e("2", String.valueOf(json_datos_actuaDisci));
                    for(int i = 0; i< json_datos_actuaDisci.length(); i++){
                        try {JSONObject jsoSacandoPro= json_datos_actuaDisci.getJSONObject(i);
                            String strnuevo_tipoActua=jsoSacandoPro.get("nuevo_tipoActua").toString();
                            String strnuevo_instPaisActua=jsoSacandoPro.get("nuevo_instPaisActua").toString();
                            String strnuevo_anoObtencionActua=jsoSacandoPro.get("nuevo_anoObtencionActua").toString();
                            String strnuevo_horasActua=jsoSacandoPro.get("nuevo_horasActua").toString();
                            String strnuevo_actua2=jsoSacandoPro.get("nuevo_actua2").toString();
                            String strnuevo_instPaisActua2=jsoSacandoPro.get("nuevo_instPaisActua2").toString();
                            String strnuevo_anoActua2=jsoSacandoPro.get("nuevo_anoActua2").toString();
                            String strnuevo_horaActua2=jsoSacandoPro.get("nuevo_horaActua2").toString();
                            String strnuevo_actua3=jsoSacandoPro.get("nuevo_actua3").toString();
                            String strnuevo_instactua3=jsoSacandoPro.get("nuevo_instactua3").toString();
                            String strnuevo_anoactua3=jsoSacandoPro.get("nuevo_anoactua3").toString();
                            String strnuevo_horaactua3=jsoSacandoPro.get("nuevo_horaactua3").toString();
                            String strnuevo_actua4=jsoSacandoPro.get("nuevo_actua4").toString();
                            String strnuevo_instactua4=jsoSacandoPro.get("nuevo_instactua4").toString();
                            String strnuevo_anoactua4=jsoSacandoPro.get("nuevo_anoactua4").toString();
                            String strnuevo_horaactua4=jsoSacandoPro.get("nuevo_horaactua4").toString();

                            actuaDisci_totales =strnuevo_tipoActua+" /*-*/ "+strnuevo_instPaisActua+" /*-*/ "+strnuevo_anoObtencionActua+" /*-*/ "+strnuevo_horasActua
                                    +" /*-*/ "+strnuevo_actua2+" /*-*/ "+strnuevo_instPaisActua2+" /*-*/ "+strnuevo_anoActua2+
                                    " /*-*/ "+strnuevo_horaActua2+" /*-*/ "+strnuevo_actua3+" /*-*/ "+strnuevo_instactua3+" /*-*/ "+strnuevo_anoactua3
                                    +" /*-*/ "+strnuevo_horaactua3+" /*-*/ "+strnuevo_actua4+" /*-*/ "+strnuevo_instactua4+
                                    " /*-*/ "+strnuevo_anoactua4+" /*-*/ "+strnuevo_horaactua4;
                            if(!actuaDisci_totales.trim().equals("")){
                                executorService.execute(new Runnable() {
                                    @Override
                                    public void run() {
                                        guardando_actuaDisci();
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
    public void guardando_actuaDisci(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"actualizacion_disciplinar.php",
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
                map.put("actualizacion_disciplinar",actuaDisci_totales);
                map.put("id",id_usuer);
                map.put("id_sesion",id_SesionUsuer);
                return map;
            }
        };
        requestQueue.add(request);
    }
}