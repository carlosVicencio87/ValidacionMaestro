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

    private TextView ir_formacion_docente,ir_capa_docente,ir_actualizacion_disciplinar,
            ir_gestion_disciplinar,ir_productosAca,ir_expeProfe,ir_expeDiseInge,ir_logrosProfe,
            ir_partColeCam,ir_premiosDist,ir_aportaRele;

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
        ir_productosAca=findViewById(R.id.ir_productosAca);
        ir_expeProfe=findViewById(R.id.ir_expeProfe);
        ir_expeDiseInge=findViewById(R.id.ir_expeDiseInge);
        ir_logrosProfe=findViewById(R.id.ir_logrosProfe);
        ir_partColeCam=findViewById(R.id.ir_partColeCam);
        ir_premiosDist=findViewById(R.id.ir_premiosDist);
        ir_aportaRele=findViewById(R.id.ir_aportaRele);

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
        ir_productosAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prodcutsoAca= new Intent(Partes_formulario.this,ProductosAcademicos.class);
                startActivity(prodcutsoAca);
            }
        });

        ir_expeProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent expProfe= new Intent(Partes_formulario.this,ExperienciaProfesional.class);
                startActivity(expProfe);
            }
        });
        ir_expeDiseInge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent expDiseno= new Intent(Partes_formulario.this,ExperienciaDisenoInge.class);
                startActivity(expDiseno);
            }
        });
        ir_logrosProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logProfe= new Intent(Partes_formulario.this,LogrosProfesionales .class);
                startActivity(logProfe);
            }
        });
        ir_partColeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent partColCam= new Intent(Partes_formulario.this,ParticipacionColCam .class);
                startActivity(partColCam);
            }
        });
        ir_premiosDist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent premioDist= new Intent(Partes_formulario.this,PremiosDisticiones .class);
                startActivity(premioDist);
            }
        });
        ir_aportaRele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent partColCam= new Intent(Partes_formulario.this,AportacionesPe .class);
                startActivity(partColCam);
            }
        });
    }
}