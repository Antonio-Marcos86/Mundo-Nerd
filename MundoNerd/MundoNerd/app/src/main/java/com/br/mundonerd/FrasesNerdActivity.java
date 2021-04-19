package com.br.mundonerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class FrasesNerdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases_nerd);
    }

    // Armazenando as frases que podem ser geradas
    public void gerarNovaFrase(View view){
        String[] frases = {//vai gerar frases aleatoriamente
                "Vida longa e próspera (Sr. Spock - StarTrek)",
                "Eu tenho a força! (He-man)",
                "Que a força esteja com você! (StarWars)",
                "Você não passará! (Gandalf)",
                "Com grandes poderes vem grandes responsabilidades (Uncle Ben)",
                "Ao infinito, e além (BuzzLightyear)" ,
                "Bazinga! (Shedon Cooper)" ,
                "Que é que há, velhinho (Pernalonga)"  ,
                "Nós criamos os nossos próprios demônios.(Tony Stark)",
                "Dizem que o inferno existe e é um lugar onde seus piores pesadelos se repetem sem parar. Mas muitos não precisam morrer para chegar lá.(Logan Wolverine)",
                "Progresso é a habilidade do homem de complicar as coisas simples.(Thor)",
                "Nem sempre sou capaz de escolher minhas batalhas... Mas com efeito imediato, vou fazer um esforço para escolher as batalhas que importam.Steve Rogers (Capitão América)",
                "Só porque alguém tropeça e perde seu caminho, isso não significa que estão perdidos para sempre.Charles Xavier (X-Men)",
                "Não é o que sou por dentro, é o que eu faço que me define.Bruce Wayne (Batman)",
                "Nossos poderes não decidem quem somos. Nós decidimos.Barry Allen (The Flash)",
                "Transmita o que aprendeu. Força , mestria. Mas fraqueza, , insensatez, fracasso também. Sim, fracasso acima de tudo.O maior professor, o fracaso é. mestre Yoda(Star Wars)"


        };
        // VAR responsável por gerar os valores aleatórios
        // que serão utilizados para indicar a posião no vetor frases
        int numero = new Random().nextInt(16);

        // Mostrando a frase com base na posição sorteada
        TextView frase = findViewById(R.id.txtFraseGerada);
        frase.setText(frases[numero]);
    }// fechamento da função gerarNovaFrase

    public void voltarHome(View View){
        startActivity(new Intent(this,HomeActivity.class));
    }
}