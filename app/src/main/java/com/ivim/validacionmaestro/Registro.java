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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registro extends AppCompatActivity {
    private EditText nombres,apellidos,fecha_de_nacimiento,antiguedad,nombramiento_actual,contrasenaPin,confPin,correo
            ,telefono,confirmarTelefono,numero_profesor;
    private String nombreStr,nombreTemp,apellidoStr,apellidosTemp,fecha_str,fecha_actual,correo_str,telefono_str,
            telefonotemp,confirmarTelefono_str,confirmarTelefonoTemp,contrasenaPin_str,contrasenaPinTemp,
            confPin_str,confPinTemp,antiguedad_str,nombramiento_actual_str,edad_real_str,numero_profesor_str;
    private TextView mensajeNombre,mensajeApellidos,mensajeFechaNacimiento,anos_profesor,mensajeCorreo,mensajetelefono,
            mensajeteligual,mensajePin,mensajeConfPin,registrar;
    private boolean nombreExitoso, apellidoExitoso,fecha_existoso,correoExitoso,telefonoExitoso,tel10,
            confirmartelExitoso,contrasenaPinExitoso,pin6,confPinExitoso;
    private int elementoNumeroMes_actual,elementoNumerAno_actual,elementoNumeroMes_nacimiento,
            elementoNumerAno_nacimiento,edad_acutal,edad_real,elemntoDia_nacimiento,elementoNumeroDia_actual;
    private static String SERVIDOR_CONTROLADOR;
    private ExecutorService executorService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_registro);

        apellidos=findViewById(R.id.apellidos);
        nombres=findViewById(R.id.nombres);
        mensajeNombre=findViewById(R.id.mensajeNombre);
        mensajeApellidos=findViewById(R.id.mensajeApellidos);
        fecha_de_nacimiento=findViewById(R.id.fecha_de_nacimiento);
        mensajeFechaNacimiento=findViewById(R.id.mensajeFechaNacimiento);
        anos_profesor=findViewById(R.id.anos_profesor);
        correo=findViewById(R.id.correo);
        telefono=findViewById(R.id.telefono);
        mensajeCorreo=findViewById(R.id.mensajeCorreo);
        mensajetelefono=findViewById(R.id.mensajetelefono);
        confirmarTelefono=findViewById(R.id.confirmarTelefono);
        mensajeteligual=findViewById(R.id.mensajeteligual);
        contrasenaPin=findViewById(R.id.contrasenaPin);
        mensajePin=findViewById(R.id.mensajePin);
        confPin=findViewById(R.id.confPin);
        mensajeConfPin=findViewById(R.id.mensajeConfPin);
        registrar=findViewById(R.id.registrar);
        antiguedad=findViewById(R.id.antiguedad);
        nombramiento_actual=findViewById(R.id.nombramiento_actual);
        numero_profesor=findViewById(R.id.numero_profesor);
        SERVIDOR_CONTROLADOR = new Servidor().local;
        executorService= Executors.newSingleThreadExecutor();

        nombres.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean tieneFoco) {
                if(!tieneFoco)
                {
                    //Toast.makeText(getApplicationContext(), "NOMBRE PERDIO FOCO", Toast.LENGTH_LONG).show();
                    nombreStr=nombres.getText().toString().trim().toLowerCase();
                    Log.e("apellidos",nombreStr);

                    if (!nombreStr.equals("")&&nombreStr!=null)
                    {
                        String regexusuario = "[a-z]+";
                        nombreTemp=nombreStr;
                        String verificarreg= nombreTemp.trim().replaceAll(regexusuario,"");
                        if (verificarreg.equals(""))
                        {
                            nombreExitoso=true;
                            Log.e("nombre exitoso", String.valueOf(nombreExitoso));

                            mensajeNombre.setVisibility(view.GONE);
                        }

                        else
                        {

                            mensajeNombre.setText("los nombres solo pueden tener   letras");
                            mensajeNombre.setVisibility(view.VISIBLE);
                        }
                    }
                }
                else{
                   // Toast.makeText(getApplicationContext(),"No hay nada",Toast.LENGTH_LONG).show();
                    }
            }
        });
        apellidos.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean tieneFoco) {

                if(!tieneFoco)
                {
                    //Toast.makeText(getApplicationContext(), "NOMBRE PERDIO FOCO", Toast.LENGTH_LONG).show();
                    apellidoStr=apellidos.getText().toString().trim().toLowerCase();
                    Log.e("apellidos",apellidoStr);

                    if (!apellidoStr.equals("")&&apellidoStr!=null)
                    {
                        String regexusuario = "[a-z]+";
                        apellidosTemp=apellidoStr;
                        String verificarreg= apellidosTemp.trim().replaceAll(regexusuario,"");
                        if (verificarreg.equals(""))
                        {
                            apellidoExitoso=true;
                            Log.e("nombre exitoso", String.valueOf(apellidoExitoso));

                            mensajeApellidos.setVisibility(view.GONE);
                        }

                        else
                        {

                            mensajeApellidos.setText("los apellidos solo pueden tener   letras");
                            mensajeApellidos.setVisibility(view.VISIBLE);
                        }
                    }
                }
                else{
                    // Toast.makeText(getApplicationContext(),"No hay nada",Toast.LENGTH_LONG).show();
                }
            }
        });

        fecha_de_nacimiento.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hayActividad) {

                if(!hayActividad){

                    fecha_str = fecha_de_nacimiento.getText().toString().trim();
                    if (!fecha_str.trim().equals("")&&fecha_str!=null) {

                        String regexFecha ="[0-9]{2}-[0-9]{2}-[0-9]{4}";
                        Pattern pattern = Pattern.compile(regexFecha);
                        Matcher matcher = pattern.matcher(fecha_str);
                        if(matcher.matches()==true){

                            fecha_existoso=true;
                            mensajeFechaNacimiento.setVisibility(View.GONE);
                             String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
                            Log.e("fecha",date);
                            fecha_actual=date;
                            String[] fecha_actual_fragmentada=fecha_actual.split("-");
                            String elementoDia=fecha_actual_fragmentada[0];
                            String elementoMes=fecha_actual_fragmentada[1];
                            String elementoAno=fecha_actual_fragmentada[2];
                            elementoNumeroDia_actual= Integer.parseInt(elementoDia);
                            elementoNumeroMes_actual= Integer.parseInt(elementoMes);
                            elementoNumerAno_actual= Integer.parseInt(elementoAno);
                            Log.e("fecha_actual", "" + fecha_actual_fragmentada.toString());

                            String[] fecha_nacimiento_fragmentada=fecha_str.split("-");
                            String elementoDiaNacimiento=fecha_nacimiento_fragmentada[0];
                            String elementoMesNacimiento=fecha_nacimiento_fragmentada[1];
                            String elementoAnoNacimiento=fecha_nacimiento_fragmentada[2];
                            elemntoDia_nacimiento= Integer.parseInt(elementoDiaNacimiento);
                            elementoNumeroMes_nacimiento= Integer.parseInt(elementoMesNacimiento);
                            elementoNumerAno_nacimiento= Integer.parseInt(elementoAnoNacimiento);
                            Log.e("mes_nacimiento_numero",""+elementoNumeroMes_nacimiento);
                            Log.e("mes_actual_numero",""+elementoNumeroMes_actual);
                            Log.e("mes_nacimiento_numero",""+elementoNumerAno_nacimiento);
                            Log.e("mes_actual_numero",""+elementoNumerAno_actual);
                            edad_acutal=elementoNumerAno_actual-elementoNumerAno_nacimiento;

                            if(elementoNumeroMes_nacimiento>=elementoNumeroMes_actual){
                               edad_real=edad_acutal-1;
                                anos_profesor.setText(String.valueOf(edad_real)+" "+"años");
                            }
                            else{
                                edad_real=edad_acutal;
                                anos_profesor.setText(String.valueOf(edad_real)+" "+"años");

                            }
                            Log.e("fecha_nacimiento", "" + edad_acutal);


                        }
                        else {
                            mensajeFechaNacimiento.setText("El formato de fecha es necesario 99-99-9999 es necesario");
                            mensajeFechaNacimiento.setVisibility(View.VISIBLE);
                        }

                    }
                    else {
                        mensajeFechaNacimiento.setText("Formato de fecha  dd-mm-yyyy es necesario");
                        mensajeFechaNacimiento.setVisibility(View.VISIBLE);
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Inserte fecha",Toast.LENGTH_LONG).show();

                }
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
                else{}
            }
        });
        telefono.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean tieneFoco) {

                if(!tieneFoco)
                {
                    //Toast.makeText(getApplicationContext(), "NOMBRE PERDIO FOCO", Toast.LENGTH_LONG).show();
                    telefono_str=telefono.getText().toString().trim().toLowerCase();
                    if (!telefono_str.equals("")&&telefono_str!=null)
                    {
                        String regexUsuario = "[0-9]+";
                        telefonotemp=telefono_str;
                        String verificarReg= telefonotemp.trim().replaceAll(regexUsuario,"");
                        if (verificarReg.equals(""))
                        {
                            telefonoExitoso=true;
                            mensajetelefono.setVisibility(View.GONE);
                            int cuenta = telefono.getText().toString().trim().length();
                            if (cuenta == 10) {
                                tel10 = true;
                            }
                            else {
                                tel10 = false;
                                mensajetelefono.setText("El telefono debe tener 10 numeros");
                                mensajetelefono.setVisibility(View.VISIBLE);
                            }
                        }

                        else
                        {

                            mensajetelefono.setText("El telefono solo pueden tener numeros");
                            mensajetelefono.setVisibility(View.VISIBLE);
                        }
                    }
                }
                else{
                    //Toast.makeText(getApplicationContext(), "NOMBRE obtuvo FOCO", Toast.LENGTH_LONG).show();
                }
            }
        });
        confirmarTelefono.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean tieneFoco) {

                if(!tieneFoco)
                {
                    //Toast.makeText(getApplicationContext(), "NOMBRE PERDIO FOCO", Toast.LENGTH_LONG).show();
                    confirmarTelefono_str=confirmarTelefono.getText().toString().trim();
                    if (!confirmarTelefono_str.equals("")&&confirmarTelefono_str!=null)
                    {
                        String regexUsuario = "[0-9]+";
                        confirmarTelefonoTemp=confirmarTelefono_str;
                        String verificarReg= confirmarTelefonoTemp.trim().replaceAll(regexUsuario,"");
                        if (verificarReg.equals(""))
                        {
                            confirmartelExitoso=true;

//                            valtel = telefono.getText().toString().trim();
//                            valConfirmar = confirmarTelefono.getText().toString().trim();

                            Log.e("valores",telefono_str+"   "+confirmarTelefono_str);
                            if(telefono_str.equals(confirmarTelefono_str)){
                                mensajeteligual.setVisibility(View.GONE);
                                Log.e("paso","paso");
                                /*executorService.execute(new Runnable() {
                                    @Override
                                    public void run() {
                                       buscar_tel();
                                    }
                                });*/


                            }
                            else{mensajeteligual.setText("Los telefonos no coinciden");
                                mensajeteligual.setVisibility(View.VISIBLE); }
                        }

                        else
                        {mensajeteligual.setText("El telefono solo pueden tener numeros");
                         mensajeteligual.setVisibility(View.VISIBLE); }
                    }
                }
                else{
                    //Toast.makeText(getApplicationContext(), "NOMBRE obtuvo FOCO", Toast.LENGTH_LONG).show();
                }
            }
        });
        contrasenaPin.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean tieneFoco) {

                if(!tieneFoco)
                {
                    //Toast.makeText(getApplicationContext(), "NOMBRE PERDIO FOCO", Toast.LENGTH_LONG).show();
                    contrasenaPin_str=contrasenaPin.getText().toString().trim().toLowerCase();
                    if (!contrasenaPin_str.equals("")&&contrasenaPin_str!=null)
                    {
                        String regexUsuario = "[0-9]+";
                        contrasenaPinTemp=contrasenaPin_str;
                        String verificarReg= contrasenaPinTemp.trim().replaceAll(regexUsuario,"");
                        if (verificarReg.equals(""))
                        {
                            contrasenaPinExitoso=true;
                            mensajePin.setVisibility(View.GONE);
                            int cpin = contrasenaPin.getText().toString().trim().length();
                            if (cpin == 6) {

                                pin6 = true;
                            } else {

                                pin6 = false;
                                mensajePin.setText("El pin debe tener 6 digitos");
                                mensajePin.setVisibility(View.VISIBLE);
                            }
                        }

                        else
                        {

                            mensajePin.setText("El pin solo pueden tener numeros");
                            mensajePin.setVisibility(View.VISIBLE);
                        }
                    }
                }
                else{
                    //Toast.makeText(getApplicationContext(), "NOMBRE obtuvo FOCO", Toast.LENGTH_LONG).show();
                }
            }
        });
        confPin.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean tieneFoco) {

                if(!tieneFoco)
                {
                    //Toast.makeText(getApplicationContext(), "NOMBRE PERDIO FOCO", Toast.LENGTH_LONG).show();
                    confPin_str=confPin.getText().toString().trim().toLowerCase();
                    if (!confPin_str.equals("")&&confPin_str!=null)
                    {
                        String regexUsuario = "[0-9]+";
                        confPinTemp=confPin_str;
                        String verificarReg= confPinTemp.trim().replaceAll(regexUsuario,"");
                        if (verificarReg.equals(""))
                        {
                            confPinExitoso=true;


                            if(contrasenaPin_str.equals(confPin_str)){
                                mensajeConfPin.setVisibility(View.GONE);
                                Log.e("paso","paso");
                            }
                            else{
                                mensajeConfPin.setText("Los PIN no coinciden");
                                mensajeConfPin.setVisibility(View.VISIBLE);
                            }
                        }

                        else
                        {

                            mensajeConfPin.setText("El PIN solo pueden tener numeros");
                            mensajeConfPin.setVisibility(View.VISIBLE);
                        }
                    }
                }
                else{
                    //Toast.makeText(getApplicationContext(), "NOMBRE obtuvo FOCO", Toast.LENGTH_LONG).show();
                }
            }
       });
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombreStr=nombres.getText().toString().trim().toLowerCase();
                apellidoStr=apellidos.getText().toString().trim().toLowerCase();
                fecha_str = fecha_de_nacimiento.getText().toString().trim();
                antiguedad_str=antiguedad.getText().toString().trim().toLowerCase();
                nombramiento_actual_str=nombramiento_actual.getText().toString().trim().toLowerCase();
                correo_str=correo.getText().toString().trim().toLowerCase();
                telefono_str=telefono.getText().toString().trim().toLowerCase();
                confirmarTelefono_str=confirmarTelefono.getText().toString().trim();
                confPin_str=confPin.getText().toString().trim().toLowerCase();
                contrasenaPin_str=contrasenaPin.getText().toString().trim().toLowerCase();
                edad_real_str=anos_profesor.getText().toString().trim();
                numero_profesor_str=numero_profesor.getText().toString().trim();
                if(!nombreStr.equals("")){
                    if(nombreExitoso=true){
                        if(!apellidoStr.equals("")){
                            if(apellidoExitoso=true){
                              if(!fecha_str.equals("")){
                                  if(fecha_existoso=true){
                                      if(!antiguedad_str.equals("")){
                                          if(!nombramiento_actual_str.equals("")){
                                              if(!correo_str.equals("")){
                                                  if(correoExitoso=true){
                                                      if(!telefono_str.equals("")){
                                                          if(telefonoExitoso=true){
                                                              if(!confirmarTelefono_str.equals("")){
                                                                  if(!contrasenaPin_str.equals("")){
                                                                      if ((!confPin_str.equals(""))){
                                                                          if(!edad_real_str.equals("")){
                                                                              if (!numero_profesor_str.equals("")){
                                                                                  executorService.execute(new Runnable() {
                                                                                      @Override
                                                                                      public void run() {
                                                                                          registrarProfe();
                                                                                          Log.e("todos_los_Datos",nombreStr+apellidoStr+fecha_str+
                                                                                                  nombramiento_actual_str+correo_str+telefono_str+confirmarTelefono_str+
                                                                                                  contrasenaPin_str+confPin_str+edad_real_str+numero_profesor_str);
                                                                                      }
                                                                                  });

                                                                              }
                                                                              else{
                                                                                  Toast.makeText(getApplicationContext(), "El numero de profesor es necesario es necesario", Toast.LENGTH_LONG).show();
                                                                              }
                                                                          }
                                                                          else{
                                                                              Toast.makeText(getApplicationContext(), "La edad es necesario", Toast.LENGTH_LONG).show();
                                                                          }

                                                                      }
                                                                      else{
                                                                          Toast.makeText(getApplicationContext(), "Confirmar contrasena es necesario", Toast.LENGTH_LONG).show();
                                                                      }
                                                                  }
                                                                  else{
                                                                      Toast.makeText(getApplicationContext(), "El pin es necesario", Toast.LENGTH_LONG).show();
                                                                  }
                                                              }
                                                              else{
                                                                  Toast.makeText(getApplicationContext(), "Confirmar telefono es necesario", Toast.LENGTH_LONG).show();
                                                              }
                                                          }
                                                          else{
                                                              Toast.makeText(getApplicationContext(), "El telefono solo lleva numeros", Toast.LENGTH_LONG).show();
                                                          }
                                                      }
                                                      else{
                                                          Toast.makeText(getApplicationContext(), "El telefono es necesario", Toast.LENGTH_LONG).show();
                                                      }
                                                  }
                                                  else{
                                                      Toast.makeText(getApplicationContext(), "Ingrese un correo valido", Toast.LENGTH_LONG).show();
                                                  }
                                              }
                                              else{
                                                  Toast.makeText(getApplicationContext(), "El correo es necesaria", Toast.LENGTH_LONG).show();
                                              }
                                          }
                                          else{
                                              Toast.makeText(getApplicationContext(), "nombramiento actual es necesaria", Toast.LENGTH_LONG).show();
                                          }
                                      }
                                      else{
                                          Toast.makeText(getApplicationContext(), "Antiguedad es necesaria", Toast.LENGTH_LONG).show();
                                      }
                                  }

                                  else{
                                      Toast.makeText(getApplicationContext(), "Formatod e fecha dd-mm-yyyy", Toast.LENGTH_LONG).show();
                                  }
                              }
                              else{
                                  Toast.makeText(getApplicationContext(), "La fecha de nacimiento es necesaria", Toast.LENGTH_LONG).show();
                              }
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "El apellido solo puede tener letras", Toast.LENGTH_LONG).show();
                            }
                        }
                        else{
                            Toast.makeText(getApplicationContext(), "El apellido es necesario", Toast.LENGTH_LONG).show();
                        }
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "El nombre solo puede tener letras", Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "El nombre es necesario", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void registrarProfe()
    {
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST,  SERVIDOR_CONTROLADOR+"registro_maestro.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("respuesta4:",response + "sal");
                        if(response.equals("success")){
                            Intent intent = new Intent(Registro.this,Login.class);
                            startActivity(intent);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("respuesta4Error:",error + "error");
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> map = new HashMap<>();


                map.put("nombre",nombreStr);
                map.put("apellido",apellidoStr);
                map.put("fecha_nacimiento",fecha_str);
                map.put("antiguedad",antiguedad_str);
                map.put("nombramiento_actual",nombramiento_actual_str);
                map.put("correo",correo_str);
                map.put("telefono",telefono_str);
                map.put("contrasena",contrasenaPin_str);
                map.put("edad",edad_real_str);
                map.put("numero_profesor",numero_profesor_str);


                return map;
            }
        };
        requestQueue.add(request);
    }
}