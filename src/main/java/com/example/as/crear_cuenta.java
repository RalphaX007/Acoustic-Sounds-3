package com.example.as;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class crear_cuenta extends AppCompatActivity {
     Button proseguir;
     EditText nombre; EditText contraseña;
     String nombre2; String contraseña2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_crear_cuenta);

        nombre = findViewById(R.id.nombre);
        contraseña = findViewById(R.id.contaseña);

        nombre.setHint("Ingresar correo electronico");
        contraseña.setHint("Ingresar contraseña");

        proseguir=findViewById(R.id.proseguir);
        proseguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre2 = String.valueOf(nombre.getText());
                contraseña2 = String.valueOf(contraseña.getText());
                if (nombre2.isEmpty()){ nombre.setHint("No has introducido tu correo"); }

                if (contraseña2.isEmpty()){ contraseña.setHint("No has ingresado tu contraseña"); }

                else if (!nombre2.isEmpty() && !contraseña2.isEmpty()){

                    Intent intent = new Intent(crear_cuenta.this, informacion_1.class );
                    startActivity(intent);

                }
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}