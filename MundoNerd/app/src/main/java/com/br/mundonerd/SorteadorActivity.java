package com.br.mundonerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SorteadorActivity extends AppCompatActivity {
    private Button dez, cem, mil, dezm;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteador);

        dez = (Button) findViewById(R.id.dez);
        cem = (Button) findViewById(R.id.cem);
        mil = (Button) findViewById(R.id.mil);
        dezm = (Button) findViewById(R.id.dezMil);
        resultado = (TextView) findViewById(R.id.textNumero);


        dez.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(11);
                resultado.setText(String.valueOf(answer));
            }
        });

        cem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(101) ;
                resultado.setText(String.valueOf(answer));
            }
        });

        mil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(1001);
                resultado.setText(String.valueOf(answer));
            }
        });

        dezm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(10001);
                resultado.setText(String.valueOf(answer));
            }
        });
    }


    public void voltarHome(View View){
        startActivity(new Intent(this,HomeActivity.class));
    }
}