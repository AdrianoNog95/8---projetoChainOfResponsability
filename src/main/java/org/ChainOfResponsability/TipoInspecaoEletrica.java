package org.ChainOfResponsability;

public class TipoInspecaoEletrica implements TipoInspecao {

    private static TipoInspecaoEletrica tipoInspecaoEletrica = new TipoInspecaoEletrica();

    private TipoInspecaoEletrica() {};

    public static TipoInspecaoEletrica getTipoInspecaoEletrica() {
        return tipoInspecaoEletrica;
    }
}
