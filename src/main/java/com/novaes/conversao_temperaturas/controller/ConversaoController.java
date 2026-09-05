package com.novaes.conversao_temperaturas.controller;

import com.novaes.conversao_temperaturas.dto.ConversaoRequest;
import com.novaes.conversao_temperaturas.dto.ConversaoResponse;
import com.novaes.conversao_temperaturas.service.ConversaoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/temperaturas")
public class ConversaoController {

    private final ConversaoService conversaoService;

    public ConversaoController(ConversaoService conversaoService) {
        this.conversaoService = conversaoService;
    }

    @PostMapping("/converter")
    public ConversaoResponse converterTemperatura(@RequestBody ConversaoRequest request) {

        double valorConvertido = conversaoService.converterTemperatura(
                request.getTemperatura(),
                request.getUnidadeOrigem(),
                request.getUnidadeDestino()
        );

        return new ConversaoResponse(
                valorConvertido,
                request.getUnidadeDestino().name()
        );
    }
}
