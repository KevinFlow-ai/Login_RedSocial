package com.example.login_redsocial;

import android.os.Bundle;
import android.view.WindowInsets;

import androidx.appcompat.app.AppCompatActivity;

// CLASE PARA MOSTRAR EL PERFIL SOCIAL
public class PerfilRedSocialActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_red_social); // Usa tu layout del perfil
        //  esto oculta todo el status bar
        //getWindow().getInsetsController().hide(WindowInsets.Type.statusBars());


    }
}

