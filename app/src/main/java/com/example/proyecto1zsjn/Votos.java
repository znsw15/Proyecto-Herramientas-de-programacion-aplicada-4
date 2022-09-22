package com.example.proyecto1zsjn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;

public class Votos extends AppCompatActivity {
    TextView tvres1,tvres2,tvres3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votos);
        tvres1=findViewById(R.id.tvres1);
        tvres2=findViewById(R.id.tvres2);
        tvres3=findViewById(R.id.tvres3);

               Usuario.cand1= (Usuario.cand1/39)*100;
               Usuario.cand2= (Usuario.cand2/39)*100;
               Usuario.cand3= (Usuario.cand3/39)*100;

                tvres1.setText("= "+Usuario.cand1);
                tvres2.setText("= "+Usuario.cand2);
                tvres3.setText("= "+Usuario.cand3);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
            }

        }
