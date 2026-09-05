package com.novaes.conversao_temperaturas.service;

public class ConversaoService {

    public static double converterTemperatura(double valor, String unidadeOrigem, String unidadeDestino) {
        double valorConvertido = 0.0;

        if (unidadeOrigem.equalsIgnoreCase("Celsius")) {
            if (unidadeDestino.equalsIgnoreCase("Fahrenheit")) {
                valorConvertido = (valor * 9 / 5) + 32;
            } else if (unidadeDestino.equalsIgnoreCase("Kelvin")) {
                valorConvertido = valor + 273.15;
            }
        } else if (unidadeOrigem.equalsIgnoreCase("Fahrenheit")) {
            if (unidadeDestino.equalsIgnoreCase("Celsius")) {
                valorConvertido = (valor - 32) * 5 / 9;
            } else if (unidadeDestino.equalsIgnoreCase("Kelvin")) {
                valorConvertido = (valor - 32) * 5 / 9 + 273.15;
            }
        } else if (unidadeOrigem.equalsIgnoreCase("Kelvin")) {
            if (unidadeDestino.equalsIgnoreCase("Celsius")) {
                valorConvertido = valor - 273.15;
            } else if (unidadeDestino.equalsIgnoreCase("Fahrenheit")) {
                valorConvertido = (valor - 273.15) * 9 / 5 + 32;
            }
        }

        return valorConvertido;
    }
    
}
