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
        jogo.jogada(1);
        for (int i = 0; i < 19 ; i++) {
            jogo.jogada(1);
        }
        assertEquals(20, jogo.pontuacao());
    }

    @Test
    void testaSpare(){
       jogo.jogada(5);
       jogo.jogada(5);
       jogo.jogada(5);
        for (int i = 0; i < 17 ; i++) {
            jogo.jogada(0);
        }
        assertEquals(24, jogo.pontuacao());
    }

}
