package boliche;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogoTeste {

    Jogo jogo;

    @BeforeEach
    void inicializacao() {
        jogo = new Jogo();
    }

    @Test
    void testaPrimeiraJogada() {
        jogo.executaJogada(1);
        jogo.executaJogada(2);
        jogo.executaJogada(2);
        assertEquals(5, jogo.obtemPontuacao());
    }

    @Test
    void testeSpare() {

        jogo.executaJogada(5);
        jogo.executaJogada(5);

        jogo.executaJogada(3);

        assertEquals(16, jogo.obtemPontuacao());
    }

    @Test
    void testeStrike() {

        jogo.executaJogada(10);

        jogo.executaJogada(1);
        jogo.executaJogada(2);

        assertEquals(16, jogo.obtemPontuacao());
    }
    @Test
    void doisStrike() {

        jogo.executaJogada(10);
        jogo.executaJogada(10);

        jogo.executaJogada(2);
        jogo.executaJogada(2);

        assertEquals(40, jogo.obtemPontuacao());
    }

}
