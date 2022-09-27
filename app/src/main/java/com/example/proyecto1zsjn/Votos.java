package com.example.proyecto1zsjn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Votos extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votos);

        tv1 = findViewById(R.id.tvres1);
        tv2 = findViewById(R.id.tvres2);
        tv3 = findViewById(R.id.tvres3);
        btn1 = findViewById(R.id.btn1);


        Intent intent = getIntent();
        Usuario.cand1 = intent.getIntExtra("cand1", 0);
        Usuario.cand2  = intent.getIntExtra("cand2", 0);
        Usuario.cand3 = intent.getIntExtra("cand3", 0);


        tv1.setText("Votos: " + (Usuario.cand1/39)*100);
        tv2.setText("Votos: " + (Usuario.cand2/39)*100);
        tv3.setText("Votos: " + (Usuario.cand3/39)*100);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Votos.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
