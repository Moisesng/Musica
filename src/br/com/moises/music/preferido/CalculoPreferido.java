package br.com.moises.music.preferido;

import br.com.moises.music.modelo.Audio;

public class CalculoPreferido {
    public void favoritar( Preferido preferido){
        if (preferido.getPreferido()==4){
            System.out.println("preferido d mais");
    } else {
            System.out.println("nao preferido");
        }
    }
    public void testar (Audio audio){

    }
}
