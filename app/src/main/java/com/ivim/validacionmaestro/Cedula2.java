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
            caja_ceduDoc2_final,caja_edit_actiPuesto,caja_actiPuesto_final,caja_edit_instGesAca,
            caja_instGesAca_final,caja_edit_tiemGesAca,caja_tiemGesAca_final,caja_edit_tiemGesAcaA,
            caja_tiemGesAcaA_final,caja_actiPues2_final,caja_intGesAca2_final,caja_tiemGesAca2_final,
            caja_tiemGesAcaA2_final,caja_actiPues3_final,caja_intGesAca3_final,caja_tiemGesAca3_final,
            caja_tiemGesAcaA3_final,caja_actiPues4_final,caja_intGesAca4_final,caja_tiemGesAca4_final,
            caja_tiemGesAcaA4_final,caja_edit_tipoCapa,caja_tipoCapa_final,caja_edit_instPaisCapa,
            caja_instPaisCapa_final,caja_edit_anoObtencionCapa,caja_anoObtencionCapa_final,caja_edit_horasCapa,
            caja_horasCapa_final,caja_capa2_final,caja_intCapa2_final,caja_anoCapa2_final,caja_horaCapa2_final,
            caja_capa3_final,caja_instcapa3_final,caja_anoCapa3_final,caja_horaCapa3_final,capa4_final,
            caja_instcapa4_final,caja_anoCapa4_final,caja_horaCapa4_final,caja_edit_tipoActua,
            caja_tipoActua_final,caja_edit_instPaisActua,caja_instPaisActua_final,
            caja_edit_anoObtencionActua,caja_anoObtencionActua_final,caja_edit_horasActua,
            caja_horasActua_final,caja_actua2_final,caja_instPaisActua2_final,caja_anoActua2_final,
            caja_horaActua2_final,caja_actua3_final,caja_instactua3_final,caja_anoactua3_final,
            caja_horaactua3_final,caja_actua4_final,caja_instactua4_final,caja_anoactua4_final,
            caja_horaactua4_final,caja_edit_desProdAca,caja_desProdAca_final,caja_edit_desProdAca2,
            caja_desProdAca2_final,caja_edit_desProdAca3,caja_desProdAca3_final,caja_edit_desProdAca4,
            caja_desProdAca4_final,caja_edit_desProdAca5,caja_desProdAca5_final,caja_edit_desProdAca6,
            caja_desProdAca6_final,caja_edit_desProdAca7,caja_desProdAca7_final,caja_edit_desProdAca8,
            caja_desProdAca8_final,caja_edit_actiPuestoProfe,caja_actiPuestoProfe_final,caja_edit_OrgaEmp,
            caja_OrgaEmp_final,caja_edit_tiemProfe,caja_tiemProfe_final,caja_edit_tiemProfeA,caja_tiemProfeA_final,
            caja_actiPuestoProfe2_final,caja_OrgaEmp2_final,caja_tiemProfe2_final,caja_tiemProfeA2_final,
            caja_actiPuesProfe3_final,caja_OrgaEmp3_final,caja_tiemProfe3_final,caja_tiemProfeA3_final,
            caja_actiPuesProfe4_final,caja_OrgaEmp4_final,caja_tiemProfe4_final,caja_tiemProfeA4_final,
            caja_edit_organismo,caja_organismo_final,caja_edit_periodo,caja_periodo_final,caja_nivelExp_final,
            caja_edit_nivelExp,caja_organismo2_final,caja_periodo2_final,caja_nivelExp2_final,caja_organismo3_final,
            caja_periodo3_final,caja_nivelExp3_final,caja_organismo4_final,caja_periodo4_final,caja_nivelExp4_final,
            caja_edit_desLogAca,caja_desLogAca_final,caja_edit_desLogAca2,caja_desLogAca2_final,caja_edit_desLogAca3,
            caja_desLogAca3_final,caja_edit_desLogAca4,caja_desLogAca4_final,caja_edit_desLogAca5,caja_desLogAca5_final,
            caja_edit_desPreRec,caja_desPreRec_final,caja_edit_desPreRec2,caja_desPreRec2_final,caja_edit_desPreRec3,
            caja_desPreRec3_final,caja_edit_desPreRec4,caja_desPreRec4_final,caja_edit_desPreRec5,caja_desPreRec5_final,
            caja_edit_orgColeCam,caja_orgColeCam_final,caja_edit_periColeCam,caja_periColeCam_final,caja_edit_nivelPart,
            caja_nivelPart_final,caja_orgColeCam2_final,caja_periColeCam2_final,caja_nivelPart2_final,caja_orgColeCam3_final,
            caja_periColeCam3_final,caja_nivelPart3_final,caja_orgColeCam4_final,caja_periColeCam4_final,
            caja_nivelPart4_final,caja_edit_aportacionPE,caja_aportacionPE_final;

    private EditText numProfesor,apellido1_texto,apellido2_texto,fecha_de_nacimiento_texto,
            nombramiento_actual_texto,antiguedad_texto,licenciatura_texto,instPaisLic_texto,
            anoObtencionLic_texto,cedulaProfLic_texto,licenciatura2_texto,cedulaProfLic2_texto,
            anoObtencion2Lic_texto,instPaisLic2_texto,ceduEsp_texto,anoEsp_texto,instEsp_texto,
            especialidad_texto,ceduEsp2_texto,anoEsp2_texto,instEsp2_texto,especialidad2_texto,
            maes_texto,instMaes_texto,anoMaes_texto,ceduMaes_texto,maes2_texto,instMaes2_texto,
            anoMaes2_texto,ceduMaes2_texto,doc_texto,instDoc_texto,anoDoc_texto,ceduDoc_texto,
            doc2_texto,instdoc2_texto,anoDoc2_texto,ceduDoc2_texto,actiPuesto_texto,
            instGesAca_texto,tiemGesAca_texto,tiemGesAcaA_texto,actiPues2_texto,
            intGesAca2_texto,tiemGesAca2_texto,tiemGesAcaA2_texto,actiPues3_texto,
            intGesAca3_texto,tiemGesAca3_texto,tiemGesAcaA3_texto,actiPues4_texto,
            intGesAca4_texto,tiemGesAca4_texto,tiemGesAcaA4_texto,tipoCapa_texto,
            instPaisCapa_texto,anoObtencionCapa_texto,horasCapa_texto,capa2_texto,
            intCapa2_texto,anoCapa2_texto,horaCapa2_texto,capa3_texto,instcapa3_texto,
            anoCapa3_texto,horaCapa3_texto,capa4_texto,instcapa4_texto,anoCapa4_texto,
            horaCapa4_texto,tipoActua_texto,instPaisActua_texto,anoObtencionActua_texto,
            horasActua_texto,actua2_texto,instPaisActua2_texto,anoActua2_texto,horaActua2_texto,
            actua3_texto,instactua3_texto,anoactua3_texto,horaactua3_texto,actua4_texto,
            instactua4_texto,anoactua4_texto,horaactua4_texto,desProdAca_texto,desProdAca2_texto,
            desProdAca3_texto,desProdAca4_texto,desProdAca5_texto,desProdAca6_texto,desProdAca7_texto,
            desProdAca8_texto,actiPuestoProfe_texto,OrgaEmp_texto,tiemProfe_texto,tiemProfeA_texto,
            actiPuestoProfe2_texto,OrgaEmp2_texto,tiemProfe2_texto,tiemProfeA2_texto,actiPuesProfe3_texto,
            OrgaEmp3_texto,tiemProfe3_texto,tiemProfeA3_texto,actiPuesProfe4_texto,OrgaEmp4_texto,
            tiemProfe4_texto,tiemProfeA4_texto,organismo_texto,periodo_texto,nivelExp_texto,organismo2_texto,
            periodo2_texto,nivelExp2_texto,organismo3_texto,periodo3_texto,nivelExp3_texto,organismo4_texto,
            periodo4_texto,nivelExp4_texto,desLogAca_texto,desLogAca2_texto,desLogAca3_texto,desLogAca4_texto,
            desLogAca5_texto,desPreRec_texto,desPreRec2_texto,desPreRec3_texto,desPreRec4_texto,desPreRec5_texto,
            orgColeCam_texto,periColeCam_texto,nivelPart_texto,orgColeCam2_texto,periColeCam2_texto,nivelPart2_texto,
            orgColeCam3_texto,periColeCam3_texto,nivelPart3_texto,orgColeCam4_texto,periColeCam4_texto,nivelPart4_texto,
            aportacionPE_texto;


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
            guardar_instdoc2,cambiar_instdoc2,guardar_anoDoc2,cambiar_anoDoc2,guardar_ceduDoc2,
            cambiar_ceduDoc2,guardar_actiPuesto,cambiar_actiPuesto,guardar_instGesAca,
            cambiar_instGesAca,guardar_tiemGesAca,cambiar_tiemGesAca,guardar_tiemGesAcaA,
            cambiar_tiemGesAcaA,guardar_actiPues2,cambiar_actiPues2,guardar_intGesAca2,cambiar_intGesAca2,
            guardar_tiemGesAca2,cambiar_tiemGesAca2,guardar_tiemGesAcaA2,cambiar_tiemGesAcaA2,
            guardar_actiPues3,cambiar_actiPues3,guardar_intGesAca3,cambiar_intGesAca3,
            guardar_tiemGesAca3,cambiar_tiemGesAca3,guardar_tiemGesAcaA3,cambiar_tiemGesAcaA3,
            guardar_actiPues4,cambiar_actiPues4,guardar_intGesAca4,cambiar_intGesAca4,
            guardar_tiemGesAca4,cambiar_tiemGesAca4,guardar_tiemGesAcaA4,cambiar_tiemGesAcaA4,
            guardar_tipoCapa,cambiar_tipoCapa,guardar_instPaisCapa,cambiar_instPaisCapa,
            guardar_anoObtencionCapa,cambiar_anoObtencionCapa,guardar_horasCapa,
            cambiar_horasCapa,guardar_capa2,cambiar_capa2,guardar_intCapa2,cambiar_CapaIns2,
            guardar_anoCapa2,cambiar_anoCapa2,guardar_horaCapa2,cambiar_horaCapa2,guardar_capa3,
            cambiar_capa3,guardar_instcapa3,cambiar_instcapa3,guardar_anoCapa3,cambiar_anoCapa3,
            guardar_horaCapa3,cambiar_horaCapa3,guardar_capa4,cambiar_capa4,guardar_instcapa4,
            cambiar_instcapa4,guardar_anoCapa4,cambiar_anoCapa4,guardar_horaCapa4,cambiar_horaCapa4,
            guardar_tipoActua,cambiar_tipoActua,guardar_instPaisActua,cambiar_instPaisActua,
            guardar_anoObtencionActua,cambiar_anoObtencionActua,guardar_horasActua,cambiar_horasActua,
            guardar_actua2,cambiar_actua2,guardar_instPaisActua2,cambiar_instPaisActua2,guardar_anoActua2,
            cambiar_anoActua2,guardar_horaActua2,cambiar_horaActua2,guardar_actua3,cambiar_actua3,
            guardar_instactua3,cambiar_instactua3,guardar_anoactua3,cambiar_anoactua3,guardar_horaactua3,
            cambiar_horaactua3,guardar_actua4,cambiar_actua4,guardar_instactua4,cambiar_instactua4,
            guardar_anoactua4,cambiar_anoactua4,guardar_horaactua4,cambiar_horaactua4,guardar_desProdAca,
            cambiar_desProdAca,guardar_desProdAca2,cambiar_desProdAca2,guardar_desProdAca3,
            cambiar_desProdAca3,guardar_desProdAca4,cambiar_desProdAca4,guardar_desProdAca5,
            cambiar_desProdAca5,guardar_desProdAca6,cambiar_desProdAca6,guardar_desProdAca7,
            cambiar_desProdAca7,guardar_desProdAca8,cambiar_desProdAca8,guardar_actiPuestoProfe,
            cambiar_actiPuestoProfe,guardar_OrgaEmp,cambiar_OrgaEmp,guardar_tiemProfe,cambiar_tiemProfe,
            guardar_tiemProfeA,cambiar_tiemProfeA,guardar_actiPuestoProfe2,cambiar_actiPuestoProfe2,guardar_OrgaEmp2,
            cambiar_OrgaEmp2,guardar_tiemProfe2,cambiar_tiemProfe2,guardar_tiemProfeA2,cambiar_tiemProfeA2,
            guardar_actiPuesProfe3,cambiar_actiPuesProfe3,guardar_OrgaEmp3,cambiar_OrgaEmp3,guardar_tiemProfe3,
            cambiar_tiemProfe3,guardar_tiemProfeA3,cambiar_tiemProfeA3,guardar_actiPuesProfe4,cambiar_actiPuesProfe4,
            guardar_OrgaEmp4,cambiar_OrgaEmp4,guardar_tiemProfe4,cambiar_tiemProfe4,guardar_tiemProfeA4,
            cambiar_tiemProfeA4,guardar_organismo,cambiar_organismo,guardar_periodo,cambiar_periodo,guardar_nivelExp,
            cambiar_nivelExp,guardar_organismo2,cambiar_organismo2,guardar_periodo2,cambiar_periodo2,
            guardar_nivelExp2,cambiar_nivelExp2,guardar_organismo3,cambiar_organismo3,guardar_periodo3,
            cambiar_periodo3,guardar_nivelExp3,cambiar_nivelExp3,guardar_organismo4,cambiar_organismo4,
            guardar_periodo4,cambiar_periodo4,guardar_nivelExp4,cambiar_nivelExp4,guardar_desLogAca,
            cambiar_desLogAca,guardar_desLogAca2,cambiar_desLogAca2,guardar_desLogAca3,cambiar_desLogAca3,guardar_desLogAca4,
            cambiar_desLogAca4,guardar_desLogAca5,cambiar_desLogAca5,guardar_desPreRec,cambiar_desPreRec,
            guardar_desPreRec2,cambiar_desPreRec2,guardar_desPreRec3,cambiar_desPreRec3,guardar_desPreRec4,
            cambiar_desPreRec4,guardar_desPreRec5,cambiar_desPreRec5,guardar_orgColeCam,cambiar_orgColeCam,
            guardar_periColeCam,cambiar_periColeCam,guardar_nivelPart,cambiar_nivelPart,
            guardar_orgColeCam2,cambiar_orgColeCam2,guardar_periColeCam2,cambiar_periColeCam2,guardar_nivelPart2,
            cambiar_nivelPart2,guardar_orgColeCam3,cambiar_orgColeCam3,guardar_periColeCam3,cambiar_periColeCam3,
            guardar_nivelPart3,cambiar_nivelPart3,guardar_orgColeCam4,cambiar_orgColeCam4,guardar_periColeCam4,
            cambiar_periColeCam4,guardar_nivelPart4,cambiar_nivelPart4,guardar_aportacionPE,cambiar_aportacionPE;

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
            anoMaes2_vista,ceduMaes2,doc,instDoc,anoDoc_vista,ceduDoc,doc2,instdoc2,anoDoc2_vista,ceduDoc2,
            actiPuesto,instGesAca,tiemGesAca,tiemGesAcaA,actiPues2,intGesAca2,tiemGesAca2,tiemGesAcaA2,actiPues3,
            intGesAca3,tiemGesAca3_vista,tiemGesAcaA3,actiPues4,intGesAca4,tiemGesAca4_vista,tiemGesAcaA4,tipoCapa,
            instPaisCapa,anoObtencionCapa,horasCapa,capa2,intCapa2,anoCapa2,horaCapa2,capa3,instcapa3,anoCapa3_vista,
            horaCapa3,capa4,instcapa4,anoCapa4_vista,horaCapa4,tipoActua,instPaisActua,anoObtencionActua,horasActua,
            actua2,instPaisActua2,anoActua2,horaActua2,actua3,instactua3,anoactua3_vista,horaactua3,actua4,
            instactua4,anoactua4_vista,horaactua4,desProdAca,desProdAca2,desProdAca3,desProdAca4,desProdAca5,
            desProdAca6,desProdAca7,desProdAca8,actiPuestoProfe,OrgaEmp,tiemProfe,tiemProfeA,actiPuestoProfe2,
            OrgaEmp2,tiemProfe2,tiemProfeA2,actiPuesProfe3,OrgaEmp3,tiemProfe3_vista,tiemProfeA3,actiPuesProfe4,
            OrgaEmp4,tiemProfe4_vista,tiemProfeA4,organismo,periodo,nivelExp,organismo2,periodo2,nivelExp2,
            organismo3,periodo3,nivelExp3_vista,organismo4,periodo4,nivelExp4_vista,desLogAca,desLogAca2,
            desLogAca3,desLogAca4,desLogAca5,desPreRec,desPreRec2,desPreRec3,desPreRec4,desPreRec5,orgColeCam,
            periColeCam,nivelPart,orgColeCam2,periColeCam2,nivelPart2,orgColeCam3,periColeCam3,nivelPart3_vista,
            orgColeCam4,periColeCam4,nivelPart4_vista,aportacionPE;

    private String nuevo_licenciatura,nuevo_instPaisLic,nuevo_anoObtencionLic,nuevo_cedulaProfLic,
            nuevo_licenciatura2,nuevo_cedulaProfLic2,nuevo_anoObtencion2Lic,nuevo_instPaisLic2,
            nuevo_ceduEsp,nuevo_anoEsp,nuevo_instEsp,nuevo_especialidad,nuevo_ceduEsp2,nuevo_anoEsp2,
            nuevo_instEsp2,nuevo_especialidad2,nuevo_maes,nuevo_instMaes,nuevo_anoMaes,nuevo_ceduMaes,
            nuevo_maes2,nuevo_instMaes2,nuevo_anoMaes2,nuevo_ceduMaes2,nuevo_doc,nuevo_instDoc,nuevo_anoDoc,
            nuevo_ceduDoc,nuevo_doc2,nuevo_instdoc2,nuevo_anoDoc2,nuevo_ceduDoc2,nuevo_actiPuesto,
            nuevo_instGesAca,nuevo_tiemGesAca,nuevo_tiemGesAcaA,nuevo_actiPues2,nuevo_intGesAca2,
            nuevo_tiemGesAca2,nuevo_tiemGesAcaA2,nuevo_actiPues3,nuevo_intGesAca3,nuevo_tiemGesAca3,
            nuevo_tiemGesAcaA3,nuevo_actiPues4,nuevo_intGesAca4,nuevo_tiemGesAca4,nuevo_tiemGesAcaA4,
            nuevo_tipoCapa,nuevo_instPaisCapa,nuevo_anoObtencionCapa,nuevo_horasCapa,nuevo_capa2,
            nuevo_intCapa2,nuevo_anoCapa2,nuevo_horaCapa2,nuevo_capa3,nuevo_instcapa3,nuevo_anoCapa3,
            nuevo_horaCapa3,nuevo_capa4,nuevo_instcapa4,nuevo_anoCapa4,nuevo_horaCapa4,nuevo_tipoActua,
            nuevo_instPaisActua,nuevo_anoObtencionActua,nuevo_horasActua,nuevo_actua2,nuevo_instPaisActua2,
            nuevo_anoActua2,nuevo_horaActua2,nuevo_actua3,nuevo_instactua3,nuevo_anoactua3,nuevo_horaactua3,
            nuevo_actua4,nuevo_instactua4,nuevo_anoactua4,nuevo_horaactua4,nuevo_desProdAca,nuevo_desProdAca2,
            nuevo_desProdAca3,nuevo_desProdAca4,nuevo_desProdAca5,nuevo_desProdAca6,nuevo_desProdAca7,nuevo_desProdAca8,
            nuevo_actiPuestoProfe,nuevo_OrgaEmp,nuevo_tiemProfe,nuevo_tiemProfeA,nuevo_actiPuestoProfe2,
            nuevo_OrgaEmp2,nuevo_tiemProfe2,nuevo_tiemProfeA2,nuevo_actiPuesProfe3,nuevo_OrgaEmp3,nuevo_tiemProfe3,
            nuevo_tiemProfeA3,nuevo_actiPuesProfe4,nuevo_OrgaEmp4,nuevo_tiemProfe4,nuevo_tiemProfeA4,nuevo_organismo,
            nuevo_periodo,nuevo_nivelExp,nuevo_organismo2,nuevo_periodo2,nuevo_nivelExp2,nuevo_nivelExp3,nuevo_periodo3,
            nuevo_organismo3,nuevo_nivelExp4,nuevo_periodo4,nuevo_organismo4,nuevo_desLogAca,nuevo_desLogAca2,
            nuevo_desLogAca3,nuevo_desLogAca4,nuevo_desLogAca5,nuevo_desPreReca,nuevo_desPreRec2,nuevo_desPreRec3,
            nuevo_desPreRec4,nuevo_desPreRec5,nuevo_orgColeCam,nuevo_periColeCam,nuevo_nivelPart,nuevo_orgColeCam2,
            nuevo_periColeCam2,nuevo_nivelPart2,nuevo_orgColeCam3,nuevo_periColeCam3,nuevo_nivelPart3,nuevo_orgColeCam4,
            nuevo_periColeCam4,nuevo_nivelPart4,nuevo_aportacionPE;
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


        guardar_tipoCapa= findViewById(R.id.guardar_tipoCapa);
        tipoCapa_texto= findViewById(R.id.instGesAca_texto);
        tipoCapa= findViewById(R.id.instGesAca);
        caja_edit_tipoCapa= findViewById(R.id.caja_edit_tipoCapa);
        caja_tipoCapa_final= findViewById(R.id.caja_tipoCapa_final);
        cambiar_tipoCapa= findViewById(R.id.cambiar_tipoCapa);

        guardar_instPaisCapa= findViewById(R.id.guardar_instPaisCapa);
        instPaisCapa_texto= findViewById(R.id.instPaisCapa_texto);
        instPaisCapa= findViewById(R.id.instPaisCapa);
        caja_edit_instPaisCapa= findViewById(R.id.caja_edit_instPaisCapa);
        caja_instPaisCapa_final = findViewById(R.id.caja_instPaisCapa_final);
        cambiar_instPaisCapa = findViewById(R.id.cambiar_tiemGesAca);


        guardar_anoObtencionCapa= findViewById(R.id.guardar_anoObtencionCapa);
        anoObtencionCapa_texto= findViewById(R.id.anoObtencionCapa_texto);
        anoObtencionCapa= findViewById(R.id.anoObtencionCapa);
        caja_edit_anoObtencionCapa= findViewById(R.id.caja_edit_anoObtencionCapa);
        caja_anoObtencionCapa_final= findViewById(R.id.caja_anoObtencionCapa_final);
        cambiar_anoObtencionCapa = findViewById(R.id.cambiar_anoObtencionCapa);

        guardar_horasCapa= findViewById(R.id.guardar_horasCapa);
        horasCapa_texto= findViewById(R.id.horasCapa_texto);
        horasCapa= findViewById(R.id.horasCapa);
        caja_edit_horasCapa= findViewById(R.id.caja_edit_horasCapa);
        caja_horasCapa_final= findViewById(R.id.caja_horasCapa_final);
        cambiar_horasCapa= findViewById(R.id.cambiar_horasCapa);

        guardar_capa2= findViewById(R.id.guardar_capa2);
        capa2_texto= findViewById(R.id.capa2_texto);
        capa2= findViewById(R.id.capa2);
        caja_capa2_final = findViewById(R.id.caja_capa2_final);
        cambiar_capa2= findViewById(R.id.cambiar_capa2);


        guardar_intCapa2= findViewById(R.id.guardar_intCapa2);
        intCapa2_texto = findViewById(R.id.intCapa2_texto);
        intCapa2= findViewById(R.id.intCapa2);
        caja_intCapa2_final= findViewById(R.id.caja_intCapa2_final);
        cambiar_CapaIns2= findViewById(R.id.cambiar_CapaIns2);


        guardar_anoCapa2= findViewById(R.id.guardar_anoCapa2);
        anoCapa2_texto= findViewById(R.id.anoCapa2_texto);
        anoCapa2 = findViewById(R.id.anoCapa2);
        caja_anoCapa2_final = findViewById(R.id.caja_anoCapa2_final);
        cambiar_anoCapa2= findViewById(R.id.cambiar_anoCapa2);

        guardar_horaCapa2= findViewById(R.id.guardar_horaCapa2);
        horaCapa2_texto= findViewById(R.id.horaCapa2_texto);
        horaCapa2 = findViewById(R.id.horaCapa2);
        caja_horaCapa2_final= findViewById(R.id.caja_horaCapa2_final);
        cambiar_horaCapa2= findViewById(R.id.cambiar_horaCapa2);

        guardar_capa3= findViewById(R.id.guardar_capa3);
        capa3_texto= findViewById(R.id.capa3_texto);
        capa3= findViewById(R.id.capa3);
        caja_capa3_final = findViewById(R.id.caja_capa3_final);
        cambiar_capa3= findViewById(R.id.cambiar_capa3);

        guardar_instcapa3= findViewById(R.id.guardar_instcapa3);
        instcapa3_texto= findViewById(R.id.instcapa3_texto);
        instcapa3 = findViewById(R.id.instcapa3);
        caja_instcapa3_final = findViewById(R.id.caja_instcapa3_final);
        cambiar_instcapa3= findViewById(R.id.cambiar_instcapa3);

        guardar_anoCapa3 = findViewById(R.id.guardar_anoCapa3);
        anoCapa3_texto= findViewById(R.id.anoCapa3_texto);
        anoCapa3_vista= findViewById(R.id.anoCapa3_vista);
        caja_anoCapa3_final= findViewById(R.id.caja_anoCapa3_final);
        cambiar_anoCapa3= findViewById(R.id.cambiar_anoCapa3);


        guardar_horaCapa3 = findViewById(R.id.guardar_horaCapa3);
        horaCapa3_texto = findViewById(R.id.horaCapa3_texto);
        horaCapa3 = findViewById(R.id.horaCapa3);
        caja_horaCapa3_final= findViewById(R.id.caja_horaCapa3_final);
        cambiar_horaCapa3= findViewById(R.id.cambiar_horaCapa3);


        guardar_capa4= findViewById(R.id.guardar_capa4);
        capa4_texto = findViewById(R.id.capa4_texto);
        capa4= findViewById(R.id.capa4);
        capa4_final= findViewById(R.id.capa4_final);
        cambiar_capa4 = findViewById(R.id.cambiar_capa4);

        guardar_instcapa4= findViewById(R.id.guardar_instcapa4);
        instcapa4_texto= findViewById(R.id.instcapa4_texto);
        instcapa4= findViewById(R.id.instcapa4);
        caja_instcapa4_final= findViewById(R.id.caja_instcapa4_final);
        cambiar_instcapa4= findViewById(R.id.cambiar_instcapa4);

        guardar_anoCapa4= findViewById(R.id.guardar_anoCapa4);
        anoCapa4_texto= findViewById(R.id.anoCapa4_texto);
        anoCapa4_vista = findViewById(R.id.anoCapa4_vista);
        caja_anoCapa4_final= findViewById(R.id.caja_anoCapa4_final);
        cambiar_anoCapa4= findViewById(R.id.cambiar_anoCapa4);

        guardar_horaCapa4 = findViewById(R.id.guardar_horaCapa4);
        horaCapa4_texto= findViewById(R.id.horaCapa4_texto);
        horaCapa4= findViewById(R.id.horaCapa4);
        caja_horaCapa4_final = findViewById(R.id.caja_horaCapa4_final);
        cambiar_horaCapa4= findViewById(R.id.cambiar_horaCapa4);


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

        guardar_tipoActua= findViewById(R.id.guardar_tipoActua);
        tipoActua_texto= findViewById(R.id.tipoActua_texto);
        tipoActua= findViewById(R.id.tipoActua);
        caja_edit_tipoActua= findViewById(R.id.caja_edit_tipoActua);
        caja_tipoActua_final = findViewById(R.id.caja_tipoActua_final);
        cambiar_tipoActua = findViewById(R.id.cambiar_tipoActua);

        guardar_instPaisActua= findViewById(R.id.guardar_instPaisActua);
        instPaisActua_texto= findViewById(R.id.instPaisActua_texto);
        instPaisActua = findViewById(R.id.instPaisActua);
        caja_edit_instPaisActua= findViewById(R.id.caja_edit_instPaisActua);
        caja_instPaisActua_final = findViewById(R.id.caja_instPaisActua_final);
        cambiar_instPaisActua = findViewById(R.id.cambiar_instPaisActua);


        guardar_anoObtencionActua= findViewById(R.id.guardar_anoObtencionActua);
        anoObtencionActua_texto = findViewById(R.id.anoObtencionActua_texto);
        anoObtencionActua= findViewById(R.id.anoObtencionActua);
        caja_edit_anoObtencionActua= findViewById(R.id.caja_edit_anoObtencionActua);
        caja_anoObtencionActua_final= findViewById(R.id.caja_anoObtencionActua_final);
        cambiar_anoObtencionActua= findViewById(R.id.cambiar_anoObtencionActua);

        guardar_horasActua= findViewById(R.id.guardar_horasActua);
        horasActua_texto= findViewById(R.id.horasActua_texto);
        horasActua= findViewById(R.id.horasActua);
        caja_edit_horasActua= findViewById(R.id.caja_edit_horasActua);
        caja_horasActua_final= findViewById(R.id.caja_horasActua_final);
        cambiar_horasActua= findViewById(R.id.cambiar_horasActua);

        guardar_actua2= findViewById(R.id.guardar_actua2);
        actua2_texto= findViewById(R.id.actua2_texto);
        actua2 = findViewById(R.id.actua2);
        caja_actua2_final= findViewById(R.id.caja_actua2_final);
        cambiar_actua2= findViewById(R.id.cambiar_actua2);


        guardar_instPaisActua2= findViewById(R.id.guardar_instPaisActua2);
        instPaisActua2_texto = findViewById(R.id.instPaisActua2_texto);
        instPaisActua2 = findViewById(R.id.instPaisActua2);
        caja_instPaisActua2_final = findViewById(R.id.caja_instPaisActua2_final);
        cambiar_instPaisActua2= findViewById(R.id.cambiar_instPaisActua2);


        guardar_anoActua2= findViewById(R.id.guardar_anoActua2);
        anoActua2_texto= findViewById(R.id.anoActua2_texto);
        anoActua2= findViewById(R.id.anoActua2);
        caja_anoActua2_final= findViewById(R.id.caja_anoActua2_final);
        cambiar_anoActua2= findViewById(R.id.cambiar_anoActua2);

        guardar_horaActua2= findViewById(R.id.guardar_horaActua2);
        horaActua2_texto= findViewById(R.id.horaActua2_texto);
        horaActua2= findViewById(R.id.horaActua2);
        caja_horaActua2_final= findViewById(R.id.caja_horaActua2_final);
        cambiar_horaActua2 = findViewById(R.id.cambiar_horaActua2);

        guardar_actua3= findViewById(R.id.guardar_actua3);
        actua3_texto = findViewById(R.id.actua3_texto);
        actua3= findViewById(R.id.actua3);
        caja_actua3_final = findViewById(R.id.caja_actua3_final);
        cambiar_actua3= findViewById(R.id.cambiar_actua3);

        guardar_instactua3= findViewById(R.id.guardar_instactua3);
        instactua3_texto= findViewById(R.id.instactua3_texto);
        instactua3= findViewById(R.id.instactua3);
        caja_instactua3_final = findViewById(R.id.caja_instactua3_final);
        cambiar_instactua3 = findViewById(R.id.cambiar_instactua3);

        guardar_anoactua3 = findViewById(R.id.guardar_anoactua3);
        anoactua3_texto= findViewById(R.id.anoactua3_texto);
        anoactua3_vista = findViewById(R.id.anoactua3_vista);
        caja_anoactua3_final= findViewById(R.id.caja_anoactua3_final);
        cambiar_anoactua3 = findViewById(R.id.cambiar_anoactua3);


        guardar_horaactua3= findViewById(R.id.guardar_horaactua3);
        horaactua3_texto = findViewById(R.id.horaactua3_texto);
        horaactua3 = findViewById(R.id.horaactua3);
        caja_horaactua3_final= findViewById(R.id.caja_horaactua3_final);
        cambiar_horaactua3= findViewById(R.id.cambiar_horaactua3);


        guardar_actua4= findViewById(R.id.guardar_actua4);
        actua4_texto = findViewById(R.id.actua4_texto);
        actua4= findViewById(R.id.actua4);
        caja_actua4_final = findViewById(R.id.caja_actua4_final);
        cambiar_actua4 = findViewById(R.id.cambiar_actua4);

        guardar_instactua4= findViewById(R.id.guardar_instactua4);
        instactua4_texto= findViewById(R.id.instactua4_texto);
        instactua4= findViewById(R.id.instactua4);
        caja_instactua4_final= findViewById(R.id.caja_instactua4_final);
        cambiar_instactua4= findViewById(R.id.cambiar_instactua4);

        guardar_anoactua4= findViewById(R.id.guardar_anoactua4);
        anoactua4_texto= findViewById(R.id.anoactua4_texto);
        anoactua4_vista = findViewById(R.id.anoactua4_vista);
        caja_anoactua4_final= findViewById(R.id.caja_anoactua4_final);
        cambiar_anoactua4 = findViewById(R.id.cambiar_anoactua4);

        guardar_horaactua4= findViewById(R.id.guardar_horaactua4);
        horaactua4_texto= findViewById(R.id.horaactua4_texto);
        horaactua4= findViewById(R.id.horaactua4);
        caja_horaactua4_final= findViewById(R.id.caja_horaactua4_final);
        cambiar_horaactua4= findViewById(R.id.cambiar_horaactua4);



        guardar_actiPuesto= findViewById(R.id.guardar_actiPuesto);
        actiPuesto_texto = findViewById(R.id.actiPuesto_texto);
        actiPuesto = findViewById(R.id.actiPuesto);
        caja_edit_actiPuesto = findViewById(R.id.caja_edit_actiPuesto);
        caja_actiPuesto_final = findViewById(R.id.caja_actiPuesto_final);
        cambiar_actiPuesto = findViewById(R.id.cambiar_actiPuesto);

        guardar_instGesAca = findViewById(R.id.guardar_instGesAca);
        instGesAca_texto = findViewById(R.id.instGesAca_texto);
        instGesAca = findViewById(R.id.instGesAca);
        caja_edit_instGesAca = findViewById(R.id.caja_edit_instGesAca);
        caja_instGesAca_final = findViewById(R.id.caja_instGesAca_final);
        cambiar_instGesAca = findViewById(R.id.cambiar_instGesAca);

        guardar_tiemGesAca = findViewById(R.id.guardar_tiemGesAca);
        tiemGesAca_texto = findViewById(R.id.tiemGesAca_texto);
        tiemGesAca = findViewById(R.id.tiemGesAca);
        caja_edit_tiemGesAca = findViewById(R.id.caja_edit_tiemGesAca);
        caja_tiemGesAca_final = findViewById(R.id.caja_tiemGesAca_final);
        cambiar_tiemGesAca = findViewById(R.id.cambiar_tiemGesAca);


        guardar_tiemGesAcaA = findViewById(R.id.guardar_tiemGesAcaA);
        tiemGesAcaA_texto = findViewById(R.id.tiemGesAcaA_texto);
        tiemGesAcaA = findViewById(R.id.tiemGesAcaA);
        caja_edit_tiemGesAcaA = findViewById(R.id.caja_edit_tiemGesAcaA);
        caja_tiemGesAcaA_final = findViewById(R.id.caja_tiemGesAcaA_final);
        cambiar_tiemGesAcaA = findViewById(R.id.cambiar_tiemGesAcaA);


        guardar_actiPues2 = findViewById(R.id.guardar_actiPues2);
        actiPues2_texto = findViewById(R.id.actiPues2_texto);
        actiPues2 = findViewById(R.id.actiPues2);
        caja_actiPues2_final = findViewById(R.id.caja_actiPues2_final);
        cambiar_actiPues2 = findViewById(R.id.cambiar_actiPues2);


        guardar_intGesAca2 = findViewById(R.id.guardar_intGesAca2);
        intGesAca2_texto = findViewById(R.id.intGesAca2_texto);
        intGesAca2 = findViewById(R.id.intGesAca2);
        caja_intGesAca2_final = findViewById(R.id.caja_intGesAca2_final);
        cambiar_intGesAca2 = findViewById(R.id.cambiar_intGesAca2);


        guardar_tiemGesAca2 = findViewById(R.id.guardar_tiemGesAca2);
        tiemGesAca2_texto = findViewById(R.id.tiemGesAca2_texto);
        tiemGesAca2 = findViewById(R.id.tiemGesAca2);
        caja_tiemGesAca2_final = findViewById(R.id.caja_tiemGesAca2_final);
        cambiar_tiemGesAca2 = findViewById(R.id.cambiar_tiemGesAca2);

        guardar_tiemGesAcaA2 = findViewById(R.id.guardar_tiemGesAcaA2);
        tiemGesAcaA2_texto = findViewById(R.id.tiemGesAcaA2_texto);
        tiemGesAcaA2 = findViewById(R.id.tiemGesAcaA2);
        caja_tiemGesAcaA2_final = findViewById(R.id.caja_tiemGesAcaA2_final);
        cambiar_tiemGesAcaA2 = findViewById(R.id.cambiar_tiemGesAcaA2);

        guardar_actiPues3 = findViewById(R.id.guardar_actiPues3);
        actiPues3_texto = findViewById(R.id.actiPues3_texto);
        actiPues3 = findViewById(R.id.actiPues3);
        caja_actiPues3_final = findViewById(R.id.caja_actiPues3_final);
        cambiar_actiPues3 = findViewById(R.id.cambiar_actiPues3);

        guardar_intGesAca3 = findViewById(R.id.guardar_intGesAca3);
        intGesAca3_texto = findViewById(R.id.intGesAca3_texto);
        intGesAca3 = findViewById(R.id.intGesAca3);
        caja_intGesAca3_final = findViewById(R.id.caja_intGesAca3_final);
        cambiar_intGesAca3 = findViewById(R.id.cambiar_intGesAca3);

        guardar_tiemGesAca3 = findViewById(R.id.guardar_tiemGesAca3);
        tiemGesAca3_texto = findViewById(R.id.tiemGesAca3_texto);
        tiemGesAca3_vista = findViewById(R.id.tiemGesAca3_vista);
        caja_tiemGesAca3_final = findViewById(R.id.caja_tiemGesAca3_final);
        cambiar_tiemGesAca3 = findViewById(R.id.cambiar_tiemGesAca3);


        guardar_tiemGesAcaA3 = findViewById(R.id.guardar_tiemGesAcaA3);
        tiemGesAcaA3_texto = findViewById(R.id.tiemGesAcaA3_texto);
        tiemGesAcaA3 = findViewById(R.id.tiemGesAcaA3);
        caja_tiemGesAcaA3_final = findViewById(R.id.caja_tiemGesAcaA3_final);
        cambiar_tiemGesAcaA3 = findViewById(R.id.cambiar_tiemGesAcaA3);


        guardar_actiPues4 = findViewById(R.id.guardar_actiPues4);
        actiPues4_texto = findViewById(R.id.actiPues4_texto);
        actiPues4 = findViewById(R.id.actiPues4);
        caja_actiPues4_final = findViewById(R.id.caja_actiPues4_final);
        cambiar_actiPues4 = findViewById(R.id.cambiar_actiPues4);

        guardar_intGesAca4 = findViewById(R.id.guardar_intGesAca4);
        intGesAca4_texto = findViewById(R.id.intGesAca4_texto);
        intGesAca4 = findViewById(R.id.intGesAca4);
        caja_intGesAca4_final = findViewById(R.id.caja_intGesAca4_final);
        cambiar_intGesAca4 = findViewById(R.id.cambiar_intGesAca4);

        guardar_tiemGesAca4 = findViewById(R.id.guardar_tiemGesAca4);
        tiemGesAca4_texto = findViewById(R.id.tiemGesAca4_texto);
        tiemGesAca4_vista = findViewById(R.id.tiemGesAca4_vista);
        caja_tiemGesAca4_final = findViewById(R.id.caja_tiemGesAca4_final);
        cambiar_tiemGesAca4 = findViewById(R.id.cambiar_tiemGesAca4);

        guardar_tiemGesAcaA4 = findViewById(R.id.guardar_tiemGesAcaA4);
        tiemGesAcaA4_texto = findViewById(R.id.tiemGesAcaA4_texto);
        tiemGesAcaA4 = findViewById(R.id.tiemGesAcaA4);
        caja_tiemGesAcaA4_final = findViewById(R.id.caja_tiemGesAcaA4_final);
        cambiar_tiemGesAcaA4 = findViewById(R.id.cambiar_tiemGesAcaA4);

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

        guardar_desProdAca= findViewById(R.id.guardar_desProdAca);
        desProdAca_texto= findViewById(R.id.desProdAca_texto);
        desProdAca= findViewById(R.id.desProdAca);
        caja_edit_desProdAca= findViewById(R.id.caja_edit_desProdAca);
        caja_desProdAca2_final= findViewById(R.id.caja_desProdAca2_final);
        cambiar_desProdAca= findViewById(R.id.cambiar_desProdAca);

        guardar_desProdAca2 = findViewById(R.id.guardar_desProdAca2);
        desProdAca2_texto= findViewById(R.id.desProdAca2_texto);
        desProdAca2= findViewById(R.id.desProdAca2);
        caja_edit_desProdAca2= findViewById(R.id.caja_edit_desProdAca2);
        caja_desProdAca_final= findViewById(R.id.caja_desProdAca_final);
        cambiar_desProdAca2= findViewById(R.id.cambiar_desProdAca2);

        guardar_desProdAca3 = findViewById(R.id.guardar_desProdAca3);
        desProdAca3_texto= findViewById(R.id.desProdAca3_texto);
        desProdAca3= findViewById(R.id.desProdAca3);
        caja_edit_desProdAca3= findViewById(R.id.caja_edit_desProdAca3);
        caja_desProdAca3_final= findViewById(R.id.caja_desProdAca3_final);
        cambiar_desProdAca3= findViewById(R.id.cambiar_desProdAca3);

        guardar_desProdAca4= findViewById(R.id.guardar_desProdAca4);
        desProdAca4_texto= findViewById(R.id.desProdAca4_texto);
        desProdAca4 = findViewById(R.id.desProdAca4);
        caja_edit_desProdAca4 = findViewById(R.id.caja_edit_desProdAca4);
        caja_desProdAca4_final = findViewById(R.id.caja_desProdAca4_final);
        cambiar_desProdAca4= findViewById(R.id.cambiar_desProdAca4);

        guardar_desProdAca5 = findViewById(R.id.guardar_desProdAca5);
        desProdAca5_texto= findViewById(R.id.desProdAca5_texto);
        desProdAca5= findViewById(R.id.desProdAca5);
        caja_edit_desProdAca5= findViewById(R.id.caja_edit_desProdAca5);
        caja_desProdAca5_final= findViewById(R.id.caja_desProdAca5_final);
        cambiar_desProdAca5= findViewById(R.id.cambiar_desProdAca5);

        guardar_desProdAca6= findViewById(R.id.guardar_desProdAca6);
        desProdAca6_texto= findViewById(R.id.desProdAca6_texto);
        desProdAca6 = findViewById(R.id.desProdAca6);
        caja_edit_desProdAca6= findViewById(R.id.caja_edit_desProdAca6);
        caja_desProdAca6_final= findViewById(R.id.caja_desProdAca6_final);
        cambiar_desProdAca6= findViewById(R.id.cambiar_desProdAca6);

        guardar_desProdAca7= findViewById(R.id.guardar_desProdAca7);
        desProdAca7_texto = findViewById(R.id.desProdAca7_texto);
        desProdAca7= findViewById(R.id.desProdAca7);
        caja_edit_desProdAca7= findViewById(R.id.caja_edit_desProdAca7);
        caja_desProdAca7_final = findViewById(R.id.caja_desProdAca7_final);
        cambiar_desProdAca7= findViewById(R.id.cambiar_desProdAca7);

        guardar_desProdAca8= findViewById(R.id.guardar_desProdAca8);
        desProdAca8_texto = findViewById(R.id.desProdAca8_texto);
        desProdAca8= findViewById(R.id.desProdAca8);
        caja_edit_desProdAca8= findViewById(R.id.caja_edit_desProdAca8);
        caja_desProdAca8_final= findViewById(R.id.caja_desProdAca8_final);
        cambiar_desProdAca8= findViewById(R.id.cambiar_desProdAca8);

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

        guardar_actiPuestoProfe= findViewById(R.id.guardar_actiPuestoProfe);
        actiPuestoProfe_texto = findViewById(R.id.actiPuestoProfe_texto);
        actiPuestoProfe= findViewById(R.id.actiPuestoProfe);
        caja_edit_actiPuestoProfe= findViewById(R.id.caja_edit_actiPuestoProfe);
        caja_actiPuestoProfe_final= findViewById(R.id.caja_actiPuestoProfe_final);
        cambiar_actiPuestoProfe = findViewById(R.id.cambiar_actiPuestoProfe);

        guardar_OrgaEmp= findViewById(R.id.guardar_OrgaEmp);
        OrgaEmp_texto= findViewById(R.id.OrgaEmp_texto);
        OrgaEmp= findViewById(R.id.OrgaEmp);
        caja_edit_OrgaEmp = findViewById(R.id.caja_edit_OrgaEmp);
        caja_OrgaEmp_final= findViewById(R.id.caja_OrgaEmp_final);
        cambiar_OrgaEmp = findViewById(R.id.cambiar_OrgaEmp);

        guardar_tiemProfe = findViewById(R.id.guardar_tiemProfe);
        tiemProfe_texto= findViewById(R.id.tiemProfe_texto);
        tiemProfe= findViewById(R.id.tiemProfe);
        caja_edit_tiemProfe = findViewById(R.id.caja_edit_tiemProfe);
        caja_tiemProfe_final= findViewById(R.id.caja_tiemProfe_final);
        cambiar_tiemProfe= findViewById(R.id.cambiar_tiemProfe);


        guardar_tiemProfeA = findViewById(R.id.guardar_tiemProfeA);
        tiemProfeA_texto= findViewById(R.id.tiemProfeA_texto);
        tiemProfeA= findViewById(R.id.tiemProfeA);
        caja_edit_tiemProfeA= findViewById(R.id.caja_edit_tiemProfeA);
        caja_tiemProfeA_final = findViewById(R.id.caja_tiemProfeA_final);
        cambiar_tiemProfeA = findViewById(R.id.cambiar_tiemProfeA);


        guardar_actiPuestoProfe2= findViewById(R.id.guardar_actiPuestoProfe2);
        actiPuestoProfe2_texto= findViewById(R.id.actiPuestoProfe2_texto);
        actiPuestoProfe2= findViewById(R.id.actiPuestoProfe2);
        caja_actiPuestoProfe2_final= findViewById(R.id.caja_actiPuestoProfe2_final);
        cambiar_actiPuestoProfe2 = findViewById(R.id.cambiar_actiPuestoProfe2);


        guardar_OrgaEmp2 = findViewById(R.id.guardar_OrgaEmp2);
        OrgaEmp2_texto= findViewById(R.id.OrgaEmp2_texto);
        OrgaEmp2 = findViewById(R.id.OrgaEmp2);
        caja_OrgaEmp2_final = findViewById(R.id.caja_OrgaEmp2_final);
        cambiar_OrgaEmp2 = findViewById(R.id.cambiar_OrgaEmp2);


        guardar_tiemProfe2= findViewById(R.id.guardar_tiemProfe2);
        tiemProfe2_texto= findViewById(R.id.tiemProfe2_texto);
        tiemProfe2= findViewById(R.id.tiemProfe2);
        caja_tiemProfe2_final= findViewById(R.id.caja_tiemProfe2_final);
        cambiar_tiemProfe2 = findViewById(R.id.cambiar_tiemProfe2);

        guardar_tiemProfeA2 = findViewById(R.id.guardar_tiemProfeA2);
        tiemProfeA2_texto= findViewById(R.id.tiemProfeA2_texto);
        tiemProfeA2= findViewById(R.id.tiemProfeA2);
        caja_tiemProfeA2_final = findViewById(R.id.caja_tiemProfeA2_final);
        cambiar_tiemProfeA2= findViewById(R.id.cambiar_tiemProfeA2);

        guardar_actiPuesProfe3= findViewById(R.id.guardar_actiPuesProfe3);
        actiPuesProfe3_texto = findViewById(R.id.actiPuesProfe3_texto);
        actiPuesProfe3= findViewById(R.id.actiPuesProfe3);
        caja_actiPuesProfe3_final= findViewById(R.id.caja_actiPuesProfe3_final);
        cambiar_actiPuesProfe3= findViewById(R.id.cambiar_actiPuesProfe3);

        guardar_OrgaEmp3= findViewById(R.id.guardar_OrgaEmp3);
        OrgaEmp3_texto= findViewById(R.id.OrgaEmp3_texto);
        OrgaEmp3= findViewById(R.id.OrgaEmp3);
        caja_OrgaEmp3_final= findViewById(R.id.caja_OrgaEmp3_final);
        cambiar_OrgaEmp3= findViewById(R.id.cambiar_OrgaEmp3);

        guardar_tiemProfe3= findViewById(R.id.guardar_tiemProfe3);
        tiemProfe3_texto= findViewById(R.id.tiemProfe3_texto);
        tiemProfe3_vista= findViewById(R.id.tiemProfe3_vista);
        caja_tiemProfe3_final= findViewById(R.id.caja_tiemProfe3_final);
        cambiar_tiemProfe3= findViewById(R.id.cambiar_tiemProfe3);


        guardar_tiemProfeA3= findViewById(R.id.guardar_tiemProfeA3);
        tiemProfeA3_texto= findViewById(R.id.tiemProfeA3_texto);
        tiemProfeA3= findViewById(R.id.tiemProfeA3);
        caja_tiemProfeA3_final= findViewById(R.id.caja_tiemProfeA3_final);
        cambiar_tiemProfeA3= findViewById(R.id.cambiar_tiemProfeA3);


        guardar_actiPuesProfe4= findViewById(R.id.guardar_actiPuesProfe4);
        actiPuesProfe4_texto = findViewById(R.id.actiPuesProfe4_texto);
        actiPuesProfe4= findViewById(R.id.actiPuesProfe4);
        caja_actiPuesProfe4_final= findViewById(R.id.caja_actiPuesProfe4_final);
        cambiar_actiPuesProfe4= findViewById(R.id.cambiar_actiPuesProfe4);

        guardar_OrgaEmp4= findViewById(R.id.guardar_OrgaEmp4);
        OrgaEmp4_texto= findViewById(R.id.OrgaEmp4_texto);
        OrgaEmp4= findViewById(R.id.OrgaEmp4);
        caja_OrgaEmp4_final= findViewById(R.id.caja_OrgaEmp4_final);
        cambiar_OrgaEmp4= findViewById(R.id.cambiar_OrgaEmp4);

        guardar_tiemProfe4 = findViewById(R.id.guardar_tiemProfe4);
        tiemProfe4_texto= findViewById(R.id.tiemProfe4_texto);
        tiemProfe4_vista= findViewById(R.id.tiemProfe4_vista);
        caja_tiemProfe4_final= findViewById(R.id.caja_tiemProfe4_final);
        cambiar_tiemProfe4= findViewById(R.id.cambiar_tiemProfe4);

        guardar_tiemProfeA4= findViewById(R.id.guardar_tiemProfeA4);
        tiemProfeA4_texto = findViewById(R.id.tiemProfeA4_texto);
        tiemProfeA4= findViewById(R.id.tiemProfeA4);
        caja_tiemProfeA4_final= findViewById(R.id.caja_tiemProfeA4_final);
        cambiar_tiemProfeA4= findViewById(R.id.cambiar_tiemProfeA4);

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

        guardar_organismo= findViewById(R.id.guardar_organismo);
        organismo_texto= findViewById(R.id.organismo_texto);
        organismo= findViewById(R.id.organismo);
        caja_edit_organismo= findViewById(R.id.caja_edit_organismo);
        caja_organismo_final = findViewById(R.id.caja_organismo_final);
        cambiar_organismo= findViewById(R.id.cambiar_organismo);

        guardar_periodo= findViewById(R.id.guardar_periodo);
        periodo_texto= findViewById(R.id.periodo_texto);
        periodo= findViewById(R.id.periodo);
        caja_edit_periodo= findViewById(R.id.caja_edit_periodo);
        caja_periodo_final= findViewById(R.id.caja_periodo_final);
        cambiar_periodo= findViewById(R.id.cambiar_periodo);

        guardar_nivelExp = findViewById(R.id.guardar_nivelExp);
        nivelExp_texto = findViewById(R.id.nivelExp_texto);
        nivelExp= findViewById(R.id.nivelExp);
        caja_edit_nivelExp = findViewById(R.id.caja_edit_nivelExp);
        caja_nivelExp_final= findViewById(R.id.caja_nivelExp_final);
        cambiar_nivelExp= findViewById(R.id.cambiar_nivelExp);


        guardar_organismo2= findViewById(R.id.guardar_organismo2);
        organismo2_texto= findViewById(R.id.organismo2_texto);
        organismo2 = findViewById(R.id.organismo2);
        caja_organismo2_final = findViewById(R.id.caja_organismo2_final);
        cambiar_organismo2= findViewById(R.id.cambiar_organismo2);



        guardar_periodo2= findViewById(R.id.guardar_periodo2);
        periodo2_texto= findViewById(R.id.periodo2_texto);
        periodo2 = findViewById(R.id.periodo2);
        caja_periodo2_final= findViewById(R.id.caja_periodo2_final);
        cambiar_periodo2= findViewById(R.id.cambiar_periodo2);


        guardar_nivelExp2= findViewById(R.id.guardar_nivelExp2);
        nivelExp2_texto= findViewById(R.id.nivelExp2_texto);
        nivelExp2= findViewById(R.id.nivelExp2);
        caja_nivelExp2_final= findViewById(R.id.caja_nivelExp2_final);
        cambiar_nivelExp2= findViewById(R.id.cambiar_nivelExp2);


        guardar_organismo3= findViewById(R.id.guardar_organismo3);
        organismo3_texto= findViewById(R.id.organismo3_texto);
        organismo3= findViewById(R.id.organismo3);
        caja_organismo3_final= findViewById(R.id.caja_organismo3_final);
        cambiar_organismo3= findViewById(R.id.cambiar_organismo3);

        guardar_periodo3= findViewById(R.id.guardar_periodo3);
        periodo3_texto= findViewById(R.id.periodo3_texto);
        periodo3= findViewById(R.id.periodo3);
        caja_periodo3_final = findViewById(R.id.caja_periodo3_final);
        cambiar_periodo3= findViewById(R.id.cambiar_periodo3);

        guardar_nivelExp3 = findViewById(R.id.guardar_nivelExp3);
        nivelExp3_texto = findViewById(R.id.nivelExp3_texto);
        nivelExp3_vista= findViewById(R.id.nivelExp3_vista);
        caja_nivelExp3_final = findViewById(R.id.caja_nivelExp3_final);
        cambiar_nivelExp3 = findViewById(R.id.cambiar_nivelExp3);

        guardar_organismo4= findViewById(R.id.guardar_organismo4);
        organismo4_texto= findViewById(R.id.organismo4_texto);
        organismo4= findViewById(R.id.organismo4);
        caja_organismo4_final = findViewById(R.id.caja_organismo4_final);
        cambiar_organismo4 = findViewById(R.id.cambiar_organismo4);

        guardar_periodo4 = findViewById(R.id.guardar_periodo4);
        periodo4_texto = findViewById(R.id.periodo4_texto);
        periodo4 = findViewById(R.id.periodo4);
        caja_periodo4_final= findViewById(R.id.caja_periodo4_final);
        cambiar_periodo4= findViewById(R.id.cambiar_periodo4);


        guardar_nivelExp4 = findViewById(R.id.guardar_nivelExp4);
        nivelExp4_texto= findViewById(R.id.nivelExp4_texto);
        nivelExp4_vista= findViewById(R.id.nivelExp4_vista);
        caja_nivelExp4_final = findViewById(R.id.caja_nivelExp4_final);
        cambiar_nivelExp4= findViewById(R.id.cambiar_nivelExp4);





        formulario_logrosProfeNoAca = findViewById(R.id.formulario_logrosProfeNoAca);
        caja_siguiente_scroll8 = findViewById(R.id.caja_siguiente_scroll8);
        regresar_ExpDise = findViewById(R.id.regresar_ExpDise);
        ir_partColeCam = findViewById(R.id.ir_partColeCam);


        guardar_orgColeCam= findViewById(R.id.guardar_orgColeCam);
        orgColeCam_texto= findViewById(R.id.orgColeCam_texto);
        orgColeCam= findViewById(R.id.orgColeCam);
        caja_edit_orgColeCam= findViewById(R.id.caja_edit_orgColeCam);
        caja_orgColeCam_final = findViewById(R.id.caja_orgColeCam_final);
        cambiar_orgColeCam= findViewById(R.id.cambiar_orgColeCam);

        guardar_periColeCam = findViewById(R.id.guardar_periColeCam);
        periColeCam_texto= findViewById(R.id.periColeCam_texto);
        periColeCam= findViewById(R.id.periColeCam);
        caja_edit_periColeCam = findViewById(R.id.caja_edit_periColeCam);
        caja_periColeCam_final = findViewById(R.id.caja_periColeCam_final);
        cambiar_periColeCam = findViewById(R.id.cambiar_periColeCam);

        guardar_nivelPart = findViewById(R.id.guardar_nivelPart);
        nivelPart_texto= findViewById(R.id.nivelPart_texto);
        nivelPart= findViewById(R.id.nivelPart);
        caja_edit_nivelPart= findViewById(R.id.caja_edit_nivelPart);
        caja_nivelPart_final= findViewById(R.id.caja_nivelPart_final);
        cambiar_nivelPart= findViewById(R.id.cambiar_nivelPart);


        guardar_orgColeCam2= findViewById(R.id.guardar_orgColeCam2);
        orgColeCam2_texto = findViewById(R.id.orgColeCam2_texto);
        orgColeCam2 = findViewById(R.id.orgColeCam2);
        caja_orgColeCam2_final= findViewById(R.id.caja_orgColeCam2_final);
        cambiar_orgColeCam2= findViewById(R.id.cambiar_orgColeCam2);



        guardar_periColeCam2= findViewById(R.id.guardar_periColeCam2);
        periColeCam2_texto= findViewById(R.id.periColeCam2_texto);
        periColeCam2= findViewById(R.id.periColeCam2);
        caja_periColeCam2_final= findViewById(R.id.caja_periColeCam2_final);
        cambiar_periColeCam2= findViewById(R.id.cambiar_periColeCam2);


        guardar_nivelPart2 = findViewById(R.id.guardar_nivelPart2);
        nivelPart2_texto= findViewById(R.id.nivelPart2_texto);
        nivelPart2 = findViewById(R.id.nivelPart2);
        caja_nivelPart2_final= findViewById(R.id.caja_nivelPart2_final);
        cambiar_nivelPart2= findViewById(R.id.cambiar_nivelPart2);


        guardar_orgColeCam3= findViewById(R.id.guardar_orgColeCam3);
        orgColeCam3_texto = findViewById(R.id.orgColeCam3_texto);
        orgColeCam3= findViewById(R.id.orgColeCam3);
        caja_orgColeCam3_final= findViewById(R.id.caja_orgColeCam3_final);
        cambiar_orgColeCam3= findViewById(R.id.cambiar_orgColeCam3);

        guardar_periColeCam3= findViewById(R.id.guardar_periColeCam3);
        periColeCam3_texto= findViewById(R.id.periColeCam3_texto);
        periColeCam3 = findViewById(R.id.periColeCam3);
        caja_periColeCam3_final= findViewById(R.id.caja_periColeCam3_final);
        cambiar_periColeCam3 = findViewById(R.id.cambiar_periColeCam3);

        guardar_nivelPart3= findViewById(R.id.guardar_nivelPart3);
        nivelPart3_texto = findViewById(R.id.nivelPart3_texto);
        nivelPart3_vista= findViewById(R.id.nivelPart3_vista);
        caja_nivelPart3_final = findViewById(R.id.caja_nivelPart3_final);
        cambiar_nivelPart3= findViewById(R.id.cambiar_nivelPart3);

        guardar_orgColeCam4 = findViewById(R.id.guardar_orgColeCam4);
        orgColeCam4_texto= findViewById(R.id.orgColeCam4_texto);
        orgColeCam4= findViewById(R.id.orgColeCam4);
        caja_orgColeCam4_final= findViewById(R.id.caja_organismo4_final);
        cambiar_orgColeCam4= findViewById(R.id.cambiar_orgColeCam4);

        guardar_periColeCam4 = findViewById(R.id.guardar_periColeCam4);
        periColeCam4_texto = findViewById(R.id.periColeCam4_texto);
        periColeCam4= findViewById(R.id.periColeCam4);
        caja_periColeCam4_final= findViewById(R.id.caja_periColeCam4_final);
        cambiar_periColeCam4= findViewById(R.id.cambiar_periColeCam4);


        guardar_nivelPart4= findViewById(R.id.guardar_nivelPart4);
        nivelPart4_texto = findViewById(R.id.nivelPart4_texto);
        nivelPart4_vista= findViewById(R.id.nivelPart4_vista);
        caja_nivelPart4_final= findViewById(R.id.caja_nivelPart4_final);
        cambiar_nivelPart4= findViewById(R.id.cambiar_nivelPart4);

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

        guardar_desLogAca = findViewById(R.id.guardar_desLogAca);
        desLogAca_texto = findViewById(R.id.desLogAca_texto);
        desLogAca= findViewById(R.id.desLogAca);
        caja_edit_desLogAca= findViewById(R.id.caja_edit_desLogAca);
        caja_desLogAca_final= findViewById(R.id.caja_desLogAca_final);
        cambiar_desLogAca = findViewById(R.id.cambiar_desLogAca);

        guardar_desLogAca2= findViewById(R.id.guardar_desLogAca2);
        desLogAca2_texto= findViewById(R.id.desLogAca2_texto);
        desLogAca2 = findViewById(R.id.desLogAca2);
        caja_edit_desLogAca2 = findViewById(R.id.caja_edit_desLogAca2);
        caja_desLogAca2_final= findViewById(R.id.caja_desLogAca2_final);
        cambiar_desLogAca2= findViewById(R.id.cambiar_desLogAca2);

        guardar_desLogAca3= findViewById(R.id.guardar_desLogAca3);
        desLogAca3_texto = findViewById(R.id.desLogAca3_texto);
        desLogAca3= findViewById(R.id.desLogAca3);
        caja_edit_desLogAca3= findViewById(R.id.caja_edit_desLogAca3);
        caja_desLogAca3_final = findViewById(R.id.caja_desLogAca3_final);
        cambiar_desLogAca3 = findViewById(R.id.cambiar_desLogAca3);

        guardar_desLogAca4 = findViewById(R.id.guardar_desLogAca4);
        desLogAca4_texto = findViewById(R.id.desLogAca4_texto);
        desLogAca4= findViewById(R.id.desLogAca4);
        caja_edit_desLogAca4 = findViewById(R.id.caja_edit_desLogAca4);
        caja_desLogAca4_final= findViewById(R.id.caja_desLogAca4_final);
        cambiar_desLogAca4 = findViewById(R.id.cambiar_desLogAca4);

        guardar_desLogAca5= findViewById(R.id.guardar_desLogAca5);
        desLogAca5_texto= findViewById(R.id.desLogAca5_texto);
        desLogAca5= findViewById(R.id.desLogAca5);
        caja_edit_desLogAca5 = findViewById(R.id.caja_edit_desLogAca5);
        caja_desLogAca5_final= findViewById(R.id.caja_desLogAca5_final);
        cambiar_desLogAca5= findViewById(R.id.cambiar_desLogAca5);

        guardar_desPreRec= findViewById(R.id.guardar_desPreRec);
        desPreRec_texto= findViewById(R.id.desPreRec_texto);
        desPreRec= findViewById(R.id.desPreRec);
        caja_edit_desPreRec= findViewById(R.id.caja_edit_desPreRec);
        caja_desPreRec_final = findViewById(R.id.caja_desPreRec_final);
        cambiar_desPreRec= findViewById(R.id.cambiar_desPreRec);

        guardar_desPreRec2= findViewById(R.id.guardar_desPreRec2);
        desPreRec2_texto= findViewById(R.id.desPreRec2_texto);
        desPreRec2 = findViewById(R.id.desPreRec2);
        caja_edit_desPreRec2= findViewById(R.id.caja_edit_desPreRec2);
        caja_desPreRec2_final = findViewById(R.id.caja_desPreRec2_final);
        cambiar_desPreRec2 = findViewById(R.id.cambiar_desPreRec2);

        guardar_desPreRec3= findViewById(R.id.guardar_desPreRec3);
        desPreRec3_texto= findViewById(R.id.desPreRec3_texto);
        desPreRec3= findViewById(R.id.desPreRec3);
        caja_edit_desPreRec3= findViewById(R.id.caja_edit_desPreRec3);
        caja_desPreRec3_final = findViewById(R.id.caja_desPreRec3_final);
        cambiar_desPreRec3= findViewById(R.id.cambiar_desPreRec3);

        guardar_desPreRec4= findViewById(R.id.guardar_desPreRec4);
        desPreRec4_texto = findViewById(R.id.desPreRec4_texto);
        desPreRec4= findViewById(R.id.desPreRec4);
        caja_edit_desPreRec4= findViewById(R.id.caja_edit_desPreRec4);
        caja_desPreRec4_final= findViewById(R.id.caja_desPreRec4_final);
        cambiar_desPreRec4= findViewById(R.id.cambiar_desPreRec4);

        guardar_desPreRec5= findViewById(R.id.guardar_desPreRec5);
        desPreRec5_texto= findViewById(R.id.desPreRec5_texto);
        desPreRec5= findViewById(R.id.desPreRec5);
        caja_edit_desPreRec5= findViewById(R.id.caja_edit_desPreRec5);
        caja_desPreRec5_final= findViewById(R.id.caja_desPreRec5_final);
        cambiar_desPreRec5= findViewById(R.id.cambiar_desPreRec5);

        guardar_aportacionPE= findViewById(R.id.guardar_aportacionPE);
        aportacionPE_texto= findViewById(R.id.aportacionPE_texto);
        aportacionPE= findViewById(R.id.aportacionPE);
        caja_edit_aportacionPE= findViewById(R.id.caja_edit_aportacionPE);
        caja_aportacionPE_final= findViewById(R.id.caja_aportacionPE_final);
        cambiar_aportacionPE= findViewById(R.id.cambiar_aportacionPE);


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
        ir_formAcademica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulario_datosBasicos.setVisibility(View.GONE);
                formulario_formaDocente.setVisibility(View.VISIBLE);
            }
        });

        guardar_tipoCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tipoCapa = tipoCapa_texto.getText().toString();
                tipoCapa.setText(nuevo_tipoCapa);
                if (!nuevo_tipoCapa.trim().equals("")) {
                    caja_edit_tipoCapa.setVisibility(View.GONE);
                    caja_tipoCapa_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tipoCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tipoCapa.setVisibility(View.VISIBLE);
                caja_tipoCapa_final.setVisibility(View.GONE);

            }
        });
        guardar_instPaisCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instPaisCapa = instPaisCapa_texto.getText().toString();
                instPaisCapa.setText(nuevo_instPaisCapa);
                if (!nuevo_instPaisCapa.trim().equals("")) {
                    caja_edit_instPaisCapa.setVisibility(View.GONE);
                    caja_instPaisCapa_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instPaisCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instPaisCapa.setVisibility(View.VISIBLE);
                caja_instPaisCapa_final.setVisibility(View.GONE);

            }
        });
        guardar_anoObtencionCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoObtencionCapa = anoObtencionCapa_texto.getText().toString();
                anoObtencionCapa.setText(nuevo_anoObtencionCapa);
                if (!nuevo_anoObtencionCapa.trim().equals("")) {
                    caja_edit_anoObtencionCapa.setVisibility(View.GONE);
                    caja_anoObtencionCapa_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoObtencionCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_anoObtencionCapa.setVisibility(View.VISIBLE);
                caja_anoObtencionCapa_final.setVisibility(View.GONE);

            }
        });
        guardar_horasCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horasCapa = horasCapa_texto.getText().toString();
                horasCapa.setText(nuevo_horasCapa);
                if (!nuevo_horasCapa.trim().equals("")) {
                    caja_edit_horasCapa.setVisibility(View.GONE);
                    caja_horasCapa_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de la capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horasCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horasCapa.setVisibility(View.VISIBLE);
                caja_horasCapa_final.setVisibility(View.GONE);

            }
        });
        agregar_otraCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa2.setVisibility(View.VISIBLE);
                caja_edit_capa2.setVisibility(View.VISIBLE);
                capa2_texto.setText("");

                caja_anuncio_instActua2.setVisibility(View.VISIBLE);
                caja_edit_intCapa2.setVisibility(View.VISIBLE);
                intCapa2_texto.setText("");

                caja_anuncio_anoCapa2.setVisibility(View.VISIBLE);
                caja_edit_anoCapa2.setVisibility(View.VISIBLE);
                anoCapa2_texto.setText("");

                caja_anuncio_horaCapa2.setVisibility(View.VISIBLE);
                caja_edit_horaCapa2.setVisibility(View.VISIBLE);
                horaCapa2_texto.setText("");

                caja_agregar_otraCapa.setVisibility(View.GONE);
                caja_borrar_otraCapa.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraCapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa2.setVisibility(View.GONE);
                caja_edit_capa2.setVisibility(View.GONE);
                caja_capa2_final.setVisibility(View.GONE);

                caja_anuncio_instActua2.setVisibility(View.GONE);
                caja_edit_intCapa2.setVisibility(View.GONE);
                caja_intCapa2_final.setVisibility(View.GONE);

                caja_anuncio_anoCapa2.setVisibility(View.GONE);
                caja_edit_anoCapa2.setVisibility(View.GONE);
                caja_anoCapa2_final.setVisibility(View.GONE);

                caja_anuncio_horaCapa2.setVisibility(View.GONE);
                caja_edit_horaCapa2.setVisibility(View.GONE);
                caja_horaCapa2_final.setVisibility(View.GONE);

                caja_agregar_otraCapa.setVisibility(View.VISIBLE);
                caja_borrar_otraCapa.setVisibility(View.GONE);


            }
        });
        guardar_capa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_capa2 = capa2_texto.getText().toString();
                capa2.setText(nuevo_capa2);
                if (!nuevo_capa2.trim().equals("")) {
                    caja_edit_capa2.setVisibility(View.GONE);
                    caja_capa2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_capa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_capa2.setVisibility(View.VISIBLE);
                caja_capa2_final.setVisibility(View.GONE);

            }
        });
        guardar_intCapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_intCapa2= intCapa2_texto.getText().toString();
                intCapa2.setText(nuevo_intCapa2);
                if (!nuevo_intCapa2.trim().equals("")) {
                    caja_edit_intCapa2.setVisibility(View.GONE);
                    caja_intCapa2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_CapaIns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_intCapa2.setVisibility(View.VISIBLE);
                caja_intCapa2_final.setVisibility(View.GONE);

            }
        });
        guardar_anoCapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoCapa2 = anoCapa2_texto.getText().toString();
                anoCapa2.setText(nuevo_anoCapa2);
                if (!nuevo_anoCapa2.trim().equals("")) {
                    caja_edit_anoCapa2.setVisibility(View.GONE);
                    caja_anoCapa2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoCapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_anoCapa2.setVisibility(View.VISIBLE);
                caja_anoCapa2_final.setVisibility(View.GONE);

            }
        });
        guardar_horaCapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horaCapa2 = horaCapa2_texto.getText().toString();
                horaCapa2.setText(nuevo_horaCapa2);
                if (!nuevo_horaCapa2.trim().equals("")) {
                    caja_edit_horaCapa2.setVisibility(View.GONE);
                    caja_horaCapa2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horaCapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horaCapa2.setVisibility(View.VISIBLE);
                caja_horaCapa2_final.setVisibility(View.GONE);

            }
        });


        agregar_otraOtracapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa3.setVisibility(View.VISIBLE);
                caja_capa3.setVisibility(View.VISIBLE);
                capa3_texto.setText("");

                caja_anuncio_instcapa3.setVisibility(View.VISIBLE);
                caja_edit_instcapa3.setVisibility(View.VISIBLE);
                instcapa3_texto.setText("");

                caja_anuncio_anoCapa3.setVisibility(View.VISIBLE);
                caja_anoCapa3.setVisibility(View.VISIBLE);
                anoCapa3_texto.setText("");

                caja_anuncio_horaCapa3.setVisibility(View.VISIBLE);
                caja_edit_horaCapa3.setVisibility(View.VISIBLE);
                horaCapa3_texto.setText("");

                caja_borrar_otraCapa.setVisibility(View.GONE);
                caja_borrar_otraCapa2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraCapa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa3.setVisibility(View.GONE);
                caja_capa3.setVisibility(View.GONE);
                caja_capa3_final.setVisibility(View.GONE);

                caja_anuncio_instcapa3.setVisibility(View.GONE);
                caja_edit_instcapa3.setVisibility(View.GONE);
                caja_instcapa3_final.setVisibility(View.GONE);

                caja_anuncio_anoCapa3.setVisibility(View.GONE);
                caja_anoCapa3.setVisibility(View.GONE);
                caja_anoCapa3_final.setVisibility(View.GONE);

                caja_anuncio_horaCapa3.setVisibility(View.GONE);
                caja_edit_horaCapa3.setVisibility(View.GONE);
                caja_horaCapa3_final.setVisibility(View.GONE);

                caja_borrar_otraCapa.setVisibility(View.VISIBLE);
                caja_borrar_otraCapa2.setVisibility(View.GONE);


            }
        });
        guardar_capa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_capa3= capa3_texto.getText().toString();
                capa3.setText(nuevo_capa3);
                if (!nuevo_capa3.trim().equals("")) {
                    caja_capa3.setVisibility(View.GONE);
                    caja_capa3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_capa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_capa3.setVisibility(View.VISIBLE);
                caja_capa3_final.setVisibility(View.GONE);

            }
        });
        guardar_instcapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instcapa3= instcapa3_texto.getText().toString();
                instcapa3.setText(nuevo_instcapa3);
                if (!nuevo_instcapa3.trim().equals("")) {
                    caja_edit_instcapa3.setVisibility(View.GONE);
                    caja_instcapa3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instcapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instcapa3.setVisibility(View.VISIBLE);
                caja_instcapa3_final.setVisibility(View.GONE);

            }
        });
        guardar_anoCapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoCapa3 = anoCapa3_texto.getText().toString();
                anoCapa3_vista.setText(nuevo_anoCapa3);
                if (!nuevo_anoCapa3.trim().equals("")) {
                    caja_anoCapa3.setVisibility(View.GONE);
                    caja_anoCapa3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoCapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoCapa3.setVisibility(View.VISIBLE);
                caja_anoCapa3_final.setVisibility(View.GONE);

            }
        });
        guardar_horaCapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horaCapa3 = horaCapa3_texto.getText().toString();
                horaCapa3.setText(nuevo_horaCapa3);
                if (!nuevo_horaCapa3.trim().equals("")) {
                    caja_edit_horaCapa3.setVisibility(View.GONE);
                    caja_horaCapa3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de la capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horaCapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horaCapa3.setVisibility(View.VISIBLE);
                caja_horaCapa3_final.setVisibility(View.GONE);

            }
        });


        agregar_otraOtracapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa4.setVisibility(View.VISIBLE);
                caja_capa4.setVisibility(View.VISIBLE);
                capa4_texto.setText("");

                caja_anuncio_instcapa4.setVisibility(View.VISIBLE);
                caja_edit_instcapa4.setVisibility(View.VISIBLE);
                instcapa4_texto.setText("");

                caja_anuncio_anoCapa4.setVisibility(View.VISIBLE);
                caja_anoCapa4.setVisibility(View.VISIBLE);
                anoCapa4_texto.setText("");

                caja_anuncio_horaCapa4.setVisibility(View.VISIBLE);
                caja_edit_horaCapa4.setVisibility(View.VISIBLE);
                horaCapa4_texto.setText("");

                caja_borrar_otraCapa2.setVisibility(View.GONE);
                caja_borrar_otraCapa3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraCapa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_capa4.setVisibility(View.GONE);
                caja_capa4.setVisibility(View.GONE);
                capa4_final.setVisibility(View.GONE);

                caja_anuncio_instcapa4.setVisibility(View.GONE);
                caja_edit_instcapa4.setVisibility(View.GONE);
                caja_instcapa4_final.setVisibility(View.GONE);

                caja_anuncio_anoCapa4.setVisibility(View.GONE);
                caja_anoCapa4.setVisibility(View.GONE);
                caja_anoCapa4_final.setVisibility(View.GONE);

                caja_anuncio_horaCapa4.setVisibility(View.GONE);
                caja_edit_horaCapa4.setVisibility(View.GONE);
                caja_horaCapa4_final.setVisibility(View.GONE);

                caja_borrar_otraCapa2.setVisibility(View.VISIBLE);
                caja_borrar_otraCapa3.setVisibility(View.GONE);


            }
        });
        guardar_capa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_capa4= capa4_texto.getText().toString();
                capa4.setText(nuevo_capa4);
                if (!nuevo_capa4.trim().equals("")) {
                    caja_capa4.setVisibility(View.GONE);
                    capa4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tipo de capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_capa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_capa4.setVisibility(View.VISIBLE);
                capa4_final.setVisibility(View.GONE);

            }
        });
        guardar_instcapa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instcapa4= instcapa4_texto.getText().toString();
                instcapa4.setText(nuevo_instcapa4);
                if (!nuevo_instcapa4.trim().equals("")) {
                    caja_edit_instcapa4.setVisibility(View.GONE);
                    caja_instcapa4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instcapa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instcapa4.setVisibility(View.VISIBLE);
                caja_instcapa4_final.setVisibility(View.GONE);

            }
        });
        guardar_anoCapa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoCapa4 = anoCapa4_texto.getText().toString();
                anoCapa4_vista.setText(nuevo_anoCapa4);
                if (!nuevo_anoCapa3.trim().equals("")) {
                    caja_anoCapa4.setVisibility(View.GONE);
                    caja_anoCapa4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de capacitacion es necesario.", Toast.LENGTH_LONG).show();
            }
            }
        });
        cambiar_anoCapa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoCapa4.setVisibility(View.VISIBLE);
                caja_anoCapa4_final.setVisibility(View.GONE);

            }
        });
        guardar_horaCapa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horaCapa4 = horaCapa4_texto.getText().toString();
                horaCapa4.setText(nuevo_horaCapa4);
                if (!nuevo_horaCapa4.trim().equals("")) {
                    caja_edit_horaCapa4.setVisibility(View.GONE);
                    caja_horaCapa4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de capacitacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horaCapa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horaCapa4.setVisibility(View.VISIBLE);
                caja_horaCapa4_final.setVisibility(View.GONE);

            }
        });


        ir_actuaDisciplinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulario_formaCapaDocente.setVisibility(View.GONE);
               formulario_actuaDisci.setVisibility(View.VISIBLE);


            }
        });
        guardar_tipoActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tipoActua = tipoActua_texto.getText().toString();
                tipoActua.setText(nuevo_tipoActua);
                if (!nuevo_tipoActua.trim().equals("")) {
                    caja_edit_tipoActua.setVisibility(View.GONE);
                    caja_tipoActua_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tipoActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tipoActua.setVisibility(View.VISIBLE);
                caja_tipoActua_final.setVisibility(View.GONE);

            }
        });
        guardar_instPaisActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instPaisActua = instPaisActua_texto.getText().toString();
                instPaisActua.setText(nuevo_instPaisActua);
                if (!nuevo_instPaisActua.trim().equals("")) {
                    caja_edit_instPaisActua.setVisibility(View.GONE);
                    caja_instPaisActua_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instPaisActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instPaisActua.setVisibility(View.VISIBLE);
                caja_instPaisActua_final.setVisibility(View.GONE);

            }
        });
        guardar_anoObtencionActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoObtencionActua = anoObtencionActua_texto.getText().toString();
                anoObtencionActua.setText(nuevo_anoObtencionActua);
                if (!nuevo_anoObtencionActua.trim().equals("")) {
                    caja_edit_anoObtencionActua.setVisibility(View.GONE);
                    caja_anoObtencionActua_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoObtencionActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_anoObtencionActua.setVisibility(View.VISIBLE);
                caja_anoObtencionActua_final.setVisibility(View.GONE);

            }
        });
        guardar_horasActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horasActua = horasActua_texto.getText().toString();
                horasActua.setText(nuevo_horasActua);
                if (!nuevo_horasActua.trim().equals("")) {
                    caja_edit_horasActua.setVisibility(View.GONE);
                    caja_horasActua_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de la actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horasActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horasActua.setVisibility(View.VISIBLE);
                caja_horasActua_final.setVisibility(View.GONE);

            }
        });

        agregar_otraActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_tipoActua2.setVisibility(View.VISIBLE);
                caja_edit_actua2.setVisibility(View.VISIBLE);
                actua2_texto.setText("");

                caja_anuncio_actuaInts2.setVisibility(View.VISIBLE);
                caja_edit_instPaisActua2.setVisibility(View.VISIBLE);
                instPaisActua2_texto.setText("");

                caja_anuncio_anoActua2.setVisibility(View.VISIBLE);
                caja_edit_anoActua2.setVisibility(View.VISIBLE);
                anoActua2_texto.setText("");

                caja_anuncio_horaActua2.setVisibility(View.VISIBLE);
                caja_edit_horaActua2.setVisibility(View.VISIBLE);
                horaActua2_texto.setText("");

                caja_agregar_otraActua.setVisibility(View.GONE);
                caja_borrar_otraActua.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraActua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_tipoActua2.setVisibility(View.GONE);
                caja_edit_actua2.setVisibility(View.GONE);
                caja_actua2_final.setVisibility(View.GONE);

                caja_anuncio_actuaInts2.setVisibility(View.GONE);
                caja_edit_instPaisActua2.setVisibility(View.GONE);
                caja_instPaisActua2_final.setVisibility(View.GONE);

                caja_anuncio_anoActua2.setVisibility(View.GONE);
                caja_edit_anoActua2.setVisibility(View.GONE);
                caja_anoActua2_final.setVisibility(View.GONE);

                caja_anuncio_horaActua2.setVisibility(View.GONE);
                caja_edit_horaActua2.setVisibility(View.GONE);
                caja_horaActua2_final.setVisibility(View.GONE);

                caja_agregar_otraActua.setVisibility(View.VISIBLE);
                caja_borrar_otraActua.setVisibility(View.GONE);


            }
        });
        guardar_actua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actua2 = actua2_texto.getText().toString();
                actua2.setText(nuevo_actua2);
                if (!nuevo_actua2.trim().equals("")) {
                    caja_edit_actua2.setVisibility(View.GONE);
                    caja_actua2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_actua2.setVisibility(View.VISIBLE);
                caja_actua2_final.setVisibility(View.GONE);

            }
        });
        guardar_instPaisActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instPaisActua2= instPaisActua2_texto.getText().toString();
                instPaisActua2.setText(nuevo_instPaisActua2);
                if (!nuevo_instPaisActua2.trim().equals("")) {
                    caja_edit_instPaisActua2.setVisibility(View.GONE);
                    caja_instPaisActua2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instPaisActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instPaisActua2.setVisibility(View.VISIBLE);
                caja_instPaisActua2_final.setVisibility(View.GONE);

            }
        });
        guardar_anoActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoActua2 = anoActua2_texto.getText().toString();
                anoActua2.setText(nuevo_anoActua2);
                if (!nuevo_anoActua2.trim().equals("")) {
                    caja_edit_anoActua2.setVisibility(View.GONE);
                    caja_anoActua2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_anoActua2.setVisibility(View.VISIBLE);
                caja_anoActua2_final.setVisibility(View.GONE);

            }
        });
        guardar_horaActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horaActua2 = horaActua2_texto.getText().toString();
                horaActua2.setText(nuevo_horaActua2);
                if (!nuevo_horaActua2.trim().equals("")) {
                    caja_edit_horaActua2.setVisibility(View.GONE);
                    caja_horaActua2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horaActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horaActua2.setVisibility(View.VISIBLE);
                caja_horaActua2_final.setVisibility(View.GONE);

            }
        });

        agregar_otraActua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actua3.setVisibility(View.VISIBLE);
                caja_actua3.setVisibility(View.VISIBLE);
                actua3_texto.setText("");

                caja_anuncio_instActua3.setVisibility(View.VISIBLE);
                caja_edit_intactua3.setVisibility(View.VISIBLE);
                instactua3_texto.setText("");

                caja_anuncio_anoactua3.setVisibility(View.VISIBLE);
                caja_anoactua3.setVisibility(View.VISIBLE);
                anoactua3_texto.setText("");

                caja_anuncio_horaactua3.setVisibility(View.VISIBLE);
                caja_edit_horaactua3.setVisibility(View.VISIBLE);
                horaactua3_texto.setText("");

                caja_borrar_otraActua.setVisibility(View.GONE);
                caja_agregar_otraactua3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actua3.setVisibility(View.GONE);
                caja_actua3.setVisibility(View.GONE);
                caja_actua3_final.setVisibility(View.GONE);

                caja_anuncio_instActua3.setVisibility(View.GONE);
                caja_edit_intactua3.setVisibility(View.GONE);
                caja_instactua3_final.setVisibility(View.GONE);

                caja_anuncio_anoactua3.setVisibility(View.GONE);
                caja_anoactua3.setVisibility(View.GONE);
                caja_anoactua3_final.setVisibility(View.GONE);

                caja_anuncio_horaactua3.setVisibility(View.GONE);
                caja_edit_horaactua3.setVisibility(View.GONE);
                caja_horaactua3_final.setVisibility(View.GONE);

                caja_borrar_otraActua.setVisibility(View.VISIBLE);
                caja_agregar_otraactua3.setVisibility(View.GONE);


            }
        });
        guardar_actua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actua3 = actua3_texto.getText().toString();
                actua3.setText(nuevo_actua3);
                if (!nuevo_actua3.trim().equals("")) {
                    caja_actua3.setVisibility(View.GONE);
                    caja_actua3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_actua3.setVisibility(View.VISIBLE);
                caja_actua3_final.setVisibility(View.GONE);

            }
        });
        guardar_instactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instactua3= instactua3_texto.getText().toString();
                instactua3.setText(nuevo_instactua3);
                if (!nuevo_instactua3.trim().equals("")) {
                    caja_edit_intactua3.setVisibility(View.GONE);
                    caja_instactua3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_intactua3.setVisibility(View.VISIBLE);
                caja_instactua3_final.setVisibility(View.GONE);

            }
        });
        guardar_anoactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoactua3 = anoactua3_texto.getText().toString();
                anoactua3_vista.setText(nuevo_anoactua3);
                if (!nuevo_anoactua3.trim().equals("")) {
                    caja_anoactua3.setVisibility(View.GONE);
                    caja_anoactua3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoactua3.setVisibility(View.VISIBLE);
                caja_anoactua3_final.setVisibility(View.GONE);

            }
        });
        guardar_horaactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horaactua3 = horaactua3_texto.getText().toString();
                horaactua3.setText(nuevo_horaactua3);
                if (!nuevo_horaactua3.trim().equals("")) {
                    caja_edit_horaactua3.setVisibility(View.GONE);
                    caja_horaactua3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horaactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horaactua3.setVisibility(View.VISIBLE);
                caja_horaactua3_final.setVisibility(View.GONE);

            }
        });
        agregar_otraactua3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actua4.setVisibility(View.VISIBLE);
                caja_actua4.setVisibility(View.VISIBLE);
                actua4_texto.setText("");

                caja_anuncio_instactua4.setVisibility(View.VISIBLE);
                caja_edit_instactua4.setVisibility(View.VISIBLE);
                instactua4_texto.setText("");

                caja_anuncio_anoactua4.setVisibility(View.VISIBLE);
                caja_anoactua4.setVisibility(View.VISIBLE);
                anoactua4_texto.setText("");

                caja_anuncio_horasactua4.setVisibility(View.VISIBLE);
                caja_edit_horaactua4.setVisibility(View.VISIBLE);
                horaactua4_texto.setText("");

                caja_agregar_otraactua3.setVisibility(View.GONE);
                caja_borrar_otraactua4.setVisibility(View.VISIBLE);


            }
        });

        borrar_otraactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actua4.setVisibility(View.GONE);
                caja_actua4.setVisibility(View.GONE);
                caja_actua4_final.setVisibility(View.GONE);
                caja_anuncio_instactua4.setVisibility(View.GONE);
                caja_edit_instactua4.setVisibility(View.GONE);
                caja_instactua4_final.setVisibility(View.GONE);

                caja_anuncio_anoactua4.setVisibility(View.GONE);
                caja_anoactua4.setVisibility(View.GONE);
                caja_anoactua4_final.setVisibility(View.GONE);


                caja_anuncio_horasactua4.setVisibility(View.GONE);
                caja_edit_horaactua4.setVisibility(View.GONE);
                caja_horaactua4_final.setVisibility(View.GONE);

                caja_agregar_otraactua3.setVisibility(View.VISIBLE);
                caja_borrar_otraactua4.setVisibility(View.GONE);


            }
        });
        guardar_actua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actua4 = actua4_texto.getText().toString();
                actua4.setText(nuevo_actua4);
                if (!nuevo_actua4.trim().equals("")) {
                    caja_actua4.setVisibility(View.GONE);
                    caja_actua4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre de la actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_actua4.setVisibility(View.VISIBLE);
                caja_actua4_final.setVisibility(View.GONE);

            }
        });
        guardar_instactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instactua4= instactua4_texto.getText().toString();
                instactua4.setText(nuevo_instactua4);
                if (!nuevo_instactua4.trim().equals("")) {
                    caja_edit_instactua4.setVisibility(View.GONE);
                    caja_instactua4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instactua4.setVisibility(View.VISIBLE);
                caja_instactua4_final.setVisibility(View.GONE);

            }
        });
        guardar_anoactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_anoactua4 = anoactua4_texto.getText().toString();
                anoactua4_vista.setText(nuevo_anoactua4);
                if (!nuevo_anoactua4.trim().equals("")) {
                    caja_anoactua4.setVisibility(View.GONE);
                    caja_anoactua4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El año de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_anoactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_anoactua4.setVisibility(View.VISIBLE);
                caja_anoactua4_final.setVisibility(View.GONE);

            }
        });
        guardar_horaactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_horaactua4 = horaactua4_texto.getText().toString();
                horaactua4.setText(nuevo_horaactua4);
                if (!nuevo_horaactua4.trim().equals("")) {
                    caja_edit_horaactua4.setVisibility(View.GONE);
                    caja_horaactua4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de actualizacion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_horaactua4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_horaactua4.setVisibility(View.VISIBLE);
                caja_horaactua4_final.setVisibility(View.GONE);

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
        guardar_actiPuesto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPuesto = actiPuesto_texto.getText().toString();
                actiPuesto.setText(nuevo_actiPuesto);
                if (!nuevo_actiPuesto.trim().equals("")) {
                    caja_edit_actiPuesto.setVisibility(View.GONE);
                    caja_actiPuesto_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPuesto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_actiPuesto.setVisibility(View.VISIBLE);
                caja_actiPuesto_final.setVisibility(View.GONE);

            }
        });
        guardar_instGesAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_instGesAca = instGesAca_texto.getText().toString();
                instGesAca.setText(nuevo_instGesAca);
                if (!nuevo_instGesAca.trim().equals("")) {
                    caja_edit_instGesAca.setVisibility(View.GONE);
                    caja_instGesAca_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_instGesAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_instGesAca.setVisibility(View.VISIBLE);
                caja_instGesAca_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAca = tiemGesAca_texto.getText().toString();
                tiemGesAca.setText(nuevo_tiemGesAca);
                if (!nuevo_tiemGesAca.trim().equals("")) {
                    caja_edit_tiemGesAca.setVisibility(View.GONE);
                    caja_tiemGesAca_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de inicio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemGesAca.setVisibility(View.VISIBLE);
                caja_tiemGesAca_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAcaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAcaA = tiemGesAcaA_texto.getText().toString();
                tiemGesAcaA.setText(nuevo_tiemGesAcaA);
                if (!nuevo_tiemGesAcaA.trim().equals("")) {
                    caja_edit_tiemGesAcaA.setVisibility(View.GONE);
                    caja_tiemGesAcaA_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAcaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemGesAcaA.setVisibility(View.VISIBLE);
                caja_tiemGesAcaA_final.setVisibility(View.GONE);

            }
        });
        agregar_otraGesAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues2.setVisibility(View.VISIBLE);
                caja_edit_actiPues2.setVisibility(View.VISIBLE);
                actiPues2_texto.setText("");

                caja_anuncio_intGesAca2.setVisibility(View.VISIBLE);
                caja_edit_intGesAca2.setVisibility(View.VISIBLE);
                intGesAca2_texto.setText("");

                caja_anuncio_tiemGesAca2.setVisibility(View.VISIBLE);
                caja_edit_tiemGesAca2.setVisibility(View.VISIBLE);
                tiemGesAca2_texto.setText("");

                caja_anuncio_tiemGesAcaA2.setVisibility(View.VISIBLE);
                caja_edit_tiemGesAcaA2.setVisibility(View.VISIBLE);
                tiemGesAcaA2_texto.setText("");

                caja_agregar_otraGesAca.setVisibility(View.GONE);
                caja_agregar_otraGesAca2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues2.setVisibility(View.GONE);
                caja_edit_actiPues2.setVisibility(View.GONE);
                caja_actiPues2_final.setVisibility(View.GONE);

                caja_anuncio_intGesAca2.setVisibility(View.GONE);
                caja_edit_intGesAca2.setVisibility(View.GONE);
                caja_intGesAca2_final.setVisibility(View.GONE);

                caja_anuncio_tiemGesAca2.setVisibility(View.GONE);
                caja_edit_tiemGesAca2.setVisibility(View.GONE);
                caja_tiemGesAca2_final.setVisibility(View.GONE);

                caja_anuncio_tiemGesAcaA2.setVisibility(View.GONE);
                caja_edit_tiemGesAcaA2.setVisibility(View.GONE);
                caja_tiemGesAcaA2_final.setVisibility(View.GONE);

                caja_agregar_otraGesAca.setVisibility(View.VISIBLE);
                caja_agregar_otraGesAca2.setVisibility(View.GONE);


            }
        });
        guardar_actiPues2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPues2 = actiPues2_texto.getText().toString();
                actiPues2.setText(nuevo_actiPues2);
                if (!nuevo_actiPues2.trim().equals("")) {
                    caja_edit_actiPues2.setVisibility(View.GONE);
                    caja_actiPues2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPues2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_actiPues2.setVisibility(View.VISIBLE);
                caja_actiPues2_final.setVisibility(View.GONE);

            }
        });
        guardar_intGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_intGesAca2= intGesAca2_texto.getText().toString();
                intGesAca2.setText(nuevo_intGesAca2);
                if (!nuevo_intGesAca2.trim().equals("")) {
                    caja_edit_intGesAca2.setVisibility(View.GONE);
                    caja_intGesAca2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_intGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_intGesAca2.setVisibility(View.VISIBLE);
                caja_intGesAca2_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAca2 = tiemGesAca2_texto.getText().toString();
                tiemGesAca2.setText(nuevo_tiemGesAca2);
                if (!nuevo_tiemGesAca2.trim().equals("")) {
                    caja_edit_tiemGesAca2.setVisibility(View.GONE);
                    caja_tiemGesAca2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de inicio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemGesAca2.setVisibility(View.VISIBLE);
                caja_tiemGesAca2_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAcaA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAcaA2 = tiemGesAcaA2_texto.getText().toString();
                tiemGesAcaA2.setText(nuevo_tiemGesAcaA2);
                if (!nuevo_tiemGesAcaA2.trim().equals("")) {
                    caja_edit_tiemGesAcaA2.setVisibility(View.GONE);
                    caja_tiemGesAcaA2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAcaA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemGesAcaA2.setVisibility(View.VISIBLE);
                caja_tiemGesAcaA2_final.setVisibility(View.GONE);

            }
        });


        agregar_otraGesAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues3.setVisibility(View.VISIBLE);
                caja_actiPues3.setVisibility(View.VISIBLE);
                actiPues3_texto.setText("");

                caja_anuncio_intGesAca3.setVisibility(View.VISIBLE);
                caja_edit_intGesAca3.setVisibility(View.VISIBLE);
                intGesAca3_texto.setText("");

                caja_anuncio_tiemGesAca3.setVisibility(View.VISIBLE);
                caja_tiemGesAca3.setVisibility(View.VISIBLE);
                tiemGesAca3_texto.setText("");

                caja_anuncio_tiemGesAcaA3.setVisibility(View.VISIBLE);
                caja_edit_tiemGesAcaA3.setVisibility(View.VISIBLE);
                tiemGesAcaA3_texto.setText("");

                caja_agregar_otraGesAca2.setVisibility(View.GONE);
                caja_agregar_otraGesAca3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues3.setVisibility(View.GONE);
                caja_actiPues3.setVisibility(View.GONE);
                caja_actiPues3_final.setVisibility(View.GONE);

                caja_anuncio_intGesAca3.setVisibility(View.GONE);
                caja_edit_intGesAca3.setVisibility(View.GONE);
                caja_intGesAca3_final.setVisibility(View.GONE);

                caja_anuncio_tiemGesAca3.setVisibility(View.GONE);
                caja_tiemGesAca3.setVisibility(View.GONE);
                caja_tiemGesAca3_final.setVisibility(View.GONE);

                caja_anuncio_tiemGesAcaA3.setVisibility(View.GONE);
                caja_edit_tiemGesAcaA3.setVisibility(View.GONE);
                caja_tiemGesAcaA3_final.setVisibility(View.GONE);

                caja_agregar_otraGesAca2.setVisibility(View.VISIBLE);
                caja_agregar_otraGesAca3.setVisibility(View.GONE);


            }
        });
        guardar_actiPues3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPues3 = actiPues3_texto.getText().toString();
                actiPues3.setText(nuevo_actiPues3);
                if (!nuevo_actiPues3.trim().equals("")) {
                    caja_actiPues3.setVisibility(View.GONE);
                    caja_actiPues3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPues3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_actiPues3.setVisibility(View.VISIBLE);
                caja_actiPues3_final.setVisibility(View.GONE);

            }
        });
        guardar_intGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_intGesAca3 = intGesAca3_texto.getText().toString();
                intGesAca3.setText(nuevo_intGesAca3);
                if (!nuevo_intGesAca3.trim().equals("")) {
                    caja_edit_intGesAca3.setVisibility(View.GONE);
                    caja_intGesAca3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_intGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_intGesAca3.setVisibility(View.VISIBLE);
                caja_intGesAca3_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAca3 = tiemGesAca3_texto.getText().toString();
                tiemGesAca3_vista.setText(nuevo_tiemGesAca3);
                if (!nuevo_tiemGesAca3.trim().equals("")) {
                    caja_tiemGesAca3.setVisibility(View.GONE);
                    caja_tiemGesAca3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de inicio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_tiemGesAca3.setVisibility(View.VISIBLE);
                caja_tiemGesAca3_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAcaA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAcaA3= tiemGesAcaA3_texto.getText().toString();
                tiemGesAcaA3.setText(nuevo_tiemGesAcaA3);
                if (!nuevo_tiemGesAcaA3.trim().equals("")) {
                    caja_edit_tiemGesAcaA3.setVisibility(View.GONE);
                    caja_tiemGesAcaA3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAcaA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemGesAcaA3.setVisibility(View.VISIBLE);
                caja_tiemGesAcaA3_final.setVisibility(View.GONE);

            }
        });
        agregar_otraGesAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues4.setVisibility(View.VISIBLE);
                caja_actiPues4.setVisibility(View.VISIBLE);
                actiPues4_texto.setText("");

                caja_anuncio_intGesAca4.setVisibility(View.VISIBLE);
                caja_edit_intGesAca4.setVisibility(View.VISIBLE);
                intGesAca4_texto.setText("");

                caja_anuncio_tiemGesAca4.setVisibility(View.VISIBLE);
                caja_tiemGesAca4.setVisibility(View.VISIBLE);
                tiemGesAca4_texto.setText("");

                caja_anuncio_tiemGesAcaA4.setVisibility(View.VISIBLE);
                caja_edit_tiemGesAcaA4.setVisibility(View.VISIBLE);
                tiemGesAcaA4_texto.setText("");
                caja_agregar_otraGesAca3.setVisibility(View.GONE);
                caja_borrar_otraGesAca4.setVisibility(View.VISIBLE);


            }
        });

        borrar_otraGesAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPues4.setVisibility(View.GONE);
                caja_actiPues4.setVisibility(View.GONE);
                caja_actiPues4_final.setVisibility(View.GONE);

                caja_anuncio_intGesAca4.setVisibility(View.GONE);
                caja_edit_intGesAca4.setVisibility(View.GONE);
                caja_intGesAca4_final.setVisibility(View.GONE);

                caja_anuncio_tiemGesAca4.setVisibility(View.GONE);
                caja_tiemGesAca4.setVisibility(View.GONE);
                caja_tiemGesAca4_final.setVisibility(View.GONE);

                caja_anuncio_tiemGesAcaA4.setVisibility(View.GONE);
                caja_edit_tiemGesAcaA4.setVisibility(View.GONE);
                caja_tiemGesAcaA4_final.setVisibility(View.GONE);

                caja_agregar_otraGesAca3.setVisibility(View.VISIBLE);
                caja_borrar_otraGesAca4.setVisibility(View.GONE);


            }
        });
        guardar_actiPues4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPues4= actiPues4_texto.getText().toString();
                actiPues4.setText(nuevo_actiPues4);
                if (!nuevo_actiPues4.trim().equals("")) {
                    caja_actiPues4.setVisibility(View.GONE);
                    caja_actiPues4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPues4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_actiPues4.setVisibility(View.VISIBLE);
                caja_actiPues4_final.setVisibility(View.GONE);

            }
        });
        guardar_intGesAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_intGesAca4 = intGesAca4_texto.getText().toString();
                intGesAca4.setText(nuevo_intGesAca4);
                if (!nuevo_intGesAca4.trim().equals("")) {
                    caja_edit_intGesAca4.setVisibility(View.GONE);
                    caja_intGesAca4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El instituto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_intGesAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_intGesAca4.setVisibility(View.VISIBLE);
                caja_intGesAca4_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAca4 = tiemGesAca4_texto.getText().toString();
                tiemGesAca4_vista.setText(nuevo_tiemGesAca4);
                if (!nuevo_tiemGesAca4.trim().equals("")) {
                    caja_tiemGesAca4.setVisibility(View.GONE);
                    caja_tiemGesAca4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de incio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_tiemGesAca4.setVisibility(View.VISIBLE);
                caja_tiemGesAca4_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemGesAcaA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemGesAcaA4= tiemGesAcaA4_texto.getText().toString();
                tiemGesAcaA4.setText(nuevo_tiemGesAcaA4);
                if (!nuevo_tiemGesAcaA4.trim().equals("")) {
                    caja_edit_tiemGesAcaA4.setVisibility(View.GONE);
                    caja_tiemGesAcaA4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemGesAcaA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemGesAcaA4.setVisibility(View.VISIBLE);
                caja_tiemGesAcaA4_final.setVisibility(View.GONE);

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
        guardar_desProdAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca= desProdAca_texto.getText().toString();
                desProdAca.setText(nuevo_desProdAca);
                if (!nuevo_desProdAca.trim().equals("")) {
                    caja_edit_desProdAca.setVisibility(View.GONE);
                    caja_desProdAca_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca.setVisibility(View.VISIBLE);
                caja_desProdAca_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca2 = desProdAca2_texto.getText().toString();
                desProdAca2.setText(nuevo_desProdAca2);
                if (!nuevo_desProdAca2.trim().equals("")) {
                    caja_edit_desProdAca2.setVisibility(View.GONE);
                    caja_desProdAca2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca2.setVisibility(View.VISIBLE);
                caja_desProdAca2_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca3 = desProdAca3_texto.getText().toString();
                desProdAca3.setText(nuevo_desProdAca3);
                if (!nuevo_desProdAca3.trim().equals("")) {
                    caja_edit_desProdAca3.setVisibility(View.GONE);
                    caja_desProdAca3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca3.setVisibility(View.VISIBLE);
                caja_desProdAca3_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca4=desProdAca4_texto.getText().toString();
                desProdAca4.setText(nuevo_desProdAca4);
                if (!nuevo_desProdAca4.trim().equals("")) {
                    caja_edit_desProdAca4.setVisibility(View.GONE);
                    caja_desProdAca4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca4.setVisibility(View.VISIBLE);
                caja_desProdAca4_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca5= desProdAca5_texto.getText().toString();
                desProdAca5.setText(nuevo_desProdAca5);
                if (!nuevo_desProdAca5.trim().equals("")) {
                    caja_edit_desProdAca5.setVisibility(View.GONE);
                    caja_desProdAca5_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca5.setVisibility(View.VISIBLE);
                caja_desProdAca5_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca6 = desProdAca6_texto.getText().toString();
                desProdAca6.setText(nuevo_desProdAca6);
                if (!nuevo_desProdAca6.trim().equals("")) {
                    caja_edit_desProdAca6.setVisibility(View.GONE);
                    caja_desProdAca6_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca6.setVisibility(View.VISIBLE);
                caja_desProdAca6_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca7 = desProdAca7_texto.getText().toString();
                desProdAca7.setText(nuevo_desProdAca7);
                if (!nuevo_desProdAca7.trim().equals("")) {
                    caja_edit_desProdAca7.setVisibility(View.GONE);
                    caja_desProdAca7_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca7.setVisibility(View.VISIBLE);
                caja_desProdAca7_final.setVisibility(View.GONE);

            }
        });
        guardar_desProdAca8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desProdAca8= desProdAca8_texto.getText().toString();
                desProdAca8.setText(nuevo_desProdAca8);
                if (!nuevo_desProdAca8.trim().equals("")) {
                    caja_edit_desProdAca8.setVisibility(View.GONE);
                    caja_desProdAca8_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El producto academico  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desProdAca8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desProdAca8.setVisibility(View.VISIBLE);
                caja_desProdAca8_final.setVisibility(View.GONE);

            }
        });

        ir_expeProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulario_expProfeNoAcade.setVisibility(View.VISIBLE);
                formulario_productosAcademicos.setVisibility(View.GONE);
            }
        });
        guardar_actiPuestoProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 nuevo_actiPuestoProfe=actiPuestoProfe_texto.getText().toString();
                actiPuestoProfe.setText(nuevo_actiPuestoProfe);
                if (!nuevo_actiPuestoProfe.trim().equals("")) {
                    caja_edit_actiPuestoProfe.setVisibility(View.GONE);
                    caja_actiPuestoProfe_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPuestoProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_actiPuestoProfe.setVisibility(View.VISIBLE);
                caja_actiPuestoProfe_final.setVisibility(View.GONE);

            }
        });
        guardar_OrgaEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 nuevo_OrgaEmp= OrgaEmp_texto.getText().toString();
                 OrgaEmp.setText(nuevo_OrgaEmp);
                if (!nuevo_OrgaEmp.trim().equals("")) {
                    caja_edit_OrgaEmp.setVisibility(View.GONE);
                    caja_OrgaEmp_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La organizacion o empresa es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_OrgaEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_OrgaEmp.setVisibility(View.VISIBLE);
                caja_OrgaEmp_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 nuevo_tiemProfe= tiemProfe_texto.getText().toString();
                tiemProfe.setText(nuevo_tiemProfe);
                if (!nuevo_tiemProfe.trim().equals("")) {
                    caja_edit_tiemProfe.setVisibility(View.GONE);
                    caja_tiemProfe_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de inicio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemProfe.setVisibility(View.VISIBLE);
                caja_tiemProfe_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             nuevo_tiemProfeA= tiemProfeA_texto.getText().toString();
             tiemProfeA.setText(nuevo_tiemProfeA);
                if (!nuevo_tiemProfeA.trim().equals("")) {
                    caja_edit_tiemProfeA.setVisibility(View.GONE);
                    caja_tiemProfeA_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemProfeA.setVisibility(View.VISIBLE);
                caja_tiemProfeA_final.setVisibility(View.GONE);

            }
        });
        agregar_otraExpProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe2.setVisibility(View.VISIBLE);
                caja_edit_actiPuestoProfe2.setVisibility(View.VISIBLE);
                actiPuestoProfe2_texto.setText("");

                caja_anuncio_OrgaEmp2.setVisibility(View.VISIBLE);
                caja_edit_OrgaEmp2.setVisibility(View.VISIBLE);
                OrgaEmp2_texto.setText("");

                caja_anuncio_tiemProfe2.setVisibility(View.VISIBLE);
                caja_edit_tiemProfe2.setVisibility(View.VISIBLE);
                tiemProfe2_texto.setText("");

                caja_anuncio_tiemProfeA2.setVisibility(View.VISIBLE);
                caja_edit_tiemProfeA2.setVisibility(View.VISIBLE);
                tiemProfeA2_texto.setText("");

                caja_agregar_otraExpProfe.setVisibility(View.GONE);
                caja_agregar_otraExpProfe2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpProfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe2.setVisibility(View.GONE);
                caja_edit_actiPuestoProfe2.setVisibility(View.GONE);
                caja_actiPuestoProfe2_final.setVisibility(View.GONE);

                caja_anuncio_OrgaEmp2.setVisibility(View.GONE);
                caja_edit_OrgaEmp2.setVisibility(View.GONE);
                caja_OrgaEmp2_final .setVisibility(View.GONE);

                caja_anuncio_tiemProfe2.setVisibility(View.GONE);
                caja_edit_tiemProfe2.setVisibility(View.GONE);
                caja_tiemProfe2_final.setVisibility(View.GONE);

                caja_anuncio_tiemProfeA2.setVisibility(View.GONE);
                caja_edit_tiemProfeA2.setVisibility(View.GONE);
                caja_tiemProfeA2_final.setVisibility(View.GONE);

                caja_agregar_otraExpProfe.setVisibility(View.VISIBLE);
                caja_agregar_otraExpProfe2.setVisibility(View.GONE);


            }
        });
        guardar_actiPuestoProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPuestoProfe2= actiPuestoProfe2_texto.getText().toString();
                actiPuestoProfe2.setText(nuevo_actiPuestoProfe2);
                if (!nuevo_actiPuestoProfe2.trim().equals("")) {
                    caja_edit_actiPuestoProfe2.setVisibility(View.GONE);
                    caja_actiPuestoProfe2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPuestoProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_actiPuestoProfe2.setVisibility(View.VISIBLE);
                caja_actiPuestoProfe2_final.setVisibility(View.GONE);

            }
        });
        guardar_OrgaEmp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 nuevo_OrgaEmp2= OrgaEmp2_texto.getText().toString();
                 OrgaEmp2.setText(nuevo_OrgaEmp2);
                if (!nuevo_OrgaEmp2.trim().equals("")) {
                    caja_edit_OrgaEmp2.setVisibility(View.GONE);
                    caja_OrgaEmp2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La organizacion o empresa es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_OrgaEmp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_OrgaEmp2.setVisibility(View.VISIBLE);
                caja_OrgaEmp2_final .setVisibility(View.GONE);

            }
        });
        guardar_tiemProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 nuevo_tiemProfe2= tiemProfe2_texto.getText().toString();
                tiemProfe2.setText(nuevo_tiemProfe2);
                if (!nuevo_tiemProfe2.trim().equals("")) {
                    caja_edit_tiemProfe2.setVisibility(View.GONE);
                    caja_tiemProfe2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de incio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemProfe2.setVisibility(View.VISIBLE);
                caja_tiemProfe2_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfeA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemProfeA2= tiemProfeA2_texto.getText().toString();
                tiemProfeA2.setText(nuevo_tiemProfeA2);
                if (!nuevo_tiemProfeA2.trim().equals("")) {
                    caja_edit_tiemProfeA2.setVisibility(View.GONE);
                    caja_tiemProfeA2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfeA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemProfeA2.setVisibility(View.VISIBLE);
                caja_tiemProfeA2_final.setVisibility(View.GONE);

            }
        });
        agregar_otraExpProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe3.setVisibility(View.VISIBLE);
                caja_actiPuesProfe3.setVisibility(View.VISIBLE);
                actiPuesProfe3_texto.setText("");

                caja_anuncio_OrgaEmp3.setVisibility(View.VISIBLE);
                caja_edit_OrgaEmp3.setVisibility(View.VISIBLE);
                OrgaEmp3_texto.setText("");

                caja_anuncio_tiemProfe3.setVisibility(View.VISIBLE);
                caja_tiemProfe3.setVisibility(View.VISIBLE);
                tiemProfe3_texto.setText("");

                caja_anuncio_tiemProfeA3.setVisibility(View.VISIBLE);
                caja_edit_tiemProfeA3.setVisibility(View.VISIBLE);
                tiemProfeA3_texto.setText("");

                caja_agregar_otraExpProfe2.setVisibility(View.GONE);
                caja_agregar_otraExpProfe3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpProfe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe3.setVisibility(View.GONE);
                caja_actiPuesProfe3.setVisibility(View.GONE);
                caja_actiPuesProfe3_final.setVisibility(View.GONE);

                caja_anuncio_OrgaEmp3.setVisibility(View.GONE);
                caja_edit_OrgaEmp3.setVisibility(View.GONE);
                caja_OrgaEmp3_final.setVisibility(View.GONE);

                caja_anuncio_tiemProfe3.setVisibility(View.GONE);
                caja_tiemProfe3.setVisibility(View.GONE);
                caja_tiemProfe3_final.setVisibility(View.GONE);

                caja_anuncio_tiemProfeA3.setVisibility(View.GONE);
                caja_edit_tiemProfeA3.setVisibility(View.GONE);
                caja_tiemProfeA3_final.setVisibility(View.GONE);

                caja_agregar_otraExpProfe2.setVisibility(View.VISIBLE);
                caja_agregar_otraExpProfe3.setVisibility(View.GONE);


            }
        });
        guardar_actiPuesProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPuesProfe3= actiPuesProfe3_texto.getText().toString();
                actiPuesProfe3.setText(nuevo_actiPuesProfe3);
                if (!nuevo_actiPuesProfe3.trim().equals("")) {
                    caja_actiPuesProfe3.setVisibility(View.GONE);
                    caja_actiPuesProfe3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPuesProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_actiPuesProfe3.setVisibility(View.VISIBLE);
                caja_actiPuesProfe3_final.setVisibility(View.GONE);

            }
        });
        guardar_OrgaEmp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             nuevo_OrgaEmp3= OrgaEmp3_texto.getText().toString();
             OrgaEmp3.setText(nuevo_OrgaEmp3);
                if (!nuevo_OrgaEmp3.trim().equals("")) {
                    caja_edit_OrgaEmp3.setVisibility(View.GONE);
                    caja_OrgaEmp3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La organizacion o empresa es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_OrgaEmp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_OrgaEmp3.setVisibility(View.VISIBLE);
                caja_OrgaEmp3_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            nuevo_tiemProfe3= tiemProfe3_texto.getText().toString();
            tiemProfe3_vista.setText(nuevo_tiemProfe3);
                if (!nuevo_tiemProfe3.trim().equals("")) {
                    caja_tiemProfe3.setVisibility(View.GONE);
                    caja_tiemProfe3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de incio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_tiemProfe3.setVisibility(View.VISIBLE);
                caja_tiemProfe3_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfeA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemProfeA3= tiemProfeA3_texto.getText().toString();
                tiemProfeA3.setText(nuevo_tiemProfeA3);
                if (!nuevo_tiemProfeA3.trim().equals("")) {
                    caja_edit_tiemProfeA3.setVisibility(View.GONE);
                    caja_tiemProfeA3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfeA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemProfeA3.setVisibility(View.VISIBLE);
                caja_tiemProfeA3_final.setVisibility(View.GONE);

            }
        });
        agregar_otraExpProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe4.setVisibility(View.VISIBLE);
                caja_actiPuesProfe4.setVisibility(View.VISIBLE);
                actiPuesProfe4_texto.setText("");

                caja_anuncio_OrgaEmp4.setVisibility(View.VISIBLE);
                caja_edit_OrgaEmp4.setVisibility(View.VISIBLE);
                OrgaEmp4_texto.setText("");

                caja_anuncio_tiemProfe4.setVisibility(View.VISIBLE);
                caja_tiemProfe4.setVisibility(View.VISIBLE);
                tiemProfe4_texto.setText("");

                caja_anuncio_tiemProfeA4.setVisibility(View.VISIBLE);
                caja_edit_tiemProfeA4.setVisibility(View.VISIBLE);
                tiemProfeA4_texto.setText("");

                caja_agregar_otraExpProfe3.setVisibility(View.GONE);
                caja_borrar_otraExpProfe3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpProfe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_actiPuesProfe4.setVisibility(View.GONE);
                caja_actiPuesProfe4.setVisibility(View.GONE);
                caja_actiPuesProfe4_final.setVisibility(View.GONE);

                caja_anuncio_OrgaEmp4.setVisibility(View.GONE);
                caja_edit_OrgaEmp4.setVisibility(View.GONE);
                caja_OrgaEmp4_final.setVisibility(View.GONE);

                caja_anuncio_tiemProfe4.setVisibility(View.GONE);
                caja_tiemProfe4.setVisibility(View.GONE);
                caja_tiemProfe4_final.setVisibility(View.GONE);

                caja_anuncio_tiemProfeA4.setVisibility(View.GONE);
                caja_edit_tiemProfeA4.setVisibility(View.GONE);
                caja_tiemProfeA4_final.setVisibility(View.GONE);

                caja_agregar_otraExpProfe3.setVisibility(View.VISIBLE);
                caja_borrar_otraExpProfe3.setVisibility(View.GONE);


            }
        });
        guardar_actiPuesProfe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_actiPuesProfe4= actiPuesProfe4_texto.getText().toString();
                actiPuesProfe4.setText(nuevo_actiPuesProfe4);
                if (!nuevo_actiPuesProfe4.trim().equals("")) {
                    caja_actiPuesProfe4.setVisibility(View.GONE);
                    caja_actiPuesProfe4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del puesto  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_actiPuesProfe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_actiPuesProfe4.setVisibility(View.VISIBLE);
                caja_actiPuesProfe4_final.setVisibility(View.GONE);

            }
        });
        guardar_OrgaEmp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_OrgaEmp4= OrgaEmp4_texto.getText().toString();
                OrgaEmp4.setText(nuevo_OrgaEmp4);
                if (!nuevo_OrgaEmp4.trim().equals("")) {
                    caja_edit_OrgaEmp4.setVisibility(View.GONE);
                    caja_OrgaEmp4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La organizacion o empresa es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_OrgaEmp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_OrgaEmp4.setVisibility(View.VISIBLE);
                caja_OrgaEmp4_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 nuevo_tiemProfe4= tiemProfe4_texto.getText().toString();
                tiemProfe4_vista.setText(nuevo_tiemProfe4);
                if (!nuevo_tiemProfe4.trim().equals("")) {
                    caja_tiemProfe4.setVisibility(View.GONE);
                    caja_tiemProfe4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo de incio es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_tiemProfe4.setVisibility(View.VISIBLE);
                caja_tiemProfe4_final.setVisibility(View.GONE);

            }
        });
        guardar_tiemProfeA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_tiemProfeA4= tiemProfeA4_texto.getText().toString();
                tiemProfeA4.setText(nuevo_tiemProfeA4);
                if (!nuevo_tiemProfeA4.trim().equals("")) {
                    caja_edit_tiemProfeA4.setVisibility(View.GONE);
                    caja_tiemProfeA4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El tiempo final es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_tiemProfeA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_tiemProfeA4.setVisibility(View.VISIBLE);
                caja_tiemProfeA4_final.setVisibility(View.GONE);

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
        guardar_organismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_organismo=organismo_texto.getText().toString();
                organismo.setText(nuevo_organismo);
                if (!nuevo_organismo.trim().equals("")) {
                    caja_edit_organismo.setVisibility(View.GONE);
                    caja_organismo_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del organismo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_organismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_organismo.setVisibility(View.VISIBLE);
                caja_organismo_final.setVisibility(View.GONE);

            }
        });
        guardar_periodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_periodo= periodo_texto.getText().toString();
                periodo.setText(nuevo_periodo);
                if (!nuevo_periodo.trim().equals("")) {
                    caja_edit_periodo.setVisibility(View.GONE);
                    caja_periodo_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El periodo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_periodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_periodo.setVisibility(View.VISIBLE);
                caja_periodo_final.setVisibility(View.GONE);

            }
        });
        guardar_nivelExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_nivelExp= nivelExp_texto.getText().toString();
                nivelExp.setText(nuevo_nivelExp);
                if (!nuevo_nivelExp.trim().equals("")) {
                    caja_edit_nivelExp.setVisibility(View.GONE);
                    caja_nivelExp_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_nivelExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_nivelExp.setVisibility(View.VISIBLE);
                caja_nivelExp_final.setVisibility(View.GONE);

            }
        });
        agregar_otraExpInge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_organismo2.setVisibility(View.VISIBLE);
                caja_edit_organismo2.setVisibility(View.VISIBLE);
                organismo2_texto.setText("");

                caja_anuncio_periodo2.setVisibility(View.VISIBLE);
                caja_edit_periodo2.setVisibility(View.VISIBLE);
                periodo2_texto.setText("");

                caja_anuncio_nivelExp2.setVisibility(View.VISIBLE);
                caja_edit_nivelExp2.setVisibility(View.VISIBLE);
                nivelExp2_texto.setText("");



                caja_agregar_otraExpInge.setVisibility(View.GONE);
                caja_agregar_otraExpInge2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpInge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_organismo2.setVisibility(View.GONE);
                caja_edit_organismo2.setVisibility(View.GONE);
                caja_organismo2_final.setVisibility(View.GONE);

                caja_anuncio_periodo2.setVisibility(View.GONE);
                caja_edit_periodo2.setVisibility(View.GONE);
                caja_periodo2_final.setVisibility(View.GONE);


                caja_anuncio_nivelExp2.setVisibility(View.GONE);
                caja_edit_nivelExp2.setVisibility(View.GONE);
                caja_nivelExp2_final.setVisibility(View.GONE);



                caja_agregar_otraExpInge.setVisibility(View.VISIBLE);
                caja_agregar_otraExpInge2.setVisibility(View.GONE);


            }
        });
        guardar_organismo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_organismo2=organismo2_texto.getText().toString();
                organismo2.setText(nuevo_organismo2);
                if (!nuevo_organismo2.trim().equals("")) {
                    caja_edit_organismo2.setVisibility(View.GONE);
                    caja_organismo2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del organismo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_organismo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_organismo2.setVisibility(View.VISIBLE);
                caja_organismo2_final.setVisibility(View.GONE);

            }
        });
        guardar_periodo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_periodo2= periodo2_texto.getText().toString();
                periodo2.setText(nuevo_periodo2);
                if (!nuevo_periodo2.trim().equals("")) {
                    caja_edit_periodo2.setVisibility(View.GONE);
                    caja_periodo2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El periodo  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_periodo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_periodo2.setVisibility(View.VISIBLE);
                caja_periodo2_final.setVisibility(View.GONE);

            }
        });
        guardar_nivelExp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_nivelExp2= nivelExp2_texto.getText().toString();
                nivelExp2.setText(nuevo_nivelExp2);
                if (!nuevo_nivelExp2.trim().equals("")) {
                    caja_edit_nivelExp2.setVisibility(View.GONE);
                    caja_nivelExp2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_nivelExp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_nivelExp2.setVisibility(View.VISIBLE);
                caja_nivelExp2_final.setVisibility(View.GONE);

            }
        });
        agregar_otraExpInge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_organismo3.setVisibility(View.VISIBLE);
                caja_organismo3.setVisibility(View.VISIBLE);
                organismo3_texto.setText("");


                caja_anuncio_periodo3.setVisibility(View.VISIBLE);
                caja_edit_periodo3.setVisibility(View.VISIBLE);
                periodo3_texto.setText("");

                caja_anuncio_nivelExp3.setVisibility(View.VISIBLE);
                caja_nivelExp3.setVisibility(View.VISIBLE);
                nivelExp3_texto.setText("");



                caja_agregar_otraExpInge2.setVisibility(View.GONE);
                caja_agregar_otraExpInge3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpInge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_organismo3.setVisibility(View.GONE);
                caja_organismo3.setVisibility(View.GONE);
                caja_organismo3_final.setVisibility(View.GONE);


                caja_anuncio_periodo3.setVisibility(View.GONE);
                caja_edit_periodo3.setVisibility(View.GONE);
                caja_periodo3_final.setVisibility(View.GONE);


                caja_anuncio_nivelExp3.setVisibility(View.GONE);
                caja_nivelExp3.setVisibility(View.GONE);
                caja_nivelExp3_final.setVisibility(View.GONE);


                caja_agregar_otraExpInge2.setVisibility(View.VISIBLE);
                caja_agregar_otraExpInge3.setVisibility(View.GONE);


            }
        });
        guardar_organismo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_organismo3=organismo3_texto.getText().toString();
                organismo3.setText(nuevo_organismo3);
                if (!nuevo_organismo3.trim().equals("")) {
                    caja_organismo3.setVisibility(View.GONE);
                    caja_organismo3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del organismo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_organismo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_organismo3.setVisibility(View.VISIBLE);
                caja_organismo3_final.setVisibility(View.GONE);

            }
        });
        guardar_periodo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_periodo3= periodo3_texto.getText().toString();
                periodo3.setText(nuevo_periodo3);
                if (!nuevo_periodo3.trim().equals("")) {
                    caja_edit_periodo3.setVisibility(View.GONE);
                    caja_periodo3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El periodo  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_periodo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_periodo3.setVisibility(View.VISIBLE);
                caja_periodo3_final.setVisibility(View.GONE);

            }
        });
        guardar_nivelExp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_nivelExp3= nivelExp3_texto.getText().toString();
                nivelExp3_vista.setText(nuevo_nivelExp3);
                if (!nuevo_nivelExp3.trim().equals("")) {
                    caja_nivelExp3.setVisibility(View.GONE);
                    caja_nivelExp3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_nivelExp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_nivelExp3.setVisibility(View.VISIBLE);
                caja_nivelExp3_final.setVisibility(View.GONE);

            }
        });
        agregar_otraExpInge3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_organismo4.setVisibility(View.VISIBLE);
                caja_organismo4.setVisibility(View.VISIBLE);
                organismo4_texto.setText("");

                caja_anuncio_periodo4.setVisibility(View.VISIBLE);
                caja_edit_periodo4.setVisibility(View.VISIBLE);
                periodo4_texto.setText("");


                caja_anuncio_nivelExp4.setVisibility(View.VISIBLE);
                caja_nivelExp4.setVisibility(View.VISIBLE);
                nivelExp4_texto.setText("");



                caja_agregar_otraExpInge3.setVisibility(View.GONE);
                caja_borrar_otraExpInge3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraExpInge3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_organismo4.setVisibility(View.GONE);
                caja_organismo4.setVisibility(View.GONE);
                caja_organismo4_final.setVisibility(View.GONE);


                caja_anuncio_periodo4.setVisibility(View.GONE);
                caja_edit_periodo4.setVisibility(View.GONE);
                caja_periodo4_final.setVisibility(View.GONE);


                caja_anuncio_nivelExp4.setVisibility(View.GONE);
                caja_nivelExp4.setVisibility(View.GONE);
                caja_nivelExp4_final.setVisibility(View.GONE);



                caja_agregar_otraExpInge3.setVisibility(View.VISIBLE);
                caja_borrar_otraExpInge3.setVisibility(View.GONE);


            }
        });
        guardar_organismo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_organismo4=organismo4_texto.getText().toString();
                organismo4.setText(nuevo_organismo4);
                if (!nuevo_organismo4.trim().equals("")) {
                    caja_organismo4.setVisibility(View.GONE);
                    caja_organismo4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del organismo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_organismo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_organismo4.setVisibility(View.VISIBLE);
                caja_organismo4_final.setVisibility(View.GONE);

            }
        });
        guardar_periodo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_periodo4= periodo4_texto.getText().toString();
                periodo4.setText(nuevo_periodo4);
                if (!nuevo_periodo4.trim().equals("")) {
                    caja_edit_periodo4.setVisibility(View.GONE);
                    caja_periodo4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El periodo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_periodo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_periodo4.setVisibility(View.VISIBLE);
                caja_periodo4_final.setVisibility(View.GONE);

            }
        });
        guardar_nivelExp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_nivelExp4= nivelExp4_texto.getText().toString();
                nivelExp4_vista.setText(nuevo_nivelExp4);
                if (!nuevo_nivelExp4.trim().equals("")) {
                    caja_nivelExp4.setVisibility(View.GONE);
                    caja_nivelExp4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_nivelExp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_nivelExp4.setVisibility(View.VISIBLE);
                caja_nivelExp4_final.setVisibility(View.GONE);

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
        guardar_desLogAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca= desLogAca_texto.getText().toString();
                desLogAca.setText(nuevo_desLogAca);
                if (!nuevo_desLogAca.trim().equals("")) {
                    caja_edit_desLogAca.setVisibility(View.GONE);
                    caja_desLogAca_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca.setVisibility(View.VISIBLE);
                caja_desLogAca_final.setVisibility(View.GONE);

            }
        });
        guardar_desLogAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca2 = desLogAca2_texto.getText().toString();
                desLogAca2.setText(nuevo_desLogAca2);
                if (!nuevo_desLogAca2.trim().equals("")) {
                    caja_edit_desLogAca2.setVisibility(View.GONE);
                    caja_desLogAca2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca2.setVisibility(View.VISIBLE);
                caja_desLogAca2_final.setVisibility(View.GONE);

            }
        });
        guardar_desLogAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca3 = desLogAca3_texto.getText().toString();
                desLogAca3.setText(nuevo_desLogAca3);
                if (!nuevo_desLogAca3.trim().equals("")) {
                    caja_edit_desLogAca3.setVisibility(View.GONE);
                    caja_desLogAca3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca3.setVisibility(View.VISIBLE);
                caja_desLogAca3_final.setVisibility(View.GONE);

            }
        });
        guardar_desLogAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca4=desLogAca4_texto.getText().toString();
                desLogAca4.setText(nuevo_desLogAca4);
                if (!nuevo_desLogAca4.trim().equals("")) {
                    caja_edit_desLogAca4.setVisibility(View.GONE);
                    caja_desLogAca4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca4.setVisibility(View.VISIBLE);
                caja_desLogAca4_final.setVisibility(View.GONE);

            }
        });
        guardar_desLogAca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desLogAca5= desLogAca5_texto.getText().toString();
                desLogAca5.setText(nuevo_desLogAca5);
                if (!nuevo_desLogAca5.trim().equals("")) {
                    caja_edit_desLogAca5.setVisibility(View.GONE);
                    caja_desLogAca5_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desLogAca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desLogAca5.setVisibility(View.VISIBLE);
                caja_desLogAca5_final.setVisibility(View.GONE);

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
        guardar_orgColeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_orgColeCam=orgColeCam_texto.getText().toString();
                orgColeCam.setText(nuevo_orgColeCam);
                if (!nuevo_orgColeCam.trim().equals("")) {
                    caja_edit_orgColeCam.setVisibility(View.GONE);
                    caja_orgColeCam_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del organismo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_orgColeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_orgColeCam.setVisibility(View.VISIBLE);
                caja_orgColeCam_final.setVisibility(View.GONE);

            }
        });
        guardar_periColeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_periColeCam= periColeCam_texto.getText().toString();
                periColeCam.setText(nuevo_periColeCam);
                if (!nuevo_periColeCam.trim().equals("")) {
                    caja_edit_periColeCam.setVisibility(View.GONE);
                    caja_periColeCam_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El periodo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_periColeCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_periColeCam.setVisibility(View.VISIBLE);
                caja_periColeCam_final.setVisibility(View.GONE);

            }
        });
        guardar_nivelPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_nivelPart= nivelPart_texto.getText().toString();
                nivelPart.setText(nuevo_nivelPart);
                if (!nuevo_nivelPart.trim().equals("")) {
                    caja_edit_nivelPart.setVisibility(View.GONE);
                    caja_nivelPart_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_nivelPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_nivelPart.setVisibility(View.VISIBLE);
                caja_nivelPart_final.setVisibility(View.GONE);

            }
        });
        agregar_otraPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam2.setVisibility(View.VISIBLE);
                caja_edit_orgColeCam2.setVisibility(View.VISIBLE);
                orgColeCam2_texto.setText("");
                caja_anuncio_periColeCam2.setVisibility(View.VISIBLE);
                caja_edit_periColeCam2.setVisibility(View.VISIBLE);
                periColeCam2_texto.setText("");
                caja_anuncio_nivelPart2.setVisibility(View.VISIBLE);
                caja_edit_nivelPart2.setVisibility(View.VISIBLE);
                nivelPart2_texto.setText("");



                caja_agregar_otraPart.setVisibility(View.GONE);
                caja_agregar_otraPart2.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam2.setVisibility(View.GONE);
                caja_edit_orgColeCam2.setVisibility(View.GONE);
                caja_orgColeCam2_final.setVisibility(View.GONE);

                caja_anuncio_periColeCam2.setVisibility(View.GONE);
                caja_edit_periColeCam2.setVisibility(View.GONE);
                caja_periColeCam2_final.setVisibility(View.GONE);


                caja_anuncio_nivelPart2.setVisibility(View.GONE);
                caja_edit_nivelPart2.setVisibility(View.GONE);
                caja_nivelPart2_final.setVisibility(View.GONE);


                caja_agregar_otraPart.setVisibility(View.VISIBLE);
                caja_agregar_otraPart2.setVisibility(View.GONE);


            }
        });
        guardar_orgColeCam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_orgColeCam2=orgColeCam2_texto.getText().toString();
                orgColeCam2.setText(nuevo_orgColeCam2);
                if (!nuevo_orgColeCam2.trim().equals("")) {
                    caja_edit_orgColeCam2.setVisibility(View.GONE);
                    caja_orgColeCam2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del organismo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_orgColeCam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_orgColeCam2.setVisibility(View.VISIBLE);
                caja_orgColeCam2_final.setVisibility(View.GONE);

            }
        });
        guardar_periColeCam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_periColeCam2= periColeCam2_texto.getText().toString();
                periColeCam2.setText(nuevo_periColeCam2);
                if (!nuevo_periColeCam2.trim().equals("")) {
                    caja_edit_periColeCam2.setVisibility(View.GONE);
                    caja_periColeCam2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El periodo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_periColeCam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_periColeCam2.setVisibility(View.VISIBLE);
                caja_periColeCam2_final.setVisibility(View.GONE);

            }
        });
        guardar_nivelPart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_nivelPart2= nivelPart2_texto.getText().toString();
                nivelPart2.setText(nuevo_nivelPart2);
                if (!nuevo_nivelPart2.trim().equals("")) {
                    caja_edit_nivelPart2.setVisibility(View.GONE);
                    caja_nivelPart2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_nivelPart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_nivelPart2.setVisibility(View.VISIBLE);
                caja_nivelPart2_final.setVisibility(View.GONE);

            }
        });
        agregar_otraPart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam3.setVisibility(View.VISIBLE);
                caja_orgColeCam3.setVisibility(View.VISIBLE);
                orgColeCam3_texto.setText("");


                caja_anuncio_periColeCam3.setVisibility(View.VISIBLE);
                caja_edit_periColeCam3.setVisibility(View.VISIBLE);
                periColeCam3_texto.setText("");

                caja_anuncio_nivelPart3.setVisibility(View.VISIBLE);
                caja_nivelPart3.setVisibility(View.VISIBLE);
                nivelPart3_texto.setText("");


                caja_agregar_otraPart2.setVisibility(View.GONE);
                caja_agregar_otraPart3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraPart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam3.setVisibility(View.GONE);
                caja_orgColeCam3.setVisibility(View.GONE);
                caja_orgColeCam3_final.setVisibility(View.GONE);


                caja_anuncio_periColeCam3.setVisibility(View.GONE);
                caja_edit_periColeCam3.setVisibility(View.GONE);
                caja_periColeCam3_final.setVisibility(View.GONE);


                caja_anuncio_nivelPart3.setVisibility(View.GONE);
                caja_nivelPart3.setVisibility(View.GONE);
                caja_nivelPart3_final.setVisibility(View.GONE);

                caja_agregar_otraPart2.setVisibility(View.VISIBLE);
                caja_agregar_otraPart3.setVisibility(View.GONE);


            }
        });
        guardar_orgColeCam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_orgColeCam3=orgColeCam3_texto.getText().toString();
                orgColeCam3.setText(nuevo_orgColeCam3);
                if (!nuevo_orgColeCam3.trim().equals("")) {
                    caja_orgColeCam3.setVisibility(View.GONE);
                    caja_orgColeCam3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del organismo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_orgColeCam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_orgColeCam3.setVisibility(View.VISIBLE);
                caja_orgColeCam3_final.setVisibility(View.GONE);

            }
        });
        guardar_periColeCam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_periColeCam3= periColeCam3_texto.getText().toString();
                periColeCam3.setText(nuevo_periColeCam3);
                if (!nuevo_periColeCam3.trim().equals("")) {
                    caja_edit_periColeCam3.setVisibility(View.GONE);
                    caja_periColeCam3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El periodo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_periColeCam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_periColeCam3.setVisibility(View.VISIBLE);
                caja_periColeCam3_final.setVisibility(View.GONE);

            }
        });
        guardar_nivelPart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_nivelPart3= nivelPart3_texto.getText().toString();
                nivelPart3_vista.setText(nuevo_nivelPart3);
                if (!nuevo_nivelPart3.trim().equals("")) {
                    caja_nivelPart3.setVisibility(View.GONE);
                    caja_nivelPart3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_nivelPart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_nivelPart3.setVisibility(View.VISIBLE);
                caja_nivelPart3_final.setVisibility(View.GONE);

            }
        });

        agregar_otraPart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam4.setVisibility(View.VISIBLE);
                caja_orgColeCam4.setVisibility(View.VISIBLE);
                orgColeCam4_texto.setText("");
                caja_anuncio_periColeCam4.setVisibility(View.VISIBLE);
                caja_edit_periColeCam4.setVisibility(View.VISIBLE);
                periColeCam4_texto.setText("");

                caja_anuncio_nivelPart4.setVisibility(View.VISIBLE);
                caja_nivelPart4.setVisibility(View.VISIBLE);
                nivelPart4_texto.setText("");



                caja_agregar_otraPart3.setVisibility(View.GONE);
                caja_borrar_otraPart3.setVisibility(View.VISIBLE);


            }
        });
        borrar_otraPart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja_anuncio_orgColeCam4.setVisibility(View.GONE);
                caja_orgColeCam4.setVisibility(View.GONE);
                caja_orgColeCam4_final.setVisibility(View.GONE);

                caja_anuncio_periColeCam4.setVisibility(View.GONE);
                caja_edit_periColeCam4.setVisibility(View.GONE);
                caja_periColeCam4_final.setVisibility(View.GONE);

                caja_anuncio_nivelPart4.setVisibility(View.GONE);
                caja_nivelPart4.setVisibility(View.GONE);
                caja_nivelPart4_final.setVisibility(View.GONE);



                caja_agregar_otraPart3.setVisibility(View.VISIBLE);
                caja_borrar_otraPart3.setVisibility(View.GONE);


            }
        });
        guardar_orgColeCam4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_orgColeCam4=orgColeCam4_texto.getText().toString();
                orgColeCam4.setText(nuevo_orgColeCam4);
                if (!nuevo_orgColeCam4.trim().equals("")) {
                    caja_orgColeCam4.setVisibility(View.GONE);
                    caja_orgColeCam4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nombre del organismo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_orgColeCam4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_orgColeCam4.setVisibility(View.VISIBLE);
                caja_orgColeCam4_final.setVisibility(View.GONE);

            }
        });
        guardar_periColeCam4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_periColeCam4= periColeCam4_texto.getText().toString();
                periColeCam4.setText(nuevo_periColeCam4);
                if (!nuevo_periColeCam4.trim().equals("")) {
                    caja_edit_periColeCam4.setVisibility(View.GONE);
                    caja_periColeCam4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El periodo es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_periColeCam4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_periColeCam4.setVisibility(View.VISIBLE);
                caja_periColeCam4_final.setVisibility(View.GONE);

            }
        });
        guardar_nivelPart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_nivelPart4= nivelPart4_texto.getText().toString();
                nivelPart4_vista.setText(nuevo_nivelPart4);
                if (!nuevo_nivelPart4.trim().equals("")) {
                    caja_nivelPart4.setVisibility(View.GONE);
                    caja_nivelPart4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_nivelPart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_nivelPart4.setVisibility(View.VISIBLE);
                caja_nivelPart4_final.setVisibility(View.GONE);

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

        guardar_desPreRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desPreReca= desPreRec_texto.getText().toString();
                desPreRec.setText(nuevo_desPreReca);
                if (!nuevo_desPreReca.trim().equals("")) {
                    caja_edit_desPreRec.setVisibility(View.GONE);
                    caja_desPreRec_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desPreRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desPreRec.setVisibility(View.VISIBLE);
                caja_desPreRec_final.setVisibility(View.GONE);

            }
        });
        guardar_desPreRec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desPreRec2 = desPreRec2_texto.getText().toString();
                desPreRec2.setText(nuevo_desPreRec2);
                if (!nuevo_desPreRec2.trim().equals("")) {
                    caja_edit_desPreRec2.setVisibility(View.GONE);
                    caja_desPreRec2_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desPreRec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desPreRec2.setVisibility(View.VISIBLE);
                caja_desPreRec2_final.setVisibility(View.GONE);

            }
        });
        guardar_desPreRec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desPreRec3=desPreRec3_texto.getText().toString();
                desPreRec3.setText(nuevo_desPreRec3);
                if (!nuevo_desPreRec3.trim().equals("")) {
                    caja_edit_desPreRec3.setVisibility(View.GONE);
                    caja_desPreRec3_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desPreRec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desPreRec3.setVisibility(View.VISIBLE);
                caja_desPreRec3_final.setVisibility(View.GONE);

            }
        });

        guardar_desPreRec4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desPreRec4 = desPreRec4_texto.getText().toString();
                desPreRec4.setText(nuevo_desPreRec4);
                if (!nuevo_desPreRec4.trim().equals("")) {
                    caja_edit_desPreRec4.setVisibility(View.GONE);
                    caja_desPreRec4_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desPreRec4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desPreRec4.setVisibility(View.VISIBLE);
                caja_desPreRec4_final.setVisibility(View.GONE);

            }
        });
        guardar_desPreRec5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_desPreRec5= desPreRec5_texto.getText().toString();
                desPreRec5.setText(nuevo_desPreRec5);
                if (!nuevo_desPreRec5.trim().equals("")) {
                    caja_edit_desPreRec5.setVisibility(View.GONE);
                    caja_desPreRec5_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "La descripcion es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_desPreRec5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_desPreRec5.setVisibility(View.VISIBLE);
                caja_desPreRec5_final.setVisibility(View.GONE);

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
        guardar_aportacionPE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevo_aportacionPE= aportacionPE_texto.getText().toString();
                aportacionPE.setText(nuevo_aportacionPE);
                if (!nuevo_aportacionPE.trim().equals("")) {
                    caja_edit_aportacionPE.setVisibility(View.GONE);
                    caja_aportacionPE_final.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "El nivel de experiencia  es necesario.", Toast.LENGTH_LONG).show();
                }
            }
        });
        cambiar_aportacionPE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                caja_edit_aportacionPE.setVisibility(View.VISIBLE);
                caja_aportacionPE_final.setVisibility(View.GONE);

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