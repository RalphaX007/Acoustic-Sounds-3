package com.example.as;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.ViewCompat;

public class seleccion2 extends AppCompatActivity {
     Button practica1,practica2,practica3,leccion1,leccion2,leccion3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seleccion2);

        practica1 = findViewById(R.id.practica1);
        practica2 = findViewById(R.id.practica2);
        practica3 = findViewById(R.id.practica3);
        leccion1 = findViewById(R.id.leccion1);
        leccion2 = findViewById(R.id.leccion2);
        leccion3 = findViewById(R.id.leccion3);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED ||
                    ContextCompat.checkSelfPermission(this, android.Manifest.permission.MANAGE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

                ActivityCompat.requestPermissions(this,
                        new String[]{android.Manifest.permission.RECORD_AUDIO, Manifest.permission.MANAGE_EXTERNAL_STORAGE}, 200);
            }
        }


        leccion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seleccion2.this, leccion2de3.class);
                startActivity(intent);
            }
        });
        leccion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seleccion2.this, leccion2de2.class);
                startActivity(intent);
            }
        });
        leccion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seleccion2.this,leccion2de1.class);
                startActivity(intent);
            }
        });
        practica3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seleccion2.this, vista_previa_3de2.class);
                startActivity(intent);
            }
        });
        practica2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seleccion2.this, vista_previa_2de2.class);
                startActivity(intent);
            }
        });
        practica1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seleccion2.this, vista_previa_1de2.class);
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