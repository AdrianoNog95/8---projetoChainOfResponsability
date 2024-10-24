package org.ChainOfResponsability;

public class TipoInspecaoEstrutural implements TipoInspecao {

    private static TipoInspecaoEstrutural tipoInspecaoEstrutural = new TipoInspecaoEstrutural();

    private TipoInspecaoEstrutural() {};

    public static TipoInspecaoEstrutural getTipoInspecaoEstrutural() {
        return tipoInspecaoEstrutural;
    }
}
