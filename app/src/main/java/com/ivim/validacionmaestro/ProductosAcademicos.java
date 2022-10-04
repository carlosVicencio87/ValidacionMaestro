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
            desProdAca6,desProdAca7,desProdAca8,actuatualizar_seccion;

    private String nuevo_desProdAca,nuevo_desProdAca2,
            nuevo_desProdAca3,nuevo_desProdAca4,nuevo_desProdAca5,nuevo_desProdAca6,nuevo_desProdAca7,nuevo_desProdAca8,produc_totales,id_usuer,id_SesionUsuer,prodAca_Usuer;

    private JSONArray json_datos_productoAca;

    private ExecutorService executorService;
    private static String SERVIDOR_CONTROLADOR;
    private SharedPreferences idSher,id_SesionSher,prodAca_sher;


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
        actuatualizar_seccion=findViewById(R.id.actuatualizar_seccion);

        executorService= Executors.newSingleThreadExecutor();
        SERVIDOR_CONTROLADOR = new Servidor().local;
        idSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_usuer=idSher.getString("id","no");
        Log.e("ID",""+id_usuer);
        id_SesionSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_SesionUsuer=id_SesionSher.getString("id_sesion","no");
        Log.e("ID",""+id_SesionUsuer);

        prodAca_sher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        prodAca_Usuer=prodAca_sher.getString("productos_academicos","no");
        Log.e("productos",""+prodAca_Usuer);
        pedir_prodAca();
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
                desProdAca.setText("");


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
                desProdAca2.setText("");


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
                desProdAca3.setText("");


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
                desProdAca4.setText("");


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
                desProdAca5.setText("");


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
                desProdAca6.setText("");

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
                desProdAca7.setText("");


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
                desProdAca8.setText("");

            }
        });
        actuatualizar_seccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nuevo_desProdAca= desProdAca.getText().toString();
                nuevo_desProdAca2 = desProdAca2.getText().toString();
                nuevo_desProdAca3 = desProdAca3.getText().toString();
                nuevo_desProdAca4=desProdAca4.getText().toString();
                nuevo_desProdAca5= desProdAca5.getText().toString();
                nuevo_desProdAca6 = desProdAca6.getText().toString();
                nuevo_desProdAca7 = desProdAca7.getText().toString();
                nuevo_desProdAca8= desProdAca8.getText().toString();
                    if (nuevo_desProdAca.trim().equals("")){
                        nuevo_desProdAca=" ";
                    }
                    if (nuevo_desProdAca2.trim().equals("")){
                        nuevo_desProdAca2=" ";
                    }
                    if (nuevo_desProdAca3.trim().equals("")){
                        nuevo_desProdAca3=" ";
                    }
                    if (nuevo_desProdAca4.trim().equals("")){
                        nuevo_desProdAca4=" ";
                    }
                    if (nuevo_desProdAca5.trim().equals("")){
                        nuevo_desProdAca5=" ";
                    }
                    if (nuevo_desProdAca6.trim().equals("")){
                        nuevo_desProdAca6=" ";
                    }
                    if (nuevo_desProdAca7.trim().equals("")){
                        nuevo_desProdAca7=" ";
                    }
                    if (nuevo_desProdAca8.trim().equals("")){
                        nuevo_desProdAca8=" ";
                    }
                    JSONObject jsonObject=new JSONObject();
                    json_datos_productoAca =new JSONArray();
                        try {
                            jsonObject.put("nuevo_desProdAca",nuevo_desProdAca);
                            jsonObject.put("nuevo_desProdAca2",nuevo_desProdAca2);
                            jsonObject.put("nuevo_desProdAca3",nuevo_desProdAca3);
                            jsonObject.put("nuevo_desProdAca4",nuevo_desProdAca4);
                            jsonObject.put("nuevo_desProdAca5",nuevo_desProdAca5);
                            jsonObject.put("nuevo_desProdAca6",nuevo_desProdAca6);
                            jsonObject.put("nuevo_desProdAca7",nuevo_desProdAca7);
                            jsonObject.put("nuevo_desProdAca8",nuevo_desProdAca8);
                            json_datos_productoAca.put(jsonObject);
                            Log.e("1", String.valueOf(jsonObject));
                            Log.e("2", String.valueOf(json_datos_productoAca));
                            for(int i=0;i<json_datos_productoAca.length();i++){
                                    try {JSONObject jsoSacandoPro=json_datos_productoAca.getJSONObject(i);
                                        String strnuevo_desProdAca=jsoSacandoPro.get("nuevo_desProdAca").toString();
                                        String strnuevo_desProdAca2=jsoSacandoPro.get("nuevo_desProdAca2").toString();
                                        String strnuevo_desProdAca3=jsoSacandoPro.get("nuevo_desProdAca3").toString();
                                        String strnuevo_desProdAca4=jsoSacandoPro.get("nuevo_desProdAca4").toString();
                                        String strnuevo_desProdAca5=jsoSacandoPro.get("nuevo_desProdAca5").toString();
                                        String strnuevo_desProdAca6=jsoSacandoPro.get("nuevo_desProdAca6").toString();
                                        String strnuevo_desProdAca7=jsoSacandoPro.get("nuevo_desProdAca7").toString();
                                        String strnuevo_desProdAca8=jsoSacandoPro.get("nuevo_desProdAca8").toString();

                                        produc_totales=strnuevo_desProdAca+" /*-*/ "+strnuevo_desProdAca2+" /*-*/ "+strnuevo_desProdAca3+" /*-*/ "+strnuevo_desProdAca4
                                                +" /*-*/ "+strnuevo_desProdAca5+" /*-*/ "+strnuevo_desProdAca6+" /*-*/ "+strnuevo_desProdAca7+
                                                " /*-*/ "+strnuevo_desProdAca8;
                                        if(!produc_totales.trim().equals("")){
                                            executorService.execute(new Runnable() {
                                                @Override
                                                public void run() {
                                                    guardando_proAca();
                                                    Intent intent = new Intent(ProductosAcademicos.this,Login.class);
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
    public void guardando_proAca(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"productos_academicos.php",
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
                map.put("productos_academicos",produc_totales);
                map.put("id",id_usuer);
                map.put("id_sesion",id_SesionUsuer);
                return map;
            }
        };
        requestQueue.add(request);
    }
    public void pedir_prodAca(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"pedir_productos_academicos.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("respuesta:",response);

                        JSONObject jsonObject = null;
                        try {
                            jsonObject = new JSONObject(response);
                            String str_prod_academicos = jsonObject.getString("productos_academicos");

                            if(!str_prod_academicos.equals("")){
                                Log.e("respuesta_frag",""+str_prod_academicos);
                                String[] productosAca_fragmentada=str_prod_academicos.split(" /\\*-\\*/ ");
                                Log.e("respuesta_frag",""+productosAca_fragmentada);

                                if(!productosAca_fragmentada[0].equals(" ")){

                                    nuevo_desProdAca=productosAca_fragmentada[0];
                                    Log.e("Nuevalic",""+nuevo_desProdAca);
                                    desProdAca.setText(nuevo_desProdAca);
                                    caja_edit_desProdAca.setVisibility(View.GONE);
                                    caja_desProdAca_final.setVisibility(View.VISIBLE);

                                }
                                if(!productosAca_fragmentada[1].equals(" ")){

                                    nuevo_desProdAca2=productosAca_fragmentada[1];

                                    Log.e("Nuevalic",""+nuevo_desProdAca2);
                                    desProdAca2.setText(nuevo_desProdAca2);
                                    caja_edit_desProdAca2.setVisibility(View.GONE);
                                    caja_desProdAca2_final.setVisibility(View.VISIBLE);


                                }
                                if(!productosAca_fragmentada[2].equals(" ")){

                                    nuevo_desProdAca3=productosAca_fragmentada[2];


                                    Log.e("Nuevalic3",""+nuevo_desProdAca3);
                                    desProdAca3.setText(nuevo_desProdAca3);
                                    caja_edit_desProdAca3.setVisibility(View.GONE);
                                    caja_desProdAca3_final.setVisibility(View.VISIBLE);

                                }
                                if(!productosAca_fragmentada[3].equals(" ")){

                                    nuevo_desProdAca4=productosAca_fragmentada[3];

                                    Log.e("Nuevalic4",""+nuevo_desProdAca4);

                                    desProdAca4.setText(nuevo_desProdAca4);
                                    caja_edit_desProdAca4.setVisibility(View.GONE);
                                    caja_desProdAca4_final.setVisibility(View.VISIBLE);

                                }
                                if(!productosAca_fragmentada[4].equals(" ")){
                                    nuevo_desProdAca5=productosAca_fragmentada[4];
                                    Log.e("Nuevalic4",""+nuevo_desProdAca5);

                                    desProdAca5.setText(nuevo_desProdAca5);
                                    caja_edit_desProdAca5.setVisibility(View.GONE);
                                    caja_desProdAca5_final.setVisibility(View.VISIBLE);
                                }
                                if(!productosAca_fragmentada[5].equals(" ")){
                                    nuevo_desProdAca6=productosAca_fragmentada[5];

                                    Log.e("Nuevalic4",""+nuevo_desProdAca6);

                                    desProdAca6.setText(nuevo_desProdAca6);
                                    caja_edit_desProdAca6.setVisibility(View.GONE);
                                    caja_desProdAca6_final.setVisibility(View.VISIBLE);
                                }
                                if(!productosAca_fragmentada[6].equals(" ")){
                                    nuevo_desProdAca7=productosAca_fragmentada[6];

                                    Log.e("Nuevalic4",""+nuevo_desProdAca7);

                                    desProdAca7.setText(nuevo_desProdAca7);
                                    caja_edit_desProdAca7.setVisibility(View.GONE);
                                    caja_desProdAca7_final.setVisibility(View.VISIBLE);
                                }
                                if(!productosAca_fragmentada[7].equals(" ")){
                                    nuevo_desProdAca8=productosAca_fragmentada[7];

                                    Log.e("Nuevalic4",""+nuevo_desProdAca8);

                                    desProdAca8.setText(nuevo_desProdAca8);
                                    caja_edit_desProdAca8.setVisibility(View.GONE);
                                    caja_desProdAca8_final.setVisibility(View.VISIBLE);
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