package org.ChainOfResponsability;

public class TipoInspecaoAmbiental implements TipoInspecao {

    private static TipoInspecaoAmbiental tipoInspecaoAmbiental = new TipoInspecaoAmbiental();

    private TipoInspecaoAmbiental() {};

    public static TipoInspecaoAmbiental getTipoInspecaoAmbiental() {
        return tipoInspecaoAmbiental;
    }
}
