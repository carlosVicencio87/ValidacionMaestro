package com.ivim.validacionmaestro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public abstract class Cedula extends AppCompatActivity {

    private ScrollView formulario_datosBasicos;
    private LinearLayout caja_edit_numProfesor,caja_numProfesor_final,caja_edit_apellido1,
            caja_apellido1_final,caja_edit_apellido2,caja_apellido2_final,
            caja_fecha_de_nacimiento,caja_edad,caja_nombramiento_actual,
            caja_nombramiento_actual_final,caja_edit_antiguedad,caja_antiguedad_final;
    private EditText numProfesor,apellido1_texto,apellido2_texto,
            nombramiento_actual_texto,antiguedad_texto;
    private ImageView guardar_numProfesor,cambiar_numProfesor,guardar_apellido1,cambiar_apellido2,
            cambiar_apellido1,guardar_apellido2,cambiar_nombramiento_actual,
            guardar_nombramiento_actual,guardar_antiguedad,cambiar_antiguedad;
    private TextView numProfesor_final,apellido1,apellido2,edad,nombramiento_actual_vista,
            antiguedad;
    private DatePicker fecha_de_nacimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_cedula);

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
        fecha_de_nacimiento = findViewById(R.id.fecha_de_nacimiento);

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
    }
}