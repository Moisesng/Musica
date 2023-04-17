package br.com.moises.music.modelo;

import br.com.moises.music.preferido.Preferido;

public class Musica extends Audio implements Preferido {

    private String album;

    @Override
    public int getPreferido() {
        if (getTotalDeReproducoes() > 2){
        return 4;
        }else{
            return 1;
        }
    }


}
