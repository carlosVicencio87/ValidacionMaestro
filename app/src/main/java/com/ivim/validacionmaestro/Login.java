package com.ivim.validacionmaestro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
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

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends AppCompatActivity {
    private TextView registrar,mensajeCorreo,ingresar,mensajeEntrando;
    private EditText contrasena,correo;
    private static String SERVIDOR_CONTROLADOR;
    private ExecutorService executorService;
    private String correo_str,contra_str;
    private boolean correoExitoso;
    private  JSONArray json_datos_usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);

        registrar=findViewById(R.id.registrar);
        contrasena=findViewById(R.id.contrasena);
        correo=findViewById(R.id.correo);
        mensajeCorreo=findViewById(R.id.mensajeCorreo);
        mensajeEntrando=findViewById(R.id.mensajeEntrando);
        ingresar=findViewById(R.id.ingresar);
        SERVIDOR_CONTROLADOR = new Servidor().local;
        executorService= Executors.newSingleThreadExecutor();

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irRegistrar=new Intent(Login.this,Registro.class);
                startActivity(irRegistrar);

            }
        });
        correo.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean tieneFoco) {

                if(!tieneFoco)
                {
                    correo_str=correo.getText().toString().trim().toLowerCase();
                    if (!correo_str.equals("")&&correo_str!=null)
                    {
                        // String regex = "^(.+)@(.+)$";

                        String regexUsuario = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
                        Pattern pattern = Pattern.compile(regexUsuario);
                        Matcher matcher = pattern.matcher(correo_str);
                        if(matcher.matches()==true){

                            correoExitoso=true;
                            mensajeCorreo.setVisibility(View.GONE);
                        }
                        else {
                            mensajeCorreo.setText("Ingrese  correo valido");
                            mensajeCorreo.setVisibility(View.VISIBLE);
                        }
                    }
                    else {
                        mensajeCorreo.setText("Ingrese  correo valido");
                        mensajeCorreo.setVisibility(View.VISIBLE);
                    }
                }
                else{

                }
            }
        });

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correo_str=correo.getText().toString();
                contra_str=contrasena.getText().toString();
                Log.e("datocorreo",correo_str );
                Log.e("datocontra",contra_str );
                if(!correo_str.trim().equals("")){
                    if(!contra_str.trim().equals("")){
                        if(correoExitoso==true){


                            ingresar.setVisibility(View.GONE);
                            registrar.setVisibility(View.GONE);
                            mensajeEntrando.setText("Iniciando sesión ...");
                            mensajeEntrando.setVisibility(View.VISIBLE);
                            executorService.execute(new Runnable() {
                                @Override
                                public void run() {
                                   iniciandoSesion();
                                }
                            });


                        }
                        else{
                            correoExitoso = false;
                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "La contrasena es necesario.", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "El correo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public  void iniciandoSesion(){
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"inicio_sesion.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("respuesta:",response);
                        if (response.equals("no_existe")) {
                            registrar.setVisibility(View.VISIBLE);
                            ingresar.setVisibility(View.VISIBLE);
                            mensajeEntrando.setText("El teléfono o correo es incorrecto.");
                        }
                        else
                        {
                            try {

                                json_datos_usuario=new JSONArray(response);
                                Log.e("lala",""+json_datos_usuario);

                                Intent intent = new Intent(Login.this, Partes_formulario.class);
                                startActivity(intent);
                            }
                            catch (JSONException e) {
                                Log.e("errorRespuesta", String.valueOf(e));
                            }
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
                map.put("correo",correo_str);
                map.put("contrasena",contra_str);
                return map;
            }
        };
        requestQueue.add(request);
    }
}