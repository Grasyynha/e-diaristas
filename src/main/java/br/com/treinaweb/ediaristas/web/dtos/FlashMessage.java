package br.com.treinaweb.ediaristas.web.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@IoArgsConstructor
@AllArgsConstructor

public class FlashMessage {

    private String classeCss;

    private String mensagem;
    
}
