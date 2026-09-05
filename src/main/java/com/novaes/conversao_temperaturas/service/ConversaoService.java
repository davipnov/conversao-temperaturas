package com.novaes.conversao_temperaturas.service;

import com.novaes.conversao_temperaturas.enums.UnidadeTemperatura;
import org.springframework.stereotype.Service;

@Service
public class ConversaoService {

    public double converterTemperatura(
            double valor,
            UnidadeTemperatura unidadeOrigem,
            UnidadeTemperatura unidadeDestino) {

        if (unidadeOrigem == unidadeDestino) {
            return valor;
        }

        if (unidadeOrigem == UnidadeTemperatura.CELSIUS) {

            if (unidadeDestino == UnidadeTemperatura.FAHRENHEIT) {
                return (valor * 9 / 5) + 32;
            }

            if (unidadeDestino == UnidadeTemperatura.KELVIN) {
                return valor + 273.15;
            }
        }

        if (unidadeOrigem == UnidadeTemperatura.FAHRENHEIT) {

            if (unidadeDestino == UnidadeTemperatura.CELSIUS) {
                return (valor - 32) * 5 / 9;
            }

            if (unidadeDestino == UnidadeTemperatura.KELVIN) {
                return (valor - 32) * 5 / 9 + 273.15;
            }
        }

        if (unidadeOrigem == UnidadeTemperatura.KELVIN) {

            if (unidadeDestino == UnidadeTemperatura.CELSIUS) {
                return valor - 273.15;
            }

            if (unidadeDestino == UnidadeTemperatura.FAHRENHEIT) {
                return (valor - 273.15) * 9 / 5 + 32;
            }
        }

        return valor;
    }
}