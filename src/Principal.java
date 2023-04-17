import br.com.moises.music.modelo.Audio;

public class Principal {
    public static void main(String[] args) {

        Audio musica = new Audio();
        musica.setTitulo("sidoka");
        musica.setDuracao(5);
        musica.curtir(5);
        musica.curtir(1);
        musica.notas(1);
        musica.notas(1);
        musica.reproduzir(3);
        musica.reproduzir(2);
        musica.exibeFicha();



    }
}
