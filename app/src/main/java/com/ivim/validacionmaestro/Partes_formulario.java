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
import android.widget.ScrollView;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Partes_formulario extends AppCompatActivity {

    private ScrollView formulario_lista;

    private TextView ir_formacion_docente,ir_capa_docente,ir_actualizacion_disciplinar,
            ir_gestion_disciplinar,ir_productosAca,ir_expeProfe,ir_expeDiseInge,ir_logrosProfe,
            ir_partColeCam,ir_premiosDist,ir_aportaRele,cerrar_sesion;
    private String id_usuer,correoUsuer,id_SesionUsuer;
    private ExecutorService executorService;
    private static String SERVIDOR_CONTROLADOR;
    private SharedPreferences idSher,id_SesionSher,correoSher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_partes_formulario);


        formulario_lista=findViewById(R.id.formulario_lista);
        ir_formacion_docente=findViewById(R.id.ir_formacion_docente);
        ir_capa_docente=findViewById(R.id.ir_capa_docente);
        ir_actualizacion_disciplinar=findViewById(R.id.ir_actualizacion_disciplinar);
        ir_gestion_disciplinar=findViewById(R.id.ir_gestion_disciplinar);
        ir_productosAca=findViewById(R.id.ir_productosAca);
        ir_expeProfe=findViewById(R.id.ir_expeProfe);
        ir_expeDiseInge=findViewById(R.id.ir_expeDiseInge);
        ir_logrosProfe=findViewById(R.id.ir_logrosProfe);
        ir_partColeCam=findViewById(R.id.ir_partColeCam);
        ir_premiosDist=findViewById(R.id.ir_premiosDist);
        ir_aportaRele=findViewById(R.id.ir_aportaRele);
        cerrar_sesion=findViewById(R.id.cerrar_sesion);
        executorService= Executors.newSingleThreadExecutor();
        SERVIDOR_CONTROLADOR = new Servidor().local;
        idSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_usuer =idSher.getString("id","no");
        Log.e("ID",""+ id_usuer);
        id_SesionSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_SesionUsuer=id_SesionSher.getString("id_sesion","no");
        Log.e("ID",""+id_SesionUsuer);
        correoSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        correoUsuer=correoSher.getString("correo","no");
        Log.e("correo",""+correoUsuer);

        ir_formacion_docente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irFormDocente;
                irFormDocente= new Intent(Partes_formulario.this,Formacion_docente.class);
                startActivity(irFormDocente);
            }
        });
        ir_capa_docente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irCapaDocente;
                irCapaDocente= new Intent(Partes_formulario.this,Capacitacion_docente.class);
                startActivity(irCapaDocente);
            }
        });
        ir_actualizacion_disciplinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actuaDisciplinar;
                actuaDisciplinar= new Intent(Partes_formulario.this,Actualizacion_disciplinar.class);
                startActivity(actuaDisciplinar);
            }
        });
        ir_gestion_disciplinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gestionDisciplinar;
                gestionDisciplinar= new Intent(Partes_formulario.this,Gestion_academica.class);
                startActivity(gestionDisciplinar);
            }
        });
        ir_productosAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prodcutsoAca= new Intent(Partes_formulario.this,ProductosAcademicos.class);
                startActivity(prodcutsoAca);
            }
        });

        ir_expeProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent expProfe= new Intent(Partes_formulario.this,ExperienciaProfesional.class);
                startActivity(expProfe);
            }
        });
        ir_expeDiseInge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent expDiseno= new Intent(Partes_formulario.this,ExperienciaDisenoInge.class);
                startActivity(expDiseno);
            }
        });
        ir_logrosProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logProfe= new Intent(Partes_formulario.this,LogrosProfesionales .class);
                startActivity(logProfe);
            }
        });
        ir_partColeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent partColCam= new Intent(Partes_formulario.this,ParticipacionColCam .class);
                startActivity(partColCam);
            }
        });
        ir_premiosDist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent premioDist= new Intent(Partes_formulario.this,PremiosDisticiones .class);
                startActivity(premioDist);
            }
        });
        ir_aportaRele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent partColCam= new Intent(Partes_formulario.this,AportacionesPe .class);
                startActivity(partColCam);
            }
        });
        cerrar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        cerrarSesion();
                    }
                });
            }
        });
    }
    public void cerrarSesion(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"cerrar_sesion.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("respuesta:",response);
                        if (response.equals("sesion_cerrada")) {
                            Intent intent= new Intent(Partes_formulario.this,Login.class);
                            startActivity(intent);
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
                map.put("correo",correoUsuer);
                return map;
            }
        };
        requestQueue.add(request);
    }
}