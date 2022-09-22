package com.example.proyecto1zsjn;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etcedula;
    private Button btn1;
    private ArrayList<Usuario> listaUsuario;
    private Usuario objUsuario;

    public MainActivity(Usuario objUsuario) {
        this.objUsuario = objUsuario;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ini();
    }

    public void ini ()
    {
        etcedula = (EditText) findViewById(R.id.etcedula);
        btn1=(Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
    }
    public void llenarUsuario() {

        listaUsuario = new ArrayList<Usuario>();
        listaUsuario.add(new Usuario("08-0939-001578", "Julio Navas" ));
        listaUsuario.add(new Usuario("03-0742-002055", "Zulixa Salas"));
        listaUsuario.add(new Usuario("08-0944-000327", "EDWIN ARROCHA"));
    }

    private void iniciarSesion()
    {
        llenarUsuario();
        String cedula = etcedula.getText().toString();
        boolean usuarioEncontrado = false;
        for (int i=0; i< listaUsuario.size(); i++)
        {
            if (cedula.equals(listaUsuario.get(i).getCedula()))
            {
                Toast.makeText(this, "Bienvenido" + listaUsuario.get(i).getNombre(), Toast.LENGTH_SHORT).show();
                usuarioEncontrado = true;
                Intent intent = new Intent(MainActivity.this, Eleccion.class);
                startActivity(intent);
                objUsuario = listaUsuario.get(i);
                intent.putExtra("Usuario", objUsuario);
            }
            else if (cedula.isEmpty())
            {
                Toast.makeText(this, "Llenar el campo", Toast.LENGTH_SHORT).show();
            }
        }
        if(!usuarioEncontrado)
        {
            Toast.makeText(this, "Cedula invalida", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn1){
            iniciarSesion();
        }
    }}
