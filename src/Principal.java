import br.com.moises.music.modelo.Audio;
import br.com.moises.music.modelo.Musica;
import br.com.moises.music.modelo.Teste1;
import br.com.moises.music.preferido.CalculoPreferido;
import br.com.moises.music.preferido.Preferido;

public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("sidoka");
        musica.setDuracao(5);
        musica.curtir(5);
        musica.curtir(1);
        musica.notas(1);
        musica.notas(1);
        musica.reproduzir(3);
        musica.reproduzir(2);
        musica.exibeFicha();

        Teste1 sidoka =new Teste1();
        sidoka.setGostei(30);
        CalculoPreferido favorito = new CalculoPreferido();
        favorito.favoritar(sidoka);






    }
}
