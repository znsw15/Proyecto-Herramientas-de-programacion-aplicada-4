package com.example.proyecto1zsjn;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText etcedula;
    Button btn1;
    ArrayList<Usuario>listaUsuario;
    private Usuario objUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etcedula = findViewById(R.id.etcedula);
        btn1=findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llenarUsuario();
                String cedula = etcedula.getText().toString();
                boolean usuarioEncontrado = false;
                for (int i = 0; i< listaUsuario.size(); i++) {

                    if (cedula.equals(listaUsuario.get(i).getCedula())) {
                        //Toast.makeText(this, "Bienvenido" + listaUsuario.get(i).getNombre(), Toast.LENGTH_SHORT).show();
                        usuarioEncontrado = true;
                        //Intent inicio = new Intent(MainActivity.this,Eleccion.class);
                        //startActivity(inicio);
                    }else if(cedula.isEmpty()){
                        //Toast.makeText(this, "Llene el campo", Toast.LENGTH_SHORT).show();
                    }else if(!usuarioEncontrado){
                        //Toast.makeText(this, "La cedula no es válida", Toast.LENGTH_SHORT).show();
                    }
                }
                Intent intent = new Intent(getApplicationContext(), Eleccion.class);
                startActivity(intent);
            }});}
    public void llenarUsuario(){

        listaUsuario = new ArrayList<Usuario>();
        listaUsuario.add(new Usuario("08-0939-001578", "Julio Navas"));
        listaUsuario.add(new Usuario("03-0742-002055", "Zulixa Salas"));
        listaUsuario.add(new Usuario("08-0944-000327","EDWIN ARROCHA" ));
       /* listaUsuario.add(new Usuario("03-0740-001394"));
        listaUsuario.add(new Usuario("20-0053-004282"));
        listaUsuario.add(new Usuario("08-0943-001867"));
        listaUsuario.add(new Usuario("08-0937-000503"));
        listaUsuario.add(new Usuario("08-0952-002444"));
        listaUsuario.add(new Usuario("08-0943-000012"));
        listaUsuario.add(new Usuario("08-0986-000549"));
        listaUsuario.add(new Usuario("08-0957-001827"));
        listaUsuario.add(new Usuario("08-0940-001311"));
        listaUsuario.add(new Usuario("08-0863-001620"));*/
    }}