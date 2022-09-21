package com.example.proyecto1zsjn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import com.example.proyecto1zsjn.modelo.Usuario;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText etcedula;
    private Button btn1;
    private ArrayList<Usuario>listaUsuario;
    private Usuario objUsuario;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

    }
    public void ini(){
        etcedula = findViewById(R.id.etcedula);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

    }

    private void listaUsuario(){

        listaUsuario = new ArrayList<Usuario>();
        listaUsuario.add(new Usuario("8-939-1578"));
        listaUsuario.add(new Usuario("3-742-2055"));
    }

    @Override
    public void onClick(View view) {
    if (view.getId()== R.id.btn1){
        etcedula.setText("");

    }
    }
}