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
    private int segprac = 3000;
    float [] tabs;  int finalI = 0;
    float g = 0, g1 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_practica1de1);

        actividadAnterior = getIntent().getStringExtra("actividad_anterior");
        text = findViewById(R.id.textView6);
        hola = new Cuerdasnumero();


        tabs = new float[]{60, 60, 0, 60, 60, 63};




            new Handler().postDelayed(() -> {
                StringBuilder valores = new StringBuilder();

                if (tabs[finalI] / 10 == 6 | tabs[finalI] / 100 == 6) {
                    if (tabs[finalI] > 100) {
                        g = tabs[finalI] / 100;
                        g1 = (g - (int)g) * 100;
                        valores.append((int)g1).append("\n");
                        text.setText(valores.toString());
                    } else if (tabs[finalI] >= 60 && tabs[finalI] <= 69) {
                        g = tabs[finalI] / 10;
                        g1 = (g - (int)g) * 10;
                        valores.append((int)g1).append("\n");
                        text.setText(valores.toString());
                    }


                } else if (tabs[finalI] / 10 == 5 | tabs[finalI] / 100 == 5){
                    if (tabs[finalI] > 100) {
                        g = tabs[finalI] / 100;
                        g1 = (g - (int)g) * 100;
                        valores.append((int)g1).append("\n");
                        text.setText(valores.toString());
                    } else if (tabs[finalI] >= 50 && tabs[finalI] <= 59) {
                        g = tabs[finalI] / 10;
                        g1 = (g - (int)g) * 10;
                        valores.append((int)g1).append("\n");
                        text.setText(valores.toString());
                    }
                }
finalI++;
                Log.d("Timer", "Ejecutando el temporizador");
            }, segprac);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
