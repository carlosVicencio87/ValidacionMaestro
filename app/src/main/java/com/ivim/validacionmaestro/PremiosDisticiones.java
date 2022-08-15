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

public class PremiosDisticiones extends AppCompatActivity {
    private ScrollView formulario_premDist;

    private LinearLayout caja_edit_desPreRec,caja_desPreRec_final,caja_edit_desPreRec2,caja_desPreRec2_final,caja_edit_desPreRec3,
            caja_desPreRec3_final,caja_edit_desPreRec4,caja_desPreRec4_final,caja_edit_desPreRec5,caja_desPreRec5_final;

    private EditText desPreRec_texto,desPreRec2_texto,desPreRec3_texto,desPreRec4_texto,desPreRec5_texto;


    private ImageView guardar_desPreRec,cambiar_desPreRec,
            guardar_desPreRec2,cambiar_desPreRec2,guardar_desPreRec3,cambiar_desPreRec3,guardar_desPreRec4,
            cambiar_desPreRec4,guardar_desPreRec5,cambiar_desPreRec5;

    private TextView desPreRec,desPreRec2,desPreRec3,desPreRec4,desPreRec5;

    private String nuevo_desPreReca,nuevo_desPreRec2,nuevo_desPreRec3,
            nuevo_desPreRec4,nuevo_desPreRec5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_premios_disticiones);
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

    }
}