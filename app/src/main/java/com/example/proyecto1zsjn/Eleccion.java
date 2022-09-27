package com.example.proyecto1zsjn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioButton;

public class Eleccion extends AppCompatActivity {
    RadioGroup  radioGroup;
    Button botonVoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleccion);

        radioGroup = findViewById(R.id.rg);
        botonVoto = findViewById(R.id.btn1);


        botonVoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int checkedId = radioGroup.getCheckedRadioButtonId();
                Intent intent =new Intent(Eleccion.this, Votos.class);
                if (checkedId == -1) {
                    Toast.makeText(Eleccion.this, "No hay seleccion.", Toast.LENGTH_SHORT).show();
                }else{
                    findRadioButton(checkedId);
                    startActivity(intent);
                }

            }
        });

    }
    private void findRadioButton(int checkedId) {
        switch (checkedId) {
            case R.id.rb1:
                Usuario.cand1++;
                break;
            case R.id.rb2:
                Usuario.cand2++;
                break;
            case R.id.rb3:
                Usuario.cand3++;
                break;

        }
    }
}



