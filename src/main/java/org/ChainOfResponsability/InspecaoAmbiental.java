package org.ChainOfResponsability;

public class InspecaoAmbiental extends Inspecao {

    public InspecaoAmbiental(Inspecao superior) {
        listaInspecoes.add(TipoInspecaoAmbiental.getTipoInspecaoAmbiental());
        setInspecaoSuperior(superior);
    }

    public String getDescricaoInspecao() {
        return "Inspeção Ambiental";
    }
}
