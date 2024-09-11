package com.example.as;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class seleccion extends AppCompatActivity {
   Button practica1,leccion,leccion2,practica2,leccion3,practica3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seleccion);

        practica1 = findViewById(R.id.practica1);
        leccion = findViewById(R.id.leccion1);
        leccion2  = findViewById(R.id.leccion2);
        practica2 = findViewById(R.id.practica2);
        leccion3 = findViewById(R.id.leccion3);
        practica3 = findViewById(R.id.practica3);
        practica3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seleccion.this, vista_previa_3de1.class);
                startActivity(intent);
            }
        });
        leccion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seleccion.this, leccion1de3.class);
                startActivity(intent);
            }
        });
        practica2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seleccion.this, vista_previa_2de1.class);
                startActivity(intent);
            }
        });
        leccion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seleccion.this, leccion1dedos.class);
                startActivity(intent);
            }
        });
        leccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seleccion.this, leccion1de1.class);
                startActivity(intent);
            }
        });
        practica1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seleccion.this,vista_previa_1de1.class);
                startActivity(intent);
            }
        });

                ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}