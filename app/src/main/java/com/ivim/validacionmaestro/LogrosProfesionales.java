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

public class LogrosProfesionales extends AppCompatActivity {
    private ScrollView formulario_datosBasicos,formulario_formaDocente,formulario_formaCapaDocente,
            formulario_actuaDisci,formulario_gestioAcademica,formulario_productosAcademicos,formulario_expProfeNoAcade,
            formulario_expDiseñoIng,formulario_logrosProfeNoAca,formulario_partColeCam,formulario_premDist,
            formulario_aportacionPe;

    private LinearLayout
            caja_edit_desLogAca,caja_desLogAca_final,caja_edit_desLogAca2,caja_desLogAca2_final,caja_edit_desLogAca3,
            caja_desLogAca3_final,caja_edit_desLogAca4,caja_desLogAca4_final,caja_edit_desLogAca5,caja_desLogAca5_final;

    private EditText desLogAca_texto,desLogAca2_texto,desLogAca3_texto,desLogAca4_texto,
            desLogAca5_texto;


    private ImageView guardar_desLogAca,
            cambiar_desLogAca,guardar_desLogAca2,cambiar_desLogAca2,guardar_desLogAca3,cambiar_desLogAca3,guardar_desLogAca4,
            cambiar_desLogAca4,guardar_desLogAca5,cambiar_desLogAca5;

    private TextView desLogAca,desLogAca2,
            desLogAca3,desLogAca4,desLogAca5,actuaLogrosProfe;

    private String nuevo_desLogAca,nuevo_desLogAca2,
            nuevo_desLogAca3,nuevo_desLogAca4,nuevo_desLogAca5,id_usuer,id_SesionUsuer,logrosProfe_totales,logProf_Usuer;

    private JSONArray json_datos_logrosProfe;

    private ExecutorService executorService;
    private static String SERVIDOR_CONTROLADOR;
    private SharedPreferences idSher,id_SesionSher,logProf_sher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_logros_profesionales);
        guardar_desLogAca = findViewById(R.id.guardar_desLogAca);
        desLogAca_texto = findViewById(R.id.desLogAca_texto);
        desLogAca= findViewById(R.id.desLogAca);
        caja_edit_desLogAca= findViewById(R.id.caja_edit_desLogAca);
        caja_desLogAca_final= findViewById(R.id.caja_desLogAca_final);
        cambiar_desLogAca = findViewById(R.id.cambiar_desLogAca);

        guardar_desLogAca2= findViewById(R.id.guardar_desLogAca2);
        desLogAca2_texto= findViewById(R.id.desLogAca2_texto);
        desLogAca2 = findViewById(R.id.desLogAca2);
        caja_edit_desLogAca2 = findViewById(R.id.caja_edit_desLogAca2);
        caja_desLogAca2_final= findViewById(R.id.caja_desLogAca2_final);
        cambiar_desLogAca2= findViewById(R.id.cambiar_desLogAca2);

        guardar_desLogAca3= findViewById(R.id.guardar_desLogAca3);
        desLogAca3_texto = findViewById(R.id.desLogAca3_texto);
        desLogAca3= findViewById(R.id.desLogAca3);
        caja_edit_desLogAca3= findViewById(R.id.caja_edit_desLogAca3);
        caja_desLogAca3_final = findViewById(R.id.caja_desLogAca3_final);
        cambiar_desLogAca3 = findViewById(R.id.cambiar_desLogAca3);

        guardar_desLogAca4 = findViewById(R.id.guardar_desLogAca4);
        desLogAca4_texto = findViewById(R.id.desLogAca4_texto);
        desLogAca4= findViewById(R.id.desLogAca4);
        caja_edit_desLogAca4 = findViewById(R.id.caja_edit_desLogAca4);
        caja_desLogAca4_final= findViewById(R.id.caja_desLogAca4_final);
        cambiar_desLogAca4 = findViewById(R.id.cambiar_desLogAca4);

        guardar_desLogAca5= findViewById(R.id.guardar_desLogAca5);
        desLogAca5_texto= findViewById(R.id.desLogAca5_texto);
        desLogAca5= findViewById(R.id.desLogAca5);
        caja_edit_desLogAca5 = findViewById(R.id.caja_edit_desLogAca5);
        caja_desLogAca5_final= findViewById(R.id.caja_desLogAca5_final);
        cambiar_desLogAca5= findViewById(R.id.cambiar_desLogAca5);
        actuaLogrosProfe=findViewById(R.id.actuaLogrosProfe);
        executorService= Executors.newSingleThreadExecutor();
        SERVIDOR_CONTROLADOR = new Servidor().local;
        idSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_usuer=idSher.getString("id","no");
        Log.e("ID",""+id_usuer);
        id_SesionSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_SesionUsuer=id_SesionSher.getString("id_sesion","no");
        Log.e("ID",""+id_SesionUsuer);
        logProf_sher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        logProf_Usuer=logProf_sher.getString("logros_profesionales","no");
        Log.e("logros",""+logProf_Usuer);
        pedir_logProfe();
        guardar_desLogAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca= desLogAca_texto.getText().toString();
                desLogAca.setText(nuevo_desLogAca);
                if (!nuevo_desLogAca.trim().equals("")) {
                    caja_edit_desLogAca.setVisibility(View.GONE);
                    caja_desLogAca_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca.setVisibility(View.VISIBLE);
                caja_desLogAca_final.setVisibility(View.GONE);
                desLogAca.setText(" ");


            }
        });
        guardar_desLogAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca2 = desLogAca2_texto.getText().toString();
                desLogAca2.setText(nuevo_desLogAca2);
                if (!nuevo_desLogAca2.trim().equals("")) {
                    caja_edit_desLogAca2.setVisibility(View.GONE);
                    caja_desLogAca2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca2.setVisibility(View.VISIBLE);
                caja_desLogAca2_final.setVisibility(View.GONE);
                desLogAca2.setText("");


            }
        });
        guardar_desLogAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca3 = desLogAca3_texto.getText().toString();
                desLogAca3.setText(nuevo_desLogAca3);
                if (!nuevo_desLogAca3.trim().equals("")) {
                    caja_edit_desLogAca3.setVisibility(View.GONE);
                    caja_desLogAca3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca3.setVisibility(View.VISIBLE);
                caja_desLogAca3_final.setVisibility(View.GONE);
                desLogAca3.setText("");


            }
        });
        guardar_desLogAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca4=desLogAca4_texto.getText().toString();
                desLogAca4.setText(nuevo_desLogAca4);
                if (!nuevo_desLogAca4.trim().equals("")) {
                    caja_edit_desLogAca4.setVisibility(View.GONE);
                    caja_desLogAca4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca4.setVisibility(View.VISIBLE);
                caja_desLogAca4_final.setVisibility(View.GONE);
                desLogAca4.setText("");

            }
        });
        guardar_desLogAca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca5= desLogAca5_texto.getText().toString();
                desLogAca5.setText(nuevo_desLogAca5);
                if (!nuevo_desLogAca5.trim().equals("")) {
                    caja_edit_desLogAca5.setVisibility(View.GONE);
                    caja_desLogAca5_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca5.setVisibility(View.VISIBLE);
                caja_desLogAca5_final.setVisibility(View.GONE);
                desLogAca5.setText("");


            }
        });
        actuaLogrosProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nuevo_desLogAca= desLogAca.getText().toString();
                nuevo_desLogAca2 = desLogAca2.getText().toString();
                nuevo_desLogAca3 = desLogAca3.getText().toString();
                nuevo_desLogAca4=desLogAca4.getText().toString();
                nuevo_desLogAca5= desLogAca5.getText().toString();

                if (nuevo_desLogAca.trim().equals("")){
                    nuevo_desLogAca=" ";
                }
                if (nuevo_desLogAca2.trim().equals("")){
                    nuevo_desLogAca2=" ";
                }
                if (nuevo_desLogAca3.trim().equals("")){
                    nuevo_desLogAca3=" ";
                }
                if (nuevo_desLogAca4.trim().equals("")){
                    nuevo_desLogAca4=" ";
                }
                if (nuevo_desLogAca5.trim().equals("")){
                    nuevo_desLogAca5=" ";
                }

                JSONObject jsonObject=new JSONObject();
                json_datos_logrosProfe =new JSONArray();
                try {
                    jsonObject.put("nuevo_desLogAca",nuevo_desLogAca);
                    jsonObject.put("nuevo_desLogAca2",nuevo_desLogAca2);
                    jsonObject.put("nuevo_desLogAca3",nuevo_desLogAca3);
                    jsonObject.put("nuevo_desLogAca4",nuevo_desLogAca4);
                    jsonObject.put("nuevo_desLogAca5",nuevo_desLogAca5);
                    json_datos_logrosProfe.put(jsonObject);
                    Log.e("1", String.valueOf(jsonObject));
                    Log.e("2", String.valueOf(json_datos_logrosProfe));
                    for(int i=0;i<json_datos_logrosProfe.length();i++){
                        try {JSONObject jsoSacandoPro=json_datos_logrosProfe.getJSONObject(i);
                            String strnuevo_desLogAca=jsoSacandoPro.get("nuevo_desLogAca").toString();
                            String stnuevo_desLogAca2=jsoSacandoPro.get("nuevo_desLogAca2").toString();
                            String strnuevo_desLogAca3=jsoSacandoPro.get("nuevo_desLogAca3").toString();
                            String strnuevo_desLogAca4=jsoSacandoPro.get("nuevo_desLogAca4").toString();
                            String strnuevo_desLogAca5=jsoSacandoPro.get("nuevo_desLogAca5").toString();

                            logrosProfe_totales=strnuevo_desLogAca+" /*-*/ "+stnuevo_desLogAca2+" /*-*/ "+strnuevo_desLogAca3+" /*-*/ "+strnuevo_desLogAca4
                                    +" /*-*/ "+strnuevo_desLogAca5;
                            if(!logrosProfe_totales.trim().equals("")){
                                executorService.execute(new Runnable() {
                                    @Override
                                    public void run() {
                                        guardando_logProfe();
                                        Intent intent = new Intent(LogrosProfesionales.this,Login.class);
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
    public void guardando_logProfe(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"logros_profesionales.php",
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
                map.put("logros_profesionales",logrosProfe_totales);
                map.put("id",id_usuer);
                map.put("id_sesion",id_SesionUsuer);
                return map;
            }
        };
        requestQueue.add(request);
    }
    public void pedir_logProfe(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"pedir_logros_profesionales.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("respuesta:",response);

                        JSONObject jsonObject = null;
                        try {
                            jsonObject = new JSONObject(response);
                            String str_logros_profes = jsonObject.getString("logros_profesionales");

                            if(!str_logros_profes.equals("")){
                                Log.e("respuesta_frag",""+str_logros_profes);
                                String[] logrosProfes_fragmentada=str_logros_profes.split(" /\\*-\\*/ ");
                                Log.e("respuesta_frag",""+logrosProfes_fragmentada);

                                if(!logrosProfes_fragmentada[0].equals(" ")){

                                    nuevo_desLogAca=logrosProfes_fragmentada[0];
                                    Log.e("Nuevalic",""+nuevo_desLogAca);
                                    desLogAca.setText(nuevo_desLogAca);
                                    caja_edit_desLogAca.setVisibility(View.GONE);
                                    caja_desLogAca_final.setVisibility(View.VISIBLE);

                                }
                                if(!logrosProfes_fragmentada[1].equals(" ")){

                                    nuevo_desLogAca2=logrosProfes_fragmentada[1];

                                    Log.e("Nuevalic",""+nuevo_desLogAca2);
                                    desLogAca2.setText(nuevo_desLogAca2);
                                    caja_edit_desLogAca2.setVisibility(View.GONE);
                                    caja_desLogAca2_final.setVisibility(View.VISIBLE);


                                }
                                if(!logrosProfes_fragmentada[2].equals(" ")){

                                    nuevo_desLogAca3=logrosProfes_fragmentada[2];


                                    Log.e("Nuevalic3",""+nuevo_desLogAca3);
                                    desLogAca3.setText(nuevo_desLogAca3);
                                    caja_edit_desLogAca3.setVisibility(View.GONE);
                                    caja_desLogAca3_final.setVisibility(View.VISIBLE);

                                }
                                if(!logrosProfes_fragmentada[3].equals(" ")){

                                    nuevo_desLogAca4=logrosProfes_fragmentada[3];

                                    Log.e("Nuevalic4",""+nuevo_desLogAca4);

                                    desLogAca4.setText(nuevo_desLogAca4);

                                    caja_edit_desLogAca4.setVisibility(View.GONE);
                                    caja_desLogAca4_final.setVisibility(View.VISIBLE);

                                }
                                if(!logrosProfes_fragmentada[4].equals(" ")){
                                    nuevo_desLogAca5=logrosProfes_fragmentada[4];
                                    Log.e("Nuevalic4",""+nuevo_desLogAca5);

                                    desLogAca5.setText(nuevo_desLogAca5);

                                    caja_edit_desLogAca5.setVisibility(View.GONE);
                                    caja_desLogAca5_final.setVisibility(View.VISIBLE);
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