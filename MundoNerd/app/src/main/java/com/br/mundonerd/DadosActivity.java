package com.br.mundonerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class DadosActivity extends AppCompatActivity {

    private Button bseis, bdoze, bvinte, bcen;
    private TextView eu,app,vencedor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        bseis = (Button) findViewById(R.id.seis);
        bdoze = (Button) findViewById(R.id.doze);
        bvinte = (Button) findViewById(R.id.vinte);
        bcen = (Button) findViewById(R.id.cem);
        eu = (TextView) findViewById(R.id.voce6);
        app = (TextView) findViewById(R.id.app6);
        vencedor = (TextView) findViewById(R.id.vencedor);

        bseis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               Random rn = new Random();
                int answer = rn.nextInt(7) ;
                eu.setText(String.valueOf(answer));
               int resp = rn.nextInt(7);
               app.setText(String.valueOf(resp));

               if (answer > resp){
                   vencedor.setText("Você venceu!");
               }else if (answer == resp){
                   vencedor.setText("O App venceu!");
               }else{
                   vencedor.setText("Empate!");
               }

            }
        });

        bdoze.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(13) ;
                eu.setText(String.valueOf(answer));
                int resp = rn.nextInt(13);
                app.setText(String.valueOf(resp));

                if (answer > resp){
                    vencedor.setText("Você venceu!");
                }else if (answer == resp){
                    vencedor.setText("O App venceu!");
                }else{
                    vencedor.setText("Empate!");
                }
            }
        });

        bvinte.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(21) ;
                eu.setText(String.valueOf(answer));
                int resp = rn.nextInt(21);
                app.setText(String.valueOf(resp));

                if (answer > resp){
                    vencedor.setText("Você venceu!");
                }else if (answer == resp){
                    vencedor.setText("O App venceu!");
                }else{
                    vencedor.setText("Empate!");
                }
            }
        });

        bcen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(101);
                eu.setText(String.valueOf(answer));
                int resp = rn.nextInt(101);
                app.setText(String.valueOf(resp));

                if (answer > resp){
                    vencedor.setText("Você venceu!");
                }else if (answer == resp){
                    vencedor.setText("O App venceu!");
                }else{
                    vencedor.setText("Empate!");
                }
            }
        });



    }



    public void voltarHome(View View){
        startActivity(new Intent(this,HomeActivity.class));
    }


}