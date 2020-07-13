package com.example.semana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class prueba extends AppCompatActivity {

    private TextView ptvnombre, ptvtelefono, ptvemail, ptvdescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        ptvnombre       = findViewById(R.id.ptvnombre);
        ptvtelefono     = findViewById(R.id.ptvtelefono);
        ptvemail        = findViewById(R.id.ptvemail);
        ptvdescripcion  = findViewById(R.id.ptvdescripcion);

        String name = getIntent().getStringExtra("name");
        ptvnombre.setText(name);
        String numberphone = getIntent().getStringExtra("numberphone");
        ptvtelefono.setText(numberphone);
        String correo = getIntent().getStringExtra("correo");
        ptvemail.setText(correo);
        String description = getIntent().getStringExtra("description");
        ptvdescripcion.setText(description);
    }

    public void editardatos (View view){
        Intent editardatos = new Intent(this, MainActivity.class);
        startActivity(editardatos);
    }


}