package com.br.mundonerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void iniciaSorteador(View View){
        startActivity(new Intent(this, SorteadorActivity.class));
    }
    public void iniciaDados(View View){
        startActivity(new Intent(this, DadosActivity.class));
    }
    public void iniciaFrasesNerd(View View){
        startActivity(new Intent(this, FrasesNerdActivity.class));
    }
    public void frases(View View){
        startActivity(new Intent(this, FrasesMotivacionaisActivity.class));
    }
}