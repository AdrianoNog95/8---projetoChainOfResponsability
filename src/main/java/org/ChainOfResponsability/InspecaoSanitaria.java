package org.ChainOfResponsability;

public class InspecaoSanitaria extends Inspecao {

    public InspecaoSanitaria(Inspecao superior) {
        listaInspecoes.add(TipoInspecaoSanitaria.getTipoInspecaoSanitaria());
        setInspecaoSuperior(superior);
    }

    public String getDescricaoInspecao() {
        return "Inspeção Sanitária";
    }
}
