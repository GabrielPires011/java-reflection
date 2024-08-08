package br.com.reflection.controller;

import br.com.reflection.dto.DadosDetalhadosUsuarioDto;
import br.com.reflection.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @GetMapping("lista")
    public List<DadosDetalhadosUsuarioDto> lista() {
        return service.listar();
    }
}