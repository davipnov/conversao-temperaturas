package com.novaes.conversao_temperaturas.dto;

public class ConversãoResponse {

    private double temperatura;
    private String unidade;

    public ConversãoResponse(double temperatura, String unidade) {
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
