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
    private SharedPreferences datosUsuario;
    private SharedPreferences.Editor editor;

    private String strInicio;
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
        datosUsuario = getSharedPreferences("Usuario",this.MODE_PRIVATE);
        editor=datosUsuario.edit();

        checkSesion();

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
                            for (int i=0;i<json_datos_usuario.length();i++){
                                JSONObject jsonObject = json_datos_usuario.getJSONObject(i);
                                //Log.e("nombreMovies", String.valueOf(jsonObject));
                                String strId = jsonObject.getString("id");
                                String strId_sesion= jsonObject.getString("id_sesion");

                                String strActivo = jsonObject.getString("activo");
                                String strNombre=jsonObject.getString("nombre");
                                String strApellido=jsonObject.getString("apellido");
                                String strFecha_nacimiento=jsonObject.getString("fecha_nacimiento");
                                String strAntiguedad=jsonObject.getString("antiguedad");
                                String strNombramiento_actual = jsonObject.getString("nombramiento_actual");
                                String strCorreo=jsonObject.getString("correo");
                                String strTelefono = jsonObject.getString("telefono");
                                String strContrasena=jsonObject.getString("contrasena");
                                String strEdad=jsonObject.getString("edad");
                                String strNumero_profesor=jsonObject.getString("numero_profesor");
                                String strFormacion_docente=jsonObject.getString("formacion_docente");
                                String strCapacitacion_docente=jsonObject.getString("capacitacion_docente");
                                String strActualizacion_disciplinar=jsonObject.getString("actualizacion_disciplinar");
                                String strGestion_academica=jsonObject.getString("gestion_academica");
                                String strProductos_academicos=jsonObject.getString("productos_academicos");
                                String strExperiencia_profesional=jsonObject.getString("experiencia_profesional");
                                String strExperiencia_diseno=jsonObject.getString("experiencia_diseno");
                                String strLogros_profesionales=jsonObject.getString("logros_profesionales");
                                String strParticipacion_colecam=jsonObject.getString("participacion_colecam");
                                String strPremios_distinciones=jsonObject.getString("premios_distinciones");
                                String strAportaciones_pe=jsonObject.getString("aportaciones_pe");
                                Log.e("idsesion",strId_sesion);


                                editor.putString("id",strId);
                                editor.putString("id_sesion",strId_sesion);
                                editor.putString("activo",strActivo);
                                editor.putString("nombre",strNombre);
                                editor.putString("apellido",strApellido);
                                editor.putString("fecha_nacimiento",strFecha_nacimiento);
                                editor.putString("antiguedad",strAntiguedad);
                                editor.putString("nombramiento_actual",strNombramiento_actual);
                                editor.putString("correo",strCorreo);
                                editor.putString("telefono",strTelefono);
                                editor.putString("contrasena",strContrasena);
                                editor.putString("edad",strEdad);
                                editor.putString("numero_profesor",strNumero_profesor);
                                editor.putString("formacion_docente",strFormacion_docente);
                                editor.putString("capacitacion_docente",strCapacitacion_docente);
                                editor.putString("actualizacion_disciplinar",strActualizacion_disciplinar);
                                editor.putString("gestion_academica",strGestion_academica);
                                editor.putString("productos_academicos",strProductos_academicos);
                                editor.putString("experiencia_profesional",strExperiencia_profesional);
                                editor.putString("experiencia_diseno",strExperiencia_diseno);
                                editor.putString("logros_profesionales",strLogros_profesionales);
                                editor.putString("participacion_colecam",strParticipacion_colecam);
                                editor.putString("premios_distinciones",strPremios_distinciones);
                                editor.putString("aportaciones_pe",strAportaciones_pe);
                                editor.apply();
                                Log.e("1",""+strId);
                                Log.e("id_sesion",strId_sesion);
                                Log.e("3",strActivo);
                                Log.e("4",strNombre);
                                Log.e("4",strApellido);
                                Log.e("5",strFecha_nacimiento);
                                Log.e("6",strAntiguedad);
                                Log.e("7",""+strNombramiento_actual);
                                Log.e("8",strCorreo);
                                Log.e("9",strTelefono);
                                Log.e("10",strContrasena);
                                Log.e("11",strEdad);
                                Log.e("12",strNumero_profesor);
                                Log.e("13",strFormacion_docente);
                                Log.e("14",""+strCapacitacion_docente);
                                Log.e("15",strActualizacion_disciplinar);
                                Log.e("16",strGestion_academica);
                                Log.e("17",strProductos_academicos);
                                Log.e("18",strExperiencia_profesional);
                                Log.e("19",strExperiencia_diseno);
                                Log.e("20",strLogros_profesionales);
                                Log.e("21",strParticipacion_colecam);
                                Log.e("22",""+strPremios_distinciones);
                                Log.e("23",strAportaciones_pe);


                                Intent intent = new Intent(Login.this, Partes_formulario.class);
                                startActivity(intent);






                            }
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
    private void checkSesion() {
        strInicio = datosUsuario.getString("id_sesion", "no");

        Log.e("inicio",""+strInicio);
        if (!strInicio.equals("no"))
        {

            Log.e("idsesion_main",strInicio);
            Intent agenda= new Intent(Login.this, Partes_formulario.class);
            startActivity(agenda);
        }
    }
}