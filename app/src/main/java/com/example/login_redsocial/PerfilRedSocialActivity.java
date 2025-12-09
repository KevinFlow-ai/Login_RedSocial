package com.example.login_redsocial;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowInsets;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

// CLASE PARA MOSTRAR EL PERFIL SOCIAL
public class PerfilRedSocialActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_red_social); // Usa tu layout del perfil
        //  esto oculta todo el status bar
        //getWindow().getInsetsController().hide(WindowInsets.Type.statusBars());


        /*
        // si queremos cambiar de una interfaz a otra. Copiamos primero el identificador
        Button btnEditProfile = findViewById(R.id.btnEditProfile);

        // ponemos esta funcion
        btnEditProfile.setOnClickListener(V -> {
            // Acciones a realizar cuando se hace clic en el botón

            Intent intent = new Intent(PerfilRedSocialActivity.this, Cardview_CartaDePresentacion_Activity.class);
            startActivity(intent);
        });

         */

    }
}

