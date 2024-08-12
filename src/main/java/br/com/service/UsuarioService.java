package br.com.service;

import br.com.dto.DadosDetalhadosUsuarioDto;
import br.com.repository.UsuarioRepository;
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
