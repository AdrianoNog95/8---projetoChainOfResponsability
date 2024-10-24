package org.ChainOfResponsability;

import java.util.ArrayList;

public abstract class Inspecao {

    protected ArrayList listaInspecoes = new ArrayList();
    private Inspecao inspecaoSuperior;

    public Inspecao getInspecaoSuperior() {
        return inspecaoSuperior;
    }

    public void setInspecaoSuperior(Inspecao inspecaoSuperior) {
        this.inspecaoSuperior = inspecaoSuperior;
    }

    public abstract String getDescricaoInspecao();

    public String inspecionar(Obra obra) {
        if (listaInspecoes.contains(obra.getTipoInspecao())) {
            return getDescricaoInspecao();
        } else {
            if (inspecaoSuperior != null) {
                return inspecaoSuperior.inspecionar(obra);
            } else {
                return "Sem inspeção";
            }
        }
    }
}
