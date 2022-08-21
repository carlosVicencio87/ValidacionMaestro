package com.ivim.validacionmaestro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Prueba extends AppCompatActivity {
    private TextView pedir_json;
    private static String servicio;
    private ExecutorService executorService;
    private RequestQueue requestQueue;
    private JSONArray json_datos_usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_prueba);

        pedir_json=findViewById(R.id.pedir_json);

        servicio = "https://demos.auditoriades.com/ServicioADA_TEST/AdaDataService.svc/ObtenerMisAuditoriasPorFecha";
        executorService= Executors.newSingleThreadExecutor();
        requestQueue= Volley.newRequestQueue(this);
        pedir_json.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        pedirArreglo();
                        arreglo();
                    }
                });
            }
        });
    }
    public void pedirArreglo(){
            JsonObjectRequest request=new JsonObjectRequest(Request.Method.GET, servicio, null, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    Log.e("respuesta1:", String.valueOf(response));

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("error1:",""+error.getMessage());

                }
            });
        requestQueue.add(request);

    }
    public void arreglo(){
        StringRequest postrequest= new StringRequest(Request.Method.GET, servicio, new Response.Listener<String>() {
            @Override
            public void onResponse(String response2) {
                Log.e("respuesta2:",response2 + "");
                try {
                   JSONArray objetoDejson=new JSONArray(response2);
                    Log.e("respuesta3", String.valueOf(objetoDejson));
                    for(int i=0;i<objetoDejson.length();i++){
                        JSONObject jsonTable = objetoDejson.getJSONObject(i);
                        Log.e("respuesta4",jsonTable+"");

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("error2",""+error.getMessage());
            }
        });
        Volley.newRequestQueue(this).add(postrequest);
    }
}