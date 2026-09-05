package com.novaes.conversao_temperaturas.dto;

import com.novaes.conversao_temperaturas.enums.UnidadeTemperatura;

public class ConversaoRequest {

    private double temperatura;
    private UnidadeTemperatura unidadeOrigem;
    private UnidadeTemperatura unidadeDestino;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public UnidadeTemperatura getUnidadeOrigem() {
        return unidadeOrigem;
    }

    public void setUnidadeOrigem(UnidadeTemperatura unidadeOrigem) {
        this.unidadeOrigem = unidadeOrigem;
    }

    public UnidadeTemperatura getUnidadeDestino() {
        return unidadeDestino;
    }

    public void setUnidadeDestino(UnidadeTemperatura unidadeDestino) {
        this.unidadeDestino = unidadeDestino;
    }
}
