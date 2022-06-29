package br.com.programacaoempar;

public class Jogo {

    int pontuacao = 0;
    int[] pontuacaoTodasJogadas = new int[20];
    int jogadaAtual = 0;
    public void jogada(int quedaPinos) {
        pontuacaoTodasJogadas[jogadaAtual++] = quedaPinos;
    }

    public int pontuacao() {
        for (int i = 0; i < pontuacaoTodasJogadas.length; i++) {
            pontuacao += pontuacaoTodasJogadas[i];
        }
        return pontuacao;
    }
}
