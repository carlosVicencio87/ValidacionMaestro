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
import android.widget.Toast;

public class Cedula2 extends AppCompatActivity {

    private ScrollView formulario_datosBasicos,formulario_formaDocente,formulario_formaCapaDocente,
            formulario_actuaDisci,formulario_gestioAcademica,formulario_productosAcademicos,formulario_expProfeNoAcade,
            formulario_expDiseñoIng,formulario_logrosProfeNoAca,formulario_partColeCam,formulario_premDist,
            formulario_aportacionPe;

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
            caja_anuncio_instActua3,caja_actua3,caja_anuncio_actua3,caja_anuncio_actua4,caja_actua4,caja_anuncio_instactua4,
            caja_edit_instactua4,caja_anuncio_anoactua4,caja_anuncio_horasactua4,caja_edit_horaactua4,caja_borrar_otraactua4,
            caja_anoactua4,caja_borrar_otraGesAca4,caja_agregar_otraGesAca3,caja_edit_tiemGesAcaA4,caja_anuncio_tiemGesAcaA4,caja_edit_intGesAca4,
            caja_agregar_otraGesAca2,caja_edit_tiemGesAcaA3,caja_anuncio_tiemGesAcaA3,caja_tiemGesAca3,caja_anuncio_tiemGesAca3,caja_edit_intGesAca3,caja_anuncio_intGesAca3,caja_actiPues3,
            caja_anuncio_actiPues3,caja_agregar_otraGesAca,caja_edit_tiemGesAcaA2,caja_anuncio_tiemGesAcaA2,caja_anuncio_tiemGesAca2,caja_edit_intGesAca2,caja_anuncio_intGesAca2,
            caja_edit_actiPues2,caja_anuncio_actiPues2,caja_edit_tiemGesAca2,caja_tiemGesAca4,caja_anuncio_tiemGesAca4,
            caja_anuncio_intGesAca4,caja_actiPues4,caja_anuncio_actiPues4,caja_borrar_otraExpProfe3,caja_agregar_otraExpProfe3,
            caja_anuncio_tiemProfeA4,caja_tiemProfe4,caja_anuncio_tiemProfe4,caja_edit_OrgaEmp4,
            caja_anuncio_OrgaEmp4,caja_actiPuesProfe4,caja_anuncio_actiPuesProfe4,caja_edit_tiemProfeA4,
            caja_agregar_otraExpProfe2,caja_edit_tiemProfeA3,caja_anuncio_tiemProfeA3,caja_tiemProfe3,
            caja_anuncio_tiemProfe3,caja_edit_OrgaEmp3,caja_anuncio_OrgaEmp3,caja_actiPuesProfe3,
            caja_anuncio_actiPuesProfe3,caja_agregar_otraExpProfe,caja_edit_tiemProfe2,
            caja_anuncio_tiemProfeA2,caja_anuncio_tiemProfe2,caja_edit_OrgaEmp2,caja_anuncio_OrgaEmp2,
            caja_edit_actiPuestoProfe2,caja_anuncio_actiPuesProfe2,caja_edit_tiemProfeA2,caja_borrar_otraExpInge3,
            caja_agregar_otraExpInge3,caja_nivelExp4,caja_anuncio_nivelExp4,caja_edit_periodo4,caja_anuncio_periodo4,
            caja_organismo4,caja_anuncio_organismo4,caja_agregar_otraExpInge2,caja_nivelExp3,caja_anuncio_nivelExp3,
            caja_edit_periodo3,caja_anuncio_periodo3,caja_organismo3,caja_anuncio_organismo3,
            caja_agregar_otraExpInge,caja_edit_nivelExp2,caja_anuncio_nivelExp2,caja_edit_periodo2,
            caja_anuncio_periodo2,caja_edit_organismo2,caja_anuncio_organismo2,caja_borrar_otraPart3,
            caja_agregar_otraPart3,caja_nivelPart4,caja_anuncio_nivelPart4,caja_edit_periColeCam4
            ,caja_anuncio_periColeCam4,caja_orgColeCam4,caja_anuncio_orgColeCam4,caja_agregar_otraPart2,
            caja_nivelPart3,caja_anuncio_nivelPart3,caja_edit_periColeCam3,caja_anuncio_periColeCam3,caja_orgColeCam3,
            caja_anuncio_orgColeCam3,caja_agregar_otraPart,caja_edit_nivelPart2,caja_anuncio_nivelPart2,
            caja_edit_periColeCam2,caja_anuncio_periColeCam2,caja_edit_orgColeCam2,caja_anuncio_orgColeCam2,
            caja_licenciatura_final,caja_edit_licenciatura,caja_edit_instPais,caja_instPais_final,
            caja_edit_anoObtencionLic,caja_anoObtencionLic_final,caja_edit_cedulaProfLic,caja_cedulaProfLic_final,
            caja_cedulaProfLic2_final,caja_anoObtencionLic2_final,caja_instPais2_final,caja_ceduEsp_final
            ,caja_edit_ceduEsp,caja_anoEsp_final,caja_anoEsp,caja_instEsp_final,caja_edit_instEsp,
            caja_especialidad_final,caja_especialidad,caja_ceduEsp_final2,caja_anoEsp2_final,
            caja_instEsp_final2,caja_especialidad2_final,caja_maes,maes_final,caja_edit_instMaes,
            caja_instMaes_final,caja_anoMaes,caja_anoMaes_final,caja_edit_ceduMaes,caja_ceduMaes_final,
            caja_maes2_final,caja_instMaes2_final,caja_anoMaes2_final,caja_ceduMaes2_final,
            caja_doc,doc_final,caja_edit_instDoc,caja_instDoc_final,caja_anoDoc,caja_anoDoc_final,
            caja_edit_ceduDoc,caja_ceduDoc_final,doc2_final,caja_instdoc2_final,caja_anoDoc2_final,
            caja_ceduDoc2_final;

    private EditText numProfesor,apellido1_texto,apellido2_texto,fecha_de_nacimiento_texto,
            nombramiento_actual_texto,antiguedad_texto,licenciatura_texto,instPaisLic_texto,
            anoObtencionLic_texto,cedulaProfLic_texto,licenciatura2_texto,cedulaProfLic2_texto,
            anoObtencion2Lic_texto,instPaisLic2_texto,ceduEsp_texto,anoEsp_texto,instEsp_texto,
            especialidad_texto,ceduEsp2_texto,anoEsp2_texto,instEsp2_texto,especialidad2_texto,
            maes_texto,instMaes_texto,anoMaes_texto,ceduMaes_texto,maes2_texto,instMaes2_texto,
            anoMaes2_texto,ceduMaes2_texto,doc_texto,instDoc_texto,anoDoc_texto,ceduDoc_texto,
            doc2_texto,instdoc2_texto,anoDoc2_texto,ceduDoc2_texto;


    private ImageView guardar_numProfesor,cambiar_numProfesor,guardar_apellido1,cambiar_apellido2,
            cambiar_fecha_de_nacimiento,guardar_fecha_de_nacimiento,
            cambiar_apellido1,guardar_apellido2,cambiar_nombramiento_actual,
            guardar_nombramiento_actual,guardar_antiguedad,cambiar_antiguedad,guardar_cedulaProf2,
            cambiar_cedulaProf2,guardar_licenciatura,cambiar_licenciatura,guardar_instPaisLic,
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
            guardar_instdoc2,cambiar_instdoc2,guardar_anoDoc2,cambiar_anoDoc2,guardar_ceduDoc2,cambiar_ceduDoc2;

    private TextView numProfesor_final,apellido1,apellido2,edad,nombramiento_actual_vista,
            antiguedad,fecha_de_nacimiento,ir_formAcademica,ir_capDocente,regresar_datosBasic,ir_actuaDisciplinar,
            regresar_datos_formDocente,regresar_datos_actuaDocente,ir_getsionActualizacion,agregar_otraLic,borrar_otraLic,cedulaProf2,
            regresar_actualizacionDisc,ir_productosAca,ir_getsionAcademica,regresar_gestionAcademica,ir_expeProfe,regresar_produAca,
            ir_expeDiseInge,regresar_expProfe,ir_logProfe,regresar_ExpDise,ir_partColeCam,regresar_logProfe,ir_premios,regresar_partColeCam,ir_aportaRele,
            finalizar_formulario,regresar_preDist,borrar_otraEsp,agregar_otraEsp,agregar_otraMaes,borrar_otraMaes,agregar_otraDoc,borrar_otraDoc,borrar_otraCapa,
            agregar_otraCapa,agregar_otraOtracapa2,borrar_otraCapa2,agregar_otraOtracapa3,borrar_otraCapa3
            ,agregar_otraActua,borrar_otraActua,agregar_otraActua2,borrar_otraactua3,agregar_otraactua3,borrar_otraactua4
            ,borrar_otraGesAca4,agregar_otraGesAca3,borrar_otraGesAca3,agregar_otraGesAca2,
            borrar_otraGesAca2,agregar_otraGesAca,borrar_otraExpProfe3,agregar_otraExpProfe3,
            borrar_otraExpProfe2,agregar_otraExpProfe2,borrar_otraExpProfe,agregar_otraExpProfe,
            borrar_otraExpInge3,agregar_otraExpInge3,borrar_otraExpInge2,agregar_otraExpInge2,
            borrar_otraExpInge,agregar_otraExpInge,borrar_otraPart3,agregar_otraPart3,borrar_otraPart2,
            agregar_otraPart2,borrar_otraPart,agregar_otraPart,licenciatura,instPaisLic,anoObtencionLic,cedulaProfLic,
            licenciatura2,cedulaProfLic2,anoObtencionLic2,instPaisLic2,ceduEsp,anoEsp_vista,instEsp,especialidad,
            ceduEsp2,anoEsp2_vista,instEsp2,especialidad2,maes,instMaes,anoMaes_vista,ceduMaes,maes2,instMaes2,
            anoMaes2_vista,ceduMaes2,doc,instDoc,anoDoc_vista,ceduDoc,doc2,instdoc2,anoDoc2_vista,ceduDoc2;

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
        borrar_otraactua3 = findViewById(R.id.borrar_otraactua3);
        agregar_otraactua3 = findViewById(R.id.agregar_otraactua3);
        caja_anuncio_actua4 = findViewById(R.id.caja_anuncio_actua4);
        caja_actua4 = findViewById(R.id.caja_actua4);
        caja_anuncio_instactua4 = findViewById(R.id.caja_anuncio_instactua4);
        caja_edit_instactua4 = findViewById(R.id.caja_edit_instactua4);
        caja_anuncio_anoactua4 = findViewById(R.id.caja_anuncio_anoactua4);
        caja_anoactua4 = findViewById(R.id.caja_anoactua4);
        caja_anuncio_horasactua4 = findViewById(R.id.caja_anuncio_horasactua4);
        caja_edit_horaactua4 = findViewById(R.id.caja_edit_horaactua4);
        caja_borrar_otraactua4 = findViewById(R.id.caja_borrar_otraactua4);
        borrar_otraactua4 = findViewById(R.id.borrar_otraactua4);

        formulario_formaCapaDocente = findViewById(R.id.formulario_formaCapaDocente);
        caja_siguiente_scroll2 = findViewById(R.id.caja_siguiente_scroll2);
        regresar_datos_formDocente = findViewById(R.id.regresar_datos_formDocente);
        ir_actuaDisciplinar = findViewById(R.id.ir_actuaDisciplinar);

        formulario_actuaDisci = findViewById(R.id.formulario_actuaDisci);
        regresar_datos_actuaDocente = findViewById(R.id.regresar_datos_actuaDocente);
        ir_getsionAcademica = findViewById(R.id.ir_getsionAcademica);
        caja_siguiente_scroll3 = findViewById(R.id.caja_siguiente_scroll3);
        caja_agregar_otraGesAca = findViewById(R.id.caja_agregar_otraGesAca);
        agregar_otraGesAca = findViewById(R.id.agregar_otraGesAca);
        caja_anuncio_actiPues2 = findViewById(R.id.caja_anuncio_actiPues2);
        caja_edit_actiPues2 = findViewById(R.id.caja_edit_actiPues2);
        caja_anuncio_intGesAca2 = findViewById(R.id.caja_anuncio_intGesAca2);
        caja_edit_intGesAca2 = findViewById(R.id.caja_edit_intGesAca2);
        caja_anuncio_tiemGesAca2 = findViewById(R.id.caja_anuncio_tiemGesAca2);
        caja_edit_tiemGesAca2 = findViewById(R.id.caja_edit_tiemGesAca2);
        caja_anuncio_tiemGesAcaA2 = findViewById(R.id.caja_anuncio_tiemGesAcaA2);
        caja_edit_tiemGesAcaA2 = findViewById(R.id.caja_edit_tiemGesAcaA2);
        caja_agregar_otraGesAca2 = findViewById(R.id.caja_agregar_otraGesAca2);
        agregar_otraGesAca2 = findViewById(R.id.agregar_otraGesAca2);
        borrar_otraGesAca2 = findViewById(R.id.borrar_otraGesAca2);
        caja_anuncio_actiPues3 = findViewById(R.id.caja_anuncio_actiPues3);
        caja_actiPues3 = findViewById(R.id.caja_actiPues3);
        caja_anuncio_intGesAca3 = findViewById(R.id.caja_anuncio_intGesAca3);
        caja_edit_intGesAca3 = findViewById(R.id.caja_edit_intGesAca3);
        caja_anuncio_tiemGesAca3 = findViewById(R.id.caja_anuncio_tiemGesAca3);
        caja_tiemGesAca3 = findViewById(R.id.caja_tiemGesAca3);
        caja_anuncio_tiemGesAcaA3 = findViewById(R.id.caja_anuncio_tiemGesAcaA3);
        caja_edit_tiemGesAcaA3 = findViewById(R.id.caja_edit_tiemGesAcaA3);
        caja_agregar_otraGesAca3 = findViewById(R.id.caja_agregar_otraGesAca3);
        borrar_otraGesAca3 = findViewById(R.id.borrar_otraGesAca3);
        agregar_otraGesAca3 = findViewById(R.id.agregar_otraGesAca3);
        caja_anuncio_actiPues4 = findViewById(R.id.caja_anuncio_actiPues4);
        caja_actiPues4 = findViewById(R.id.caja_actiPues4);
        caja_anuncio_intGesAca4 = findViewById(R.id.caja_anuncio_intGesAca4);
        caja_edit_intGesAca4 = findViewById(R.id.caja_edit_intGesAca4);
        caja_anuncio_tiemGesAca4 = findViewById(R.id.caja_anuncio_tiemGesAca4);
        caja_tiemGesAca4 = findViewById(R.id.caja_tiemGesAca4);
        caja_anuncio_tiemGesAcaA4 = findViewById(R.id.caja_anuncio_tiemGesAcaA4);
        caja_edit_tiemGesAcaA4 = findViewById(R.id.caja_edit_tiemGesAcaA4);
        caja_borrar_otraGesAca4 = findViewById(R.id.caja_borrar_otraGesAca4);
        borrar_otraGesAca4 = findViewById(R.id.borrar_otraGesAca4);


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
        caja_agregar_otraExpProfe = findViewById(R.id.caja_agregar_otraExpProfe);
        agregar_otraExpProfe = findViewById(R.id.agregar_otraExpProfe);
        caja_anuncio_actiPuesProfe2 = findViewById(R.id.caja_anuncio_actiPuesProfe2);
        caja_edit_actiPuestoProfe2 = findViewById(R.id.caja_edit_actiPuestoProfe2);
        caja_anuncio_OrgaEmp2 = findViewById(R.id.caja_anuncio_OrgaEmp2);
        caja_edit_OrgaEmp2 = findViewById(R.id.caja_edit_OrgaEmp2);
        caja_anuncio_tiemProfe2 = findViewById(R.id.caja_anuncio_tiemProfe2);
        caja_edit_tiemProfe2 = findViewById(R.id.caja_edit_tiemProfe2);
        caja_anuncio_tiemProfeA2 = findViewById(R.id.caja_anuncio_tiemProfeA2);
        caja_edit_tiemProfeA2 = findViewById(R.id.caja_edit_tiemProfeA2);
        caja_agregar_otraExpProfe2 = findViewById(R.id.caja_agregar_otraExpProfe2);
        agregar_otraExpProfe2 = findViewById(R.id.agregar_otraExpProfe2);
        borrar_otraExpProfe = findViewById(R.id.borrar_otraExpProfe);
        caja_anuncio_actiPuesProfe3 = findViewById(R.id.caja_anuncio_actiPuesProfe3);
        caja_actiPuesProfe3 = findViewById(R.id.caja_actiPuesProfe3);
        caja_anuncio_OrgaEmp3 = findViewById(R.id.caja_anuncio_OrgaEmp3);
        caja_edit_OrgaEmp3 = findViewById(R.id.caja_edit_OrgaEmp3);
        caja_anuncio_tiemProfe3 = findViewById(R.id.caja_anuncio_tiemProfe3);
        caja_tiemProfe3 = findViewById(R.id.caja_tiemProfe3);
        caja_anuncio_tiemProfeA3 = findViewById(R.id.caja_anuncio_tiemProfeA3);
        caja_edit_tiemProfeA3 = findViewById(R.id.caja_edit_tiemProfeA3);
        caja_agregar_otraExpProfe3 = findViewById(R.id.caja_agregar_otraExpProfe3);
        borrar_otraExpProfe2 = findViewById(R.id.borrar_otraExpProfe2);
        agregar_otraExpProfe3 = findViewById(R.id.agregar_otraExpProfe3);
        caja_anuncio_actiPuesProfe4 = findViewById(R.id.caja_anuncio_actiPuesProfe4);
        caja_actiPuesProfe4 = findViewById(R.id.caja_actiPuesProfe4);
        caja_anuncio_OrgaEmp4 = findViewById(R.id.caja_anuncio_OrgaEmp4);
        caja_edit_OrgaEmp4 = findViewById(R.id.caja_edit_OrgaEmp4);
        caja_anuncio_tiemProfe4 = findViewById(R.id.caja_anuncio_tiemProfe4);
        caja_tiemProfe4 = findViewById(R.id.caja_tiemProfe4);
        caja_anuncio_tiemProfeA4 = findViewById(R.id.caja_anuncio_tiemProfeA4);
        caja_edit_tiemProfeA4 = findViewById(R.id.caja_edit_tiemProfeA4);
        caja_borrar_otraExpProfe3 = findViewById(R.id.caja_borrar_otraExpProfe3);
         borrar_otraExpProfe3 = findViewById(R.id.borrar_otraExpProfe3);

        formulario_expDiseñoIng = findViewById(R.id.formulario_expDiseñoIng);
        caja_siguiente_scroll7 = findViewById(R.id.caja_siguiente_scroll7);
        regresar_expProfe = findViewById(R.id.regresar_expProfe);
        ir_logProfe = findViewById(R.id.ir_logProfe);

        formulario_expProfeNoAcade = findViewById(R.id.formulario_expProfeNoAcade);
        caja_siguiente_scroll6 = findViewById(R.id.caja_siguiente_scroll6);
        regresar_produAca = findViewById(R.id.regresar_produAca);
        ir_expeDiseInge = findViewById(R.id.ir_expeDiseInge);
        caja_agregar_otraExpInge = findViewById(R.id.caja_agregar_otraExpInge);
        agregar_otraExpInge = findViewById(R.id.agregar_otraExpInge);
        caja_anuncio_organismo2 = findViewById(R.id.caja_anuncio_organismo2);
        caja_edit_organismo2 = findViewById(R.id.caja_edit_organismo2);
        caja_anuncio_periodo2 = findViewById(R.id.caja_anuncio_periodo2);
        caja_edit_periodo2 = findViewById(R.id.caja_edit_periodo2);
        caja_anuncio_nivelExp2 = findViewById(R.id.caja_anuncio_nivelExp2);
        caja_edit_nivelExp2 = findViewById(R.id.caja_edit_nivelExp2);
        caja_agregar_otraExpInge2 = findViewById(R.id.caja_agregar_otraExpInge2);
        borrar_otraExpInge = findViewById(R.id.borrar_otraExpInge);

        agregar_otraExpInge2 = findViewById(R.id.agregar_otraExpInge2);
        caja_anuncio_organismo3 = findViewById(R.id.caja_anuncio_organismo3);
        caja_organismo3 = findViewById(R.id.caja_organismo3);
        caja_anuncio_periodo3 = findViewById(R.id.caja_anuncio_periodo3);
        caja_edit_periodo3 = findViewById(R.id.caja_edit_periodo3);
        caja_anuncio_nivelExp3 = findViewById(R.id.caja_anuncio_nivelExp3);
        caja_nivelExp3 = findViewById(R.id.caja_nivelExp3);
        caja_agregar_otraExpInge3 = findViewById(R.id.caja_agregar_otraExpInge3);
        agregar_otraExpInge3 = findViewById(R.id.agregar_otraExpInge3);
        borrar_otraExpInge2 = findViewById(R.id.borrar_otraExpInge2);

        caja_anuncio_organismo4 = findViewById(R.id.caja_anuncio_organismo4);
        caja_organismo4 = findViewById(R.id.caja_organismo4);
        caja_anuncio_periodo4 = findViewById(R.id.caja_anuncio_periodo4);
        caja_edit_periodo4 = findViewById(R.id.caja_edit_periodo4);
        caja_anuncio_nivelExp4 = findViewById(R.id.caja_anuncio_nivelExp4);
        caja_nivelExp4 = findViewById(R.id.caja_nivelExp4);
        borrar_otraExpInge3 = findViewById(R.id.borrar_otraExpInge3);
        caja_borrar_otraExpInge3 = findViewById(R.id.caja_borrar_otraExpInge3);


        formulario_logrosProfeNoAca = findViewById(R.id.formulario_logrosProfeNoAca);
        caja_siguiente_scroll8 = findViewById(R.id.caja_siguiente_scroll8);
        regresar_ExpDise = findViewById(R.id.regresar_ExpDise);
        ir_partColeCam = findViewById(R.id.ir_partColeCam);

        formulario_partColeCam = findViewById(R.id.formulario_partColeCam);
        caja_siguiente_scroll9 = findViewById(R.id.caja_siguiente_scroll9);
        regresar_logProfe = findViewById(R.id.regresar_logProfe);
        ir_premios = findViewById(R.id.ir_premios);
        caja_agregar_otraPart = findViewById(R.id.caja_agregar_otraPart);
        agregar_otraPart = findViewById(R.id.agregar_otraPart);
        caja_anuncio_orgColeCam2 = findViewById(R.id.caja_anuncio_orgColeCam2);
        caja_edit_orgColeCam2 = findViewById(R.id.caja_edit_orgColeCam2);
        caja_anuncio_periColeCam2 = findViewById(R.id.caja_anuncio_periColeCam2);
        caja_edit_periColeCam2 = findViewById(R.id.caja_edit_periColeCam2);
        caja_anuncio_nivelPart2 = findViewById(R.id.caja_anuncio_nivelPart2);
        caja_edit_nivelPart2 = findViewById(R.id.caja_edit_nivelPart2);
        caja_agregar_otraPart2 = findViewById(R.id.caja_agregar_otraPart2);
        borrar_otraPart = findViewById(R.id.borrar_otraPart);

        agregar_otraPart2 = findViewById(R.id.agregar_otraPart2);
        caja_anuncio_orgColeCam3 = findViewById(R.id.caja_anuncio_orgColeCam3);
        caja_orgColeCam3 = findViewById(R.id.caja_orgColeCam3);
        caja_anuncio_periColeCam3 = findViewById(R.id.caja_anuncio_periColeCam3);
        caja_edit_periColeCam3 = findViewById(R.id.caja_edit_periColeCam3);
        caja_anuncio_nivelPart3 = findViewById(R.id.caja_anuncio_nivelPart3);
        caja_nivelPart3 = findViewById(R.id.caja_nivelPart3);
        caja_agregar_otraPart3 = findViewById(R.id.caja_agregar_otraPart3);
        agregar_otraPart3 = findViewById(R.id.agregar_otraPart3);
        borrar_otraPart2 = findViewById(R.id.borrar_otraPart2);

        caja_anuncio_orgColeCam4 = findViewById(R.id.caja_anuncio_orgColeCam4);
        caja_orgColeCam4 = findViewById(R.id.caja_orgColeCam4);
        caja_anuncio_periColeCam4 = findViewById(R.id.caja_anuncio_periColeCam4);
        caja_edit_periColeCam4 = findViewById(R.id.caja_edit_periColeCam4);
        caja_anuncio_nivelPart4 = findViewById(R.id.caja_anuncio_nivelPart4);
        caja_nivelPart4 = findViewById(R.id.caja_nivelPart4);
        borrar_otraPart3 = findViewById(R.id.borrar_otraPart3);
        caja_borrar_otraPart3 = findViewById(R.id.caja_borrar_otraPart3);


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
        agregar_otraactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actua4.setVisibility(View.VISIBLE);
                caja_actua4.setVisibility(View.VISIBLE);

                caja_anuncio_instactua4.setVisibility(View.VISIBLE);
                caja_edit_instactua4.setVisibility(View.VISIBLE);

                caja_anuncio_anoactua4.setVisibility(View.VISIBLE);
                caja_anoactua4.setVisibility(View.VISIBLE);

                caja_anuncio_horasactua4.setVisibility(View.VISIBLE);
                caja_edit_horaactua4.setVisibility(View.VISIBLE);

                caja_agregar_otraactua3.setVisibility(View.GONE);
                caja_borrar_otraactua4.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actua4.setVisibility(View.GONE);
                caja_actua4.setVisibility(View.GONE);

                caja_anuncio_instactua4.setVisibility(View.GONE);
                caja_edit_instactua4.setVisibility(View.GONE);

                caja_anuncio_anoactua4.setVisibility(View.GONE);
                caja_anoactua4.setVisibility(View.GONE);

                caja_anuncio_horasactua4.setVisibility(View.GONE);
                caja_edit_horaactua4.setVisibility(View.GONE);

                caja_agregar_otraactua3.setVisibility(View.VISIBLE);
                caja_borrar_otraactua4.setVisibility(View.GONE);


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
        agregar_otraGesAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues2.setVisibility(View.VISIBLE);
                caja_edit_actiPues2.setVisibility(View.VISIBLE);

                caja_anuncio_intGesAca2.setVisibility(View.VISIBLE);
                caja_edit_intGesAca2.setVisibility(View.VISIBLE);

                caja_anuncio_tiemGesAca2.setVisibility(View.VISIBLE);
                caja_edit_tiemGesAca2.setVisibility(View.VISIBLE);

                caja_anuncio_tiemGesAcaA2.setVisibility(View.VISIBLE);
                caja_edit_tiemGesAcaA2.setVisibility(View.VISIBLE);

                caja_agregar_otraGesAca.setVisibility(View.GONE);
                caja_agregar_otraGesAca2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues2.setVisibility(View.GONE);
                caja_edit_actiPues2.setVisibility(View.GONE);

                caja_anuncio_intGesAca2.setVisibility(View.GONE);
                caja_edit_intGesAca2.setVisibility(View.GONE);

                caja_anuncio_tiemGesAca2.setVisibility(View.GONE);
                caja_edit_tiemGesAca2.setVisibility(View.GONE);

                caja_anuncio_tiemGesAcaA2.setVisibility(View.GONE);
                caja_edit_tiemGesAcaA2.setVisibility(View.GONE);

                caja_agregar_otraGesAca.setVisibility(View.VISIBLE);
                caja_agregar_otraGesAca2.setVisibility(View.GONE);


            }
        });
        agregar_otraGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues3.setVisibility(View.VISIBLE);
                caja_actiPues3.setVisibility(View.VISIBLE);

                caja_anuncio_intGesAca3.setVisibility(View.VISIBLE);
                caja_edit_intGesAca3.setVisibility(View.VISIBLE);

                caja_anuncio_tiemGesAca3.setVisibility(View.VISIBLE);
                caja_tiemGesAca3.setVisibility(View.VISIBLE);

                caja_anuncio_tiemGesAcaA3.setVisibility(View.VISIBLE);
                caja_edit_tiemGesAcaA3.setVisibility(View.VISIBLE);

                caja_agregar_otraGesAca2.setVisibility(View.GONE);
                caja_agregar_otraGesAca3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues3.setVisibility(View.GONE);
                caja_actiPues3.setVisibility(View.GONE);

                caja_anuncio_intGesAca3.setVisibility(View.GONE);
                caja_edit_intGesAca3.setVisibility(View.GONE);

                caja_anuncio_tiemGesAca3.setVisibility(View.GONE);
                caja_tiemGesAca3.setVisibility(View.GONE);

                caja_anuncio_tiemGesAcaA3.setVisibility(View.GONE);
                caja_edit_tiemGesAcaA3.setVisibility(View.GONE);

                caja_agregar_otraGesAca2.setVisibility(View.VISIBLE);
                caja_agregar_otraGesAca3.setVisibility(View.GONE);


            }
        });
        agregar_otraGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues4.setVisibility(View.VISIBLE);
                caja_actiPues4.setVisibility(View.VISIBLE);

                caja_anuncio_intGesAca4.setVisibility(View.VISIBLE);
                caja_edit_intGesAca4.setVisibility(View.VISIBLE);

                caja_anuncio_tiemGesAca4.setVisibility(View.VISIBLE);
                caja_tiemGesAca4.setVisibility(View.VISIBLE);

                caja_anuncio_tiemGesAcaA4.setVisibility(View.VISIBLE);
                caja_edit_tiemGesAcaA4.setVisibility(View.VISIBLE);

                caja_agregar_otraGesAca3.setVisibility(View.GONE);
                caja_borrar_otraGesAca4.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraGesAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues4.setVisibility(View.GONE);
                caja_actiPues4.setVisibility(View.GONE);

                caja_anuncio_intGesAca4.setVisibility(View.GONE);
                caja_edit_intGesAca4.setVisibility(View.GONE);

                caja_anuncio_tiemGesAca4.setVisibility(View.GONE);
                caja_tiemGesAca4.setVisibility(View.GONE);

                caja_anuncio_tiemGesAcaA4.setVisibility(View.GONE);
                caja_edit_tiemGesAcaA4.setVisibility(View.GONE);

                caja_agregar_otraGesAca3.setVisibility(View.VISIBLE);
                caja_borrar_otraGesAca4.setVisibility(View.GONE);


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
        agregar_otraExpProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe2.setVisibility(View.VISIBLE);
                caja_edit_actiPuestoProfe2.setVisibility(View.VISIBLE);

                caja_anuncio_OrgaEmp2.setVisibility(View.VISIBLE);
                caja_edit_OrgaEmp2.setVisibility(View.VISIBLE);

                caja_anuncio_tiemProfe2.setVisibility(View.VISIBLE);
                caja_edit_tiemProfe2.setVisibility(View.VISIBLE);

                caja_anuncio_tiemProfeA2.setVisibility(View.VISIBLE);
                caja_edit_tiemProfeA2.setVisibility(View.VISIBLE);

                caja_agregar_otraExpProfe.setVisibility(View.GONE);
                caja_agregar_otraExpProfe2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe2.setVisibility(View.GONE);
                caja_edit_actiPuestoProfe2.setVisibility(View.GONE);

                caja_anuncio_OrgaEmp2.setVisibility(View.GONE);
                caja_edit_OrgaEmp2.setVisibility(View.GONE);

                caja_anuncio_tiemProfe2.setVisibility(View.GONE);
                caja_edit_tiemProfe2.setVisibility(View.GONE);

                caja_anuncio_tiemProfeA2.setVisibility(View.GONE);
                caja_edit_tiemProfeA2.setVisibility(View.GONE);

                caja_agregar_otraExpProfe.setVisibility(View.VISIBLE);
                caja_agregar_otraExpProfe2.setVisibility(View.GONE);


            }
        });
        agregar_otraExpProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe3.setVisibility(View.VISIBLE);
                caja_actiPuesProfe3.setVisibility(View.VISIBLE);

                caja_anuncio_OrgaEmp3.setVisibility(View.VISIBLE);
                caja_edit_OrgaEmp3.setVisibility(View.VISIBLE);

                caja_anuncio_tiemProfe3.setVisibility(View.VISIBLE);
                caja_tiemProfe3.setVisibility(View.VISIBLE);

                caja_anuncio_tiemProfeA3.setVisibility(View.VISIBLE);
                caja_edit_tiemProfeA3.setVisibility(View.VISIBLE);

                caja_agregar_otraExpProfe2.setVisibility(View.GONE);
                caja_agregar_otraExpProfe3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe3.setVisibility(View.GONE);
                caja_actiPuesProfe3.setVisibility(View.GONE);

                caja_anuncio_OrgaEmp3.setVisibility(View.GONE);
                caja_edit_OrgaEmp3.setVisibility(View.GONE);

                caja_anuncio_tiemProfe3.setVisibility(View.GONE);
                caja_tiemProfe3.setVisibility(View.GONE);

                caja_anuncio_tiemProfeA3.setVisibility(View.GONE);
                caja_edit_tiemProfeA3.setVisibility(View.GONE);

                caja_agregar_otraExpProfe2.setVisibility(View.VISIBLE);
                caja_agregar_otraExpProfe3.setVisibility(View.GONE);


            }
        });
        agregar_otraExpProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe4.setVisibility(View.VISIBLE);
                caja_actiPuesProfe4.setVisibility(View.VISIBLE);

                caja_anuncio_OrgaEmp4.setVisibility(View.VISIBLE);
                caja_edit_OrgaEmp4.setVisibility(View.VISIBLE);

                caja_anuncio_tiemProfe4.setVisibility(View.VISIBLE);
                caja_tiemProfe4.setVisibility(View.VISIBLE);

                caja_anuncio_tiemProfeA4.setVisibility(View.VISIBLE);
                caja_edit_tiemProfeA4.setVisibility(View.VISIBLE);

                caja_agregar_otraExpProfe3.setVisibility(View.GONE);
                caja_borrar_otraExpProfe3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe4.setVisibility(View.GONE);
                caja_actiPuesProfe4.setVisibility(View.GONE);

                caja_anuncio_OrgaEmp4.setVisibility(View.GONE);
                caja_edit_OrgaEmp4.setVisibility(View.GONE);

                caja_anuncio_tiemProfe4.setVisibility(View.GONE);
                caja_tiemProfe4.setVisibility(View.GONE);

                caja_anuncio_tiemProfeA4.setVisibility(View.GONE);
                caja_edit_tiemProfeA4.setVisibility(View.GONE);

                caja_agregar_otraExpProfe3.setVisibility(View.VISIBLE);
                caja_borrar_otraExpProfe3.setVisibility(View.GONE);


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
        agregar_otraExpInge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_organismo2.setVisibility(View.VISIBLE);
                caja_edit_organismo2.setVisibility(View.VISIBLE);

                caja_anuncio_periodo2.setVisibility(View.VISIBLE);
                caja_edit_periodo2.setVisibility(View.VISIBLE);

                caja_anuncio_nivelExp2.setVisibility(View.VISIBLE);
                caja_edit_nivelExp2.setVisibility(View.VISIBLE);



                caja_agregar_otraExpInge.setVisibility(View.GONE);
                caja_agregar_otraExpInge2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpInge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_organismo2.setVisibility(View.GONE);
                caja_edit_organismo2.setVisibility(View.GONE);

                caja_anuncio_periodo2.setVisibility(View.GONE);
                caja_edit_periodo2.setVisibility(View.GONE);

                caja_anuncio_nivelExp2.setVisibility(View.GONE);
                caja_edit_nivelExp2.setVisibility(View.GONE);


                caja_agregar_otraExpInge.setVisibility(View.VISIBLE);
                caja_agregar_otraExpInge2.setVisibility(View.GONE);


            }
        });
        agregar_otraExpInge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_organismo3.setVisibility(View.VISIBLE);
                caja_organismo3.setVisibility(View.VISIBLE);

                caja_anuncio_periodo3.setVisibility(View.VISIBLE);
                caja_edit_periodo3.setVisibility(View.VISIBLE);

                caja_anuncio_nivelExp3.setVisibility(View.VISIBLE);
                caja_nivelExp3.setVisibility(View.VISIBLE);



                caja_agregar_otraExpInge2.setVisibility(View.GONE);
                caja_agregar_otraExpInge3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpInge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_organismo3.setVisibility(View.GONE);
                caja_organismo3.setVisibility(View.GONE);

                caja_anuncio_periodo3.setVisibility(View.GONE);
                caja_edit_periodo3.setVisibility(View.GONE);

                caja_anuncio_nivelExp3.setVisibility(View.GONE);
                caja_nivelExp3.setVisibility(View.GONE);

                caja_agregar_otraExpInge2.setVisibility(View.VISIBLE);
                caja_agregar_otraExpInge3.setVisibility(View.GONE);


            }
        });
        agregar_otraExpInge3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_organismo4.setVisibility(View.VISIBLE);
                caja_organismo4.setVisibility(View.VISIBLE);

                caja_anuncio_periodo4.setVisibility(View.VISIBLE);
                caja_edit_periodo4.setVisibility(View.VISIBLE);

                caja_anuncio_nivelExp4.setVisibility(View.VISIBLE);
                caja_nivelExp4.setVisibility(View.VISIBLE);



                caja_agregar_otraExpInge3.setVisibility(View.GONE);
                caja_borrar_otraExpInge3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpInge3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_organismo4.setVisibility(View.GONE);
                caja_organismo4.setVisibility(View.GONE);

                caja_anuncio_periodo4.setVisibility(View.GONE);
                caja_edit_periodo4.setVisibility(View.GONE);

                caja_anuncio_nivelExp4.setVisibility(View.GONE);
                caja_nivelExp4.setVisibility(View.GONE);



                caja_agregar_otraExpInge3.setVisibility(View.VISIBLE);
                caja_borrar_otraExpInge3.setVisibility(View.GONE);


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
        agregar_otraPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam2.setVisibility(View.VISIBLE);
                caja_edit_orgColeCam2.setVisibility(View.VISIBLE);

                caja_anuncio_periColeCam2.setVisibility(View.VISIBLE);
                caja_edit_periColeCam2.setVisibility(View.VISIBLE);

                caja_anuncio_nivelPart2.setVisibility(View.VISIBLE);
                caja_edit_nivelPart2.setVisibility(View.VISIBLE);



                caja_agregar_otraPart.setVisibility(View.GONE);
                caja_agregar_otraPart2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam2.setVisibility(View.GONE);
                caja_edit_orgColeCam2.setVisibility(View.GONE);

                caja_anuncio_periColeCam2.setVisibility(View.GONE);
                caja_edit_periColeCam2.setVisibility(View.GONE);

                caja_anuncio_nivelPart2.setVisibility(View.GONE);
                caja_edit_nivelPart2.setVisibility(View.GONE);


                caja_agregar_otraPart.setVisibility(View.VISIBLE);
                caja_agregar_otraPart2.setVisibility(View.GONE);


            }
        });
        agregar_otraPart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam3.setVisibility(View.VISIBLE);
                caja_orgColeCam3.setVisibility(View.VISIBLE);

                caja_anuncio_periColeCam3.setVisibility(View.VISIBLE);
                caja_edit_periColeCam3.setVisibility(View.VISIBLE);

                caja_anuncio_nivelPart3.setVisibility(View.VISIBLE);
                caja_nivelPart3.setVisibility(View.VISIBLE);



                caja_agregar_otraPart2.setVisibility(View.GONE);
                caja_agregar_otraPart3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraPart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam3.setVisibility(View.GONE);
                caja_orgColeCam3.setVisibility(View.GONE);

                caja_anuncio_periColeCam3.setVisibility(View.GONE);
                caja_edit_periColeCam3.setVisibility(View.GONE);

                caja_anuncio_nivelPart3.setVisibility(View.GONE);
                caja_nivelPart3.setVisibility(View.GONE);

                caja_agregar_otraPart2.setVisibility(View.VISIBLE);
                caja_agregar_otraPart3.setVisibility(View.GONE);


            }
        });
        agregar_otraPart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam4.setVisibility(View.VISIBLE);
                caja_orgColeCam4.setVisibility(View.VISIBLE);

                caja_anuncio_periColeCam4.setVisibility(View.VISIBLE);
                caja_edit_periColeCam4.setVisibility(View.VISIBLE);

                caja_anuncio_nivelPart4.setVisibility(View.VISIBLE);
                caja_nivelPart4.setVisibility(View.VISIBLE);



                caja_agregar_otraPart3.setVisibility(View.GONE);
                caja_borrar_otraPart3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraPart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam4.setVisibility(View.GONE);
                caja_orgColeCam4.setVisibility(View.GONE);

                caja_anuncio_periColeCam4.setVisibility(View.GONE);
                caja_edit_periColeCam4.setVisibility(View.GONE);

                caja_anuncio_nivelPart4.setVisibility(View.GONE);
                caja_nivelPart4.setVisibility(View.GONE);



                caja_agregar_otraPart3.setVisibility(View.VISIBLE);
                caja_borrar_otraPart3.setVisibility(View.GONE);


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