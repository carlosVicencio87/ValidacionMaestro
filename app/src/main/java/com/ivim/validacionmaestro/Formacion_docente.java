package com.ivim.validacionmaestro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


public class Formacion_docente extends AppCompatActivity {
    private ScrollView formulario_formaDocente;
    private LinearLayout caja_edit_cedulaProf2,caja_edit_instPais2,caja_licenciatura2_final,
            caja_edit_licenciatura2,caja_licenciatura_final,caja_edit_licenciatura,caja_edit_instPais,caja_instPais_final,
            caja_edit_anoObtencionLic,caja_anoObtencionLic_final,caja_edit_cedulaProfLic,caja_cedulaProfLic_final,
            caja_cedulaProfLic2_final,caja_anoObtencionLic2_final,caja_instPais2_final,caja_ceduEsp_final
            ,caja_edit_ceduEsp,caja_anoEsp_final,caja_anoEsp,caja_instEsp_final,caja_edit_instEsp,
            caja_especialidad_final,caja_especialidad,caja_ceduEsp_final2,caja_anoEsp2_final,
            caja_instEsp_final2,caja_especialidad2_final,caja_maes,maes_final,caja_edit_instMaes,
            caja_instMaes_final,caja_anoMaes,caja_anoMaes_final,caja_edit_ceduMaes,caja_ceduMaes_final,
            caja_maes2_final,caja_instMaes2_final,caja_anoMaes2_final,caja_ceduMaes2_final,
            caja_doc,doc_final,caja_edit_instDoc,caja_instDoc_final,caja_anoDoc,caja_anoDoc_final,
            caja_edit_ceduDoc,caja_ceduDoc_final,doc2_final,caja_instdoc2_final,caja_anoDoc2_final,
            caja_ceduDoc2_final,caja_anuncio_ced,caja_edit_anoObtencion2,caja_anuncio_ano,caja_anuncio_inst,caja_anuncio_lic,caja_borrar_otraLic,caja_borrar_otraEsp,caja_agregar_otraEsp,caja_edit_ceduEsp2,
            caja_anuncio_ceduesp,caja_anoEsp2,caja_anuncio_anoesp,caja_edit_instEsp2,caja_anuncio_instEsp,caja_especialidad2,caja_anuncio_esp,caja_borrar_otraMaes,caja_agregar_maes,caja_edit_ceduMaes2,
            caja_anuncio_ceduMaes2,caja_anoMaes2,caja_anuncio_anoMaes2,caja_edit_instMaes2,caja_anuncio_instMaes2,caja_maes2,caja_anuncio_maes2,caja_borrar_doc,caja_agregar_doc,caja_edit_ceduDoc2,
            caja_anuncio_ceduDoc2,caja_anoDoc2,caja_anuncio_anodoc2,caja_edit_instdoc2,caja_anuncio_instdoc2,caja_doc2,caja_anuncio_doc2,caja_agregar_otraLic;

    private EditText licenciatura_texto,instPaisLic_texto,
            anoObtencionLic_texto,cedulaProfLic_texto,licenciatura2_texto,cedulaProfLic2_texto,
            anoObtencion2Lic_texto,instPaisLic2_texto,ceduEsp_texto,anoEsp_texto,instEsp_texto,
            especialidad_texto,ceduEsp2_texto,anoEsp2_texto,instEsp2_texto,especialidad2_texto,
            maes_texto,instMaes_texto,anoMaes_texto,ceduMaes_texto,maes2_texto,instMaes2_texto,
            anoMaes2_texto,ceduMaes2_texto,doc_texto,instDoc_texto,anoDoc_texto,ceduDoc_texto,
            doc2_texto,instdoc2_texto,anoDoc2_texto,ceduDoc2_texto;

    private ImageView guardar_licenciatura,cambiar_licenciatura,guardar_instPaisLic,
            cambiar_instPaisLic,cambiar_anoObtencionLic,guardar_anoObtencionLic,guardar_cedulaProfLic,
            cambiar_cedulaProfLic,guardar_licenciatura2,cambiar_licenciatura2,cambiar_cedulaProfLic2,
            guardar_cedulaProfLic2,cambiar_anoObtencionLic2,guardar_anoObtencionLic2,cambiar_instPais2Lic,
            guardar_instPaisLic2,cambiar_ceduEsp,guardar_ceduEsp,cambiar_anoEsp,guardar_anoEsp,cambiar_instEsp,
            guardar_instEsp,cambiar_especialidad,guardar_especialidad,cambiar_ceduEsp2,guardar_ceduEsp2,
            cambiar_anoEsp2,guardar_anoEsp2,cambiar_instEsp2,guardar_instEsp2,cambiar_especialidad2,
            guardar_especialidad2,guardar_maes,cambiar_maes,guardar_instMaes,cambiar_instMaes,
            guardar_anoMaes,cambiar_anoMaes,guardar_ceduMaes,cambiar_ceduMaes,guardar_maes2,
            cambiar_maes2,guardar_instMaes2,cambiar_instMaes2,guardar_anoMaes2,cambiar_anoMaes2,
            guardar_ceduMaes2,cambiar_ceduMaes2,guardar_doc,cambiar_doc,guardar_instDoc,cambiar_instDoc,
            guardar_anoDoc,cambiar_anoDoc,guardar_ceduDoc,cambiar_ceduDoc,guardar_doc2,cambiar_doc2,
            guardar_instdoc2,cambiar_instdoc2,guardar_anoDoc2,cambiar_anoDoc2,guardar_ceduDoc2,
            cambiar_ceduDoc2;

    private TextView borrar_otraLic,borrar_otraEsp,agregar_otraEsp,agregar_otraMaes,borrar_otraMaes,agregar_otraDoc,borrar_otraDoc,licenciatura,instPaisLic,anoObtencionLic,cedulaProfLic,
            licenciatura2,cedulaProfLic2,anoObtencionLic2,instPaisLic2,ceduEsp,anoEsp_vista,instEsp,especialidad,
            ceduEsp2,anoEsp2_vista,instEsp2,especialidad2,maes,instMaes,anoMaes_vista,ceduMaes,maes2,instMaes2,
            anoMaes2_vista,ceduMaes2,doc,instDoc,anoDoc_vista,ceduDoc,doc2,instdoc2,anoDoc2_vista,ceduDoc2,agregar_otraLic;

    private String nuevo_licenciatura,nuevo_instPaisLic,nuevo_anoObtencionLic,nuevo_cedulaProfLic,
            nuevo_licenciatura2,nuevo_cedulaProfLic2,nuevo_anoObtencion2Lic,nuevo_instPaisLic2,
            nuevo_ceduEsp,nuevo_anoEsp,nuevo_instEsp,nuevo_especialidad,nuevo_ceduEsp2,nuevo_anoEsp2,
            nuevo_instEsp2,nuevo_especialidad2,nuevo_maes,nuevo_instMaes,nuevo_anoMaes,nuevo_ceduMaes,
            nuevo_maes2,nuevo_instMaes2,nuevo_anoMaes2,nuevo_ceduMaes2,nuevo_doc,nuevo_instDoc,nuevo_anoDoc,
            nuevo_ceduDoc,nuevo_doc2,nuevo_instdoc2,nuevo_anoDoc2,nuevo_ceduDoc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_formacion_docente);
        guardar_licenciatura = findViewById(R.id.guardar_licenciatura);
        licenciatura_texto = findViewById(R.id.licenciatura_texto);
        licenciatura = findViewById(R.id.licenciatura);
        caja_edit_licenciatura = findViewById(R.id.caja_edit_licenciatura);
        caja_licenciatura_final = findViewById(R.id.caja_licenciatura_final);
        cambiar_licenciatura = findViewById(R.id.cambiar_licenciatura);

        guardar_instPaisLic = findViewById(R.id.guardar_instPaisLic);
        instPaisLic_texto = findViewById(R.id.instPaisLic_texto);
        instPaisLic = findViewById(R.id.instPaisLic);
        caja_edit_instPais = findViewById(R.id.caja_edit_instPais);
        caja_instPais_final = findViewById(R.id.caja_instPais_final);
        cambiar_instPaisLic = findViewById(R.id.cambiar_instPaisLic);

        guardar_anoObtencionLic = findViewById(R.id.guardar_anoObtencionLic);
        anoObtencionLic_texto = findViewById(R.id.anoObtencionLic_texto);
        anoObtencionLic = findViewById(R.id.anoObtencionLic);
        caja_edit_anoObtencionLic = findViewById(R.id.caja_edit_anoObtencionLic);
        caja_anoObtencionLic_final = findViewById(R.id.caja_anoObtencionLic_final);
        cambiar_anoObtencionLic = findViewById(R.id.cambiar_anoObtencionLic);

        guardar_cedulaProfLic = findViewById(R.id.guardar_cedulaProfLic);
        cedulaProfLic_texto = findViewById(R.id.cedulaProfLic_texto);
        cedulaProfLic = findViewById(R.id.cedulaProfLic);
        caja_edit_cedulaProfLic = findViewById(R.id.caja_edit_cedulaProfLic);
        caja_cedulaProfLic_final = findViewById(R.id.caja_cedulaProfLic_final);
        cambiar_cedulaProfLic = findViewById(R.id.cambiar_cedulaProfLic);

        caja_agregar_otraLic = findViewById(R.id.caja_agregar_otraLic);
        agregar_otraLic = findViewById(R.id.agregar_otraLic);
        caja_edit_cedulaProf2 = findViewById(R.id.caja_edit_cedulaProf2);
        caja_anuncio_ced = findViewById(R.id.caja_anuncio_ced);
        caja_edit_anoObtencion2 = findViewById(R.id.caja_edit_anoObtencion2);
        caja_anuncio_ano = findViewById(R.id.caja_anuncio_ano);
        caja_edit_instPais2 = findViewById(R.id.caja_edit_instPais2);
        caja_anuncio_inst = findViewById(R.id.caja_anuncio_inst);
        caja_edit_licenciatura2 = findViewById(R.id.caja_edit_licenciatura2);
        caja_licenciatura2_final = findViewById(R.id.caja_licenciatura2_final);
        caja_anuncio_lic = findViewById(R.id.caja_anuncio_lic);

        guardar_instPaisLic2 = findViewById(R.id.guardar_instPaisLic2);
        instPaisLic2_texto = findViewById(R.id.instPaisLic2_texto);
        instPaisLic2 = findViewById(R.id.instPaisLic2);
        caja_instPais2_final = findViewById(R.id.caja_instPais2_final);
        cambiar_instPais2Lic = findViewById(R.id.cambiar_instPais2Lic);

        guardar_anoObtencionLic2 = findViewById(R.id.guardar_anoObtencionLic2);
        anoObtencion2Lic_texto = findViewById(R.id.anoObtencion2Lic_texto);
        anoObtencionLic2 = findViewById(R.id.anoObtencionLic2);
        caja_anoObtencionLic2_final = findViewById(R.id.caja_anoObtencionLic2_final);
        cambiar_anoObtencionLic2 = findViewById(R.id.cambiar_anoObtencionLic2);

        guardar_cedulaProfLic2 = findViewById(R.id.guardar_cedulaProfLic2);
        cedulaProfLic2_texto = findViewById(R.id.cedulaProfLic2_texto);
        cedulaProfLic2 = findViewById(R.id.cedulaProfLic2);
        caja_cedulaProfLic2_final = findViewById(R.id.caja_cedulaProfLic2_final);
        cambiar_cedulaProfLic2 = findViewById(R.id.cambiar_cedulaProfLic2);

        cambiar_licenciatura2 = findViewById(R.id.cambiar_licenciatura2);
        licenciatura2 = findViewById(R.id.licenciatura2);
        licenciatura2_texto = findViewById(R.id.licenciatura2_texto);
        guardar_licenciatura2 = findViewById(R.id.guardar_licenciatura2);

        borrar_otraLic = findViewById(R.id.borrar_otraLic);
        caja_borrar_otraLic = findViewById(R.id.caja_borrar_otraLic);




        caja_anuncio_esp = findViewById(R.id.caja_anuncio_esp);
        caja_especialidad2 = findViewById(R.id.caja_especialidad2);
        caja_anuncio_instEsp = findViewById(R.id.caja_anuncio_instEsp);
        caja_edit_instEsp2 = findViewById(R.id.caja_edit_instEsp2);
        caja_anuncio_anoesp = findViewById(R.id.caja_anuncio_anoesp);
        caja_anoEsp2 = findViewById(R.id.caja_anoEsp2);
        caja_anuncio_ceduesp = findViewById(R.id.caja_anuncio_ceduesp);
        caja_edit_ceduEsp2 = findViewById(R.id.caja_edit_ceduEsp2);
        caja_agregar_otraEsp = findViewById(R.id.caja_agregar_otraEsp);
        agregar_otraEsp = findViewById(R.id.agregar_otraEsp);
        caja_agregar_otraEsp = findViewById(R.id.caja_agregar_otraEsp);
        caja_borrar_otraEsp = findViewById(R.id.caja_borrar_otraEsp);
        borrar_otraEsp = findViewById(R.id.borrar_otraEsp);

        guardar_especialidad = findViewById(R.id.guardar_especialidad);
        especialidad_texto = findViewById(R.id.especialidad_texto);
        especialidad = findViewById(R.id.especialidad);
        caja_especialidad = findViewById(R.id.caja_especialidad);
        caja_especialidad_final = findViewById(R.id.caja_especialidad_final);
        cambiar_especialidad = findViewById(R.id.cambiar_especialidad);

        guardar_instEsp = findViewById(R.id.guardar_instEsp);
        instEsp_texto = findViewById(R.id.instEsp_texto);
        instEsp = findViewById(R.id.instEsp);
        caja_edit_instEsp = findViewById(R.id.caja_edit_instEsp);
        caja_instEsp_final = findViewById(R.id.caja_instEsp_final);
        cambiar_instEsp = findViewById(R.id.cambiar_instPais2Lic);

        guardar_anoEsp = findViewById(R.id.guardar_anoEsp);
        anoEsp_texto = findViewById(R.id.anoEsp_texto);
        anoEsp_vista = findViewById(R.id.anoEsp_vista);
        caja_anoEsp = findViewById(R.id.caja_anoEsp);
        caja_anoEsp_final = findViewById(R.id.caja_anoEsp_final);
        cambiar_anoEsp = findViewById(R.id.cambiar_anoEsp);

        guardar_ceduEsp = findViewById(R.id.guardar_ceduEsp);
        ceduEsp_texto = findViewById(R.id.ceduEsp_texto);
        ceduEsp = findViewById(R.id.ceduEsp);
        caja_edit_ceduEsp = findViewById(R.id.caja_edit_ceduEsp);
        caja_ceduEsp_final = findViewById(R.id.caja_ceduEsp_final);
        cambiar_ceduEsp = findViewById(R.id.cambiar_ceduEsp);

        guardar_especialidad2 = findViewById(R.id.guardar_especialidad2);
        especialidad2_texto = findViewById(R.id.especialidad2_texto);
        especialidad2 = findViewById(R.id.especialidad2);
        caja_especialidad2_final = findViewById(R.id.caja_especialidad2_final);
        cambiar_especialidad2 = findViewById(R.id.cambiar_especialidad2);

        guardar_instEsp2 = findViewById(R.id.guardar_instEsp2);
        instEsp2_texto = findViewById(R.id.instEsp2_texto);
        instEsp2 = findViewById(R.id.instEsp2);
        caja_instEsp_final2 = findViewById(R.id.caja_instEsp_final2);
        cambiar_instEsp2 = findViewById(R.id.cambiar_instEsp2);

        guardar_anoEsp2 = findViewById(R.id.guardar_anoEsp2);
        anoEsp2_texto = findViewById(R.id.anoEsp2_texto);
        anoEsp2_vista = findViewById(R.id.anoEsp2_vista);
        caja_anoEsp2_final = findViewById(R.id.caja_anoEsp2_final);
        cambiar_anoEsp2 = findViewById(R.id.cambiar_anoEsp2);

        guardar_ceduEsp2 = findViewById(R.id.guardar_ceduEsp2);
        ceduEsp2_texto = findViewById(R.id.ceduEsp2_texto);
        ceduEsp2 = findViewById(R.id.ceduEsp2);
        caja_ceduEsp_final2 = findViewById(R.id.caja_ceduEsp_final2);
        cambiar_ceduEsp2 = findViewById(R.id.cambiar_ceduEsp2);


        caja_anuncio_maes2 = findViewById(R.id.caja_anuncio_maes2);
        caja_maes2 = findViewById(R.id.caja_maes2);
        caja_anuncio_instMaes2 = findViewById(R.id.caja_anuncio_instMaes2);
        caja_edit_instMaes2 = findViewById(R.id.caja_edit_instMaes2);
        caja_anuncio_anoMaes2 = findViewById(R.id.caja_anuncio_anoMaes2);
        caja_anoMaes2 = findViewById(R.id.caja_anoMaes2);
        caja_anuncio_ceduMaes2 = findViewById(R.id.caja_anuncio_ceduMaes2);
        caja_edit_ceduMaes2 = findViewById(R.id.caja_edit_ceduMaes2);
        caja_agregar_maes = findViewById(R.id.caja_agregar_maes);
        agregar_otraMaes = findViewById(R.id.agregar_otraMaes);
        caja_borrar_otraMaes = findViewById(R.id.caja_borrar_otraMaes);
        borrar_otraMaes = findViewById(R.id.borrar_otraMaes);


        guardar_maes= findViewById(R.id.guardar_maes);
        maes_texto = findViewById(R.id.maes_texto);
        maes = findViewById(R.id.maes);
        caja_maes = findViewById(R.id.caja_maes);
        maes_final = findViewById(R.id.maes_final);
        cambiar_maes = findViewById(R.id.cambiar_maes);

        guardar_instMaes = findViewById(R.id.guardar_instMaes);
        instMaes_texto = findViewById(R.id.instMaes_texto);
        instMaes = findViewById(R.id.instMaes);
        caja_edit_instMaes = findViewById(R.id.caja_edit_instMaes);
        caja_instMaes_final = findViewById(R.id.caja_instMaes_final);
        cambiar_instMaes = findViewById(R.id.cambiar_instMaes);

        guardar_anoMaes = findViewById(R.id.guardar_anoMaes);
        anoMaes_texto = findViewById(R.id.anoMaes_texto);
        anoMaes_vista = findViewById(R.id.anoMaes_vista);
        caja_anoMaes = findViewById(R.id.caja_anoMaes);
        caja_anoMaes_final = findViewById(R.id.caja_anoMaes_final);
        cambiar_anoMaes = findViewById(R.id.cambiar_anoMaes);

        guardar_ceduMaes = findViewById(R.id.guardar_ceduMaes);
        ceduMaes_texto = findViewById(R.id.ceduMaes_texto);
        ceduMaes = findViewById(R.id.ceduMaes);
        caja_edit_ceduMaes = findViewById(R.id.caja_edit_ceduMaes);
        caja_ceduMaes_final = findViewById(R.id.caja_ceduMaes_final);
        cambiar_ceduMaes = findViewById(R.id.cambiar_ceduMaes);

        guardar_maes2 = findViewById(R.id.guardar_maes2);
        maes2_texto = findViewById(R.id.maes2_texto);
        maes2 = findViewById(R.id.maes2);
        caja_maes2_final = findViewById(R.id.caja_maes2_final);
        cambiar_maes2 = findViewById(R.id.cambiar_maes2);

        guardar_instMaes2 = findViewById(R.id.guardar_instMaes2);
        instMaes2_texto = findViewById(R.id.instMaes2_texto);
        instMaes2 = findViewById(R.id.instMaes2);
        caja_instMaes2_final = findViewById(R.id.caja_instMaes2_final);
        cambiar_instMaes2 = findViewById(R.id.cambiar_instMaes2);

        guardar_anoMaes2 = findViewById(R.id.guardar_anoMaes2);
        anoMaes2_texto = findViewById(R.id.anoMaes2_texto);
        anoMaes2_vista = findViewById(R.id.anoMaes2_vista);
        caja_anoMaes2_final = findViewById(R.id.caja_anoMaes2_final);
        cambiar_anoMaes2 = findViewById(R.id.cambiar_anoMaes2);

        guardar_ceduMaes2 = findViewById(R.id.guardar_ceduMaes2);
        ceduMaes2_texto = findViewById(R.id.ceduMaes2_texto);
        ceduMaes2 = findViewById(R.id.ceduMaes2);
        caja_ceduMaes2_final = findViewById(R.id.caja_ceduMaes2_final);
        cambiar_ceduMaes2 = findViewById(R.id.cambiar_ceduMaes2);

        caja_anuncio_doc2 = findViewById(R.id.caja_anuncio_doc2);
        caja_doc2 = findViewById(R.id.caja_doc2);
        caja_anuncio_instdoc2 = findViewById(R.id.caja_anuncio_instdoc2);
        caja_edit_instdoc2 = findViewById(R.id.caja_edit_instdoc2);
        caja_anuncio_anodoc2 = findViewById(R.id.caja_anuncio_anodoc2);
        caja_anoDoc2 = findViewById(R.id.caja_anoDoc2);
        caja_anuncio_ceduDoc2 = findViewById(R.id.caja_anuncio_ceduDoc2);
        caja_edit_ceduDoc2 = findViewById(R.id.caja_edit_ceduDoc2);
        caja_agregar_doc = findViewById(R.id.caja_agregar_doc);
        agregar_otraDoc = findViewById(R.id.agregar_otraDoc);
        caja_borrar_doc = findViewById(R.id.caja_borrar_doc);
        borrar_otraDoc = findViewById(R.id.borrar_otraDoc);

        guardar_doc= findViewById(R.id.guardar_doc);
        doc_texto = findViewById(R.id.doc_texto);
        doc = findViewById(R.id.doc);
        caja_doc = findViewById(R.id.caja_doc);
        doc_final = findViewById(R.id.doc_final);
        cambiar_doc = findViewById(R.id.cambiar_doc);

        guardar_instDoc = findViewById(R.id.guardar_instDoc);
        instDoc_texto = findViewById(R.id.instDoc_texto);
        instDoc = findViewById(R.id.instDoc);
        caja_edit_instDoc = findViewById(R.id.caja_edit_instDoc);
        caja_instDoc_final = findViewById(R.id.caja_instDoc_final);
        cambiar_instDoc = findViewById(R.id.cambiar_instDoc);

        guardar_anoDoc = findViewById(R.id.guardar_anoDoc);
        anoDoc_texto = findViewById(R.id.anoDoc_texto);
        anoDoc_vista = findViewById(R.id.anoDoc_vista);
        caja_anoDoc = findViewById(R.id.caja_anoDoc);
        caja_anoDoc_final = findViewById(R.id.caja_anoDoc_final);
        cambiar_anoDoc = findViewById(R.id.cambiar_anoDoc);

        guardar_ceduDoc = findViewById(R.id.guardar_ceduDoc);
        ceduDoc_texto = findViewById(R.id.ceduDoc_texto);
        ceduDoc = findViewById(R.id.ceduDoc);
        caja_edit_ceduDoc = findViewById(R.id.caja_edit_ceduDoc);
        caja_ceduDoc_final = findViewById(R.id.caja_ceduDoc_final);
        cambiar_ceduDoc = findViewById(R.id.cambiar_ceduDoc);

        guardar_doc2 = findViewById(R.id.guardar_doc2);
        doc2_texto = findViewById(R.id.doc2_texto);
        doc2 = findViewById(R.id.doc2);
        doc2_final = findViewById(R.id.doc2_final);
        cambiar_doc2 = findViewById(R.id.cambiar_doc2);

        guardar_instdoc2 = findViewById(R.id.guardar_instdoc2);
        instdoc2_texto = findViewById(R.id.instdoc2_texto);
        instdoc2 = findViewById(R.id.instdoc2);
        caja_instdoc2_final = findViewById(R.id.caja_instdoc2_final);
        cambiar_instdoc2 = findViewById(R.id.cambiar_instdoc2);

        guardar_anoDoc2 = findViewById(R.id.guardar_anoDoc2);
        anoDoc2_texto = findViewById(R.id.anoDoc2_texto);
        anoDoc2_vista = findViewById(R.id.anoDoc2_vista);
        caja_anoDoc2_final = findViewById(R.id.caja_anoDoc2_final);
        cambiar_anoDoc2 = findViewById(R.id.cambiar_anoDoc2);

        guardar_ceduDoc2 = findViewById(R.id.guardar_ceduDoc2);
        ceduDoc2_texto = findViewById(R.id.ceduDoc2_texto);
        ceduDoc2 = findViewById(R.id.ceduDoc2);
        caja_ceduDoc2_final = findViewById(R.id.caja_ceduDoc2_final);
        cambiar_ceduDoc2 = findViewById(R.id.cambiar_ceduDoc2);

        guardar_licenciatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_licenciatura = licenciatura_texto.getText().toString();
                licenciatura.setText(nuevo_licenciatura);
                if (!nuevo_licenciatura.trim().equals("")) {
                    caja_edit_licenciatura.setVisibility(View.GONE);
                    caja_licenciatura_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la lic es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_licenciatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_licenciatura.setVisibility(View.VISIBLE);
                caja_licenciatura_final.setVisibility(View.GONE);

            }
        });
        guardar_instPaisLic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instPaisLic = instPaisLic_texto.getText().toString();
                instPaisLic.setText(nuevo_instPaisLic);
                if (!nuevo_instPaisLic.trim().equals("")) {
                    caja_edit_instPais.setVisibility(View.GONE);
                    caja_instPais_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instPaisLic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instPais.setVisibility(View.VISIBLE);
                caja_instPais_final.setVisibility(View.GONE);

            }
        });
        guardar_anoObtencionLic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoObtencionLic = anoObtencionLic_texto.getText().toString();
                anoObtencionLic.setText(nuevo_anoObtencionLic);
                if (!nuevo_anoObtencionLic.trim().equals("")) {
                    caja_edit_anoObtencionLic.setVisibility(View.GONE);
                    caja_anoObtencionLic_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El ano de obtecion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoObtencionLic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_anoObtencionLic.setVisibility(View.VISIBLE);
                caja_anoObtencionLic_final.setVisibility(View.GONE);

            }
        });
        guardar_cedulaProfLic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_cedulaProfLic = cedulaProfLic_texto.getText().toString();
                cedulaProfLic.setText(nuevo_cedulaProfLic);
                if (!nuevo_cedulaProfLic.trim().equals("")) {
                    caja_edit_cedulaProfLic.setVisibility(View.GONE);
                    caja_cedulaProfLic_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La cedula profesional es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_cedulaProfLic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_cedulaProfLic.setVisibility(View.VISIBLE);
                caja_cedulaProfLic_final.setVisibility(View.GONE);

            }
        });
        agregar_otraLic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nuevo_licenciatura = licenciatura_texto.getText().toString();
                nuevo_instPaisLic = instPaisLic_texto.getText().toString();
                nuevo_anoObtencionLic = anoObtencionLic_texto.getText().toString();
                nuevo_cedulaProfLic = cedulaProfLic_texto.getText().toString();
                if (!nuevo_licenciatura.trim().equals("")) {
                    if (!nuevo_instPaisLic.trim().equals("")) {
                        if (!nuevo_anoObtencionLic.trim().equals("")) {
                            if (!nuevo_cedulaProfLic.trim().equals("")) {

                                caja_anuncio_lic.setVisibility(View.VISIBLE);
                                caja_edit_licenciatura2.setVisibility(View.VISIBLE);
                                licenciatura2_texto.setText("");
                                caja_anuncio_inst.setVisibility(View.VISIBLE);
                                caja_edit_instPais2.setVisibility(View.VISIBLE);
                                instPaisLic2_texto.setText("");
                                caja_anuncio_ano.setVisibility(View.VISIBLE);
                                caja_edit_anoObtencion2.setVisibility(View.VISIBLE);
                                anoObtencion2Lic_texto.setText("");
                                caja_edit_cedulaProf2.setVisibility(View.VISIBLE);
                                caja_anuncio_ced.setVisibility(View.VISIBLE);
                                cedulaProfLic2_texto.setText("");
                                caja_agregar_otraLic.setVisibility(View.GONE);
                                caja_borrar_otraLic.setVisibility(View.VISIBLE);

                            } else {
                                Toast.makeText(getApplicationContext(), "La cedula profesional es necesario.", Toast.LENGTH_LONG).show();
                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "El ano de obtencion es necesario", Toast.LENGTH_LONG).show();
                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(), ".El instituto es necesario.", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "El nombre de la licenciatura es necesario..", Toast.LENGTH_LONG).show();
                }
            }
        });
        guardar_licenciatura2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_licenciatura2 = licenciatura2_texto.getText().toString();
                licenciatura2.setText(nuevo_licenciatura2);
                if (!nuevo_licenciatura2.trim().equals("")) {
                    caja_edit_licenciatura2.setVisibility(View.GONE);
                    caja_licenciatura2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la lic es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_licenciatura2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_licenciatura2.setVisibility(View.VISIBLE);
                caja_licenciatura2_final.setVisibility(View.GONE);

            }
        });
        guardar_instPaisLic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instPaisLic2 = instPaisLic2_texto.getText().toString();
                instPaisLic2.setText(nuevo_instPaisLic2);
                if (!nuevo_instPaisLic2.trim().equals("")) {
                    caja_edit_instPais2.setVisibility(View.GONE);
                    caja_instPais2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instPais2Lic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instPais2.setVisibility(View.VISIBLE);
                caja_instPais2_final.setVisibility(View.GONE);

            }
        });
        guardar_anoObtencionLic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoObtencion2Lic = anoObtencion2Lic_texto.getText().toString();
                anoObtencionLic2.setText(nuevo_anoObtencion2Lic);
                if (!nuevo_anoObtencion2Lic.trim().equals("")) {
                    caja_edit_anoObtencion2.setVisibility(View.GONE);
                    caja_anoObtencionLic2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El ano de obtecion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoObtencionLic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_anoObtencion2.setVisibility(View.VISIBLE);
                caja_anoObtencionLic2_final.setVisibility(View.GONE);

            }
        });
        guardar_cedulaProfLic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_cedulaProfLic2 = cedulaProfLic2_texto.getText().toString();
                cedulaProfLic2.setText(nuevo_cedulaProfLic2);
                if (!nuevo_cedulaProfLic2.trim().equals("")) {
                    caja_edit_cedulaProf2.setVisibility(View.GONE);
                    caja_cedulaProfLic2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La cedula profesional es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_cedulaProfLic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_cedulaProf2.setVisibility(View.VISIBLE);
                caja_cedulaProfLic2_final.setVisibility(View.GONE);

            }
        });

        borrar_otraLic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_lic.setVisibility(View.GONE);
                caja_edit_licenciatura2.setVisibility(View.GONE);
                caja_licenciatura2_final.setVisibility(View.GONE);
                caja_anuncio_inst.setVisibility(View.GONE);
                caja_edit_instPais2.setVisibility(View.GONE);
                caja_instPais2_final.setVisibility(View.GONE);
                caja_anuncio_ano.setVisibility(View.GONE);
                caja_edit_anoObtencion2.setVisibility(View.GONE);
                caja_anoObtencionLic2_final.setVisibility(View.GONE);
                caja_edit_cedulaProf2.setVisibility(View.GONE);
                caja_anuncio_ced.setVisibility(View.GONE);
                caja_cedulaProfLic2_final.setVisibility(View.GONE);
                caja_agregar_otraLic.setVisibility(View.VISIBLE);
                caja_borrar_otraLic.setVisibility(View.GONE);



            }
        });
        guardar_especialidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_especialidad = especialidad_texto.getText().toString();
                especialidad.setText(nuevo_especialidad);
                if (!nuevo_especialidad.trim().equals("")) {
                    caja_especialidad.setVisibility(View.GONE);
                    caja_especialidad_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la especialidad es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_especialidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_especialidad.setVisibility(View.VISIBLE);
                caja_especialidad_final.setVisibility(View.GONE);

            }
        });
        guardar_instEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instEsp = instEsp_texto.getText().toString();
                instEsp.setText(nuevo_instEsp);
                if (!nuevo_instEsp.trim().equals("")) {
                    caja_edit_instEsp.setVisibility(View.GONE);
                    caja_instEsp_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instEsp.setVisibility(View.VISIBLE);
                caja_instEsp_final.setVisibility(View.GONE);

            }
        });
        guardar_anoEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoEsp = anoEsp_texto.getText().toString();
                anoEsp_vista.setText(nuevo_anoEsp);
                if (!nuevo_anoEsp.trim().equals("")) {
                    caja_anoEsp.setVisibility(View.GONE);
                    caja_anoEsp_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El ano de obtecion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoEsp.setVisibility(View.VISIBLE);
                caja_anoEsp_final.setVisibility(View.GONE);

            }
        });
        guardar_ceduEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_ceduEsp = ceduEsp_texto.getText().toString();
                ceduEsp.setText(nuevo_ceduEsp);
                if (!nuevo_ceduEsp.trim().equals("")) {
                    caja_edit_ceduEsp.setVisibility(View.GONE);
                    caja_ceduEsp_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La cedula profesional es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_ceduEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_ceduEsp.setVisibility(View.VISIBLE);
                caja_ceduEsp_final.setVisibility(View.GONE);

            }
        });
        agregar_otraEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nuevo_especialidad = especialidad_texto.getText().toString();
                nuevo_instEsp = instEsp_texto.getText().toString();
                nuevo_anoEsp = anoEsp_texto.getText().toString();
                nuevo_ceduEsp = ceduEsp_texto.getText().toString();
                if (!nuevo_especialidad.trim().equals("")) {
                    if (!nuevo_instEsp.trim().equals("")) {
                        if (!nuevo_anoEsp.trim().equals("")) {
                            if (!nuevo_ceduEsp.trim().equals("")) {

                                caja_anuncio_esp.setVisibility(View.VISIBLE);
                                caja_especialidad2.setVisibility(View.VISIBLE);
                                especialidad2_texto.setText("");

                                caja_anuncio_instEsp.setVisibility(View.VISIBLE);
                                caja_edit_instEsp2.setVisibility(View.VISIBLE);
                                instEsp2_texto.setText("");

                                caja_anuncio_anoesp.setVisibility(View.VISIBLE);
                                caja_anoEsp2.setVisibility(View.VISIBLE);
                                anoEsp2_texto.setText("");

                                caja_anuncio_ceduesp.setVisibility(View.VISIBLE);
                                caja_edit_ceduEsp2.setVisibility(View.VISIBLE);
                                ceduEsp2_texto.setText("");

                                caja_agregar_otraEsp.setVisibility(View.GONE);
                                caja_borrar_otraEsp.setVisibility(View.VISIBLE);

                            } else {
                                Toast.makeText(getApplicationContext(), "La cedula profesional es necesario.", Toast.LENGTH_LONG).show();
                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "El ano de obtencion es necesario", Toast.LENGTH_LONG).show();
                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(), ".El instituto es necesario.", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "El nombre de la especialidad es necesario..", Toast.LENGTH_LONG).show();
                }



            }
        });
        guardar_especialidad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_especialidad2 = especialidad2_texto.getText().toString();
                especialidad2.setText(nuevo_especialidad2);
                if (!nuevo_especialidad2.trim().equals("")) {
                    caja_especialidad2.setVisibility(View.GONE);
                    caja_especialidad2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la lic es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_especialidad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_especialidad2.setVisibility(View.VISIBLE);
                caja_especialidad2_final.setVisibility(View.GONE);

            }
        });
        guardar_instEsp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instEsp2 = instEsp2_texto.getText().toString();
                instEsp2.setText(nuevo_instEsp2);
                if (!nuevo_instEsp2.trim().equals("")) {
                    caja_edit_instEsp2.setVisibility(View.GONE);
                    caja_instEsp_final2.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instEsp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instEsp2.setVisibility(View.VISIBLE);
                caja_instEsp_final2.setVisibility(View.GONE);

            }
        });
        guardar_anoEsp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoEsp2 = anoEsp2_texto.getText().toString();
                anoEsp2_vista.setText(nuevo_anoEsp2);
                if (!nuevo_anoEsp2.trim().equals("")) {
                    caja_anoEsp2.setVisibility(View.GONE);
                    caja_anoEsp2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El ano de obtecion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoEsp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoEsp2.setVisibility(View.VISIBLE);
                caja_anoEsp2_final.setVisibility(View.GONE);

            }
        });
        guardar_ceduEsp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_ceduEsp2 = ceduEsp2_texto.getText().toString();
                ceduEsp2.setText(nuevo_ceduEsp2);
                if (!nuevo_ceduEsp2.trim().equals("")) {
                    caja_edit_ceduEsp2.setVisibility(View.GONE);
                    caja_ceduEsp_final2.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La cedula profesional es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_ceduEsp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_ceduEsp2.setVisibility(View.VISIBLE);
                caja_ceduEsp_final2.setVisibility(View.GONE);

            }
        });
        borrar_otraEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_esp.setVisibility(View.GONE);
                caja_especialidad2.setVisibility(View.GONE);
                caja_especialidad2_final.setVisibility(View.GONE);

                caja_anuncio_instEsp.setVisibility(View.GONE);
                caja_edit_instEsp2.setVisibility(View.GONE);
                caja_instEsp_final2.setVisibility(View.GONE);

                caja_anuncio_anoesp.setVisibility(View.GONE);
                caja_anoEsp2.setVisibility(View.GONE);
                caja_anoEsp2_final.setVisibility(View.GONE);

                caja_anuncio_ceduesp.setVisibility(View.GONE);
                caja_edit_ceduEsp2.setVisibility(View.GONE);
                caja_ceduEsp_final2.setVisibility(View.GONE);

                caja_agregar_otraEsp.setVisibility(View.VISIBLE);
                caja_borrar_otraEsp.setVisibility(View.GONE);


            }
        });
        guardar_maes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_maes = maes_texto.getText().toString();
                maes.setText(nuevo_maes);
                if (!nuevo_maes.trim().equals("")) {
                    caja_maes.setVisibility(View.GONE);
                    maes_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la maestria es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_maes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_maes.setVisibility(View.VISIBLE);
                maes_final.setVisibility(View.GONE);

            }
        });
        guardar_instMaes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instMaes = instMaes_texto.getText().toString();
                instMaes.setText(nuevo_instMaes);
                if (!nuevo_instMaes.trim().equals("")) {
                    caja_edit_instMaes.setVisibility(View.GONE);
                    caja_instMaes_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instMaes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instMaes.setVisibility(View.VISIBLE);
                caja_instMaes_final.setVisibility(View.GONE);

            }
        });
        guardar_anoMaes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoMaes = anoMaes_texto.getText().toString();
                anoMaes_vista.setText(nuevo_anoMaes);
                if (!nuevo_anoMaes.trim().equals("")) {
                    caja_anoMaes.setVisibility(View.GONE);
                    caja_anoMaes_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El ano de obtecion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoMaes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoMaes.setVisibility(View.VISIBLE);
                caja_anoMaes_final.setVisibility(View.GONE);

            }
        });
        guardar_ceduMaes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_ceduMaes = ceduMaes_texto.getText().toString();
                ceduMaes.setText(nuevo_ceduMaes);
                if (!nuevo_ceduMaes.trim().equals("")) {
                    caja_edit_ceduMaes.setVisibility(View.GONE);
                    caja_ceduMaes_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La cedula profesional es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_ceduMaes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_ceduMaes.setVisibility(View.VISIBLE);
                caja_ceduMaes_final.setVisibility(View.GONE);

            }
        });
        agregar_otraMaes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nuevo_maes = maes_texto.getText().toString();
                nuevo_instMaes = instMaes_texto.getText().toString();
                nuevo_anoMaes = anoMaes_texto.getText().toString();
                nuevo_ceduMaes = ceduMaes_texto.getText().toString();
                if (!nuevo_maes.trim().equals("")) {
                    if (!nuevo_instMaes.trim().equals("")) {
                        if (!nuevo_anoMaes.trim().equals("")) {
                            if (!nuevo_ceduMaes.trim().equals("")) {

                                caja_anuncio_maes2.setVisibility(View.VISIBLE);
                                caja_maes2.setVisibility(View.VISIBLE);
                                maes2_texto.setText("");

                                caja_anuncio_instMaes2.setVisibility(View.VISIBLE);
                                caja_edit_instMaes2.setVisibility(View.VISIBLE);
                                instMaes2_texto.setText("");

                                caja_anuncio_anoMaes2.setVisibility(View.VISIBLE);
                                caja_anoMaes2.setVisibility(View.VISIBLE);
                                anoMaes2_texto.setText("");

                                caja_anuncio_ceduMaes2.setVisibility(View.VISIBLE);
                                caja_edit_ceduMaes2.setVisibility(View.VISIBLE);
                                ceduMaes2_texto.setText("");


                                caja_agregar_maes.setVisibility(View.GONE);
                                caja_borrar_otraMaes.setVisibility(View.VISIBLE);

                            } else {
                                Toast.makeText(getApplicationContext(), "La cedula profesional es necesario.", Toast.LENGTH_LONG).show();
                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "El ano de obtencion es necesario", Toast.LENGTH_LONG).show();
                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(), ".El instituto es necesario.", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "El nombre de la maestria es necesario..", Toast.LENGTH_LONG).show();
                }


            }
        });
        guardar_maes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_maes2 = maes2_texto.getText().toString();
                maes2.setText(nuevo_maes2);
                if (!nuevo_maes2.trim().equals("")) {
                    caja_maes2.setVisibility(View.GONE);
                    caja_maes2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la lic es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_maes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_maes2.setVisibility(View.VISIBLE);
                caja_maes2_final.setVisibility(View.GONE);

            }
        });
        guardar_instMaes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instMaes2= instMaes2_texto.getText().toString();
                instMaes2.setText(nuevo_instMaes2);
                if (!nuevo_instMaes2.trim().equals("")) {
                    caja_edit_instMaes2.setVisibility(View.GONE);
                    caja_instMaes2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instMaes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instMaes2.setVisibility(View.VISIBLE);
                caja_instMaes2_final.setVisibility(View.GONE);

            }
        });
        guardar_anoMaes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoMaes2 = anoMaes2_texto.getText().toString();
                anoMaes2_vista.setText(nuevo_anoMaes2);
                if (!nuevo_anoMaes2.trim().equals("")) {
                    caja_anoMaes2.setVisibility(View.GONE);
                    caja_anoMaes2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El ano de obtecion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoMaes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoMaes2.setVisibility(View.VISIBLE);
                caja_anoMaes2_final.setVisibility(View.GONE);

            }
        });
        guardar_ceduMaes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_ceduMaes2 = ceduMaes2_texto.getText().toString();
                ceduMaes2.setText(nuevo_ceduMaes2);
                if (!nuevo_ceduMaes2.trim().equals("")) {
                    caja_edit_ceduMaes2.setVisibility(View.GONE);
                    caja_ceduMaes2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La cedula profesional es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_ceduMaes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_ceduMaes2.setVisibility(View.VISIBLE);
                caja_ceduMaes2_final.setVisibility(View.GONE);

            }
        });
        borrar_otraMaes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_maes2.setVisibility(View.GONE);
                caja_maes2.setVisibility(View.GONE);
                caja_maes2_final.setVisibility(View.GONE);

                caja_anuncio_instMaes2.setVisibility(View.GONE);
                caja_edit_instMaes2.setVisibility(View.GONE);
                caja_instMaes2_final.setVisibility(View.GONE);

                caja_anuncio_anoMaes2.setVisibility(View.GONE);
                caja_anoMaes2.setVisibility(View.GONE);
                caja_anoMaes2_final.setVisibility(View.GONE);

                caja_anuncio_ceduMaes2.setVisibility(View.GONE);
                caja_edit_ceduMaes2.setVisibility(View.GONE);
                caja_ceduMaes2_final.setVisibility(View.GONE);

                caja_agregar_maes.setVisibility(View.VISIBLE);
                caja_borrar_otraMaes.setVisibility(View.GONE);


            }
        });
        guardar_doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_doc = doc_texto.getText().toString();
                doc.setText(nuevo_doc);
                if (!nuevo_doc.trim().equals("")) {
                    caja_doc.setVisibility(View.GONE);
                    doc_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la maestria es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_doc.setVisibility(View.VISIBLE);
                doc_final.setVisibility(View.GONE);

            }
        });
        guardar_instDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instDoc= instDoc_texto.getText().toString();
                instDoc.setText(nuevo_instDoc);
                if (!nuevo_instDoc.trim().equals("")) {
                    caja_edit_instDoc.setVisibility(View.GONE);
                    caja_instDoc_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instDoc.setVisibility(View.VISIBLE);
                caja_instDoc_final.setVisibility(View.GONE);

            }
        });
        guardar_anoDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoDoc = anoDoc_texto.getText().toString();
                anoDoc_vista.setText(nuevo_anoDoc);
                if (!nuevo_anoDoc.trim().equals("")) {
                    caja_anoDoc.setVisibility(View.GONE);
                    caja_anoDoc_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El ano de obtecion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoDoc.setVisibility(View.VISIBLE);
                caja_anoDoc_final.setVisibility(View.GONE);

            }
        });
        guardar_ceduDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_ceduDoc = ceduDoc_texto.getText().toString();
                ceduDoc.setText(nuevo_ceduDoc);
                if (!nuevo_ceduDoc.trim().equals("")) {
                    caja_edit_ceduDoc.setVisibility(View.GONE);
                    caja_ceduDoc_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La cedula profesional es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_ceduDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_ceduDoc.setVisibility(View.VISIBLE);
                caja_ceduDoc_final.setVisibility(View.GONE);

            }
        });
        agregar_otraDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nuevo_doc = doc_texto.getText().toString();
                nuevo_instDoc= instDoc_texto.getText().toString();
                nuevo_anoDoc = anoDoc_texto.getText().toString();
                nuevo_ceduDoc = ceduDoc_texto.getText().toString();
                if (!nuevo_doc.trim().equals("")) {
                    if (!nuevo_instDoc.trim().equals("")) {
                        if (!nuevo_anoDoc.trim().equals("")) {
                            if (!nuevo_ceduDoc.trim().equals("")) {

                                caja_anuncio_doc2.setVisibility(View.VISIBLE);
                                caja_doc2.setVisibility(View.VISIBLE);
                                doc2_texto.setText("");

                                caja_anuncio_instdoc2.setVisibility(View.VISIBLE);
                                caja_edit_instdoc2.setVisibility(View.VISIBLE);
                                instdoc2_texto.setText("");

                                caja_anuncio_anodoc2.setVisibility(View.VISIBLE);
                                caja_anoDoc2.setVisibility(View.VISIBLE);
                                anoDoc2_texto.setText("");

                                caja_anuncio_ceduDoc2.setVisibility(View.VISIBLE);
                                caja_edit_ceduDoc2.setVisibility(View.VISIBLE);
                                ceduDoc2_texto.setText("");


                                caja_agregar_doc.setVisibility(View.GONE);
                                caja_borrar_doc.setVisibility(View.VISIBLE);

                            } else {
                                Toast.makeText(getApplicationContext(), "La cedula profesional es necesario.", Toast.LENGTH_LONG).show();
                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "El ano de obtencion es necesario", Toast.LENGTH_LONG).show();
                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(), ".El instituto es necesario.", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "El nombre de la maestria es necesario..", Toast.LENGTH_LONG).show();
                }

            }
        });
        guardar_doc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_doc2 = doc2_texto.getText().toString();
                doc2.setText(nuevo_doc2);
                if (!nuevo_doc2.trim().equals("")) {
                    caja_doc2.setVisibility(View.GONE);
                    doc2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la lic es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_doc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_doc2.setVisibility(View.VISIBLE);
                doc2_final.setVisibility(View.GONE);

            }
        });
        guardar_instdoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instdoc2= instdoc2_texto.getText().toString();
                instdoc2.setText(nuevo_instdoc2);
                if (!nuevo_instdoc2.trim().equals("")) {
                    caja_edit_instdoc2.setVisibility(View.GONE);
                    caja_instdoc2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instdoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instdoc2.setVisibility(View.VISIBLE);
                caja_instdoc2_final.setVisibility(View.GONE);

            }
        });
        guardar_anoDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoDoc2 = anoDoc2_texto.getText().toString();
                anoDoc2_vista.setText(nuevo_anoDoc2);
                if (!nuevo_anoDoc2.trim().equals("")) {
                    caja_anoDoc2.setVisibility(View.GONE);
                    caja_anoDoc2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El ano de obtecion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoDoc2.setVisibility(View.VISIBLE);
                caja_anoDoc2_final.setVisibility(View.GONE);

            }
        });
        guardar_ceduDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_ceduDoc2 = ceduDoc2_texto.getText().toString();
                ceduDoc2.setText(nuevo_ceduDoc2);
                if (!nuevo_ceduDoc2.trim().equals("")) {
                    caja_edit_ceduDoc2.setVisibility(View.GONE);
                    caja_ceduDoc2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La cedula profesional es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_ceduDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_ceduDoc2.setVisibility(View.VISIBLE);
                caja_ceduDoc2_final.setVisibility(View.GONE);

            }
        });
        borrar_otraDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_doc2.setVisibility(View.GONE);
                caja_doc2.setVisibility(View.GONE);
                doc2_final.setVisibility(View.GONE);

                caja_anuncio_instdoc2.setVisibility(View.GONE);
                caja_edit_instdoc2.setVisibility(View.GONE);
                caja_instdoc2_final.setVisibility(View.GONE);

                caja_anuncio_anodoc2.setVisibility(View.GONE);
                caja_anoDoc2.setVisibility(View.GONE);
                caja_anoDoc2_final.setVisibility(View.GONE);

                caja_anuncio_ceduDoc2.setVisibility(View.GONE);
                caja_edit_ceduDoc2.setVisibility(View.GONE);
                caja_ceduDoc2_final.setVisibility(View.GONE);

                caja_agregar_doc.setVisibility(View.VISIBLE);
                caja_borrar_doc.setVisibility(View.GONE);


            }
        });

    }
}