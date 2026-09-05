package com.novaes.conversao_temperaturas.controller;

import com.novaes.conversao_temperaturas.dto.ConversaoRequest;
import com.novaes.conversao_temperaturas.dto.ConversaoResponse;
import com.novaes.conversao_temperaturas.service.ConversaoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversao")
public class ConversaoController {

    private final ConversaoService conversãoService;

    public ConversaoController(ConversaoService conversaoService) {
        this.conversãoService = conversaoService;
    }

    @PostMapping("/temperatura")
    public ConversaoResponse converterTemperatura(@RequestBody ConversaoRequest request) {
        double valorConvertido = ConversaoService.converterTemperatura(request.getTemperatura(), request.getUnidadeOrigem().name(), request.getUnidadeDestino().name());
        return new ConversaoResponse(valorConvertido, request.getUnidadeDestino().name());
    }

    @PostMapping("/temperatura/convert")
    public ConversaoResponse convertTemperatura(@RequestBody ConversaoRequest request) {
        double valorConvertido = ConversaoService.converterTemperatura(request.getTemperatura(), request.getUnidadeOrigem().name(), request.getUnidadeDestino().name());
        return new ConversaoResponse(valorConvertido, request.getUnidadeDestino().name());
    }
    
}
