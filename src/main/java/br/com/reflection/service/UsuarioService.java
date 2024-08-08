package br.com.reflection.service;

import br.com.reflection.repository.UsuarioRepository;
import br.com.reflection.dto.DadosDetalhadosUsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<DadosDetalhadosUsuarioDto> listar() {
        return repository.listarDadosDetalhadosUsuario();
    }
}
