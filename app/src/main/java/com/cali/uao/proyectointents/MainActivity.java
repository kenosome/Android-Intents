package com.cali.uao.proyectointents;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

    EditText nombre, cedula;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText) findViewById(R.id.nombre);
        cedula=(EditText) findViewById(R.id.cedula);
    }

    public void enviarparametros(View view) {

        Intent i=new Intent(this, OtraActividad.class);

        Persona p=new Persona(nombre.getText().toString(),cedula.getText().toString());

        i.putExtra("persona",p);

        //i.putExtra("nombre",nombre.getText().toString());
        //i.putExtra("cedula",cedula.getText().toString());
        startActivity(i);



    }
}
