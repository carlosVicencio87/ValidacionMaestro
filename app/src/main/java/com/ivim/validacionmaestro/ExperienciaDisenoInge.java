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

public class ExperienciaDisenoInge extends AppCompatActivity {
    private ScrollView formulario_expDiseñoIng;

    private LinearLayout caja_borrar_otraExpInge3,caja_agregar_otraExpInge3,caja_nivelExp4,caja_anuncio_nivelExp4,caja_edit_periodo4,caja_anuncio_periodo4,
            caja_organismo4,caja_anuncio_organismo4,caja_agregar_otraExpInge2,caja_nivelExp3,caja_anuncio_nivelExp3,
            caja_edit_periodo3,caja_anuncio_periodo3,caja_organismo3,caja_anuncio_organismo3,
            caja_agregar_otraExpInge,caja_edit_nivelExp2,caja_anuncio_nivelExp2,caja_edit_periodo2,
            caja_anuncio_periodo2,caja_edit_organismo2,caja_anuncio_organismo2,
            caja_edit_organismo,caja_organismo_final,caja_edit_periodo,caja_periodo_final,caja_nivelExp_final,
            caja_edit_nivelExp,caja_organismo2_final,caja_periodo2_final,caja_nivelExp2_final,caja_organismo3_final,
            caja_periodo3_final,caja_nivelExp3_final,caja_organismo4_final,caja_periodo4_final,caja_nivelExp4_final;

    private EditText organismo_texto,periodo_texto,nivelExp_texto,organismo2_texto,
            periodo2_texto,nivelExp2_texto,organismo3_texto,periodo3_texto,nivelExp3_texto,organismo4_texto,
            periodo4_texto,nivelExp4_texto;


    private ImageView guardar_organismo,cambiar_organismo,guardar_periodo,cambiar_periodo,guardar_nivelExp,
            cambiar_nivelExp,guardar_organismo2,cambiar_organismo2,guardar_periodo2,cambiar_periodo2,
            guardar_nivelExp2,cambiar_nivelExp2,guardar_organismo3,cambiar_organismo3,guardar_periodo3,
            cambiar_periodo3,guardar_nivelExp3,cambiar_nivelExp3,guardar_organismo4,cambiar_organismo4,
            guardar_periodo4,cambiar_periodo4,guardar_nivelExp4,cambiar_nivelExp4;

    private TextView borrar_otraExpInge3,agregar_otraExpInge3,borrar_otraExpInge2,agregar_otraExpInge2,
            borrar_otraExpInge,agregar_otraExpInge,organismo,periodo,nivelExp,organismo2,periodo2,nivelExp2,
            organismo3,periodo3,nivelExp3_vista,organismo4,periodo4,nivelExp4_vista;

    private String nuevo_organismo, nuevo_periodo,nuevo_nivelExp,nuevo_organismo2,nuevo_periodo2,nuevo_nivelExp2,nuevo_nivelExp3,nuevo_periodo3,
            nuevo_organismo3,nuevo_nivelExp4,nuevo_periodo4,nuevo_organismo4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_experiencia_diseno_inge);
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

    }
}