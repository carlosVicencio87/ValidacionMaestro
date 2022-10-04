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
            orgColeCam4,periColeCam4,nivelPart4_vista,actuaParColCam;

    private String nuevo_orgColeCam,nuevo_periColeCam,nuevo_nivelPart,nuevo_orgColeCam2,
            nuevo_periColeCam2,nuevo_nivelPart2,nuevo_orgColeCam3,nuevo_periColeCam3,nuevo_nivelPart3,nuevo_orgColeCam4,
            nuevo_periColeCam4,nuevo_nivelPart4,partColCam_totales,id_usuer,id_SesionUsuer,partColCam_Usuer;
    private JSONArray json_datos_parColCam;
    private ExecutorService executorService;
    private static String SERVIDOR_CONTROLADOR;
    private SharedPreferences idSher,id_SesionSher,partColCam_Sher;
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
        caja_orgColeCam4_final= findViewById(R.id.caja_orgColeCam4_final);
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
        
        actuaParColCam=findViewById(R.id.actuaParColCam);
        executorService= Executors.newSingleThreadExecutor();
        SERVIDOR_CONTROLADOR = new Servidor().local;
        idSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_usuer =idSher.getString("id","no");
        Log.e("ID",""+ id_usuer);
        id_SesionSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_SesionUsuer=id_SesionSher.getString("id_sesion","no");
        Log.e("ID",""+id_SesionUsuer);
        partColCam_Sher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        partColCam_Usuer=partColCam_Sher.getString("participacion_colecam","no");
        Log.e("partcolcam",""+partColCam_Usuer);
        pedir_parColCam();

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
                orgColeCam2.setText("");

                caja_anuncio_periColeCam2.setVisibility(View.GONE);
                caja_edit_periColeCam2.setVisibility(View.GONE);
                caja_periColeCam2_final.setVisibility(View.GONE);
                periColeCam2.setText("");


                caja_anuncio_nivelPart2.setVisibility(View.GONE);
                caja_edit_nivelPart2.setVisibility(View.GONE);
                caja_nivelPart2_final.setVisibility(View.GONE);
                nivelPart2.setText("");


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
                orgColeCam3.setText("");


                caja_anuncio_periColeCam3.setVisibility(View.GONE);
                caja_edit_periColeCam3.setVisibility(View.GONE);
                caja_periColeCam3_final.setVisibility(View.GONE);
                periColeCam3.setText("");


                caja_anuncio_nivelPart3.setVisibility(View.GONE);
                caja_nivelPart3.setVisibility(View.GONE);
                caja_nivelPart3_final.setVisibility(View.GONE);
                nivelPart3_vista.setText("");

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
                orgColeCam4.setText("");


                caja_anuncio_periColeCam4.setVisibility(View.GONE);
                caja_edit_periColeCam4.setVisibility(View.GONE);
                caja_periColeCam4_final.setVisibility(View.GONE);
                periColeCam4.setText("");


                caja_anuncio_nivelPart4.setVisibility(View.GONE);
                caja_nivelPart4.setVisibility(View.GONE);
                caja_nivelPart4_final.setVisibility(View.GONE);
                nivelPart4_vista.setText("");



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
        actuaParColCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nuevo_orgColeCam=orgColeCam.getText().toString();
                nuevo_periColeCam= periColeCam.getText().toString();
                nuevo_nivelPart= nivelPart.getText().toString();
                nuevo_orgColeCam2=orgColeCam2.getText().toString();
                nuevo_periColeCam2= periColeCam2.getText().toString();
                nuevo_nivelPart2= nivelPart2.getText().toString();
                nuevo_orgColeCam3=orgColeCam3.getText().toString();
                nuevo_periColeCam3= periColeCam3.getText().toString();
                nuevo_nivelPart3= nivelPart3_vista.getText().toString();
                nuevo_orgColeCam4=orgColeCam4.getText().toString();
                nuevo_periColeCam4= periColeCam4.getText().toString();
                nuevo_nivelPart4= nivelPart4_vista.getText().toString();


                if (nuevo_orgColeCam.trim().equals("")){
                    nuevo_orgColeCam=" ";
                }
                if (nuevo_periColeCam.trim().equals("")){
                    nuevo_periColeCam=" ";
                }
                if (nuevo_nivelPart.trim().equals("")){
                    nuevo_nivelPart=" ";
                }
                if (nuevo_orgColeCam2.trim().equals("")){
                    nuevo_orgColeCam2=" ";
                }
                if (nuevo_periColeCam2.trim().equals("")){
                    nuevo_periColeCam2=" ";
                }
                if (nuevo_nivelPart2.trim().equals("")){
                    nuevo_nivelPart2=" ";
                }
                if (nuevo_orgColeCam3.trim().equals("")){
                    nuevo_orgColeCam3=" ";
                }
                if (nuevo_periColeCam3.trim().equals("")){
                    nuevo_periColeCam3=" ";
                }
                if (nuevo_nivelPart3.trim().equals("")){
                    nuevo_nivelPart3=" ";
                }
                if (nuevo_orgColeCam4.trim().equals("")){
                    nuevo_orgColeCam4=" ";
                }
                if (nuevo_periColeCam4.trim().equals("")){
                    nuevo_periColeCam4=" ";
                }
                if (nuevo_nivelPart4.trim().equals("")){
                    nuevo_nivelPart4=" ";
                }

                JSONObject jsonObject=new JSONObject();
                json_datos_parColCam =new JSONArray();
                try {
                    jsonObject.put("nuevo_orgColeCam",nuevo_orgColeCam);
                    jsonObject.put("nuevo_periColeCam",nuevo_periColeCam);
                    jsonObject.put("nuevo_nivelPart",nuevo_nivelPart);
                    jsonObject.put("nuevo_orgColeCam2",nuevo_orgColeCam2);
                    jsonObject.put("nuevo_periColeCam2",nuevo_periColeCam2);
                    jsonObject.put("nuevo_nivelPart2",nuevo_nivelPart2);
                    jsonObject.put("nuevo_orgColeCam3",nuevo_orgColeCam3);
                    jsonObject.put("nuevo_periColeCam3",nuevo_periColeCam3);
                    jsonObject.put("nuevo_nivelPart3",nuevo_nivelPart3);
                    jsonObject.put("nuevo_orgColeCam4",nuevo_orgColeCam4);
                    jsonObject.put("nuevo_periColeCam4",nuevo_periColeCam4);
                    jsonObject.put("nuevo_nivelPart4",nuevo_nivelPart4);
                    json_datos_parColCam.put(jsonObject);
                    Log.e("1", String.valueOf(jsonObject));
                    Log.e("2", String.valueOf(json_datos_parColCam));
                    for(int i = 0; i< json_datos_parColCam.length(); i++){
                        try {JSONObject jsoSacandoPro= json_datos_parColCam.getJSONObject(i);
                            String strnuevo_orgColeCam=jsoSacandoPro.get("nuevo_orgColeCam").toString();
                            String strnuevo_periColeCam=jsoSacandoPro.get("nuevo_periColeCam").toString();
                            String strnuevo_nivelPart=jsoSacandoPro.get("nuevo_nivelPart").toString();
                            String strnuevo_orgColeCam2=jsoSacandoPro.get("nuevo_orgColeCam2").toString();
                            String strnuevo_periColeCam2=jsoSacandoPro.get("nuevo_periColeCam2").toString();
                            String strnuevo_nivelPart2=jsoSacandoPro.get("nuevo_nivelPart2").toString();
                            String strnuevo_orgColeCam3=jsoSacandoPro.get("nuevo_orgColeCam3").toString();
                            String strnuevo_periColeCam3=jsoSacandoPro.get("nuevo_periColeCam3").toString();
                            String strnuevo_nivelPart3=jsoSacandoPro.get("nuevo_nivelPart3").toString();
                            String strnuevo_orgColeCam4=jsoSacandoPro.get("nuevo_orgColeCam4").toString();
                            String strnuevo_periColeCam4=jsoSacandoPro.get("nuevo_periColeCam4").toString();
                            String strnuevo_nivelPart4=jsoSacandoPro.get("nuevo_nivelPart4").toString();

                            partColCam_totales =strnuevo_orgColeCam+" /*-*/ "+strnuevo_periColeCam+" /*-*/ "+strnuevo_nivelPart+" /*-*/ "+strnuevo_orgColeCam2
                                    +" /*-*/ "+strnuevo_periColeCam2+" /*-*/ "+strnuevo_nivelPart2+" /*-*/ "+strnuevo_orgColeCam3+
                                    " /*-*/ "+strnuevo_periColeCam3+" /*-*/ "+strnuevo_nivelPart3+" /*-*/ "+strnuevo_orgColeCam4+" /*-*/ "+strnuevo_periColeCam4
                                    +" /*-*/ "+strnuevo_nivelPart4;
                            if(!partColCam_totales.trim().equals("")){
                                executorService.execute(new Runnable() {
                                    @Override
                                    public void run() {
                                        guardando_parColCam();
                                        Intent intent = new Intent(ParticipacionColCam.this,Login.class);
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
    public void guardando_parColCam(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"participacion_colecam.php",
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
                map.put("participacion_colecam",partColCam_totales);
                map.put("id",id_usuer);
                map.put("id_sesion",id_SesionUsuer);
                return map;
            }
        };
        requestQueue.add(request);
    }
    public void pedir_parColCam(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"pedir_participacion_colecam.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("respuesta:",response);

                        JSONObject jsonObject = null;
                        try {
                            jsonObject = new JSONObject(response);
                            String str_parColCam = jsonObject.getString("participacion_colecam");

                            if(!str_parColCam.equals("")){
                                Log.e("respuesta_frag",""+str_parColCam);
                                String[] parColCam_fragmentada=str_parColCam.split(" /\\*-\\*/ ");
                                Log.e("respuesta_frag",""+parColCam_fragmentada);

                                if(!parColCam_fragmentada[0].equals(" ")){


                                    nuevo_orgColeCam=parColCam_fragmentada[0];
                                    nuevo_periColeCam=parColCam_fragmentada[1];
                                    nuevo_nivelPart=parColCam_fragmentada[2];

                                    Log.e("Nuevalic",""+nuevo_orgColeCam);
                                    orgColeCam.setText(nuevo_orgColeCam);
                                    periColeCam.setText(nuevo_periColeCam);
                                    nivelPart.setText(nuevo_nivelPart);

                                    caja_edit_orgColeCam.setVisibility(View.GONE);
                                    caja_orgColeCam_final.setVisibility(View.VISIBLE);
                                    caja_edit_periColeCam.setVisibility(View.GONE);
                                    caja_periColeCam_final.setVisibility(View.VISIBLE);
                                    caja_edit_nivelPart.setVisibility(View.GONE);
                                    caja_nivelPart_final.setVisibility(View.VISIBLE);
                                    if(!parColCam_fragmentada[3].equals(" ")){

                                        nuevo_orgColeCam2=parColCam_fragmentada[3];
                                        nuevo_periColeCam2=parColCam_fragmentada[4];
                                        nuevo_nivelPart2=parColCam_fragmentada[5];
                                        Log.e("Nuevalic",""+nuevo_orgColeCam2);
                                        orgColeCam2.setText(nuevo_orgColeCam2);
                                        periColeCam2.setText(nuevo_periColeCam2);
                                        nivelPart2.setText(nuevo_nivelPart2);

                                        caja_edit_orgColeCam2.setVisibility(View.GONE);
                                        caja_orgColeCam2_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_orgColeCam2.setVisibility(View.VISIBLE);

                                        caja_edit_periColeCam2.setVisibility(View.GONE);
                                        caja_periColeCam2_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_periColeCam2.setVisibility(View.VISIBLE);

                                        caja_edit_nivelPart2.setVisibility(View.GONE);
                                        caja_nivelPart2_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_nivelPart2.setVisibility(View.VISIBLE);

                                        caja_agregar_otraPart.setVisibility(View.GONE);
                                        caja_agregar_otraPart2.setVisibility(View.VISIBLE);


                                    }
                                    if(!parColCam_fragmentada[6].equals(" ")){

                                        nuevo_orgColeCam3=parColCam_fragmentada[6];
                                        nuevo_periColeCam3=parColCam_fragmentada[7];
                                        nuevo_nivelPart3=parColCam_fragmentada[8];

                                        Log.e("Nuevalic3",""+nuevo_orgColeCam3);
                                        orgColeCam3.setText(nuevo_orgColeCam3);
                                        periColeCam3.setText(nuevo_periColeCam3);
                                        nivelPart3_vista.setText(nuevo_nivelPart3);


                                        caja_orgColeCam3.setVisibility(View.GONE);
                                        caja_orgColeCam3_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_orgColeCam3.setVisibility(View.VISIBLE);

                                        caja_edit_periColeCam3.setVisibility(View.GONE);
                                        caja_periColeCam3_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_periColeCam3.setVisibility(View.VISIBLE);

                                        caja_nivelPart3.setVisibility(View.GONE);
                                        caja_nivelPart3_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_nivelPart3.setVisibility(View.VISIBLE);

                                        caja_agregar_otraPart2.setVisibility(View.GONE);
                                        caja_agregar_otraPart3.setVisibility(View.VISIBLE);
                                    }
                                    if(!parColCam_fragmentada[9].equals(" ")){

                                        nuevo_orgColeCam4=parColCam_fragmentada[9];
                                        nuevo_periColeCam4=parColCam_fragmentada[10];
                                        nuevo_nivelPart4=parColCam_fragmentada[11];
                                        Log.e("Nuevalic4",""+nuevo_orgColeCam4);
                                        orgColeCam4.setText(nuevo_orgColeCam4);
                                        periColeCam4.setText(nuevo_periColeCam4);
                                        nivelPart4_vista.setText(nuevo_nivelPart4);

                                        caja_orgColeCam4.setVisibility(View.GONE);
                                        caja_orgColeCam4_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_orgColeCam4.setVisibility(View.VISIBLE);

                                        caja_edit_periColeCam4.setVisibility(View.GONE);
                                        caja_periColeCam4_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_periColeCam4.setVisibility(View.VISIBLE);

                                        caja_nivelPart4.setVisibility(View.GONE);
                                        caja_nivelPart4_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_nivelPart4.setVisibility(View.VISIBLE);

                                        caja_agregar_otraPart3.setVisibility(View.GONE);
                                        caja_borrar_otraPart3.setVisibility(View.VISIBLE);
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