package com.example.a02_ciclodevidadelasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // PASO 1. Variables de la vista.
    private Button btnAbrir;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS","6 - Ejecuto onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS","5 - Ejecuto onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS","4 - Ejecuto onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS","3 - Ejecuto onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS","2 - Ejecuto onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ESTADOS","1 - Ejecuto onCreate");

        btnAbrir = findViewById(R.id.btnAbrirMain);
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                Vehículo conductor ->Intent (El objeto encargado de avisar a Android:
                    1. Quien quiere abrir una nueva activity.
                    2. Que activity quiere abrir.
                 */
                // Tengo dos tipos:
                // - Implícitos -> Abren las actividades del sistema(cámara, galería, contactos, teléfono).
                // - Expzícitos -> Actividad propia.

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}