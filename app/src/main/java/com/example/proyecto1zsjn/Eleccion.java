package com.example.proyecto1zsjn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioButton;


public class Eleccion extends AppCompatActivity {
    RadioGroup rg;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleccion);
        Intent intent = getIntent();
        rg = findViewById(R.id.rg);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                 float i = 0;
                 int cand1 = 0;
                 int cand2 = 0;
                 int cand3 = 0;
            @Override
            public void onCheckedChanged(RadioGroup rg, int checkedId) {
                switch (checkedId) {
                    case R.id.rb1:
                        cand1++;
                        break;
                    case R.id.rb2:
                        cand2++;
                        break;
                    case R.id.rb3:
                        cand3++;
                        break;
                }

                Intent intent = new Intent(getApplicationContext(), Votos.class);
                intent.putExtra("cand1", cand1);
                intent.putExtra("cand2", cand2);
                intent.putExtra("cand2", cand3);
                startActivity(intent);
            }});}});}}



