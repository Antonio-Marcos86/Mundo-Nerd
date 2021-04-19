package com.br.mundonerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class FrasesMotivacionaisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases_motivacionais);
    }
    // Armazenando as frases que podem ser geradas
    public void gerarNovaFraseMot(View view){
        String[] frases = {//vai gerar frases aleatoriamente
                " “O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis” – José de Alencar",
                "“Se você quer ser bem-sucedido precisa de dedicação total, buscar seu último limite e dar o melhor de si mesmo” – Ayrton Senna",
                "“Não crie limites para si mesmo. Você deve ir tão longe quanto sua mente permitir. O que você mais quer pode ser conquistado” – Mary Kay Ash",
                "“Dificuldades preparam pessoas comuns para destinos extraordinários” C.S Lewis",
                "“Nenhum homem será um grande líder se quiser fazer tudo sozinho ou se quiser levar todo o crédito por fazer isso” – Andrew Carnegie",
                "“Bom mesmo é ir à luta com determinação, abraçar a vida com paixão, perder com classe e vencer com ousadia, porque o mundo pertence a quem se atreve e a vida é muito curta, para ser insignificante” — Charlie Chaplin" ,
                "“Pessoas vencedoras não são aquelas que não falham, são aquelas que não desistem”  – Autor desconhecido" ,
                "“Só existem dois dias do ano em que você não pode fazer nada: um se chama ontem e outro amanhã” – Dalai Lama"  ,
                "“Para ser um campeão você tem que acreditar em si mesmo quando ninguém mais acredita” – Muhammad Ali",
                "“O pessimista vê dificuldade em toda oportunidade. O otimista vê oportunidade em toda dificuldade” – Winston Churchill",
                "“Gostaria que você soubesse que existe dentro de si uma força capaz de mudar sua vida. Basta que lute e aguarde um novo amanhecer” – Margaret Thatcher",
                "“Nossos fracassos, às vezes, são mais frutíferos do que os êxitos” – Henry Ford",
                "“Mesmo que já tenhas feito uma longa caminhada, há sempre um novo caminho a fazer” – Santo Agostinho",
                "“Somente os que ousam errar muito podem realizar muito” – John F. Kennedy",
                "Eu sou o caminho, e a verdade e a vida: ninguém vem ao Pai, senão por mim. João 14:6",
                "No princípio, Deus criou os céus e a terra.Gênesis 1:1"


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