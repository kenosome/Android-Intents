package com.cali.uao.proyectointents;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;


public class OtraActividad extends Activity {

    TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra_actividad);


        salida=(TextView) findViewById(R.id.salida);

        Persona p= (Persona)getIntent().getExtras().getSerializable("persona");
        String nombre;
        String cedula;
        if (p.getNombre().equals("")){
            nombre="NO_NOMBRE";
        }else{
            nombre=p.getNombre();
        }
        if (p.getCedula().equals("")){
            cedula="NO_CEDULA";
        }else{
            cedula=p.getCedula();
        }

        salida.setText("Su nombre es: "+nombre+"\nSu cedula es: "+cedula);




    }

}
