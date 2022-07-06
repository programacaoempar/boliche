package br.com.programacaoempar;

public class Jogo {


    int[] pontuacaoTodasJogadas = new int[20];
    int jogada = 0;
    public void executaJogada(int quedaPinos) {
        if (eStrike(quedaPinos)){
            pontuacaoTodasJogadas[jogada++] = quedaPinos;
            pontuacaoTodasJogadas[jogada] = 0;
            jogada++;
        }else{
            pontuacaoTodasJogadas[jogada++] = quedaPinos;
        }
    }

    public int pontuacao() {
        int pontuacao = 0;
        int indiceRodada = 0;
        for (int rodadas = 0; rodadas < 10; rodadas++) {
            if (eStrike(indiceRodada)){ //strike
                pontuacao += 10 + pontuacaoTodasJogadas[indiceRodada+2] + pontuacaoTodasJogadas[indiceRodada+3];
                indiceRodada += 2;
            }
            else if (eSpare(indiceRodada)) { //spare
                pontuacao += 10 + pontuacaoTodasJogadas[indiceRodada+2];
                indiceRodada += 2;
            }else{
                pontuacao += pontuacaoTodasJogadas[indiceRodada] + pontuacaoTodasJogadas[indiceRodada+1];
                indiceRodada += 2;
            }
        }
        return pontuacao;
    }

    private boolean eSpare(int i) {
        return pontuacaoTodasJogadas[i] + pontuacaoTodasJogadas[i + 1] == 10;
    }

    private boolean eStrike(int indiceRodada) {
        return pontuacaoTodasJogadas[indiceRodada] == 10;
    }
}
