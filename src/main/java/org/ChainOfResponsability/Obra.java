package org.ChainOfResponsability;

public class Obra {

    private TipoInspecao tipoInspecao;

    public Obra(TipoInspecao tipoInspecao) {
        this.tipoInspecao = tipoInspecao;
    }

    public TipoInspecao getTipoInspecao() {
        return tipoInspecao;
    }

    public void setTipoInspecao(TipoInspecao tipoInspecao) {
        this.tipoInspecao = tipoInspecao;
    }
}
