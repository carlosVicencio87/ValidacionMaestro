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
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AportacionesPe extends AppCompatActivity {
    private ScrollView formulario_aportacionPe;

    private LinearLayout caja_edit_aportacionPE,caja_aportacionPE_final;

    private EditText aportacionPE_texto;


    private ImageView guardar_aportacionPE,cambiar_aportacionPE;

    private TextView aportacionPE,actuAport;

    private String nuevo_aportacionPE,id_usuer,id_SesionUsuer,aporPe_Usuer;
    private JSONArray json_datos_aporPE;

    private ExecutorService executorService;
    private static String SERVIDOR_CONTROLADOR;
    private SharedPreferences idSher,id_SesionSher,aporPe_Sher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_aportaciones_pe);

        guardar_aportacionPE= findViewById(R.id.guardar_aportacionPE);
        aportacionPE_texto= findViewById(R.id.aportacionPE_texto);
        aportacionPE= findViewById(R.id.aportacionPE);
        caja_edit_aportacionPE= findViewById(R.id.caja_edit_aportacionPE);
        caja_aportacionPE_final= findViewById(R.id.caja_aportacionPE_final);
        cambiar_aportacionPE= findViewById(R.id.cambiar_aportacionPE);
        actuAport=findViewById(R.id.actuAport);
        executorService= Executors.newSingleThreadExecutor();
        SERVIDOR_CONTROLADOR = new Servidor().local;
        idSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_usuer=idSher.getString("id","no");
        Log.e("ID",""+id_usuer);
        id_SesionSher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        id_SesionUsuer=id_SesionSher.getString("id_sesion","no");
        Log.e("ID",""+id_SesionUsuer);
        aporPe_Sher=getSharedPreferences("Usuario",this.MODE_PRIVATE);
        aporPe_Usuer=aporPe_Sher.getString("aportaciones_pe","no");
        Log.e("apor",""+aporPe_Usuer);
        pedir_aporPe();
        guardar_aportacionPE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_aportacionPE= aportacionPE_texto.getText().toString();
                aportacionPE.setText(nuevo_aportacionPE);
                if (!nuevo_aportacionPE.trim().equals("")) {
                    guardar_aportacionPE.setVisibility(View.GONE);
                    caja_edit_aportacionPE.setVisibility(View.GONE);
                    caja_aportacionPE_final.setVisibility(View.VISIBLE);
                    cambiar_aportacionPE.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "Indique una aportacion al PE.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_aportacionPE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                guardar_aportacionPE.setVisibility(View.VISIBLE);
                caja_edit_aportacionPE.setVisibility(View.VISIBLE);
                caja_aportacionPE_final.setVisibility(View.GONE);
                cambiar_aportacionPE.setVisibility(View.GONE);


            }
        });
        actuAport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_aportacionPE= aportacionPE_texto.getText().toString();

                if (nuevo_aportacionPE.trim().equals("")){
                    nuevo_aportacionPE.equals(" ");
                }

                guardando_aporPe();


            }
        });
    }
    public void guardando_aporPe(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"aportaciones_pe.php",
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
                map.put("aportaciones_pe",nuevo_aportacionPE);
                map.put("id",id_usuer);
                map.put("id_sesion",id_SesionUsuer);
                return map;
            }
        };
        requestQueue.add(request);
    }
    public void pedir_aporPe(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"pedir_aportaciones_pe.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("respuesta:",response);

                        JSONObject jsonObject = null;
                        try {
                            jsonObject = new JSONObject(response);
                            String str_formacion_docente = jsonObject.getString("aportaciones_pe");

                            if(!str_formacion_docente.equals("")){
                                Log.e("respuesta_frag",""+str_formacion_docente);
                                String[] formacion_fragmentada=str_formacion_docente.split(" /\\*-\\*/ ");
                                Log.e("respuesta_frag",""+formacion_fragmentada);









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