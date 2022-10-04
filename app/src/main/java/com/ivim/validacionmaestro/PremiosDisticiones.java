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

public class PremiosDisticiones extends AppCompatActivity {
    private ScrollView formulario_premDist;

    private LinearLayout caja_edit_desPreRec,caja_desPreRec_final,caja_edit_desPreRec2,caja_desPreRec2_final,caja_edit_desPreRec3,
            caja_desPreRec3_final,caja_edit_desPreRec4,caja_desPreRec4_final,caja_edit_desPreRec5,caja_desPreRec5_final;

    private EditText desPreRec_texto,desPreRec2_texto,desPreRec3_texto,desPreRec4_texto,desPreRec5_texto;


    private ImageView guardar_desPreRec,cambiar_desPreRec,
            guardar_desPreRec2,cambiar_desPreRec2,guardar_desPreRec3,cambiar_desPreRec3,guardar_desPreRec4,
            cambiar_desPreRec4,guardar_desPreRec5,cambiar_desPreRec5;

    private TextView desPreRec,desPreRec2,desPreRec3,desPreRec4,desPreRec5,actuaPremiosDist;

    private String nuevo_desPreReca,nuevo_desPreRec2,nuevo_desPreRec3,
            nuevo_desPreRec4,nuevo_desPreRec5,premios_totales,id_usuer,id_SesionUsuer,premDis_Usuer;
    private JSONArray json_datos_premiosDist;

    private ExecutorService executorService;
    private static String SERVIDOR_CONTROLADOR;
    private SharedPreferences idSher,id_SesionSher,premDis_Sher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_premios_disticiones);
        guardar_desPreRec= findViewById(R.id.guardar_desPreRec);
        desPreRec_texto= findViewById(R.id.desPreRec_texto);
        desPreRec= findViewById(R.id.desPreRec);
        caja_edit_desPreRec= findViewById(R.id.caja_edit_desPreRec);
        caja_desPreRec_final = findViewById(R.id.caja_desPreRec_final);
        cambiar_desPreRec= findViewById(R.id.cambiar_desPreRec);

        guardar_desPreRec2= findViewById(R.id.guardar_desPreRec2);
        desPreRec2_texto= findViewById(R.id.desPreRec2_texto);
        desPreRec2 = findViewById(R.id.desPreRec2);
        caja_edit_desPreRec2= findViewById(R.id.caja_edit_desPreRec2);
        caja_desPreRec2_final = findViewById(R.id.caja_desPreRec2_final);
        cambiar_desPreRec2 = findViewById(R.id.cambiar_desPreRec2);

        guardar_desPreRec3= findViewById(R.id.guardar_desPreRec3);
        desPreRec3_texto= findViewById(R.id.desPreRec3_texto);
        desPreRec3= findViewById(R.id.desPreRec3);
        caja_edit_desPreRec3= findViewById(R.id.caja_edit_desPreRec3);
        caja_desPreRec3_final = findViewById(R.id.caja_desPreRec3_final);
        cambiar_desPreRec3= findViewById(R.id.cambiar_desPreRec3);

        guardar_desPreRec4= findViewById(R.id.guardar_desPreRec4);
        desPreRec4_texto = findViewById(R.id.desPreRec4_texto);
        desPreRec4= findViewById(R.id.desPreRec4);
        caja_edit_desPreRec4= findViewById(R.id.caja_edit_desPreRec4);
        caja_desPreRec4_final= findViewById(R.id.caja_desPreRec4_final);
        cambiar_desPreRec4= findViewById(R.id.cambiar_desPreRec4);

        guardar_desPreRec5= findViewById(R.id.guardar_desPreRec5);
        desPreRec5_texto= findViewById(R.id.desPreRec5_texto);
        desPreRec5= findViewById(R.id.desPreRec5);
        caja_edit_desPreRec5= findViewById(R.id.caja_edit_desPreRec5);
        caja_desPreRec5_final= findViewById(R.id.caja_desPreRec5_final);
        cambiar_desPreRec5= findViewById(R.id.cambiar_desPreRec5);
        actuaPremiosDist=findViewById(R.id.actuaPremiosDist);
        executorService= Executors.newSingleThreadExecutor();
        SERVIDOR_CONTROLADOR = new Servidor().local;
        idSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_usuer=idSher.getString("id","no");
        Log.e("ID",""+id_usuer);
        id_SesionSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_SesionUsuer=id_SesionSher.getString("id_sesion","no");
        Log.e("ID",""+id_SesionUsuer);
        premDis_Sher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        premDis_Usuer=premDis_Sher.getString("premios_distinciones","no");
        Log.e("premios",""+premDis_Usuer);
        pedir_premDist();
        guardar_desPreRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desPreReca= desPreRec_texto.getText().toString();
                desPreRec.setText(nuevo_desPreReca);
                if (!nuevo_desPreReca.trim().equals("")) {
                    caja_edit_desPreRec.setVisibility(View.GONE);
                    caja_desPreRec_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desPreRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desPreRec.setVisibility(View.VISIBLE);
                caja_desPreRec_final.setVisibility(View.GONE);
                desPreRec.setText("");


            }
        });
        guardar_desPreRec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desPreRec2 = desPreRec2_texto.getText().toString();
                desPreRec2.setText(nuevo_desPreRec2);
                if (!nuevo_desPreRec2.trim().equals("")) {
                    caja_edit_desPreRec2.setVisibility(View.GONE);
                    caja_desPreRec2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desPreRec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desPreRec2.setVisibility(View.VISIBLE);
                caja_desPreRec2_final.setVisibility(View.GONE);
                desPreRec2.setText("");

            }
        });
        guardar_desPreRec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desPreRec3=desPreRec3_texto.getText().toString();
                desPreRec3.setText(nuevo_desPreRec3);
                if (!nuevo_desPreRec3.trim().equals("")) {
                    caja_edit_desPreRec3.setVisibility(View.GONE);
                    caja_desPreRec3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desPreRec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desPreRec3.setVisibility(View.VISIBLE);
                caja_desPreRec3_final.setVisibility(View.GONE);
                desPreRec3.setText("");


            }
        });

        guardar_desPreRec4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desPreRec4 = desPreRec4_texto.getText().toString();
                desPreRec4.setText(nuevo_desPreRec4);
                if (!nuevo_desPreRec4.trim().equals("")) {
                    caja_edit_desPreRec4.setVisibility(View.GONE);
                    caja_desPreRec4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desPreRec4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desPreRec4.setVisibility(View.VISIBLE);
                caja_desPreRec4_final.setVisibility(View.GONE);
                desPreRec4.setText("");


            }
        });
        guardar_desPreRec5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desPreRec5= desPreRec5_texto.getText().toString();
                desPreRec5.setText(nuevo_desPreRec5);
                if (!nuevo_desPreRec5.trim().equals("")) {
                    caja_edit_desPreRec5.setVisibility(View.GONE);
                    caja_desPreRec5_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desPreRec5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desPreRec5.setVisibility(View.VISIBLE);
                caja_desPreRec5_final.setVisibility(View.GONE);
                desPreRec5.setText("");


            }
        });
        actuaPremiosDist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                nuevo_desPreReca= desPreRec.getText().toString();
                nuevo_desPreRec2 = desPreRec2.getText().toString();
                nuevo_desPreRec3=desPreRec3.getText().toString();
                nuevo_desPreRec4 = desPreRec4.getText().toString();
                nuevo_desPreRec5= desPreRec5.getText().toString();

                if (nuevo_desPreReca.trim().equals("")){
                    nuevo_desPreReca=" ";
                }
                if (nuevo_desPreRec2.trim().equals("")){
                    nuevo_desPreRec2=" ";
                }
                if (nuevo_desPreRec3.trim().equals("")){
                    nuevo_desPreRec3=" ";
                }
                if (nuevo_desPreRec4.trim().equals("")){
                    nuevo_desPreRec4=" ";
                }
                if (nuevo_desPreRec5.trim().equals("")){
                    nuevo_desPreRec5=" ";
                }

                JSONObject jsonObject=new JSONObject();
                json_datos_premiosDist =new JSONArray();
                try {
                    jsonObject.put("nuevo_desPreReca",nuevo_desPreReca);
                    jsonObject.put("nuevo_desPreRec2",nuevo_desPreRec2);
                    jsonObject.put("nuevo_desPreRec3",nuevo_desPreRec3);
                    jsonObject.put("nuevo_desPreRec4",nuevo_desPreRec4);
                    jsonObject.put("nuevo_desPreRec5",nuevo_desPreRec5);
                    json_datos_premiosDist.put(jsonObject);
                    Log.e("1", String.valueOf(jsonObject));
                    Log.e("2", String.valueOf(json_datos_premiosDist));
                    for(int i = 0; i< json_datos_premiosDist.length(); i++){
                        try {JSONObject jsoSacandoPro= json_datos_premiosDist.getJSONObject(i);
                            String strnuevo_desPreReca=jsoSacandoPro.get("nuevo_desPreReca").toString();
                            String strnuevo_desPreRec2=jsoSacandoPro.get("nuevo_desPreRec2").toString();
                            String strnuevo_desPreRec3=jsoSacandoPro.get("nuevo_desPreRec3").toString();
                            String strnuevo_desPreRec4=jsoSacandoPro.get("nuevo_desPreRec4").toString();
                            String strnuevo_desPreRec5=jsoSacandoPro.get("nuevo_desPreRec5").toString();

                            premios_totales=strnuevo_desPreReca+" /*-*/ "+strnuevo_desPreRec2+" /*-*/ "+strnuevo_desPreRec3+" /*-*/ "+strnuevo_desPreRec4
                                    +" /*-*/ "+strnuevo_desPreRec5;
                            if(!premios_totales.trim().equals("")){
                                executorService.execute(new Runnable() {
                                    @Override
                                    public void run() {
                                        guardando_premiosDist();
                                        Intent intent = new Intent(PremiosDisticiones.this,Login.class);
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
    public void guardando_premiosDist(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"premios_distinciones.php",
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
                map.put("premios_distinciones",premios_totales);
                map.put("id",id_usuer);
                map.put("id_sesion",id_SesionUsuer);
                return map;
            }
        };
        requestQueue.add(request);
    }
    public void pedir_premDist(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"pedir_premios_distinciones.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("respuesta:",response);

                        JSONObject jsonObject = null;
                        try {
                            jsonObject = new JSONObject(response);
                            String str_premios_dist = jsonObject.getString("premios_distinciones");

                            if(!str_premios_dist.equals("")){
                                Log.e("respuesta_frag",""+str_premios_dist);
                                String[] preDis_fragmentada=str_premios_dist.split(" /\\*-\\*/ ");
                                Log.e("respuesta_frag",""+preDis_fragmentada);
                                if(!preDis_fragmentada[0].equals(" ")){

                                    nuevo_desPreReca=preDis_fragmentada[0];
                                    Log.e("Nuevalic",""+nuevo_desPreReca);
                                    desPreRec.setText(nuevo_desPreReca);
                                    caja_edit_desPreRec.setVisibility(View.GONE);
                                    caja_desPreRec_final.setVisibility(View.VISIBLE);

                                }
                                if(!preDis_fragmentada[1].equals(" ")){

                                    nuevo_desPreRec2=preDis_fragmentada[1];

                                    Log.e("Nuevalic",""+nuevo_desPreRec2);
                                    desPreRec2.setText(nuevo_desPreRec2);
                                    caja_edit_desPreRec2.setVisibility(View.GONE);
                                    caja_desPreRec2_final.setVisibility(View.VISIBLE);


                                }
                                if(!preDis_fragmentada[2].equals(" ")){

                                    nuevo_desPreRec3=preDis_fragmentada[2];


                                    Log.e("Nuevalic3",""+nuevo_desPreRec3);
                                    desPreRec3.setText(nuevo_desPreRec3);
                                    caja_edit_desPreRec3.setVisibility(View.GONE);
                                    caja_desPreRec3_final.setVisibility(View.VISIBLE);

                                }
                                if(!preDis_fragmentada[3].equals(" ")){

                                    nuevo_desPreRec4=preDis_fragmentada[3];

                                    Log.e("Nuevalic4",""+nuevo_desPreRec4);

                                    desPreRec4.setText(nuevo_desPreRec4);
                                    caja_edit_desPreRec4.setVisibility(View.GONE);
                                    caja_desPreRec4_final.setVisibility(View.VISIBLE);

                                }
                                if(!preDis_fragmentada[4].equals(" ")){
                                    nuevo_desPreRec5=preDis_fragmentada[4];
                                    Log.e("Nuevalic4",""+nuevo_desPreRec5);

                                    desPreRec5.setText(nuevo_desPreRec5);
                                    caja_edit_desPreRec5.setVisibility(View.GONE);
                                    caja_desPreRec5_final.setVisibility(View.VISIBLE);
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