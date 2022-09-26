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

public class Capacitacion_docente extends AppCompatActivity {
    private ScrollView formulario_formaCapaDocente;

    private LinearLayout caja_borrar_otraCapa,caja_agregar_otraCapa,caja_edit_horaCapa2,
            caja_anuncio_horaCapa2,caja_edit_anoCapa2,caja_anuncio_anoCapa2,caja_edit_intCapa2,caja_anuncio_instActua2,caja_edit_capa2,caja_anuncio_capa2,caja_borrar_otraCapa2,caja_edit_horaCapa3,
            caja_anuncio_horaCapa3,caja_anoCapa3,caja_anuncio_anoCapa3,caja_edit_instcapa3,
            caja_anuncio_instcapa3,caja_capa3,caja_anuncio_capa3,caja_borrar_otraCapa3,caja_edit_horaCapa4
            ,caja_anuncio_horaCapa4,caja_anoCapa4,caja_anuncio_anoCapa4,caja_edit_instcapa4,caja_anuncio_instcapa4
            ,caja_capa4,caja_anuncio_capa4,caja_edit_tipoCapa,caja_tipoCapa_final,caja_edit_instPaisCapa,
            caja_instPaisCapa_final,caja_edit_anoObtencionCapa,caja_anoObtencionCapa_final,caja_edit_horasCapa,
            caja_horasCapa_final,caja_capa2_final,caja_intCapa2_final,caja_anoCapa2_final,caja_horaCapa2_final,
            caja_capa3_final,caja_instcapa3_final,caja_anoCapa3_final,caja_horaCapa3_final,capa4_final,
            caja_instcapa4_final,caja_anoCapa4_final,caja_horaCapa4_final;

    private EditText tipoCapa_texto,
            instPaisCapa_texto,anoObtencionCapa_texto,horasCapa_texto,capa2_texto,
            intCapa2_texto,anoCapa2_texto,horaCapa2_texto,capa3_texto,instcapa3_texto,
            anoCapa3_texto,horaCapa3_texto,capa4_texto,instcapa4_texto,anoCapa4_texto,
            horaCapa4_texto;


    private ImageView guardar_tipoCapa,cambiar_tipoCapa,guardar_instPaisCapa,cambiar_instPaisCapa,
            guardar_anoObtencionCapa,cambiar_anoObtencionCapa,guardar_horasCapa,
            cambiar_horasCapa,guardar_capa2,cambiar_capa2,guardar_intCapa2,cambiar_CapaIns2,
            guardar_anoCapa2,cambiar_anoCapa2,guardar_horaCapa2,cambiar_horaCapa2,guardar_capa3,
            cambiar_capa3,guardar_instcapa3,cambiar_instcapa3,guardar_anoCapa3,cambiar_anoCapa3,
            guardar_horaCapa3,cambiar_horaCapa3,guardar_capa4,cambiar_capa4,guardar_instcapa4,
            cambiar_instcapa4,guardar_anoCapa4,cambiar_anoCapa4,guardar_horaCapa4,cambiar_horaCapa4;

    private TextView borrar_otraCapa,agregar_otraCapa,agregar_otraOtracapa2,borrar_otraCapa2,agregar_otraOtracapa3,borrar_otraCapa3,tipoCapa,
            instPaisCapa,anoObtencionCapa,horasCapa,capa2,intCapa2,anoCapa2,horaCapa2,capa3,instcapa3,anoCapa3_vista,
            horaCapa3,capa4,instcapa4,anoCapa4_vista,horaCapa4,actua_capaDocente;

    private String nuevo_tipoCapa,nuevo_instPaisCapa,nuevo_anoObtencionCapa,nuevo_horasCapa,nuevo_capa2,
            nuevo_intCapa2,nuevo_anoCapa2,nuevo_horaCapa2,nuevo_capa3,nuevo_instcapa3,nuevo_anoCapa3,
            nuevo_horaCapa3,nuevo_capa4,nuevo_instcapa4,nuevo_anoCapa4,nuevo_horaCapa4,id_usuer,id_SesionUsuer,capDocente_totales;
    private JSONArray json_datos_capDocente;
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
        setContentView(R.layout.activity_capacitacion_docente);

        caja_anuncio_capa2 = findViewById(R.id.caja_anuncio_capa2);
        caja_edit_capa2 = findViewById(R.id.caja_edit_capa2);
        caja_anuncio_instActua2 = findViewById(R.id.caja_anuncio_instActua2);
        caja_edit_intCapa2 = findViewById(R.id.caja_edit_intCapa2);
        caja_anuncio_anoCapa2 = findViewById(R.id.caja_anuncio_anoCapa2);
        caja_edit_anoCapa2 = findViewById(R.id.caja_edit_anoCapa2);
        caja_anuncio_horaCapa2 = findViewById(R.id.caja_anuncio_horaCapa2);
        caja_edit_horaCapa2 = findViewById(R.id.caja_edit_horaCapa2);
        caja_agregar_otraCapa = findViewById(R.id.caja_agregar_otraCapa);
        agregar_otraCapa = findViewById(R.id.agregar_otraCapa);
        caja_borrar_otraCapa = findViewById(R.id.caja_borrar_otraCapa);
        borrar_otraCapa = findViewById(R.id.borrar_otraCapa);
        agregar_otraOtracapa2 = findViewById(R.id.agregar_otraOtracapa2);

        caja_anuncio_capa3 = findViewById(R.id.caja_anuncio_capa3);
        caja_capa3 = findViewById(R.id.caja_capa3);
        caja_anuncio_instcapa3 = findViewById(R.id.caja_anuncio_instcapa3);
        caja_edit_instcapa3 = findViewById(R.id.caja_edit_instcapa3);
        caja_anuncio_anoCapa3 = findViewById(R.id.caja_anuncio_anoCapa3);
        caja_anoCapa3 = findViewById(R.id.caja_anoCapa3);
        caja_anuncio_horaCapa3 = findViewById(R.id.caja_anuncio_horaCapa3);
        caja_edit_horaCapa3 = findViewById(R.id.caja_edit_horaCapa3);

        agregar_otraOtracapa2 = findViewById(R.id.agregar_otraOtracapa2);
        caja_borrar_otraCapa2 = findViewById(R.id.caja_borrar_otraCapa2);
        borrar_otraCapa2 = findViewById(R.id.borrar_otraCapa2);
        agregar_otraOtracapa3 = findViewById(R.id.agregar_otraOtracapa3);

        caja_anuncio_capa4 = findViewById(R.id.caja_anuncio_capa4);
        caja_capa4 = findViewById(R.id.caja_capa4);
        caja_anuncio_instcapa4 = findViewById(R.id.caja_anuncio_instcapa4);
        caja_edit_instcapa4 = findViewById(R.id.caja_edit_instcapa4);
        caja_anuncio_anoCapa4 = findViewById(R.id.caja_anuncio_anoCapa4);
        caja_anoCapa4 = findViewById(R.id.caja_anoCapa4);
        caja_anuncio_horaCapa4 = findViewById(R.id.caja_anuncio_horaCapa4);
        caja_edit_horaCapa4 = findViewById(R.id.caja_edit_horaCapa4);
        caja_borrar_otraCapa3 = findViewById(R.id.caja_borrar_otraCapa3);
        borrar_otraCapa3 = findViewById(R.id.borrar_otraCapa3);


        guardar_tipoCapa= findViewById(R.id.guardar_tipoCapa);
        tipoCapa_texto= findViewById(R.id.tipoCapa_texto);
        tipoCapa= findViewById(R.id.tipoCapa);
        caja_edit_tipoCapa= findViewById(R.id.caja_edit_tipoCapa);
        caja_tipoCapa_final= findViewById(R.id.caja_tipoCapa_final);
        cambiar_tipoCapa= findViewById(R.id.cambiar_tipoCapa);

        guardar_instPaisCapa= findViewById(R.id.guardar_instPaisCapa);
        instPaisCapa_texto= findViewById(R.id.instPaisCapa_texto);
        instPaisCapa= findViewById(R.id.instPaisCapa);
        caja_edit_instPaisCapa= findViewById(R.id.caja_edit_instPaisCapa);
        caja_instPaisCapa_final = findViewById(R.id.caja_instPaisCapa_final);
        cambiar_instPaisCapa = findViewById(R.id.cambiar_instPaisCapa);


        guardar_anoObtencionCapa= findViewById(R.id.guardar_anoObtencionCapa);
        anoObtencionCapa_texto= findViewById(R.id.anoObtencionCapa_texto);
        anoObtencionCapa= findViewById(R.id.anoObtencionCapa);
        caja_edit_anoObtencionCapa= findViewById(R.id.caja_edit_anoObtencionCapa);
        caja_anoObtencionCapa_final= findViewById(R.id.caja_anoObtencionCapa_final);
        cambiar_anoObtencionCapa = findViewById(R.id.cambiar_anoObtencionCapa);

        guardar_horasCapa= findViewById(R.id.guardar_horasCapa);
        horasCapa_texto= findViewById(R.id.horasCapa_texto);
        horasCapa= findViewById(R.id.horasCapa);
        caja_edit_horasCapa= findViewById(R.id.caja_edit_horasCapa);
        caja_horasCapa_final= findViewById(R.id.caja_horasCapa_final);
        cambiar_horasCapa= findViewById(R.id.cambiar_horasCapa);

        guardar_capa2= findViewById(R.id.guardar_capa2);
        capa2_texto= findViewById(R.id.capa2_texto);
        capa2= findViewById(R.id.capa2);
        caja_capa2_final = findViewById(R.id.caja_capa2_final);
        cambiar_capa2= findViewById(R.id.cambiar_capa2);


        guardar_intCapa2= findViewById(R.id.guardar_intCapa2);
        intCapa2_texto = findViewById(R.id.intCapa2_texto);
        intCapa2= findViewById(R.id.intCapa2);
        caja_intCapa2_final= findViewById(R.id.caja_intCapa2_final);
        cambiar_CapaIns2= findViewById(R.id.cambiar_CapaIns2);


        guardar_anoCapa2= findViewById(R.id.guardar_anoCapa2);
        anoCapa2_texto= findViewById(R.id.anoCapa2_texto);
        anoCapa2 = findViewById(R.id.anoCapa2);
        caja_anoCapa2_final = findViewById(R.id.caja_anoCapa2_final);
        cambiar_anoCapa2= findViewById(R.id.cambiar_anoCapa2);

        guardar_horaCapa2= findViewById(R.id.guardar_horaCapa2);
        horaCapa2_texto= findViewById(R.id.horaCapa2_texto);
        horaCapa2 = findViewById(R.id.horaCapa2);
        caja_horaCapa2_final= findViewById(R.id.caja_horaCapa2_final);
        cambiar_horaCapa2= findViewById(R.id.cambiar_horaCapa2);

        guardar_capa3= findViewById(R.id.guardar_capa3);
        capa3_texto= findViewById(R.id.capa3_texto);
        capa3= findViewById(R.id.capa3);
        caja_capa3_final = findViewById(R.id.caja_capa3_final);
        cambiar_capa3= findViewById(R.id.cambiar_capa3);

        guardar_instcapa3= findViewById(R.id.guardar_instcapa3);
        instcapa3_texto= findViewById(R.id.instcapa3_texto);
        instcapa3 = findViewById(R.id.instcapa3);
        caja_instcapa3_final = findViewById(R.id.caja_instcapa3_final);
        cambiar_instcapa3= findViewById(R.id.cambiar_instcapa3);

        guardar_anoCapa3 = findViewById(R.id.guardar_anoCapa3);
        anoCapa3_texto= findViewById(R.id.anoCapa3_texto);
        anoCapa3_vista= findViewById(R.id.anoCapa3_vista);
        caja_anoCapa3_final= findViewById(R.id.caja_anoCapa3_final);
        cambiar_anoCapa3= findViewById(R.id.cambiar_anoCapa3);


        guardar_horaCapa3 = findViewById(R.id.guardar_horaCapa3);
        horaCapa3_texto = findViewById(R.id.horaCapa3_texto);
        horaCapa3 = findViewById(R.id.horaCapa3);
        caja_horaCapa3_final= findViewById(R.id.caja_horaCapa3_final);
        cambiar_horaCapa3= findViewById(R.id.cambiar_horaCapa3);


        guardar_capa4= findViewById(R.id.guardar_capa4);
        capa4_texto = findViewById(R.id.capa4_texto);
        capa4= findViewById(R.id.capa4);
        capa4_final= findViewById(R.id.capa4_final);
        cambiar_capa4 = findViewById(R.id.cambiar_capa4);

        guardar_instcapa4= findViewById(R.id.guardar_instcapa4);
        instcapa4_texto= findViewById(R.id.instcapa4_texto);
        instcapa4= findViewById(R.id.instcapa4);
        caja_instcapa4_final= findViewById(R.id.caja_instcapa4_final);
        cambiar_instcapa4= findViewById(R.id.cambiar_instcapa4);

        guardar_anoCapa4= findViewById(R.id.guardar_anoCapa4);
        anoCapa4_texto= findViewById(R.id.anoCapa4_texto);
        anoCapa4_vista = findViewById(R.id.anoCapa4_vista);
        caja_anoCapa4_final= findViewById(R.id.caja_anoCapa4_final);
        cambiar_anoCapa4= findViewById(R.id.cambiar_anoCapa4);

        guardar_horaCapa4 = findViewById(R.id.guardar_horaCapa4);
        horaCapa4_texto= findViewById(R.id.horaCapa4_texto);
        horaCapa4= findViewById(R.id.horaCapa4);
        caja_horaCapa4_final = findViewById(R.id.caja_horaCapa4_final);
        cambiar_horaCapa4= findViewById(R.id.cambiar_horaCapa4);
        actua_capaDocente=findViewById(R.id.actua_capaDocente);
        executorService= Executors.newSingleThreadExecutor();
        SERVIDOR_CONTROLADOR = new Servidor().local;
        idSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_usuer=idSher.getString("id","no");
        Log.e("ID",""+id_usuer);
        id_SesionSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_SesionUsuer=id_SesionSher.getString("id_sesion","no");
        Log.e("ID",""+id_SesionUsuer);

        guardar_tipoCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tipoCapa = tipoCapa_texto.getText().toString();
                tipoCapa.setText(nuevo_tipoCapa);
                if (!nuevo_tipoCapa.trim().equals("")) {
                    caja_edit_tipoCapa.setVisibility(View.GONE);
                    caja_tipoCapa_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tipoCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tipoCapa.setVisibility(View.VISIBLE);
                caja_tipoCapa_final.setVisibility(View.GONE);

            }
        });
        guardar_instPaisCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instPaisCapa = instPaisCapa_texto.getText().toString();
                instPaisCapa.setText(nuevo_instPaisCapa);
                if (!nuevo_instPaisCapa.trim().equals("")) {
                    caja_edit_instPaisCapa.setVisibility(View.GONE);
                    caja_instPaisCapa_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instPaisCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instPaisCapa.setVisibility(View.VISIBLE);
                caja_instPaisCapa_final.setVisibility(View.GONE);

            }
        });
        guardar_anoObtencionCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoObtencionCapa = anoObtencionCapa_texto.getText().toString();
                anoObtencionCapa.setText(nuevo_anoObtencionCapa);
                if (!nuevo_anoObtencionCapa.trim().equals("")) {
                    caja_edit_anoObtencionCapa.setVisibility(View.GONE);
                    caja_anoObtencionCapa_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoObtencionCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_anoObtencionCapa.setVisibility(View.VISIBLE);
                caja_anoObtencionCapa_final.setVisibility(View.GONE);

            }
        });
        guardar_horasCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horasCapa = horasCapa_texto.getText().toString();
                horasCapa.setText(nuevo_horasCapa);
                if (!nuevo_horasCapa.trim().equals("")) {
                    caja_edit_horasCapa.setVisibility(View.GONE);
                    caja_horasCapa_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de la capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horasCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horasCapa.setVisibility(View.VISIBLE);
                caja_horasCapa_final.setVisibility(View.GONE);

            }
        });
        agregar_otraCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa2.setVisibility(View.VISIBLE);
                caja_edit_capa2.setVisibility(View.VISIBLE);
                capa2_texto.setText("");

                caja_anuncio_instActua2.setVisibility(View.VISIBLE);
                caja_edit_intCapa2.setVisibility(View.VISIBLE);
                intCapa2_texto.setText("");

                caja_anuncio_anoCapa2.setVisibility(View.VISIBLE);
                caja_edit_anoCapa2.setVisibility(View.VISIBLE);
                anoCapa2_texto.setText("");

                caja_anuncio_horaCapa2.setVisibility(View.VISIBLE);
                caja_edit_horaCapa2.setVisibility(View.VISIBLE);
                horaCapa2_texto.setText("");

                caja_agregar_otraCapa.setVisibility(View.GONE);
                caja_borrar_otraCapa.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa2.setVisibility(View.GONE);
                caja_edit_capa2.setVisibility(View.GONE);
                caja_capa2_final.setVisibility(View.GONE);

                caja_anuncio_instActua2.setVisibility(View.GONE);
                caja_edit_intCapa2.setVisibility(View.GONE);
                caja_intCapa2_final.setVisibility(View.GONE);

                caja_anuncio_anoCapa2.setVisibility(View.GONE);
                caja_edit_anoCapa2.setVisibility(View.GONE);
                caja_anoCapa2_final.setVisibility(View.GONE);

                caja_anuncio_horaCapa2.setVisibility(View.GONE);
                caja_edit_horaCapa2.setVisibility(View.GONE);
                caja_horaCapa2_final.setVisibility(View.GONE);

                caja_agregar_otraCapa.setVisibility(View.VISIBLE);
                caja_borrar_otraCapa.setVisibility(View.GONE);


            }
        });
        guardar_capa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_capa2 = capa2_texto.getText().toString();
                capa2.setText(nuevo_capa2);
                if (!nuevo_capa2.trim().equals("")) {
                    caja_edit_capa2.setVisibility(View.GONE);
                    caja_capa2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_capa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_capa2.setVisibility(View.VISIBLE);
                caja_capa2_final.setVisibility(View.GONE);

            }
        });
        guardar_intCapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_intCapa2= intCapa2_texto.getText().toString();
                intCapa2.setText(nuevo_intCapa2);
                if (!nuevo_intCapa2.trim().equals("")) {
                    caja_edit_intCapa2.setVisibility(View.GONE);
                    caja_intCapa2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_CapaIns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_intCapa2.setVisibility(View.VISIBLE);
                caja_intCapa2_final.setVisibility(View.GONE);

            }
        });
        guardar_anoCapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoCapa2 = anoCapa2_texto.getText().toString();
                anoCapa2.setText(nuevo_anoCapa2);
                if (!nuevo_anoCapa2.trim().equals("")) {
                    caja_edit_anoCapa2.setVisibility(View.GONE);
                    caja_anoCapa2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoCapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_anoCapa2.setVisibility(View.VISIBLE);
                caja_anoCapa2_final.setVisibility(View.GONE);

            }
        });
        guardar_horaCapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horaCapa2 = horaCapa2_texto.getText().toString();
                horaCapa2.setText(nuevo_horaCapa2);
                if (!nuevo_horaCapa2.trim().equals("")) {
                    caja_edit_horaCapa2.setVisibility(View.GONE);
                    caja_horaCapa2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horaCapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horaCapa2.setVisibility(View.VISIBLE);
                caja_horaCapa2_final.setVisibility(View.GONE);

            }
        });


        agregar_otraOtracapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa3.setVisibility(View.VISIBLE);
                caja_capa3.setVisibility(View.VISIBLE);
                capa3_texto.setText("");

                caja_anuncio_instcapa3.setVisibility(View.VISIBLE);
                caja_edit_instcapa3.setVisibility(View.VISIBLE);
                instcapa3_texto.setText("");

                caja_anuncio_anoCapa3.setVisibility(View.VISIBLE);
                caja_anoCapa3.setVisibility(View.VISIBLE);
                anoCapa3_texto.setText("");

                caja_anuncio_horaCapa3.setVisibility(View.VISIBLE);
                caja_edit_horaCapa3.setVisibility(View.VISIBLE);
                horaCapa3_texto.setText("");

                caja_borrar_otraCapa.setVisibility(View.GONE);
                caja_borrar_otraCapa2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraCapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa3.setVisibility(View.GONE);
                caja_capa3.setVisibility(View.GONE);
                caja_capa3_final.setVisibility(View.GONE);

                caja_anuncio_instcapa3.setVisibility(View.GONE);
                caja_edit_instcapa3.setVisibility(View.GONE);
                caja_instcapa3_final.setVisibility(View.GONE);

                caja_anuncio_anoCapa3.setVisibility(View.GONE);
                caja_anoCapa3.setVisibility(View.GONE);
                caja_anoCapa3_final.setVisibility(View.GONE);

                caja_anuncio_horaCapa3.setVisibility(View.GONE);
                caja_edit_horaCapa3.setVisibility(View.GONE);
                caja_horaCapa3_final.setVisibility(View.GONE);

                caja_borrar_otraCapa.setVisibility(View.VISIBLE);
                caja_borrar_otraCapa2.setVisibility(View.GONE);


            }
        });
        guardar_capa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_capa3= capa3_texto.getText().toString();
                capa3.setText(nuevo_capa3);
                if (!nuevo_capa3.trim().equals("")) {
                    caja_capa3.setVisibility(View.GONE);
                    caja_capa3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_capa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_capa3.setVisibility(View.VISIBLE);
                caja_capa3_final.setVisibility(View.GONE);

            }
        });
        guardar_instcapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instcapa3= instcapa3_texto.getText().toString();
                instcapa3.setText(nuevo_instcapa3);
                if (!nuevo_instcapa3.trim().equals("")) {
                    caja_edit_instcapa3.setVisibility(View.GONE);
                    caja_instcapa3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instcapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instcapa3.setVisibility(View.VISIBLE);
                caja_instcapa3_final.setVisibility(View.GONE);

            }
        });
        guardar_anoCapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoCapa3 = anoCapa3_texto.getText().toString();
                anoCapa3_vista.setText(nuevo_anoCapa3);
                if (!nuevo_anoCapa3.trim().equals("")) {
                    caja_anoCapa3.setVisibility(View.GONE);
                    caja_anoCapa3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoCapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoCapa3.setVisibility(View.VISIBLE);
                caja_anoCapa3_final.setVisibility(View.GONE);

            }
        });
        guardar_horaCapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horaCapa3 = horaCapa3_texto.getText().toString();
                horaCapa3.setText(nuevo_horaCapa3);
                if (!nuevo_horaCapa3.trim().equals("")) {
                    caja_edit_horaCapa3.setVisibility(View.GONE);
                    caja_horaCapa3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de la capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horaCapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horaCapa3.setVisibility(View.VISIBLE);
                caja_horaCapa3_final.setVisibility(View.GONE);

            }
        });


        agregar_otraOtracapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa4.setVisibility(View.VISIBLE);
                caja_capa4.setVisibility(View.VISIBLE);
                capa4_texto.setText("");

                caja_anuncio_instcapa4.setVisibility(View.VISIBLE);
                caja_edit_instcapa4.setVisibility(View.VISIBLE);
                instcapa4_texto.setText("");

                caja_anuncio_anoCapa4.setVisibility(View.VISIBLE);
                caja_anoCapa4.setVisibility(View.VISIBLE);
                anoCapa4_texto.setText("");

                caja_anuncio_horaCapa4.setVisibility(View.VISIBLE);
                caja_edit_horaCapa4.setVisibility(View.VISIBLE);
                horaCapa4_texto.setText("");

                caja_borrar_otraCapa2.setVisibility(View.GONE);
                caja_borrar_otraCapa3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraCapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa4.setVisibility(View.GONE);
                caja_capa4.setVisibility(View.GONE);
                capa4_final.setVisibility(View.GONE);

                caja_anuncio_instcapa4.setVisibility(View.GONE);
                caja_edit_instcapa4.setVisibility(View.GONE);
                caja_instcapa4_final.setVisibility(View.GONE);

                caja_anuncio_anoCapa4.setVisibility(View.GONE);
                caja_anoCapa4.setVisibility(View.GONE);
                caja_anoCapa4_final.setVisibility(View.GONE);

                caja_anuncio_horaCapa4.setVisibility(View.GONE);
                caja_edit_horaCapa4.setVisibility(View.GONE);
                caja_horaCapa4_final.setVisibility(View.GONE);

                caja_borrar_otraCapa2.setVisibility(View.VISIBLE);
                caja_borrar_otraCapa3.setVisibility(View.GONE);


            }
        });
        guardar_capa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_capa4= capa4_texto.getText().toString();
                capa4.setText(nuevo_capa4);
                if (!nuevo_capa4.trim().equals("")) {
                    caja_capa4.setVisibility(View.GONE);
                    capa4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tipo de capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_capa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_capa4.setVisibility(View.VISIBLE);
                capa4_final.setVisibility(View.GONE);

            }
        });
        guardar_instcapa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instcapa4= instcapa4_texto.getText().toString();
                instcapa4.setText(nuevo_instcapa4);
                if (!nuevo_instcapa4.trim().equals("")) {
                    caja_edit_instcapa4.setVisibility(View.GONE);
                    caja_instcapa4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instcapa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instcapa4.setVisibility(View.VISIBLE);
                caja_instcapa4_final.setVisibility(View.GONE);

            }
        });
        guardar_anoCapa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoCapa4 = anoCapa4_texto.getText().toString();
                anoCapa4_vista.setText(nuevo_anoCapa4);
                if (!nuevo_anoCapa3.trim().equals("")) {
                    caja_anoCapa4.setVisibility(View.GONE);
                    caja_anoCapa4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoCapa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoCapa4.setVisibility(View.VISIBLE);
                caja_anoCapa4_final.setVisibility(View.GONE);

            }
        });
        guardar_horaCapa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horaCapa4 = horaCapa4_texto.getText().toString();
                horaCapa4.setText(nuevo_horaCapa4);
                if (!nuevo_horaCapa4.trim().equals("")) {
                    caja_edit_horaCapa4.setVisibility(View.GONE);
                    caja_horaCapa4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horaCapa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horaCapa4.setVisibility(View.VISIBLE);
                caja_horaCapa4_final.setVisibility(View.GONE);

            }
        });

        actua_capaDocente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nuevo_tipoCapa = tipoCapa_texto.getText().toString();
                nuevo_instPaisCapa = instPaisCapa_texto.getText().toString();
                nuevo_anoObtencionCapa = anoObtencionCapa_texto.getText().toString();
                nuevo_horasCapa = horasCapa_texto.getText().toString();
                nuevo_capa2 = capa2_texto.getText().toString();
                nuevo_intCapa2= intCapa2_texto.getText().toString();
                nuevo_anoCapa2 = anoCapa2_texto.getText().toString();
                nuevo_horaCapa2 = horaCapa2_texto.getText().toString();
                nuevo_capa3= capa3_texto.getText().toString();
                nuevo_instcapa3= instcapa3_texto.getText().toString();
                nuevo_anoCapa3 = anoCapa3_texto.getText().toString();
                nuevo_horaCapa3 = horaCapa3_texto.getText().toString();
                nuevo_capa4= capa4_texto.getText().toString();
                nuevo_instcapa4= instcapa4_texto.getText().toString();
                nuevo_anoCapa4 = anoCapa4_texto.getText().toString();
                nuevo_horaCapa4 = horaCapa4_texto.getText().toString();

                if (nuevo_tipoCapa.trim().equals("")){
                    nuevo_tipoCapa.equals(" ");
                }
                if (nuevo_instPaisCapa.trim().equals("")){
                    nuevo_instPaisCapa.equals(" ");
                }
                if (nuevo_anoObtencionCapa.trim().equals("")){
                    nuevo_anoObtencionCapa.equals(" ");
                }
                if (nuevo_horasCapa.trim().equals("")){
                    nuevo_horasCapa.equals(" ");
                }
                if (nuevo_capa2.trim().equals("")){
                    nuevo_capa2.equals(" ");
                }
                if (nuevo_intCapa2.trim().equals("")){
                    nuevo_intCapa2.equals(" ");
                }
                if (nuevo_anoCapa2.trim().equals("")){
                    nuevo_anoCapa2.equals(" ");
                }
                if (nuevo_horaCapa2.trim().equals("")){
                    nuevo_horaCapa2.equals(" ");
                }
                if (nuevo_capa3.trim().equals("")){
                    nuevo_capa3.equals(" ");
                }
                if (nuevo_instcapa3.trim().equals("")){
                    nuevo_instcapa3.equals(" ");
                }
                if (nuevo_anoCapa3.trim().equals("")){
                    nuevo_anoCapa3.equals(" ");
                }
                if (nuevo_horaCapa3.trim().equals("")){
                    nuevo_horaCapa3.equals(" ");
                }
                if (nuevo_capa4.trim().equals("")){
                    nuevo_capa4.equals(" ");
                }
                if (nuevo_instcapa4.trim().equals("")){
                    nuevo_instcapa4.equals(" ");
                }
                if (nuevo_anoCapa4.trim().equals("")){
                    nuevo_anoCapa4.equals(" ");
                }
                if (nuevo_horaCapa4.trim().equals("")){
                    nuevo_horaCapa4.equals(" ");
                }
                JSONObject jsonObject=new JSONObject();
                json_datos_capDocente =new JSONArray();
                try {
                    jsonObject.put("nuevo_tipoCapa",nuevo_tipoCapa);
                    jsonObject.put("nuevo_instPaisCapa",nuevo_instPaisCapa);
                    jsonObject.put("nuevo_anoObtencionCapa",nuevo_anoObtencionCapa);
                    jsonObject.put("nuevo_horasCapa",nuevo_horasCapa);
                    jsonObject.put("nuevo_capa2",nuevo_capa2);
                    jsonObject.put("nuevo_intCapa2",nuevo_intCapa2);
                    jsonObject.put("nuevo_anoCapa2",nuevo_anoCapa2);
                    jsonObject.put("nuevo_horaCapa2",nuevo_horaCapa2);
                    jsonObject.put("nuevo_capa3",nuevo_capa3);
                    jsonObject.put("nuevo_instcapa3",nuevo_instcapa3);
                    jsonObject.put("nuevo_anoCapa3",nuevo_anoCapa3);
                    jsonObject.put("nuevo_horaCapa3",nuevo_horaCapa3);
                    jsonObject.put("nuevo_capa4",nuevo_capa4);
                    jsonObject.put("nuevo_instcapa4",nuevo_instcapa4);
                    jsonObject.put("nuevo_anoCapa4",nuevo_anoCapa4);
                    jsonObject.put("nuevo_horaCapa4",nuevo_horaCapa4);
                    json_datos_capDocente.put(jsonObject);
                    Log.e("1", String.valueOf(jsonObject));
                    Log.e("2", String.valueOf(json_datos_capDocente));
                    for(int i=0;i<json_datos_capDocente.length();i++){
                        try {JSONObject jsoSacandoPro=json_datos_capDocente.getJSONObject(i);
                            String strnuevo_tipoCapa=jsoSacandoPro.get("nuevo_tipoCapa").toString();
                            String strnuevo_instPaisCapa=jsoSacandoPro.get("nuevo_instPaisCapa").toString();
                            String strnuevo_anoObtencionCapa=jsoSacandoPro.get("nuevo_anoObtencionCapa").toString();
                            String strnuevo_horasCapa=jsoSacandoPro.get("nuevo_horasCapa").toString();
                            String strnuevo_capa2=jsoSacandoPro.get("nuevo_capa2").toString();
                            String strnuevo_intCapa2=jsoSacandoPro.get("nuevo_intCapa2").toString();
                            String strnuevo_anoCapa2=jsoSacandoPro.get("nuevo_anoCapa2").toString();
                            String strnuevo_horaCapa2=jsoSacandoPro.get("nuevo_horaCapa2").toString();
                            String strnuevo_capa3=jsoSacandoPro.get("nuevo_capa3").toString();
                            String strnuevo_instcapa3=jsoSacandoPro.get("nuevo_instcapa3").toString();
                            String strnuevo_anoCapa3=jsoSacandoPro.get("nuevo_anoCapa3").toString();
                            String strnuevo_horaCapa3=jsoSacandoPro.get("nuevo_horaCapa3").toString();
                            String strnuevo_capa4=jsoSacandoPro.get("nuevo_capa4").toString();
                            String strnuevo_instcapa4=jsoSacandoPro.get("nuevo_instcapa4").toString();
                            String strnuevo_anoCapa4=jsoSacandoPro.get("nuevo_anoCapa4").toString();
                            String strnuevo_horaCapa4=jsoSacandoPro.get("nuevo_horaCapa4").toString();

                            capDocente_totales=strnuevo_tipoCapa+" /*-*/ "+strnuevo_instPaisCapa+" /*-*/ "+strnuevo_anoObtencionCapa+" /*-*/ "+strnuevo_horasCapa
                                    +" /*-*/ "+strnuevo_capa2+" /*-*/ "+strnuevo_intCapa2+" /*-*/ "+strnuevo_anoCapa2+
                                    " /*-*/ "+strnuevo_horaCapa2+" /*-*/ "+strnuevo_capa3+" /*-*/ "+strnuevo_instcapa3+" /*-*/ "+strnuevo_anoCapa3
                                    +" /*-*/ "+strnuevo_horaCapa3+" /*-*/ "+strnuevo_capa4+" /*-*/ "+strnuevo_instcapa4+
                                    " /*-*/ "+strnuevo_anoCapa4+" /*-*/ "+strnuevo_horaCapa4;
                            if(!capDocente_totales.trim().equals("")){
                                executorService.execute(new Runnable() {
                                    @Override
                                    public void run() {
                                        guardando_capaDoce();
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
    public void guardando_capaDoce(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"capacitacion_docente.php",
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
                map.put("capacitacion_docente",capDocente_totales);
                map.put("id",id_usuer);
                map.put("id_sesion",id_SesionUsuer);
                return map;
            }
        };
        requestQueue.add(request);
    }
}