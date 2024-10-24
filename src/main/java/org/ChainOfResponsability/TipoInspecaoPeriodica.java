package org.ChainOfResponsability;

public class TipoInspecaoPeriodica implements TipoInspecao {

    private static TipoInspecaoPeriodica tipoInspecaoPeriodica = new TipoInspecaoPeriodica();

    private TipoInspecaoPeriodica() {}

    public static TipoInspecaoPeriodica getTipoInspecaoPeriodica() {
        return tipoInspecaoPeriodica;
    }
}
