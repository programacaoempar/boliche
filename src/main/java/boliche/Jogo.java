package boliche;

public class Jogo {

    private int[] todasJogadas = new int[21];
    private int pontuacao = 0;
    private int contadorJogada = 0;

    public void executaJogada(int quedaPinos) {
        todasJogadas[contadorJogada++] = quedaPinos;
    }

    public int obtemPontuacao() {
        for (int i = 0; i < 20; i++) {
            if(eSpare(i)){
                spareBonus(i);
                i++;
            }if(eStrike(i)){
                strikeBonus(i);
            }else{
                pontuacao += todasJogadas[i];
            }
        }
        return pontuacao;
    }

    private void strikeBonus(int i) {
        pontuacao += 10 + todasJogadas[i + 1] + todasJogadas[i + 2];
    }

    private boolean eStrike(int i) {
        return todasJogadas[i] == 10;
    }

    private void spareBonus(int i) {
        pontuacao += 10 + todasJogadas[i + 2];
    }

    private boolean eSpare(int i) {
        return todasJogadas[i] + todasJogadas[i + 1] == 10;
    }


}
