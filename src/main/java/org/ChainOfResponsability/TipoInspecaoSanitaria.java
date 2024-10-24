package org.ChainOfResponsability;

public class TipoInspecaoSanitaria implements TipoInspecao {

    private static TipoInspecaoSanitaria tipoInspecaoSanitaria = new TipoInspecaoSanitaria();

    private TipoInspecaoSanitaria() {};

    public static TipoInspecaoSanitaria getTipoInspecaoSanitaria() {
        return tipoInspecaoSanitaria;
    }
}
