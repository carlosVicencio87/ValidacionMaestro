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

    private ScrollView formulario_datosBasicos,formulario_formaDocente;
    private LinearLayout caja_edit_numProfesor,caja_numProfesor_final,caja_edit_apellido1,
            caja_apellido1_final,caja_edit_apellido2,caja_apellido2_final,
            caja_fecha_de_nacimiento,caja_fecha_de_nacimiento_final,caja_edad,caja_nombramiento_actual,
            caja_nombramiento_actual_final,caja_edit_antiguedad,caja_antiguedad_final,caja_siguiente_scroll;
    private EditText numProfesor,apellido1_texto,apellido2_texto,fecha_de_nacimiento_texto,
            nombramiento_actual_texto,antiguedad_texto;
    private ImageView guardar_numProfesor,cambiar_numProfesor,guardar_apellido1,cambiar_apellido2,
            cambiar_fecha_de_nacimiento,guardar_fecha_de_nacimiento,
            cambiar_apellido1,guardar_apellido2,cambiar_nombramiento_actual,
            guardar_nombramiento_actual,guardar_antiguedad,cambiar_antiguedad;
    private TextView numProfesor_final,apellido1,apellido2,edad,nombramiento_actual_vista,
            antiguedad,fecha_de_nacimiento,ir_formAcademica,ir_capDocente,regresar_datosBasic;


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

        caja_siguiente_scroll = findViewById(R.id.caja_siguiente_scroll);
        regresar_datosBasic = findViewById(R.id.regresar_datosBasic);
        ir_capDocente = findViewById(R.id.ir_capDocente);

        ir_formAcademica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulario_datosBasicos.setVisibility(View.GONE);
                formulario_formaDocente.setVisibility(View.VISIBLE);
            }
        });

        regresar_datosBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulario_datosBasicos.setVisibility(View.VISIBLE);
                formulario_formaDocente.setVisibility(View.GONE);
            }
        });
    }
}