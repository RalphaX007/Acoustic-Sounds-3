package com.example.as;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class practica_1de1 extends AppCompatActivity {
    private String actividadAnterior;
    private TextView text;
    private Cuerdasnumero hola;
    private final int segprac = 1000;
    double[] tabs;
    int finalI = 0;
    double g = 0, g1 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_practica1de1);

        actividadAnterior = getIntent().getStringExtra("actividad_anterior");

        hola = new Cuerdasnumero();

        tabs = new double[]{60, 60, 0, 60, 60, 63, 0, 50, 50, 0, 52, 52, 63};

        startTimer(); // Inicia el timer
    }

    private void startTimer() {
        if (finalI < tabs.length) {
            new Handler().postDelayed(() -> {
                StringBuilder valores = new StringBuilder();

                // Procesar el valor actual de tabs[finalI]
                if (tabs[finalI] / 10 >= 6.0 && tabs[finalI] / 10 <= 6.9) {
                    text = findViewById(R.id.textView6);
                    if (tabs[finalI] > 100) {
                        g = tabs[finalI] / 100;
                        g1 = (g - (int) g) * 100;
                        valores.append((int) g1).append("\n");
                        text.setText(valores.toString());
                    } else if (tabs[finalI] >= 60 && tabs[finalI] <= 69) {
                        g = tabs[finalI] / 10;
                        g1 = (g - (int) g) * 10;
                        valores.append((int) g1).append("\n");
                        text.setText(valores.toString());
                    }
                } else if (tabs[finalI] / 10 >= 5.0 && tabs[finalI] / 10 <= 5.9 || tabs[finalI] / 100 == 5) {
                    text = findViewById(R.id.textView5);
                    if (tabs[finalI] > 100) {
                        g = tabs[finalI] / 100;
                        g1 = (g - (int) g) * 100;
                        valores.append((int) g1).append("\n");
                        text.setText(valores.toString());
                    } else if (tabs[finalI] >= 50 && tabs[finalI] <= 59) {
                        g = tabs[finalI] / 10;
                        g1 = (g - (int) g) * 10;
                        valores.append((int) g1).append("\n");
                        text.setText(valores.toString());
                    }
                }
                if (tabs[finalI] == 0) {
                    text.setText("");
                }

                Log.d("Timer", "Ejecutando el temporizador para finalI: " + finalI);
                finalI++; // Incrementar finalI
                startTimer(); // Llamar de nuevo para el siguiente valor
            }, segprac);
        } else if (finalI > tabs.length){
            onDestroy();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Aquí puedes limpiar cualquier recurso o detener el timer si es necesario
    }
}
