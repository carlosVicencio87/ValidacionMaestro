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

public class ExperienciaProfesional extends AppCompatActivity {
    private ScrollView formulario_expProfeNoAcade;

    private LinearLayout caja_borrar_otraExpProfe3,caja_agregar_otraExpProfe3,
            caja_anuncio_tiemProfeA4,caja_tiemProfe4,caja_anuncio_tiemProfe4,caja_edit_OrgaEmp4,
            caja_anuncio_OrgaEmp4,caja_actiPuesProfe4,caja_anuncio_actiPuesProfe4,caja_edit_tiemProfeA4,
            caja_agregar_otraExpProfe2,caja_edit_tiemProfeA3,caja_anuncio_tiemProfeA3,caja_tiemProfe3,
            caja_anuncio_tiemProfe3,caja_edit_OrgaEmp3,caja_anuncio_OrgaEmp3,caja_actiPuesProfe3,
            caja_anuncio_actiPuesProfe3,caja_agregar_otraExpProfe,caja_edit_tiemProfe2,
            caja_anuncio_tiemProfeA2,caja_anuncio_tiemProfe2,caja_edit_OrgaEmp2,caja_anuncio_OrgaEmp2,
            caja_edit_actiPuestoProfe2,caja_anuncio_actiPuesProfe2,caja_edit_tiemProfeA2,caja_edit_actiPuestoProfe,caja_actiPuestoProfe_final,caja_edit_OrgaEmp,
            caja_OrgaEmp_final,caja_edit_tiemProfe,caja_tiemProfe_final,caja_edit_tiemProfeA,caja_tiemProfeA_final,
            caja_actiPuestoProfe2_final,caja_OrgaEmp2_final,caja_tiemProfe2_final,caja_tiemProfeA2_final,
            caja_actiPuesProfe3_final,caja_OrgaEmp3_final,caja_tiemProfe3_final,caja_tiemProfeA3_final,
            caja_actiPuesProfe4_final,caja_OrgaEmp4_final,caja_tiemProfe4_final,caja_tiemProfeA4_final;

    private EditText actiPuestoProfe_texto,OrgaEmp_texto,tiemProfe_texto,tiemProfeA_texto,
            actiPuestoProfe2_texto,OrgaEmp2_texto,tiemProfe2_texto,tiemProfeA2_texto,actiPuesProfe3_texto,
            OrgaEmp3_texto,tiemProfe3_texto,tiemProfeA3_texto,actiPuesProfe4_texto,OrgaEmp4_texto,
            tiemProfe4_texto,tiemProfeA4_texto;


    private ImageView guardar_actiPuestoProfe,
            cambiar_actiPuestoProfe,guardar_OrgaEmp,cambiar_OrgaEmp,guardar_tiemProfe,cambiar_tiemProfe,
            guardar_tiemProfeA,cambiar_tiemProfeA,guardar_actiPuestoProfe2,cambiar_actiPuestoProfe2,guardar_OrgaEmp2,
            cambiar_OrgaEmp2,guardar_tiemProfe2,cambiar_tiemProfe2,guardar_tiemProfeA2,cambiar_tiemProfeA2,
            guardar_actiPuesProfe3,cambiar_actiPuesProfe3,guardar_OrgaEmp3,cambiar_OrgaEmp3,guardar_tiemProfe3,
            cambiar_tiemProfe3,guardar_tiemProfeA3,cambiar_tiemProfeA3,guardar_actiPuesProfe4,cambiar_actiPuesProfe4,
            guardar_OrgaEmp4,cambiar_OrgaEmp4,guardar_tiemProfe4,cambiar_tiemProfe4,guardar_tiemProfeA4,
            cambiar_tiemProfeA4;

    private TextView borrar_otraExpProfe3,agregar_otraExpProfe3,
            borrar_otraExpProfe2,agregar_otraExpProfe2,borrar_otraExpProfe,agregar_otraExpProfe,
            actiPuestoProfe,OrgaEmp,tiemProfe,tiemProfeA,actiPuestoProfe2,
            OrgaEmp2,tiemProfe2,tiemProfeA2,actiPuesProfe3,OrgaEmp3,tiemProfe3_vista,tiemProfeA3,actiPuesProfe4,
            OrgaEmp4,tiemProfe4_vista,tiemProfeA4,actua_exProfe;

    private String nuevo_actiPuestoProfe,nuevo_OrgaEmp,nuevo_tiemProfe,nuevo_tiemProfeA,nuevo_actiPuestoProfe2,
            nuevo_OrgaEmp2,nuevo_tiemProfe2,nuevo_tiemProfeA2,nuevo_actiPuesProfe3,nuevo_OrgaEmp3,nuevo_tiemProfe3,
            nuevo_tiemProfeA3,nuevo_actiPuesProfe4,nuevo_OrgaEmp4,nuevo_tiemProfe4,nuevo_tiemProfeA4,exProfe_totales,id_usuer,id_SesionUsuer,exProfe_Usuer;

    private JSONArray json_datos_exProfe;
    private ExecutorService executorService;
    private static String SERVIDOR_CONTROLADOR;
    private SharedPreferences idSher,id_SesionSher,exProfe_sher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_experiencia_profesional);
        caja_agregar_otraExpProfe = findViewById(R.id.caja_agregar_otraExpProfe);
        agregar_otraExpProfe = findViewById(R.id.agregar_otraExpProfe);
        caja_anuncio_actiPuesProfe2 = findViewById(R.id.caja_anuncio_actiPuesProfe2);
        caja_edit_actiPuestoProfe2 = findViewById(R.id.caja_edit_actiPuestoProfe2);
        caja_anuncio_OrgaEmp2 = findViewById(R.id.caja_anuncio_OrgaEmp2);
        caja_edit_OrgaEmp2 = findViewById(R.id.caja_edit_OrgaEmp2);
        caja_anuncio_tiemProfe2 = findViewById(R.id.caja_anuncio_tiemProfe2);
        caja_edit_tiemProfe2 = findViewById(R.id.caja_edit_tiemProfe2);
        caja_anuncio_tiemProfeA2 = findViewById(R.id.caja_anuncio_tiemProfeA2);
        caja_edit_tiemProfeA2 = findViewById(R.id.caja_edit_tiemProfeA2);
        caja_agregar_otraExpProfe2 = findViewById(R.id.caja_agregar_otraExpProfe2);
        agregar_otraExpProfe2 = findViewById(R.id.agregar_otraExpProfe2);
        borrar_otraExpProfe = findViewById(R.id.borrar_otraExpProfe);
        caja_anuncio_actiPuesProfe3 = findViewById(R.id.caja_anuncio_actiPuesProfe3);
        caja_actiPuesProfe3 = findViewById(R.id.caja_actiPuesProfe3);
        caja_anuncio_OrgaEmp3 = findViewById(R.id.caja_anuncio_OrgaEmp3);
        caja_edit_OrgaEmp3 = findViewById(R.id.caja_edit_OrgaEmp3);
        caja_anuncio_tiemProfe3 = findViewById(R.id.caja_anuncio_tiemProfe3);
        caja_tiemProfe3 = findViewById(R.id.caja_tiemProfe3);
        caja_anuncio_tiemProfeA3 = findViewById(R.id.caja_anuncio_tiemProfeA3);
        caja_edit_tiemProfeA3 = findViewById(R.id.caja_edit_tiemProfeA3);
        caja_agregar_otraExpProfe3 = findViewById(R.id.caja_agregar_otraExpProfe3);
        borrar_otraExpProfe2 = findViewById(R.id.borrar_otraExpProfe2);
        agregar_otraExpProfe3 = findViewById(R.id.agregar_otraExpProfe3);
        caja_anuncio_actiPuesProfe4 = findViewById(R.id.caja_anuncio_actiPuesProfe4);
        caja_actiPuesProfe4 = findViewById(R.id.caja_actiPuesProfe4);
        caja_anuncio_OrgaEmp4 = findViewById(R.id.caja_anuncio_OrgaEmp4);
        caja_edit_OrgaEmp4 = findViewById(R.id.caja_edit_OrgaEmp4);
        caja_anuncio_tiemProfe4 = findViewById(R.id.caja_anuncio_tiemProfe4);
        caja_tiemProfe4 = findViewById(R.id.caja_tiemProfe4);
        caja_anuncio_tiemProfeA4 = findViewById(R.id.caja_anuncio_tiemProfeA4);
        caja_edit_tiemProfeA4 = findViewById(R.id.caja_edit_tiemProfeA4);
        caja_borrar_otraExpProfe3 = findViewById(R.id.caja_borrar_otraExpProfe3);
        borrar_otraExpProfe3 = findViewById(R.id.borrar_otraExpProfe3);

        guardar_actiPuestoProfe= findViewById(R.id.guardar_actiPuestoProfe);
        actiPuestoProfe_texto = findViewById(R.id.actiPuestoProfe_texto);
        actiPuestoProfe= findViewById(R.id.actiPuestoProfe);
        caja_edit_actiPuestoProfe= findViewById(R.id.caja_edit_actiPuestoProfe);
        caja_actiPuestoProfe_final= findViewById(R.id.caja_actiPuestoProfe_final);
        cambiar_actiPuestoProfe = findViewById(R.id.cambiar_actiPuestoProfe);

        guardar_OrgaEmp= findViewById(R.id.guardar_OrgaEmp);
        OrgaEmp_texto= findViewById(R.id.OrgaEmp_texto);
        OrgaEmp= findViewById(R.id.OrgaEmp);
        caja_edit_OrgaEmp = findViewById(R.id.caja_edit_OrgaEmp);
        caja_OrgaEmp_final= findViewById(R.id.caja_OrgaEmp_final);
        cambiar_OrgaEmp = findViewById(R.id.cambiar_OrgaEmp);

        guardar_tiemProfe = findViewById(R.id.guardar_tiemProfe);
        tiemProfe_texto= findViewById(R.id.tiemProfe_texto);
        tiemProfe= findViewById(R.id.tiemProfe);
        caja_edit_tiemProfe = findViewById(R.id.caja_edit_tiemProfe);
        caja_tiemProfe_final= findViewById(R.id.caja_tiemProfe_final);
        cambiar_tiemProfe= findViewById(R.id.cambiar_tiemProfe);


        guardar_tiemProfeA = findViewById(R.id.guardar_tiemProfeA);
        tiemProfeA_texto= findViewById(R.id.tiemProfeA_texto);
        tiemProfeA= findViewById(R.id.tiemProfeA);
        caja_edit_tiemProfeA= findViewById(R.id.caja_edit_tiemProfeA);
        caja_tiemProfeA_final = findViewById(R.id.caja_tiemProfeA_final);
        cambiar_tiemProfeA = findViewById(R.id.cambiar_tiemProfeA);


        guardar_actiPuestoProfe2= findViewById(R.id.guardar_actiPuestoProfe2);
        actiPuestoProfe2_texto= findViewById(R.id.actiPuestoProfe2_texto);
        actiPuestoProfe2= findViewById(R.id.actiPuestoProfe2);
        caja_actiPuestoProfe2_final= findViewById(R.id.caja_actiPuestoProfe2_final);
        cambiar_actiPuestoProfe2 = findViewById(R.id.cambiar_actiPuestoProfe2);


        guardar_OrgaEmp2 = findViewById(R.id.guardar_OrgaEmp2);
        OrgaEmp2_texto= findViewById(R.id.OrgaEmp2_texto);
        OrgaEmp2 = findViewById(R.id.OrgaEmp2);
        caja_OrgaEmp2_final = findViewById(R.id.caja_OrgaEmp2_final);
        cambiar_OrgaEmp2 = findViewById(R.id.cambiar_OrgaEmp2);


        guardar_tiemProfe2= findViewById(R.id.guardar_tiemProfe2);
        tiemProfe2_texto= findViewById(R.id.tiemProfe2_texto);
        tiemProfe2= findViewById(R.id.tiemProfe2);
        caja_tiemProfe2_final= findViewById(R.id.caja_tiemProfe2_final);
        cambiar_tiemProfe2 = findViewById(R.id.cambiar_tiemProfe2);

        guardar_tiemProfeA2 = findViewById(R.id.guardar_tiemProfeA2);
        tiemProfeA2_texto= findViewById(R.id.tiemProfeA2_texto);
        tiemProfeA2= findViewById(R.id.tiemProfeA2);
        caja_tiemProfeA2_final = findViewById(R.id.caja_tiemProfeA2_final);
        cambiar_tiemProfeA2= findViewById(R.id.cambiar_tiemProfeA2);

        guardar_actiPuesProfe3= findViewById(R.id.guardar_actiPuesProfe3);
        actiPuesProfe3_texto = findViewById(R.id.actiPuesProfe3_texto);
        actiPuesProfe3= findViewById(R.id.actiPuesProfe3);
        caja_actiPuesProfe3_final= findViewById(R.id.caja_actiPuesProfe3_final);
        cambiar_actiPuesProfe3= findViewById(R.id.cambiar_actiPuesProfe3);

        guardar_OrgaEmp3= findViewById(R.id.guardar_OrgaEmp3);
        OrgaEmp3_texto= findViewById(R.id.OrgaEmp3_texto);
        OrgaEmp3= findViewById(R.id.OrgaEmp3);
        caja_OrgaEmp3_final= findViewById(R.id.caja_OrgaEmp3_final);
        cambiar_OrgaEmp3= findViewById(R.id.cambiar_OrgaEmp3);

        guardar_tiemProfe3= findViewById(R.id.guardar_tiemProfe3);
        tiemProfe3_texto= findViewById(R.id.tiemProfe3_texto);
        tiemProfe3_vista= findViewById(R.id.tiemProfe3_vista);
        caja_tiemProfe3_final= findViewById(R.id.caja_tiemProfe3_final);
        cambiar_tiemProfe3= findViewById(R.id.cambiar_tiemProfe3);


        guardar_tiemProfeA3= findViewById(R.id.guardar_tiemProfeA3);
        tiemProfeA3_texto= findViewById(R.id.tiemProfeA3_texto);
        tiemProfeA3= findViewById(R.id.tiemProfeA3);
        caja_tiemProfeA3_final= findViewById(R.id.caja_tiemProfeA3_final);
        cambiar_tiemProfeA3= findViewById(R.id.cambiar_tiemProfeA3);


        guardar_actiPuesProfe4= findViewById(R.id.guardar_actiPuesProfe4);
        actiPuesProfe4_texto = findViewById(R.id.actiPuesProfe4_texto);
        actiPuesProfe4= findViewById(R.id.actiPuesProfe4);
        caja_actiPuesProfe4_final= findViewById(R.id.caja_actiPuesProfe4_final);
        cambiar_actiPuesProfe4= findViewById(R.id.cambiar_actiPuesProfe4);

        guardar_OrgaEmp4= findViewById(R.id.guardar_OrgaEmp4);
        OrgaEmp4_texto= findViewById(R.id.OrgaEmp4_texto);
        OrgaEmp4= findViewById(R.id.OrgaEmp4);
        caja_OrgaEmp4_final= findViewById(R.id.caja_OrgaEmp4_final);
        cambiar_OrgaEmp4= findViewById(R.id.cambiar_OrgaEmp4);

        guardar_tiemProfe4 = findViewById(R.id.guardar_tiemProfe4);
        tiemProfe4_texto= findViewById(R.id.tiemProfe4_texto);
        tiemProfe4_vista= findViewById(R.id.tiemProfe4_vista);
        caja_tiemProfe4_final= findViewById(R.id.caja_tiemProfe4_final);
        cambiar_tiemProfe4= findViewById(R.id.cambiar_tiemProfe4);

        guardar_tiemProfeA4= findViewById(R.id.guardar_tiemProfeA4);
        tiemProfeA4_texto = findViewById(R.id.tiemProfeA4_texto);
        tiemProfeA4= findViewById(R.id.tiemProfeA4);
        caja_tiemProfeA4_final= findViewById(R.id.caja_tiemProfeA4_final);
        cambiar_tiemProfeA4= findViewById(R.id.cambiar_tiemProfeA4);

        actua_exProfe=findViewById(R.id.actua_exProfe);
        executorService= Executors.newSingleThreadExecutor();
        SERVIDOR_CONTROLADOR = new Servidor().local;
        idSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_usuer =idSher.getString("id","no");
        Log.e("ID",""+ id_usuer);
        id_SesionSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_SesionUsuer=id_SesionSher.getString("id_sesion","no");
        Log.e("ID",""+id_SesionUsuer);
        exProfe_sher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        exProfe_Usuer=exProfe_sher.getString("experiencia_profesional","no");
        Log.e("exp profesinal",""+exProfe_Usuer);
        pedir_exProfe();
        guardar_actiPuestoProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPuestoProfe=actiPuestoProfe_texto.getText().toString();
                actiPuestoProfe.setText(nuevo_actiPuestoProfe);
                if (!nuevo_actiPuestoProfe.trim().equals("")) {
                    caja_edit_actiPuestoProfe.setVisibility(View.GONE);
                    caja_actiPuestoProfe_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPuestoProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_actiPuestoProfe.setVisibility(View.VISIBLE);
                caja_actiPuestoProfe_final.setVisibility(View.GONE);

            }
        });
        guardar_OrgaEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_OrgaEmp= OrgaEmp_texto.getText().toString();
                OrgaEmp.setText(nuevo_OrgaEmp);
                if (!nuevo_OrgaEmp.trim().equals("")) {
                    caja_edit_OrgaEmp.setVisibility(View.GONE);
                    caja_OrgaEmp_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La organizacion o empresa es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_OrgaEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_OrgaEmp.setVisibility(View.VISIBLE);
                caja_OrgaEmp_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemProfe= tiemProfe_texto.getText().toString();
                tiemProfe.setText(nuevo_tiemProfe);
                if (!nuevo_tiemProfe.trim().equals("")) {
                    caja_edit_tiemProfe.setVisibility(View.GONE);
                    caja_tiemProfe_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de inicio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemProfe.setVisibility(View.VISIBLE);
                caja_tiemProfe_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemProfeA= tiemProfeA_texto.getText().toString();
                tiemProfeA.setText(nuevo_tiemProfeA);
                if (!nuevo_tiemProfeA.trim().equals("")) {
                    caja_edit_tiemProfeA.setVisibility(View.GONE);
                    caja_tiemProfeA_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemProfeA.setVisibility(View.VISIBLE);
                caja_tiemProfeA_final.setVisibility(View.GONE);

            }
        });
        agregar_otraExpProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe2.setVisibility(View.VISIBLE);
                caja_edit_actiPuestoProfe2.setVisibility(View.VISIBLE);
                actiPuestoProfe2_texto.setText("");

                caja_anuncio_OrgaEmp2.setVisibility(View.VISIBLE);
                caja_edit_OrgaEmp2.setVisibility(View.VISIBLE);
                OrgaEmp2_texto.setText("");

                caja_anuncio_tiemProfe2.setVisibility(View.VISIBLE);
                caja_edit_tiemProfe2.setVisibility(View.VISIBLE);
                tiemProfe2_texto.setText("");

                caja_anuncio_tiemProfeA2.setVisibility(View.VISIBLE);
                caja_edit_tiemProfeA2.setVisibility(View.VISIBLE);
                tiemProfeA2_texto.setText("");

                caja_agregar_otraExpProfe.setVisibility(View.GONE);
                caja_agregar_otraExpProfe2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe2.setVisibility(View.GONE);
                caja_edit_actiPuestoProfe2.setVisibility(View.GONE);
                caja_actiPuestoProfe2_final.setVisibility(View.GONE);
                actiPuestoProfe2.setText("");


                caja_anuncio_OrgaEmp2.setVisibility(View.GONE);
                caja_edit_OrgaEmp2.setVisibility(View.GONE);
                caja_OrgaEmp2_final .setVisibility(View.GONE);
                OrgaEmp2.setText("");


                caja_anuncio_tiemProfe2.setVisibility(View.GONE);
                caja_edit_tiemProfe2.setVisibility(View.GONE);
                caja_tiemProfe2_final.setVisibility(View.GONE);
                tiemProfe2.setText("");


                caja_anuncio_tiemProfeA2.setVisibility(View.GONE);
                caja_edit_tiemProfeA2.setVisibility(View.GONE);
                caja_tiemProfeA2_final.setVisibility(View.GONE);
                tiemProfeA2.setText("");


                caja_agregar_otraExpProfe.setVisibility(View.VISIBLE);
                caja_agregar_otraExpProfe2.setVisibility(View.GONE);


            }
        });
        guardar_actiPuestoProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPuestoProfe2= actiPuestoProfe2_texto.getText().toString();
                actiPuestoProfe2.setText(nuevo_actiPuestoProfe2);
                if (!nuevo_actiPuestoProfe2.trim().equals("")) {
                    caja_edit_actiPuestoProfe2.setVisibility(View.GONE);
                    caja_actiPuestoProfe2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPuestoProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_actiPuestoProfe2.setVisibility(View.VISIBLE);
                caja_actiPuestoProfe2_final.setVisibility(View.GONE);

            }
        });
        guardar_OrgaEmp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_OrgaEmp2= OrgaEmp2_texto.getText().toString();
                OrgaEmp2.setText(nuevo_OrgaEmp2);
                if (!nuevo_OrgaEmp2.trim().equals("")) {
                    caja_edit_OrgaEmp2.setVisibility(View.GONE);
                    caja_OrgaEmp2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La organizacion o empresa es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_OrgaEmp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_OrgaEmp2.setVisibility(View.VISIBLE);
                caja_OrgaEmp2_final .setVisibility(View.GONE);

            }
        });
        guardar_tiemProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemProfe2= tiemProfe2_texto.getText().toString();
                tiemProfe2.setText(nuevo_tiemProfe2);
                if (!nuevo_tiemProfe2.trim().equals("")) {
                    caja_edit_tiemProfe2.setVisibility(View.GONE);
                    caja_tiemProfe2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de incio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemProfe2.setVisibility(View.VISIBLE);
                caja_tiemProfe2_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfeA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemProfeA2= tiemProfeA2_texto.getText().toString();
                tiemProfeA2.setText(nuevo_tiemProfeA2);
                if (!nuevo_tiemProfeA2.trim().equals("")) {
                    caja_edit_tiemProfeA2.setVisibility(View.GONE);
                    caja_tiemProfeA2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfeA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemProfeA2.setVisibility(View.VISIBLE);
                caja_tiemProfeA2_final.setVisibility(View.GONE);

            }
        });
        agregar_otraExpProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe3.setVisibility(View.VISIBLE);
                caja_actiPuesProfe3.setVisibility(View.VISIBLE);
                actiPuesProfe3_texto.setText("");

                caja_anuncio_OrgaEmp3.setVisibility(View.VISIBLE);
                caja_edit_OrgaEmp3.setVisibility(View.VISIBLE);
                OrgaEmp3_texto.setText("");

                caja_anuncio_tiemProfe3.setVisibility(View.VISIBLE);
                caja_tiemProfe3.setVisibility(View.VISIBLE);
                tiemProfe3_texto.setText("");

                caja_anuncio_tiemProfeA3.setVisibility(View.VISIBLE);
                caja_edit_tiemProfeA3.setVisibility(View.VISIBLE);
                tiemProfeA3_texto.setText("");

                caja_agregar_otraExpProfe2.setVisibility(View.GONE);
                caja_agregar_otraExpProfe3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe3.setVisibility(View.GONE);
                caja_actiPuesProfe3.setVisibility(View.GONE);
                caja_actiPuesProfe3_final.setVisibility(View.GONE);
                actiPuesProfe3.setText("");

                caja_anuncio_OrgaEmp3.setVisibility(View.GONE);
                caja_edit_OrgaEmp3.setVisibility(View.GONE);
                caja_OrgaEmp3_final.setVisibility(View.GONE);
                OrgaEmp3.setText("");

                caja_anuncio_tiemProfe3.setVisibility(View.GONE);
                caja_tiemProfe3.setVisibility(View.GONE);
                caja_tiemProfe3_final.setVisibility(View.GONE);
                tiemProfe3_vista.setText("");

                caja_anuncio_tiemProfeA3.setVisibility(View.GONE);
                caja_edit_tiemProfeA3.setVisibility(View.GONE);
                caja_tiemProfeA3_final.setVisibility(View.GONE);
                tiemProfeA3.setText("");

                caja_agregar_otraExpProfe2.setVisibility(View.VISIBLE);
                caja_agregar_otraExpProfe3.setVisibility(View.GONE);


            }
        });
        guardar_actiPuesProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPuesProfe3= actiPuesProfe3_texto.getText().toString();
                actiPuesProfe3.setText(nuevo_actiPuesProfe3);
                if (!nuevo_actiPuesProfe3.trim().equals("")) {
                    caja_actiPuesProfe3.setVisibility(View.GONE);
                    caja_actiPuesProfe3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPuesProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_actiPuesProfe3.setVisibility(View.VISIBLE);
                caja_actiPuesProfe3_final.setVisibility(View.GONE);

            }
        });
        guardar_OrgaEmp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_OrgaEmp3= OrgaEmp3_texto.getText().toString();
                OrgaEmp3.setText(nuevo_OrgaEmp3);
                if (!nuevo_OrgaEmp3.trim().equals("")) {
                    caja_edit_OrgaEmp3.setVisibility(View.GONE);
                    caja_OrgaEmp3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La organizacion o empresa es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_OrgaEmp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_OrgaEmp3.setVisibility(View.VISIBLE);
                caja_OrgaEmp3_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemProfe3= tiemProfe3_texto.getText().toString();
                tiemProfe3_vista.setText(nuevo_tiemProfe3);
                if (!nuevo_tiemProfe3.trim().equals("")) {
                    caja_tiemProfe3.setVisibility(View.GONE);
                    caja_tiemProfe3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de incio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_tiemProfe3.setVisibility(View.VISIBLE);
                caja_tiemProfe3_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfeA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemProfeA3= tiemProfeA3_texto.getText().toString();
                tiemProfeA3.setText(nuevo_tiemProfeA3);
                if (!nuevo_tiemProfeA3.trim().equals("")) {
                    caja_edit_tiemProfeA3.setVisibility(View.GONE);
                    caja_tiemProfeA3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfeA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemProfeA3.setVisibility(View.VISIBLE);
                caja_tiemProfeA3_final.setVisibility(View.GONE);

            }
        });
        agregar_otraExpProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe4.setVisibility(View.VISIBLE);
                caja_actiPuesProfe4.setVisibility(View.VISIBLE);
                actiPuesProfe4_texto.setText("");

                caja_anuncio_OrgaEmp4.setVisibility(View.VISIBLE);
                caja_edit_OrgaEmp4.setVisibility(View.VISIBLE);
                OrgaEmp4_texto.setText("");

                caja_anuncio_tiemProfe4.setVisibility(View.VISIBLE);
                caja_tiemProfe4.setVisibility(View.VISIBLE);
                tiemProfe4_texto.setText("");

                caja_anuncio_tiemProfeA4.setVisibility(View.VISIBLE);
                caja_edit_tiemProfeA4.setVisibility(View.VISIBLE);
                tiemProfeA4_texto.setText("");

                caja_agregar_otraExpProfe3.setVisibility(View.GONE);
                caja_borrar_otraExpProfe3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe4.setVisibility(View.GONE);
                caja_actiPuesProfe4.setVisibility(View.GONE);
                caja_actiPuesProfe4_final.setVisibility(View.GONE);
                actiPuesProfe4.setText("");

                caja_anuncio_OrgaEmp4.setVisibility(View.GONE);
                caja_edit_OrgaEmp4.setVisibility(View.GONE);
                caja_OrgaEmp4_final.setVisibility(View.GONE);
                OrgaEmp4.setText("");

                caja_anuncio_tiemProfe4.setVisibility(View.GONE);
                caja_tiemProfe4.setVisibility(View.GONE);
                caja_tiemProfe4_final.setVisibility(View.GONE);
                tiemProfe4_vista.setText("");

                caja_anuncio_tiemProfeA4.setVisibility(View.GONE);
                caja_edit_tiemProfeA4.setVisibility(View.GONE);
                caja_tiemProfeA4_final.setVisibility(View.GONE);
                tiemProfeA4.setText("");

                caja_agregar_otraExpProfe3.setVisibility(View.VISIBLE);
                caja_borrar_otraExpProfe3.setVisibility(View.GONE);


            }
        });
        guardar_actiPuesProfe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPuesProfe4= actiPuesProfe4_texto.getText().toString();
                actiPuesProfe4.setText(nuevo_actiPuesProfe4);
                if (!nuevo_actiPuesProfe4.trim().equals("")) {
                    caja_actiPuesProfe4.setVisibility(View.GONE);
                    caja_actiPuesProfe4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPuesProfe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_actiPuesProfe4.setVisibility(View.VISIBLE);
                caja_actiPuesProfe4_final.setVisibility(View.GONE);

            }
        });
        guardar_OrgaEmp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_OrgaEmp4= OrgaEmp4_texto.getText().toString();
                OrgaEmp4.setText(nuevo_OrgaEmp4);
                if (!nuevo_OrgaEmp4.trim().equals("")) {
                    caja_edit_OrgaEmp4.setVisibility(View.GONE);
                    caja_OrgaEmp4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La organizacion o empresa es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_OrgaEmp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_OrgaEmp4.setVisibility(View.VISIBLE);
                caja_OrgaEmp4_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemProfe4= tiemProfe4_texto.getText().toString();
                tiemProfe4_vista.setText(nuevo_tiemProfe4);
                if (!nuevo_tiemProfe4.trim().equals("")) {
                    caja_tiemProfe4.setVisibility(View.GONE);
                    caja_tiemProfe4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de incio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_tiemProfe4.setVisibility(View.VISIBLE);
                caja_tiemProfe4_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfeA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemProfeA4= tiemProfeA4_texto.getText().toString();
                tiemProfeA4.setText(nuevo_tiemProfeA4);
                if (!nuevo_tiemProfeA4.trim().equals("")) {
                    caja_edit_tiemProfeA4.setVisibility(View.GONE);
                    caja_tiemProfeA4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfeA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemProfeA4.setVisibility(View.VISIBLE);
                caja_tiemProfeA4_final.setVisibility(View.GONE);

            }
        });
        actua_exProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                nuevo_actiPuestoProfe=actiPuestoProfe.getText().toString();
                nuevo_OrgaEmp= OrgaEmp.getText().toString();
                nuevo_tiemProfe= tiemProfe.getText().toString();
                nuevo_tiemProfeA= tiemProfeA.getText().toString();
                nuevo_actiPuestoProfe2= actiPuestoProfe2.getText().toString();
                nuevo_OrgaEmp2= OrgaEmp2.getText().toString();
                nuevo_tiemProfe2= tiemProfe2.getText().toString();
                nuevo_tiemProfeA2= tiemProfeA2.getText().toString();
                nuevo_actiPuesProfe3= actiPuesProfe3.getText().toString();
                nuevo_OrgaEmp3= OrgaEmp3.getText().toString();
                nuevo_tiemProfe3= tiemProfe3_vista.getText().toString();
                nuevo_tiemProfeA3= tiemProfeA3.getText().toString();
                nuevo_actiPuesProfe4= actiPuesProfe4.getText().toString();
                nuevo_OrgaEmp4= OrgaEmp4.getText().toString();
                nuevo_tiemProfe4= tiemProfe4_vista.getText().toString();
                nuevo_tiemProfeA4= tiemProfeA4.getText().toString();

                if (nuevo_actiPuestoProfe.trim().equals("")){
                    nuevo_actiPuestoProfe=" ";
                }
                if (nuevo_OrgaEmp.trim().equals("")){
                    nuevo_OrgaEmp=" ";
                }
                if (nuevo_tiemProfe.trim().equals("")){
                    nuevo_tiemProfe=" ";
                }
                if (nuevo_tiemProfeA.trim().equals("")){
                    nuevo_tiemProfeA=" ";
                }
                if (nuevo_actiPuestoProfe2.trim().equals("")){
                    nuevo_actiPuestoProfe2=" ";
                }
                if (nuevo_OrgaEmp2.trim().equals("")){
                    nuevo_OrgaEmp2=" ";
                }
                if (nuevo_tiemProfe2.trim().equals("")){
                    nuevo_tiemProfe2=" ";
                }
                if (nuevo_tiemProfeA2.trim().equals("")){
                    nuevo_tiemProfeA2=" ";
                }
                if (nuevo_actiPuesProfe3.trim().equals("")){
                    nuevo_actiPuesProfe3=" ";
                }
                if (nuevo_OrgaEmp3.trim().equals("")){
                    nuevo_OrgaEmp3=" ";
                }
                if (nuevo_tiemProfe3.trim().equals("")){
                    nuevo_tiemProfe3=" ";
                }
                if (nuevo_tiemProfeA3.trim().equals("")){
                    nuevo_tiemProfeA3=" ";
                }
                if (nuevo_actiPuesProfe4.trim().equals("")){
                    nuevo_actiPuesProfe4=" ";
                }
                if (nuevo_OrgaEmp4.trim().equals("")){
                    nuevo_OrgaEmp4=" ";
                }
                if (nuevo_tiemProfe4.trim().equals("")){
                    nuevo_tiemProfe4=" ";
                }
                if (nuevo_tiemProfeA4.trim().equals("")){
                    nuevo_tiemProfeA4=" ";
                }
                JSONObject jsonObject=new JSONObject();
                json_datos_exProfe =new JSONArray();
                try {
                    jsonObject.put("nuevo_actiPuestoProfe",nuevo_actiPuestoProfe);
                    jsonObject.put("nuevo_OrgaEmp",nuevo_OrgaEmp);
                    jsonObject.put("nuevo_tiemProfe",nuevo_tiemProfe);
                    jsonObject.put("nuevo_tiemProfeA",nuevo_tiemProfeA);
                    jsonObject.put("nuevo_actiPuestoProfe2",nuevo_actiPuestoProfe2);
                    jsonObject.put("nuevo_OrgaEmp2",nuevo_OrgaEmp2);
                    jsonObject.put("nuevo_tiemProfe2",nuevo_tiemProfe2);
                    jsonObject.put("nuevo_tiemProfeA2",nuevo_tiemProfeA2);
                    jsonObject.put("nuevo_actiPuesProfe3",nuevo_actiPuesProfe3);
                    jsonObject.put("nuevo_OrgaEmp3",nuevo_OrgaEmp3);
                    jsonObject.put("nuevo_tiemProfe3",nuevo_tiemProfe3);
                    jsonObject.put("nuevo_tiemProfeA3",nuevo_tiemProfeA3);
                    jsonObject.put("nuevo_actiPuesProfe4",nuevo_actiPuesProfe4);
                    jsonObject.put("nuevo_OrgaEmp4",nuevo_OrgaEmp4);
                    jsonObject.put("nuevo_tiemProfe4",nuevo_tiemProfe4);
                    jsonObject.put("nuevo_tiemProfeA4",nuevo_tiemProfeA4);
                    json_datos_exProfe.put(jsonObject);
                    Log.e("1", String.valueOf(jsonObject));
                    Log.e("2", String.valueOf(json_datos_exProfe));
                    for(int i = 0; i< json_datos_exProfe.length(); i++){
                        try {JSONObject jsoSacandoPro= json_datos_exProfe.getJSONObject(i);
                            String strnuevo_actiPuestoProfe=jsoSacandoPro.get("nuevo_actiPuestoProfe").toString();
                            String strnuevo_OrgaEmp=jsoSacandoPro.get("nuevo_OrgaEmp").toString();
                            String strnuevo_tiemProfe=jsoSacandoPro.get("nuevo_tiemProfe").toString();
                            String strnuevo_tiemProfeA=jsoSacandoPro.get("nuevo_tiemProfeA").toString();
                            String strnuevo_actiPuestoProfe2=jsoSacandoPro.get("nuevo_actiPuestoProfe2").toString();
                            String strnuevo_OrgaEmp2=jsoSacandoPro.get("nuevo_OrgaEmp2").toString();
                            String strnuevo_tiemProfe2=jsoSacandoPro.get("nuevo_tiemProfe2").toString();
                            String strnuevo_tiemProfeA2=jsoSacandoPro.get("nuevo_tiemProfeA2").toString();
                            String strnuevo_actiPuesProfe3=jsoSacandoPro.get("nuevo_actiPuesProfe3").toString();
                            String strnuevo_OrgaEmp3=jsoSacandoPro.get("nuevo_OrgaEmp3").toString();
                            String strnuevo_tiemProfe3=jsoSacandoPro.get("nuevo_tiemProfe3").toString();
                            String strnuevo_tiemProfeA3=jsoSacandoPro.get("nuevo_tiemProfeA3").toString();
                            String strnuevo_actiPuesProfe4=jsoSacandoPro.get("nuevo_actiPuesProfe4").toString();
                            String strnuevo_OrgaEmp4=jsoSacandoPro.get("nuevo_OrgaEmp4").toString();
                            String strnuevo_tiemProfe4=jsoSacandoPro.get("nuevo_tiemProfe4").toString();
                            String strnuevo_tiemProfeA4=jsoSacandoPro.get("nuevo_tiemProfeA4").toString();

                            exProfe_totales =strnuevo_actiPuestoProfe+" /*-*/ "+strnuevo_OrgaEmp+" /*-*/ "+strnuevo_tiemProfe+" /*-*/ "+strnuevo_tiemProfeA
                                    +" /*-*/ "+strnuevo_actiPuestoProfe2+" /*-*/ "+strnuevo_OrgaEmp2+" /*-*/ "+strnuevo_tiemProfe2+
                                    " /*-*/ "+strnuevo_tiemProfeA2+" /*-*/ "+strnuevo_actiPuesProfe3+" /*-*/ "+strnuevo_OrgaEmp3+" /*-*/ "+strnuevo_tiemProfe3
                                    +" /*-*/ "+strnuevo_tiemProfeA3+" /*-*/ "+strnuevo_actiPuesProfe4+" /*-*/ "+strnuevo_OrgaEmp4+
                                    " /*-*/ "+strnuevo_tiemProfe4+" /*-*/ "+strnuevo_tiemProfeA4;
                            if(!exProfe_totales.trim().equals("")){
                                executorService.execute(new Runnable() {
                                    @Override
                                    public void run() {
                                        guardando_exProfe();
                                        Intent intent = new Intent(ExperienciaProfesional.this,Login.class);
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
    public void guardando_exProfe(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"experiencia_profesional.php",
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
                map.put("experiencia_profesional",exProfe_totales);
                map.put("id",id_usuer);
                map.put("id_sesion",id_SesionUsuer);
                return map;
            }
        };
        requestQueue.add(request);
    }
    public void pedir_exProfe(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"pedir_experiencia_profesional.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("respuesta:",response);

                        JSONObject jsonObject = null;
                        try {
                            jsonObject = new JSONObject(response);
                            String str_exp_profe = jsonObject.getString("experiencia_profesional");

                            if(!str_exp_profe.equals("")){
                                Log.e("respuesta_frag",""+str_exp_profe);
                                String[] expProfe_fragmentada=str_exp_profe.split(" /\\*-\\*/ ");
                                Log.e("respuesta_frag",""+expProfe_fragmentada);

                                if(!expProfe_fragmentada[0].equals(" ")){

                                    nuevo_actiPuestoProfe=expProfe_fragmentada[0];
                                    nuevo_OrgaEmp=expProfe_fragmentada[1];
                                    nuevo_tiemProfe=expProfe_fragmentada[2];
                                    nuevo_tiemProfeA=expProfe_fragmentada[3];

                                    Log.e("Nuevalic",""+nuevo_actiPuestoProfe);
                                    actiPuestoProfe.setText(nuevo_actiPuestoProfe);
                                    OrgaEmp.setText(nuevo_OrgaEmp);
                                    tiemProfe.setText(nuevo_tiemProfe);
                                    tiemProfeA.setText(nuevo_tiemProfeA);

                                    caja_edit_actiPuestoProfe.setVisibility(View.GONE);
                                    caja_actiPuestoProfe_final.setVisibility(View.VISIBLE);
                                    caja_edit_OrgaEmp.setVisibility(View.GONE);
                                    caja_OrgaEmp_final.setVisibility(View.VISIBLE);
                                    caja_edit_tiemProfe.setVisibility(View.GONE);
                                    caja_tiemProfe_final.setVisibility(View.VISIBLE);
                                    caja_edit_tiemProfeA.setVisibility(View.GONE);
                                    caja_tiemProfeA_final.setVisibility(View.VISIBLE);

                                    if(!expProfe_fragmentada[4].equals(" ")){
                                        nuevo_actiPuestoProfe2=expProfe_fragmentada[4];
                                        nuevo_OrgaEmp2=expProfe_fragmentada[5];
                                        nuevo_tiemProfe2=expProfe_fragmentada[6];
                                        nuevo_tiemProfeA2=expProfe_fragmentada[7];
                                        Log.e("Nuevalic",""+nuevo_actiPuestoProfe2);
                                        actiPuestoProfe2.setText(nuevo_actiPuestoProfe2);
                                        OrgaEmp2.setText(nuevo_OrgaEmp2);
                                        tiemProfe2.setText(nuevo_tiemProfe2);
                                        tiemProfeA2.setText(nuevo_tiemProfeA2);

                                        caja_edit_actiPuestoProfe2.setVisibility(View.GONE);
                                        caja_actiPuestoProfe2_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_actiPuesProfe2.setVisibility(View.VISIBLE);

                                        caja_edit_OrgaEmp2.setVisibility(View.GONE);
                                        caja_OrgaEmp2_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_OrgaEmp2.setVisibility(View.VISIBLE);

                                        caja_edit_tiemProfe2.setVisibility(View.GONE);
                                        caja_tiemProfe2_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_tiemProfe2.setVisibility(View.VISIBLE);

                                        caja_edit_tiemProfeA2.setVisibility(View.GONE);
                                        caja_tiemProfeA2_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_tiemProfeA2.setVisibility(View.VISIBLE);

                                        caja_agregar_otraExpProfe.setVisibility(View.GONE);
                                        caja_agregar_otraExpProfe2.setVisibility(View.VISIBLE);
                                    }
                                    if(!expProfe_fragmentada[8].equals(" ")){
                                        nuevo_actiPuesProfe3=expProfe_fragmentada[8];
                                        nuevo_OrgaEmp3=expProfe_fragmentada[9];
                                        nuevo_tiemProfe3=expProfe_fragmentada[10];
                                        nuevo_tiemProfeA3=expProfe_fragmentada[11];

                                        Log.e("Nuevalic3",""+nuevo_actiPuesProfe3);
                                        actiPuesProfe3.setText(nuevo_actiPuesProfe3);
                                        OrgaEmp3.setText(nuevo_OrgaEmp3);
                                        tiemProfe3_vista.setText(nuevo_tiemProfe3);
                                        tiemProfeA3.setText(nuevo_tiemProfeA3);


                                        caja_actiPuesProfe3.setVisibility(View.GONE);
                                        caja_actiPuesProfe3_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_actiPuesProfe3.setVisibility(View.VISIBLE);

                                        caja_edit_OrgaEmp3.setVisibility(View.GONE);
                                        caja_OrgaEmp3_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_OrgaEmp3.setVisibility(View.VISIBLE);

                                        caja_tiemProfe3.setVisibility(View.GONE);
                                        caja_tiemProfe3_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_tiemProfe3.setVisibility(View.VISIBLE);

                                        caja_edit_tiemProfeA3.setVisibility(View.GONE);
                                        caja_tiemProfeA3_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_tiemProfeA3.setVisibility(View.VISIBLE);


                                        caja_agregar_otraExpProfe2.setVisibility(View.GONE);
                                        caja_agregar_otraExpProfe3.setVisibility(View.VISIBLE);

                                    }
                                    if(!expProfe_fragmentada[12].equals(" ")){
                                        nuevo_actiPuesProfe4=expProfe_fragmentada[12];
                                        nuevo_OrgaEmp4=expProfe_fragmentada[13];
                                        nuevo_tiemProfe4=expProfe_fragmentada[14];
                                        nuevo_tiemProfeA4=expProfe_fragmentada[15];
                                        Log.e("Nuevalic4",""+nuevo_actiPuesProfe4);

                                        actiPuesProfe4.setText(nuevo_actiPuesProfe4);
                                        OrgaEmp4.setText(nuevo_OrgaEmp4);
                                        tiemProfe4_vista.setText(nuevo_tiemProfe4);
                                        tiemProfeA4.setText(nuevo_tiemProfeA4);


                                        caja_actiPuesProfe4.setVisibility(View.GONE);
                                        caja_actiPuesProfe4_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_actiPuesProfe4.setVisibility(View.VISIBLE);

                                        caja_edit_OrgaEmp4.setVisibility(View.GONE);
                                        caja_OrgaEmp4_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_OrgaEmp4.setVisibility(View.VISIBLE);

                                        caja_tiemProfe4.setVisibility(View.GONE);
                                        caja_tiemProfe4_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_tiemProfe4.setVisibility(View.VISIBLE);

                                        caja_edit_tiemProfeA4.setVisibility(View.GONE);
                                        caja_tiemProfeA4_final.setVisibility(View.VISIBLE);
                                        caja_anuncio_tiemProfeA4.setVisibility(View.VISIBLE);

                                        caja_agregar_otraExpProfe3.setVisibility(View.GONE);
                                        caja_borrar_otraExpProfe3.setVisibility(View.VISIBLE);

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