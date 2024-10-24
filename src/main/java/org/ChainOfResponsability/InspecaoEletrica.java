package org.ChainOfResponsability;

public class InspecaoEletrica extends Inspecao {

    public InspecaoEletrica(Inspecao superior) {
        listaInspecoes.add(TipoInspecaoEletrica.getTipoInspecaoEletrica());
        setInspecaoSuperior(superior);
    }

    public String getDescricaoInspecao() {
        return "Inspeção Elétrica";
    }
}
