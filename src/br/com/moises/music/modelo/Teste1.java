package br.com.moises.music.modelo;

import br.com.moises.music.preferido.Preferido;

public class Teste1 implements Preferido {
     private int gostei;

    public int getGostei() {
        return gostei;
    }

    public void setGostei(int gostei) {
        this.gostei = gostei;
    }

    @Override
    public int getPreferido() {
        if (gostei > 10){
            return 4;
        }else {
            return 1;
        }
    }
}
