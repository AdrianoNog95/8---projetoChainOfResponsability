package org.ChainOfResponsability;

public class InspecaoEstrutural extends Inspecao {

    public InspecaoEstrutural(Inspecao superior) {
        listaInspecoes.add(TipoInspecaoEstrutural.getTipoInspecaoEstrutural());
        setInspecaoSuperior(superior);
    }

    public String getDescricaoInspecao() {
        return "Inspeção Estrutural";
    }
}
