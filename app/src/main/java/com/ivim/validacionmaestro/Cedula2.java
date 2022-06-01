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
            formulario_actuaDisci,formulario_gestioAcademica,formulario_productosAcademicos,formulario_expProfeNoAcade,
            formulario_expDiseñoIng,formulario_logrosProfeNoAca,formulario_partColeCam,formulario_premDist,formulario_aportacionPe;

    private LinearLayout caja_edit_numProfesor,caja_numProfesor_final,caja_edit_apellido1,
            caja_apellido1_final,caja_edit_apellido2,caja_apellido2_final,
            caja_fecha_de_nacimiento,caja_fecha_de_nacimiento_final,caja_edad,caja_nombramiento_actual,
            caja_nombramiento_actual_final,caja_edit_antiguedad,caja_antiguedad_final,caja_siguiente_scroll,caja_siguiente_scroll2,caja_siguiente_scroll3,caja_agregar_otraLic,caja_cedulaProf2_final,
            caja_edit_cedulaProf2,caja_anoObtencion2_final,caja_edit_instPais2,caja_licenciatura2_final,
            caja_edit_licenciatura2,caja_siguiente_scroll4,caja_siguiente_scroll5,caja_siguiente_scroll6,caja_siguiente_scroll7,caja_siguiente_scroll8,caja_siguiente_scroll9,caja_siguiente_scroll10,
            caja_siguiente_scroll11,caja_anuncio_ced,caja_edit_anoObtencion2,caja_anuncio_ano,caja_anuncio_inst,caja_anuncio_lic,caja_borrar_otraLic,caja_borrar_otraEsp,caja_agregar_otraEsp,caja_edit_ceduEsp2,
            caja_anuncio_ceduesp,caja_anoEsp2,caja_anuncio_anoesp,caja_edit_instEsp2,caja_anuncio_instEsp,caja_especialidad2,caja_anuncio_esp,caja_borrar_otraMaes,caja_agregar_maes,caja_edit_ceduMaes2,
            caja_anuncio_ceduMaes2,caja_anoMaes2,caja_anuncio_anoMaes2,caja_edit_instMaes2,caja_anuncio_instMaes2,caja_maes2,caja_anuncio_maes2,caja_borrar_doc,caja_agregar_doc,caja_edit_ceduDoc2,
            caja_anuncio_ceduDoc2,caja_anoDoc2,caja_anuncio_anodoc2,caja_edit_instdoc2,caja_anuncio_instdoc2,caja_doc2,caja_anuncio_doc2,caja_borrar_otraCapa,caja_agregar_otraCapa,caja_edit_horaCapa2,
            caja_anuncio_horaCapa2,caja_edit_anoCapa2,caja_anuncio_anoCapa2,caja_edit_intCapa2,caja_anuncio_instActua2,caja_edit_capa2,caja_anuncio_capa2,caja_borrar_otraCapa2,caja_edit_horaCapa3,
            caja_anuncio_horaCapa3,caja_anoCapa3,caja_anuncio_anoCapa3,caja_edit_instcapa3,
            caja_anuncio_instcapa3,caja_capa3,caja_anuncio_capa3,caja_borrar_otraCapa3,caja_edit_horaCapa4
            ,caja_anuncio_horaCapa4,caja_anoCapa4,caja_anuncio_anoCapa4,caja_edit_instcapa4,caja_anuncio_instcapa4
            ,caja_capa4,caja_anuncio_capa4,caja_borrar_otraActua,caja_agregar_otraActua,caja_edit_horaActua2,
            caja_anuncio_horaActua2,caja_edit_anoActua2,caja_anuncio_anoActua2,caja_edit_instPaisActua2,
            caja_anuncio_actuaInts2,caja_edit_actua2,caja_anuncio_tipoActua2,caja_agregar_otraactua3
            ,caja_edit_horaactua3,caja_anuncio_horaactua3,caja_anoactua3,caja_anuncio_anoactua3,caja_edit_intactua3,
            caja_anuncio_instActua3,caja_actua3,caja_anuncio_actua3;

    private EditText numProfesor,apellido1_texto,apellido2_texto,fecha_de_nacimiento_texto,
            nombramiento_actual_texto,antiguedad_texto;
    private ImageView guardar_numProfesor,cambiar_numProfesor,guardar_apellido1,cambiar_apellido2,
            cambiar_fecha_de_nacimiento,guardar_fecha_de_nacimiento,
            cambiar_apellido1,guardar_apellido2,cambiar_nombramiento_actual,
            guardar_nombramiento_actual,guardar_antiguedad,cambiar_antiguedad,guardar_cedulaProf2,cambiar_cedulaProf2;
    private TextView numProfesor_final,apellido1,apellido2,edad,nombramiento_actual_vista,
            antiguedad,fecha_de_nacimiento,ir_formAcademica,ir_capDocente,regresar_datosBasic,ir_actuaDisciplinar,
            regresar_datos_formDocente,regresar_datos_actuaDocente,ir_getsionActualizacion,agregar_otraLic,borrar_otraLic,cedulaProf2,
            regresar_actualizacionDisc,ir_productosAca,ir_getsionAcademica,regresar_gestionAcademica,ir_expeProfe,regresar_produAca,
            ir_expeDiseInge,regresar_expProfe,ir_logProfe,regresar_ExpDise,ir_partColeCam,regresar_logProfe,ir_premios,regresar_partColeCam,ir_aportaRele,
            finalizar_formulario,regresar_preDist,borrar_otraEsp,agregar_otraEsp,agregar_otraMaes,borrar_otraMaes,agregar_otraDoc,borrar_otraDoc,borrar_otraCapa,
            agregar_otraCapa,agregar_otraOtracapa2,borrar_otraCapa2,agregar_otraOtracapa3,borrar_otraCapa3
            ,agregar_otraActua,borrar_otraActua,agregar_otraActua2,borrar_otraactua3,agregar_otraactua3;


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
        caja_edit_cedulaProf2 = findViewById(R.id.caja_edit_cedulaProf2);
        caja_anuncio_ced = findViewById(R.id.caja_anuncio_ced);
        caja_edit_anoObtencion2 = findViewById(R.id.caja_edit_anoObtencion2);
        caja_anuncio_ano = findViewById(R.id.caja_anuncio_ano);
        caja_edit_instPais2 = findViewById(R.id.caja_edit_instPais2);
        caja_anuncio_inst = findViewById(R.id.caja_anuncio_inst);
        caja_edit_licenciatura2 = findViewById(R.id.caja_edit_licenciatura2);
        caja_anuncio_lic = findViewById(R.id.caja_anuncio_lic);
        borrar_otraLic = findViewById(R.id.borrar_otraLic);
        caja_borrar_otraLic = findViewById(R.id.caja_borrar_otraLic);


        guardar_cedulaProf2 = findViewById(R.id.guardar_cedulaProf2);
        caja_cedulaProf2_final = findViewById(R.id.caja_cedulaProf2_final);
        cedulaProf2 = findViewById(R.id.cedulaProf2);
        cambiar_cedulaProf2 = findViewById(R.id.cambiar_cedulaProf2);

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


        caja_anuncio_capa2 = findViewById(R.id.caja_anuncio_capa2);
        caja_edit_capa2 = findViewById(R.id.caja_edit_capa2);
        caja_anuncio_instActua2 = findViewById(R.id.caja_anuncio_instActua2);
        caja_edit_intCapa2 = findViewById(R.id.caja_edit_intCapa2);
        caja_anuncio_anoCapa2 = findViewById(R.id.caja_anuncio_anoCapa2);
        caja_edit_anoCapa2 = findViewById(R.id.caja_edit_anoCapa2);
        caja_anuncio_horaCapa2 = findViewById(R.id.caja_anuncio_horaCapa2);
        caja_edit_horaCapa2 = findViewById(R.id.caja_edit_horaCapa2);
        caja_agregar_otraCapa = findViewById(R.id.caja_agregar_otraCapa);
        agregar_otraCapa = findViewById(R.id.agregar_otraCapa);
        caja_borrar_otraCapa = findViewById(R.id.caja_borrar_otraCapa);
        borrar_otraCapa = findViewById(R.id.borrar_otraCapa);


        agregar_otraOtracapa2 = findViewById(R.id.agregar_otraOtracapa2);

        caja_anuncio_capa3 = findViewById(R.id.caja_anuncio_capa3);
        caja_capa3 = findViewById(R.id.caja_capa3);
        caja_anuncio_instcapa3 = findViewById(R.id.caja_anuncio_instcapa3);
        caja_edit_instcapa3 = findViewById(R.id.caja_edit_instcapa3);
        caja_anuncio_anoCapa3 = findViewById(R.id.caja_anuncio_anoCapa3);
        caja_anoCapa3 = findViewById(R.id.caja_anoCapa3);
        caja_anuncio_horaCapa3 = findViewById(R.id.caja_anuncio_horaCapa3);
        caja_edit_horaCapa3 = findViewById(R.id.caja_edit_horaCapa3);

        agregar_otraOtracapa2 = findViewById(R.id.agregar_otraOtracapa2);
        caja_borrar_otraCapa2 = findViewById(R.id.caja_borrar_otraCapa2);
        borrar_otraCapa2 = findViewById(R.id.borrar_otraCapa2);
        agregar_otraOtracapa3 = findViewById(R.id.agregar_otraOtracapa3);

        caja_anuncio_capa4 = findViewById(R.id.caja_anuncio_capa4);
        caja_capa4 = findViewById(R.id.caja_capa4);
        caja_anuncio_instcapa4 = findViewById(R.id.caja_anuncio_instcapa4);
        caja_edit_instcapa4 = findViewById(R.id.caja_edit_instcapa4);
        caja_anuncio_anoCapa4 = findViewById(R.id.caja_anuncio_anoCapa4);
        caja_anoCapa4 = findViewById(R.id.caja_anoCapa4);
        caja_anuncio_horaCapa4 = findViewById(R.id.caja_anuncio_horaCapa4);
        caja_edit_horaCapa4 = findViewById(R.id.caja_edit_horaCapa4);
        caja_borrar_otraCapa3 = findViewById(R.id.caja_borrar_otraCapa3);
        borrar_otraCapa3 = findViewById(R.id.borrar_otraCapa3);



        caja_siguiente_scroll = findViewById(R.id.caja_siguiente_scroll);
        regresar_datosBasic = findViewById(R.id.regresar_datosBasic);
        ir_capDocente = findViewById(R.id.ir_capDocente);

        caja_anuncio_tipoActua2 = findViewById(R.id.caja_anuncio_tipoActua2);
        caja_edit_actua2 = findViewById(R.id.caja_edit_actua2);
        caja_anuncio_actuaInts2 = findViewById(R.id.caja_anuncio_actuaInts2);
        caja_edit_instPaisActua2 = findViewById(R.id.caja_edit_instPaisActua2);
        caja_anuncio_anoActua2 = findViewById(R.id.caja_anuncio_anoActua2);
        caja_edit_anoActua2 = findViewById(R.id.caja_edit_anoActua2);
        caja_anuncio_horaActua2 = findViewById(R.id.caja_anuncio_horaActua2);
        caja_edit_horaActua2 = findViewById(R.id.caja_edit_horaActua2);
        caja_agregar_otraActua = findViewById(R.id.caja_agregar_otraActua);
        agregar_otraActua = findViewById(R.id.agregar_otraActua);
        caja_borrar_otraActua = findViewById(R.id.caja_borrar_otraActua);
        borrar_otraActua = findViewById(R.id.borrar_otraActua);
        agregar_otraActua2 = findViewById(R.id.agregar_otraActua2);
        caja_anuncio_actua3 = findViewById(R.id.caja_anuncio_actua3);
        caja_actua3 = findViewById(R.id.caja_actua3);
        caja_anuncio_instActua3 = findViewById(R.id.caja_anuncio_instActua3);
        caja_edit_intactua3 = findViewById(R.id.caja_edit_intactua3);
        caja_anuncio_anoactua3 = findViewById(R.id.caja_anuncio_anoactua3);
        caja_anoactua3 = findViewById(R.id.caja_anoactua3);
        caja_anuncio_horaactua3 = findViewById(R.id.caja_anuncio_horaactua3);
        caja_edit_horaactua3 = findViewById(R.id.caja_edit_horaactua3);
        caja_agregar_otraactua3 = findViewById(R.id.caja_agregar_otraactua3);
        agregar_otraactua3 = findViewById(R.id.agregar_otraactua3);
        borrar_otraactua3 = findViewById(R.id.borrar_otraactua3);

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

        formulario_expProfeNoAcade = findViewById(R.id.formulario_expProfeNoAcade);
        caja_siguiente_scroll6 = findViewById(R.id.caja_siguiente_scroll6);
        regresar_produAca = findViewById(R.id.regresar_produAca);
        ir_expeDiseInge = findViewById(R.id.ir_expeDiseInge);


        formulario_expDiseñoIng = findViewById(R.id.formulario_expDiseñoIng);
        caja_siguiente_scroll7 = findViewById(R.id.caja_siguiente_scroll7);
        regresar_expProfe = findViewById(R.id.regresar_expProfe);
        ir_logProfe = findViewById(R.id.ir_logProfe);


        formulario_logrosProfeNoAca = findViewById(R.id.formulario_logrosProfeNoAca);
        caja_siguiente_scroll8 = findViewById(R.id.caja_siguiente_scroll8);
        regresar_ExpDise = findViewById(R.id.regresar_ExpDise);
        ir_partColeCam = findViewById(R.id.ir_partColeCam);

        formulario_partColeCam = findViewById(R.id.formulario_partColeCam);
        caja_siguiente_scroll9 = findViewById(R.id.caja_siguiente_scroll9);
        regresar_logProfe = findViewById(R.id.regresar_logProfe);
        ir_premios = findViewById(R.id.ir_premios);

        formulario_premDist = findViewById(R.id.formulario_premDist);
        caja_siguiente_scroll10 = findViewById(R.id.caja_siguiente_scroll10);
        regresar_partColeCam = findViewById(R.id.regresar_partColeCam);
        ir_aportaRele = findViewById(R.id.ir_aportaRele);

        formulario_aportacionPe = findViewById(R.id.formulario_aportacionPe);
        caja_siguiente_scroll11 = findViewById(R.id.caja_siguiente_scroll10);
        regresar_preDist = findViewById(R.id.regresar_preDist);
        finalizar_formulario = findViewById(R.id.finalizar_formulario);




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
                caja_anuncio_lic.setVisibility(View.VISIBLE);
                caja_edit_licenciatura2.setVisibility(View.VISIBLE);

                caja_anuncio_inst.setVisibility(View.VISIBLE);
                caja_edit_instPais2.setVisibility(View.VISIBLE);

                caja_anuncio_ano.setVisibility(View.VISIBLE);
                caja_edit_anoObtencion2.setVisibility(View.VISIBLE);

                caja_edit_cedulaProf2.setVisibility(View.VISIBLE);
                caja_anuncio_ced.setVisibility(View.VISIBLE);

                caja_agregar_otraLic.setVisibility(View.GONE);
                caja_borrar_otraLic.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraLic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_lic.setVisibility(View.GONE);
                caja_edit_licenciatura2.setVisibility(View.GONE);

                caja_anuncio_inst.setVisibility(View.GONE);
                caja_edit_instPais2.setVisibility(View.GONE);

                caja_anuncio_ano.setVisibility(View.GONE);
                caja_edit_anoObtencion2.setVisibility(View.GONE);

                caja_edit_cedulaProf2.setVisibility(View.GONE);
                caja_anuncio_ced.setVisibility(View.GONE);

                caja_agregar_otraLic.setVisibility(View.VISIBLE);
                caja_borrar_otraLic.setVisibility(View.GONE);



            }
        });
        agregar_otraEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_esp.setVisibility(View.VISIBLE);
                caja_especialidad2.setVisibility(View.VISIBLE);

                caja_anuncio_instEsp.setVisibility(View.VISIBLE);
                caja_edit_instEsp2.setVisibility(View.VISIBLE);

                caja_anuncio_anoesp.setVisibility(View.VISIBLE);
                caja_anoEsp2.setVisibility(View.VISIBLE);

                caja_anuncio_ceduesp.setVisibility(View.VISIBLE);
                caja_edit_ceduEsp2.setVisibility(View.VISIBLE);

                caja_agregar_otraEsp.setVisibility(View.GONE);
                caja_borrar_otraEsp.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_esp.setVisibility(View.GONE);
                caja_especialidad2.setVisibility(View.GONE);

                caja_anuncio_instEsp.setVisibility(View.GONE);
                caja_edit_instEsp2.setVisibility(View.GONE);

                caja_anuncio_anoesp.setVisibility(View.GONE);
                caja_anoEsp2.setVisibility(View.GONE);

                caja_anuncio_ceduesp.setVisibility(View.GONE);
                caja_edit_ceduEsp2.setVisibility(View.GONE);

                caja_agregar_otraEsp.setVisibility(View.VISIBLE);
                caja_borrar_otraEsp.setVisibility(View.GONE);


            }
        });
        agregar_otraMaes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_maes2.setVisibility(View.VISIBLE);
                caja_maes2.setVisibility(View.VISIBLE);

                caja_anuncio_instMaes2.setVisibility(View.VISIBLE);
                caja_edit_instMaes2.setVisibility(View.VISIBLE);

                caja_anuncio_anoMaes2.setVisibility(View.VISIBLE);
                caja_anoMaes2.setVisibility(View.VISIBLE);

                caja_anuncio_ceduMaes2.setVisibility(View.VISIBLE);
                caja_edit_ceduMaes2.setVisibility(View.VISIBLE);

                caja_agregar_maes.setVisibility(View.GONE);
                caja_borrar_otraMaes.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraMaes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_maes2.setVisibility(View.GONE);
                caja_maes2.setVisibility(View.GONE);

                caja_anuncio_instMaes2.setVisibility(View.GONE);
                caja_edit_instMaes2.setVisibility(View.GONE);

                caja_anuncio_anoMaes2.setVisibility(View.GONE);
                caja_anoMaes2.setVisibility(View.GONE);

                caja_anuncio_ceduMaes2.setVisibility(View.GONE);
                caja_edit_ceduMaes2.setVisibility(View.GONE);

                caja_agregar_maes.setVisibility(View.VISIBLE);
                caja_borrar_otraMaes.setVisibility(View.GONE);


            }
        });
        agregar_otraDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_doc2.setVisibility(View.VISIBLE);
                caja_doc2.setVisibility(View.VISIBLE);

                caja_anuncio_instdoc2.setVisibility(View.VISIBLE);
                caja_edit_instdoc2.setVisibility(View.VISIBLE);

                caja_anuncio_anodoc2.setVisibility(View.VISIBLE);
                caja_anoDoc2.setVisibility(View.VISIBLE);

                caja_anuncio_ceduDoc2.setVisibility(View.VISIBLE);
                caja_edit_ceduDoc2.setVisibility(View.VISIBLE);

                caja_agregar_doc.setVisibility(View.GONE);
                caja_borrar_doc.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_doc2.setVisibility(View.GONE);
                caja_doc2.setVisibility(View.GONE);

                caja_anuncio_instdoc2.setVisibility(View.GONE);
                caja_edit_instdoc2.setVisibility(View.GONE);

                caja_anuncio_anodoc2.setVisibility(View.GONE);
                caja_anoDoc2.setVisibility(View.GONE);

                caja_anuncio_ceduDoc2.setVisibility(View.GONE);
                caja_edit_ceduDoc2.setVisibility(View.GONE);

                caja_agregar_doc.setVisibility(View.VISIBLE);
                caja_borrar_doc.setVisibility(View.GONE);


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
        agregar_otraCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa2.setVisibility(View.VISIBLE);
                caja_edit_capa2.setVisibility(View.VISIBLE);

                caja_anuncio_instActua2.setVisibility(View.VISIBLE);
                caja_edit_intCapa2.setVisibility(View.VISIBLE);

                caja_anuncio_anoCapa2.setVisibility(View.VISIBLE);
                caja_edit_anoCapa2.setVisibility(View.VISIBLE);

                caja_anuncio_horaCapa2.setVisibility(View.VISIBLE);
                caja_edit_horaCapa2.setVisibility(View.VISIBLE);

                caja_agregar_otraCapa.setVisibility(View.GONE);
                caja_borrar_otraCapa.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa2.setVisibility(View.GONE);
                caja_edit_capa2.setVisibility(View.GONE);

                caja_anuncio_instActua2.setVisibility(View.GONE);
                caja_edit_intCapa2.setVisibility(View.GONE);

                caja_anuncio_anoCapa2.setVisibility(View.GONE);
                caja_edit_anoCapa2.setVisibility(View.GONE);

                caja_anuncio_horaCapa2.setVisibility(View.GONE);
                caja_edit_horaCapa2.setVisibility(View.GONE);

                caja_agregar_otraCapa.setVisibility(View.VISIBLE);
                caja_borrar_otraCapa.setVisibility(View.GONE);


            }
        });
        agregar_otraOtracapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa3.setVisibility(View.VISIBLE);
                caja_capa3.setVisibility(View.VISIBLE);

                caja_anuncio_instcapa3.setVisibility(View.VISIBLE);
                caja_edit_instcapa3.setVisibility(View.VISIBLE);

                caja_anuncio_anoCapa3.setVisibility(View.VISIBLE);
                caja_anoCapa3.setVisibility(View.VISIBLE);

                caja_anuncio_horaCapa3.setVisibility(View.VISIBLE);
                caja_edit_horaCapa3.setVisibility(View.VISIBLE);

                caja_borrar_otraCapa.setVisibility(View.GONE);
                caja_borrar_otraCapa2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraCapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa3.setVisibility(View.GONE);
                caja_capa3.setVisibility(View.GONE);

                caja_anuncio_instcapa3.setVisibility(View.GONE);
                caja_edit_instcapa3.setVisibility(View.GONE);

                caja_anuncio_anoCapa3.setVisibility(View.GONE);
                caja_anoCapa3.setVisibility(View.GONE);

                caja_anuncio_horaCapa3.setVisibility(View.GONE);
                caja_edit_horaCapa3.setVisibility(View.GONE);

                caja_borrar_otraCapa.setVisibility(View.VISIBLE);
                caja_borrar_otraCapa2.setVisibility(View.GONE);


            }
        });
        agregar_otraOtracapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa4.setVisibility(View.VISIBLE);
                caja_capa4.setVisibility(View.VISIBLE);

                caja_anuncio_instcapa4.setVisibility(View.VISIBLE);
                caja_edit_instcapa4.setVisibility(View.VISIBLE);

                caja_anuncio_anoCapa4.setVisibility(View.VISIBLE);
                caja_anoCapa4.setVisibility(View.VISIBLE);

                caja_anuncio_horaCapa4.setVisibility(View.VISIBLE);
                caja_edit_horaCapa4.setVisibility(View.VISIBLE);

                caja_borrar_otraCapa2.setVisibility(View.GONE);
                caja_borrar_otraCapa3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraCapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa4.setVisibility(View.GONE);
                caja_capa4.setVisibility(View.GONE);

                caja_anuncio_instcapa4.setVisibility(View.GONE);
                caja_edit_instcapa4.setVisibility(View.GONE);

                caja_anuncio_anoCapa4.setVisibility(View.GONE);
                caja_anoCapa4.setVisibility(View.GONE);

                caja_anuncio_horaCapa4.setVisibility(View.GONE);
                caja_edit_horaCapa4.setVisibility(View.GONE);

                caja_borrar_otraCapa2.setVisibility(View.VISIBLE);
                caja_borrar_otraCapa3.setVisibility(View.GONE);


            }
        });
        ir_actuaDisciplinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_formaCapaDocente.setVisibility(View.GONE);
               formulario_actuaDisci.setVisibility(View.VISIBLE);


            }
        });
        agregar_otraActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_tipoActua2.setVisibility(View.VISIBLE);
                caja_edit_actua2.setVisibility(View.VISIBLE);

                caja_anuncio_actuaInts2.setVisibility(View.VISIBLE);
                caja_edit_instPaisActua2.setVisibility(View.VISIBLE);

                caja_anuncio_anoActua2.setVisibility(View.VISIBLE);
                caja_edit_anoActua2.setVisibility(View.VISIBLE);

                caja_anuncio_horaActua2.setVisibility(View.VISIBLE);
                caja_edit_horaActua2.setVisibility(View.VISIBLE);

                caja_agregar_otraActua.setVisibility(View.GONE);
                caja_borrar_otraActua.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_tipoActua2.setVisibility(View.GONE);
                caja_edit_actua2.setVisibility(View.GONE);

                caja_anuncio_actuaInts2.setVisibility(View.GONE);
                caja_edit_instPaisActua2.setVisibility(View.GONE);

                caja_anuncio_anoActua2.setVisibility(View.GONE);
                caja_edit_anoActua2.setVisibility(View.GONE);

                caja_anuncio_horaActua2.setVisibility(View.GONE);
                caja_edit_horaActua2.setVisibility(View.GONE);

                caja_agregar_otraActua.setVisibility(View.VISIBLE);
                caja_borrar_otraActua.setVisibility(View.GONE);


            }
        });
        agregar_otraActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actua3.setVisibility(View.VISIBLE);
                caja_actua3.setVisibility(View.VISIBLE);

                caja_anuncio_instActua3.setVisibility(View.VISIBLE);
                caja_edit_intactua3.setVisibility(View.VISIBLE);

                caja_anuncio_anoactua3.setVisibility(View.VISIBLE);
                caja_anoactua3.setVisibility(View.VISIBLE);

                caja_anuncio_horaactua3.setVisibility(View.VISIBLE);
                caja_edit_horaactua3.setVisibility(View.VISIBLE);

                caja_borrar_otraActua.setVisibility(View.GONE);
                caja_agregar_otraactua3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actua3.setVisibility(View.GONE);
                caja_actua3.setVisibility(View.GONE);

                caja_anuncio_instActua3.setVisibility(View.GONE);
                caja_edit_intactua3.setVisibility(View.GONE);

                caja_anuncio_anoactua3.setVisibility(View.GONE);
                caja_anoactua3.setVisibility(View.GONE);

                caja_anuncio_horaactua3.setVisibility(View.GONE);
                caja_edit_horaactua3.setVisibility(View.GONE);

                caja_borrar_otraActua.setVisibility(View.VISIBLE);
                caja_agregar_otraactua3.setVisibility(View.GONE);


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
        ir_expeProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulario_expProfeNoAcade.setVisibility(View.VISIBLE);
                formulario_productosAcademicos.setVisibility(View.GONE);
            }
        });
        regresar_produAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulario_productosAcademicos.setVisibility(View.VISIBLE);
                formulario_expProfeNoAcade.setVisibility(View.GONE);
            }
        });
        ir_expeDiseInge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_expProfeNoAcade.setVisibility(View.GONE);
                formulario_expDiseñoIng.setVisibility(View.VISIBLE);
            }
        });
        regresar_expProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_expDiseñoIng.setVisibility(View.GONE);
                formulario_expProfeNoAcade.setVisibility(View.VISIBLE);
            }
        });

        ir_logProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_logrosProfeNoAca.setVisibility(View.VISIBLE);
                formulario_expDiseñoIng.setVisibility(View.GONE);
            }
        });
        regresar_ExpDise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_expDiseñoIng.setVisibility(View.VISIBLE);
                formulario_logrosProfeNoAca.setVisibility(View.GONE);
            }
        });
        ir_partColeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_logrosProfeNoAca.setVisibility(View.GONE);
                formulario_partColeCam.setVisibility(View.VISIBLE);
            }
        });
        regresar_logProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_partColeCam.setVisibility(View.GONE);
                formulario_logrosProfeNoAca.setVisibility(View.VISIBLE);
            }
        });
        ir_premios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_partColeCam.setVisibility(View.GONE);
                formulario_premDist.setVisibility(View.VISIBLE);
            }
        });
        regresar_partColeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_premDist.setVisibility(View.GONE);
                formulario_partColeCam.setVisibility(View.VISIBLE);
            }
        });

        ir_aportaRele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_premDist.setVisibility(View.GONE);
                formulario_aportacionPe.setVisibility(View.VISIBLE);
            }
        });
        regresar_preDist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_aportacionPe.setVisibility(View.GONE);
                formulario_premDist.setVisibility(View.VISIBLE);
            }
        });

    }
}