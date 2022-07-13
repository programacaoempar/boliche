package br.com.programacaoempar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogoTeste {

    Jogo jogo;

    @BeforeEach
    void inicializacao(){
        jogo = new Jogo();
    }

    @Test
    void testaJogo(){
        jogo.executaJogada(1);
        for (int i = 0; i < 19 ; i++) {
            jogo.executaJogada(1);
        }
        assertEquals(20, jogo.obtemPontuacao());
    }

    @Test
    void testaSpare(){
       jogo.executaJogada(5);
       jogo.executaJogada(5);
       jogo.executaJogada(5);
        for (int i = 0; i < 17 ; i++) {
            jogo.executaJogada(0);
        }
        assertEquals(20, jogo.obtemPontuacao());
    }

    @Test
    void testaStrike(){
        jogo.executaJogada(10);//26

        jogo.executaJogada(10);//19

        jogo.executaJogada(6);
        jogo.executaJogada(3);//9
        for (int i = 0; i < 14 ; i++) {
            jogo.executaJogada(0);
        }
        assertEquals(54, jogo.obtemPontuacao());
    }

}
