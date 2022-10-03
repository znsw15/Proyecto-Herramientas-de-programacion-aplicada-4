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
    RadioButton rb1, rb2, rb3, rb4;
    static int cand1, cand2, cand3, cand4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleccion);

        radioGroup = findViewById(R.id.rg);
        botonVoto = findViewById(R.id.btn1);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);


        botonVoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (rb1.isChecked() == true) {
                    Usuario.cand1 =  Usuario.cand1 + 1;
                    Intent intent = new Intent(getApplicationContext(), Votos.class);
                    intent.putExtra("cand1", Usuario.cand1);
                    startActivity(intent);
                }

                if (rb2.isChecked() == true) {
                    Usuario.cand2 =  Usuario.cand2 + 1;
                    Intent intent = new Intent(getApplicationContext(), Votos.class);
                    intent.putExtra("cand1", Usuario.cand2);
                    startActivity(intent);
                }
                if (rb3.isChecked() == true) {
                    Usuario.cand3 =  Usuario.cand3 + 1;
                    Intent intent = new Intent(getApplicationContext(), Votos.class);
                    intent.putExtra("cand1", Usuario.cand3);
                    startActivity(intent);
                }
                if (rb4.isChecked() == true) {
                    Usuario.cand4 =  Usuario.cand4 + 1;
                    Intent intent = new Intent(getApplicationContext(), Votos.class);
                    intent.putExtra("cand4", Usuario.cand4);
                    startActivity(intent);
                }


            }
        });


    }
}


