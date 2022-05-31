package com.ivim.validacionmaestro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Cedula2 extends AppCompatActivity {

    private ScrollView formulario_datosBasicos,formulario_formaDocente,formulario_formaCapaDocente,
            formulario_actuaDisci,formulario_gestioAcademica,formulario_productosAcademicos;
    private LinearLayout caja_edit_numProfesor,caja_numProfesor_final,caja_edit_apellido1,
            caja_apellido1_final,caja_edit_apellido2,caja_apellido2_final,
            caja_fecha_de_nacimiento,caja_fecha_de_nacimiento_final,caja_edad,caja_nombramiento_actual,
            caja_nombramiento_actual_final,caja_edit_antiguedad,caja_antiguedad_final,caja_siguiente_scroll,caja_siguiente_scroll2,caja_siguiente_scroll3,caja_agregar_otraLic,caja_cedulaProf2_final,
            caja_edit_cedulaProf2,caja_anoObtencion2_final,caja_edit_instPais2,caja_licenciatura2_final,
            caja_edit_licenciatura2,caja_siguiente_scroll4,caja_siguiente_scroll5;
    private EditText numProfesor,apellido1_texto,apellido2_texto,fecha_de_nacimiento_texto,
            nombramiento_actual_texto,antiguedad_texto;
    private ImageView guardar_numProfesor,cambiar_numProfesor,guardar_apellido1,cambiar_apellido2,
            cambiar_fecha_de_nacimiento,guardar_fecha_de_nacimiento,
            cambiar_apellido1,guardar_apellido2,cambiar_nombramiento_actual,
            guardar_nombramiento_actual,guardar_antiguedad,cambiar_antiguedad,guardar_cedulaProf2,cambiar_cedulaProf2;
    private TextView numProfesor_final,apellido1,apellido2,edad,nombramiento_actual_vista,
            antiguedad,fecha_de_nacimiento,ir_formAcademica,ir_capDocente,regresar_datosBasic,ir_actuaDisciplinar,
            regresar_datos_formDocente,regresar_datos_actuaDocente,ir_getsionActualizacion,agregar_otraLic,cedulaProf2,
            regresar_actualizacionDisc,ir_productosAca,ir_getsionAcademica,regresar_gestionAcademica,ir_expeProfe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_cedula2);

        formulario_datosBasicos = findViewById(R.id.formulario_datosBasicos);
        caja_edit_numProfesor = findViewById(R.id.caja_edit_numProfesor);
        numProfesor = findViewById(R.id.numProfesor);
        guardar_numProfesor = findViewById(R.id.guardar_numProfesor);
        caja_numProfesor_final = findViewById(R.id.caja_numProfesor_final);
        numProfesor_final = findViewById(R.id.numProfesor_final);
        cambiar_numProfesor = findViewById(R.id.cambiar_numProfesor);


        caja_edit_apellido1 = findViewById(R.id.caja_edit_apellido1);
        apellido1_texto = findViewById(R.id.apellido1_texto);
        guardar_apellido1 = findViewById(R.id.guardar_apellido1);
        caja_apellido1_final = findViewById(R.id.caja_apellido1_final);
        apellido1 = findViewById(R.id.apellido1);
        cambiar_apellido1 = findViewById(R.id.cambiar_apellido1);

        caja_edit_apellido2 = findViewById(R.id.caja_edit_apellido2);
        apellido2_texto = findViewById(R.id.apellido2_texto);
        guardar_apellido2 = findViewById(R.id.guardar_apellido2);
        caja_apellido2_final = findViewById(R.id.caja_apellido2_final);
        apellido2 = findViewById(R.id.apellido2);
        cambiar_apellido2 = findViewById(R.id.cambiar_apellido2);

        caja_fecha_de_nacimiento = findViewById(R.id.caja_fecha_de_nacimiento);
        fecha_de_nacimiento_texto = findViewById(R.id.fecha_de_nacimiento_texto);
        guardar_fecha_de_nacimiento = findViewById(R.id.guardar_fecha_de_nacimiento);
        caja_fecha_de_nacimiento_final = findViewById(R.id.caja_fecha_de_nacimiento_final);
        fecha_de_nacimiento = findViewById(R.id.fecha_de_nacimiento);
        cambiar_fecha_de_nacimiento = findViewById(R.id.cambiar_fecha_de_nacimiento);

        caja_edad = findViewById(R.id.caja_edad);
        edad = findViewById(R.id.edad);

        caja_nombramiento_actual = findViewById(R.id.caja_nombramiento_actual);
        nombramiento_actual_texto = findViewById(R.id.nombramiento_actual_texto);
        guardar_nombramiento_actual = findViewById(R.id.guardar_nombramiento_actual);
        caja_nombramiento_actual_final = findViewById(R.id.caja_nombramiento_actual_final);
        nombramiento_actual_vista = findViewById(R.id.nombramiento_actual_vista);
        cambiar_nombramiento_actual = findViewById(R.id.cambiar_nombramiento_actual);

        caja_edit_antiguedad = findViewById(R.id.caja_edit_antiguedad);
        antiguedad_texto = findViewById(R.id.antiguedad_texto);
        guardar_antiguedad = findViewById(R.id.guardar_antiguedad);
        caja_antiguedad_final = findViewById(R.id.caja_antiguedad_final);
        antiguedad = findViewById(R.id.antiguedad);
        cambiar_antiguedad = findViewById(R.id.cambiar_antiguedad);

        ir_formAcademica = findViewById(R.id.ir_formAcademica);
        formulario_formaDocente = findViewById(R.id.formulario_formaDocente);

        caja_agregar_otraLic = findViewById(R.id.caja_agregar_otraLic);
        agregar_otraLic = findViewById(R.id.agregar_otraLic);
        formulario_formaDocente = findViewById(R.id.formulario_formaDocente);
        formulario_formaDocente = findViewById(R.id.formulario_formaDocente);
        guardar_cedulaProf2 = findViewById(R.id.guardar_cedulaProf2);
        caja_cedulaProf2_final = findViewById(R.id.caja_cedulaProf2_final);
        cedulaProf2 = findViewById(R.id.cedulaProf2);
        cambiar_cedulaProf2 = findViewById(R.id.cambiar_cedulaProf2);

        caja_siguiente_scroll = findViewById(R.id.caja_siguiente_scroll);
        regresar_datosBasic = findViewById(R.id.regresar_datosBasic);
        ir_capDocente = findViewById(R.id.ir_capDocente);


        formulario_formaCapaDocente = findViewById(R.id.formulario_formaCapaDocente);
        caja_siguiente_scroll2 = findViewById(R.id.caja_siguiente_scroll2);
        regresar_datos_formDocente = findViewById(R.id.regresar_datos_formDocente);
        ir_actuaDisciplinar = findViewById(R.id.ir_actuaDisciplinar);

        formulario_actuaDisci = findViewById(R.id.formulario_actuaDisci);
        regresar_datos_actuaDocente = findViewById(R.id.regresar_datos_actuaDocente);
        ir_getsionAcademica = findViewById(R.id.ir_getsionAcademica);

        caja_siguiente_scroll3 = findViewById(R.id.caja_siguiente_scroll3);


        formulario_gestioAcademica = findViewById(R.id.formulario_gestioAcademica);
        caja_siguiente_scroll4 = findViewById(R.id.caja_siguiente_scroll4);
        regresar_actualizacionDisc = findViewById(R.id.regresar_actualizacionDisc);

        ir_productosAca = findViewById(R.id.ir_productosAca);

        formulario_productosAcademicos = findViewById(R.id.formulario_productosAcademicos);
        caja_siguiente_scroll5 = findViewById(R.id.caja_siguiente_scroll5);
        regresar_gestionAcademica = findViewById(R.id.regresar_gestionAcademica);
        ir_expeProfe = findViewById(R.id.ir_expeProfe);


        ir_formAcademica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulario_datosBasicos.setVisibility(View.GONE);
                formulario_formaDocente.setVisibility(View.VISIBLE);
            }
        });

        agregar_otraLic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anoObtencion2_final.setVisibility(View.VISIBLE);
                caja_edit_cedulaProf2.setVisibility(View.VISIBLE);
                caja_edit_instPais2.setVisibility(View.VISIBLE);
                caja_edit_licenciatura2.setVisibility(View.VISIBLE);



            }
        });


        regresar_datosBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulario_datosBasicos.setVisibility(View.VISIBLE);
                formulario_formaDocente.setVisibility(View.GONE);
            }
        });
        ir_capDocente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_formaDocente.setVisibility(View.GONE);
                formulario_formaCapaDocente.setVisibility(View.VISIBLE);
            }
        });
        regresar_datos_formDocente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulario_formaDocente.setVisibility(View.VISIBLE);
                formulario_formaCapaDocente.setVisibility(View.GONE);
            }
        });
        ir_actuaDisciplinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_formaCapaDocente.setVisibility(View.GONE);
               formulario_actuaDisci.setVisibility(View.VISIBLE);


            }
        });
        regresar_datos_actuaDocente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulario_formaCapaDocente.setVisibility(View.VISIBLE);
                formulario_actuaDisci.setVisibility(View.GONE);
            }
        });
        ir_getsionAcademica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_actuaDisci.setVisibility(View.GONE);
                formulario_gestioAcademica.setVisibility(View.VISIBLE);


            }
        });
        regresar_actualizacionDisc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulario_actuaDisci.setVisibility(View.VISIBLE);
                formulario_gestioAcademica.setVisibility(View.GONE);
            }
        });

        ir_productosAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_gestioAcademica.setVisibility(View.GONE);
                formulario_productosAcademicos.setVisibility(View.VISIBLE);


            }
        });
        regresar_gestionAcademica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulario_gestioAcademica.setVisibility(View.VISIBLE);
                formulario_productosAcademicos.setVisibility(View.GONE);
            }
        });


    }
}