package com.example.semana2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText tvnombre, tvtelefono, tvemail, tvdescripcion;

    private int dia, mes,anio;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePicker dtdatepicker = findViewById(R.id.dtdatepicker);
        int dia = dtdatepicker.getDayOfMonth();
        int mes = dtdatepicker.getMonth();
        int anio = dtdatepicker.getYear();

        tvnombre      = findViewById(R.id.tvnombre);
        tvtelefono    = findViewById(R.id.tvtelefono);
        tvemail       = findViewById(R.id.tvemail);
        tvdescripcion = findViewById(R.id.tvdescripcion);

    }

    public void siguiente (View view){
        Intent siguiente = new Intent(this, prueba.class);
        siguiente.putExtra("name", tvnombre.getText().toString());
        siguiente.putExtra("numberphone", tvtelefono.getText().toString());
        siguiente.putExtra("correo", tvemail.getText().toString());
        siguiente.putExtra("description", tvdescripcion.getText().toString());
        startActivity(siguiente);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, getResources().getString(R.string.onstart), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, getResources().getString(R.string.onresume), Toast.LENGTH_LONG).show();
    }

    //Actividad corriendo

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, getResources().getString(R.string.onrestart), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, getResources().getString(R.string.onpause), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, getResources().getString(R.string.ondestroy), Toast.LENGTH_LONG).show();
    }

}