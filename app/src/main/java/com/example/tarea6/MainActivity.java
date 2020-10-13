package com.example.tarea6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        String [] comida = {"Comidas","Pastas", "Pescados", "Carnes", "Postres", "Sopas"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, comida);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    //Spinnner methods

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selected = parent.getItemAtPosition(position).toString();

        if(selected.equals("Pastas")){
            sentTo(view, selected);
        }
        else if(selected.equals("Pescados")){
            sentTo(view, selected);
        }
        else if(selected.equals("Carnes")){
            sentTo(view, selected);
        }
        else if(selected.equals("Postres")){
            sentTo(view, selected);
        }
        else if(selected.equals("Sopas")){
            sentTo(view, selected);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    //Intent method

    public void sentTo(View view, String comida){
        Intent i = new Intent(this, Recetas.class);
        i.putExtra("Comida", comida);
        startActivity(i);
    }
}
