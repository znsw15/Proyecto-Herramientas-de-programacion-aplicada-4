package com.example.proyecto1zsjn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Votos extends AppCompatActivity {
    TextView tvres1,tvres2,tvres3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votos);
        tvres1=findViewById(R.id.tvres1);
        tvres2=findViewById(R.id.tvres2);
        tvres3=findViewById(R.id.tvres3);

                Intent intent = getIntent();
                int cand1 = intent.getIntExtra("cand1", 0);
                int cand2 = intent.getIntExtra("cand2", 0);
                int cand3 = intent.getIntExtra("cand3", 0);

                 cand1= (cand1 / 40)*100;
                 cand2= (cand2 / 40)*100;
                 cand3= (cand3 / 40)*100;

                tvres1.setText("= "+cand1);
                tvres2.setText("= "+cand2);
                tvres3.setText("= "+cand3);

            }
        }
