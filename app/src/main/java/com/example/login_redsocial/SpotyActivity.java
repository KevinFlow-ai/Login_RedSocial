package com.example.login_redsocial;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class SpotyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spoty);  // Carga el layout vertical u horizontal según la orientación *1

        /*
        Esta parte del programa, lo que hace es que cuando ejecutas el programa en el movil real
        la parte de arriba lo que es la señal, wifi, se esconda. Ya que sin esto, sale como una linea morada
        arriba y queda muy feo, ya que el fondo es negro, y no se cubre toda la pantaalla. si quiero volver
        a poner normal pongo comentarias desde el (*1 hasta el *2)
         */

        // --- 💡 Activar modo inmersivo para ocupar toda la pantalla ---
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN            // Oculta la barra de estado (hora, batería, etc.)
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION   // Oculta los botones inferiores del sistema
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY  // Mantiene el modo oculto aunque el usuario toque la pantalla
        );
    }

    // 💡 Opcional: volver a aplicar el modo inmersivo si el usuario cambia de foco o rota la pantalla
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            );
        } //*2
    }
}
