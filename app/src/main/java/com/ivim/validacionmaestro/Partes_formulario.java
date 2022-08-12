package com.ivim.validacionmaestro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ScrollView;
import android.widget.TextView;

public class Partes_formulario extends AppCompatActivity {

    private ScrollView formulario_lista;

    private TextView ir_formacion_docente,ir_capa_docente,ir_actualizacion_disciplinar,ir_gestion_disciplinar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_partes_formulario);


        formulario_lista=findViewById(R.id.formulario_lista);
        ir_formacion_docente=findViewById(R.id.ir_formacion_docente);
        ir_capa_docente=findViewById(R.id.ir_capa_docente);
        ir_actualizacion_disciplinar=findViewById(R.id.ir_actualizacion_disciplinar);
        ir_gestion_disciplinar=findViewById(R.id.ir_gestion_disciplinar);

        ir_formacion_docente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irFormDocente;
                irFormDocente= new Intent(Partes_formulario.this,Formacion_docente.class);
                startActivity(irFormDocente);
            }
        });
        ir_capa_docente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irCapaDocente;
                irCapaDocente= new Intent(Partes_formulario.this,Capacitacion_docente.class);
                startActivity(irCapaDocente);
            }
        });
        ir_actualizacion_disciplinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actuaDisciplinar;
                actuaDisciplinar= new Intent(Partes_formulario.this,Actualizacion_disciplinar.class);
                startActivity(actuaDisciplinar);
            }
        });
        ir_gestion_disciplinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gestionDisciplinar;
                gestionDisciplinar= new Intent(Partes_formulario.this,Gestion_academica.class);
                startActivity(gestionDisciplinar);
            }
        });
    }
}