package br.com.programacaoempar;

public class Jogo {
    private int[] pontuacaoTodasJogadas = new int[21];
    private int jogadaAtual = 0;
    public void executaJogada(int quantidadeDePinusDerrubado) {
        pontuacaoTodasJogadas[jogadaAtual++] = quantidadeDePinusDerrubado;
    }

    public int obtemPontuacao() {
        int pontuacao = 0;
        int indiceRodada = 0;
        for (int rodadas = 0; rodadas < 10; rodadas++) {
            if (eUmStrike(indiceRodada)){ //strike
                pontuacao += 10 + pontuacaoTodasJogadas[indiceRodada+1] + pontuacaoTodasJogadas[indiceRodada+2];
                indiceRodada++;
            } else if (eUmSpare(indiceRodada)) { //spare
                pontuacao += 10 + pontuacaoTodasJogadas[indiceRodada+2];
                indiceRodada += 2;
            } else{
                pontuacao += pontuacaoTodasJogadas[indiceRodada] + pontuacaoTodasJogadas[indiceRodada+1];
                indiceRodada += 2;
            }
        }
        return pontuacao;
    }

    private boolean eUmSpare(int i) {
        return pontuacaoTodasJogadas[i] + pontuacaoTodasJogadas[i + 1] == 10;
    }

    private boolean eUmStrike(int indiceRodada) {
        return pontuacaoTodasJogadas[indiceRodada] == 10;
    }
}
