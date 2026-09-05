package com.novaes.conversao_temperaturas.dto;

public class ConversaoResponse {

    private double temperatura;
    private String unidade;

    public ConversaoResponse(double temperatura, String unidade) {
        this.temperatura = temperatura;
        this.unidade = unidade;
    }

    public double getTemperatura() {
        return temperatura;
    }


    public String getUnidade() {
        return unidade;
    }
}
