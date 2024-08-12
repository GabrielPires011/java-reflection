package br.com.repository;

import br.com.dto.DadosDetalhadosUsuarioDto;
import br.com.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("select new br.com.dto.DadosDetalhadosUsuarioDto(u.nome, u.cpf) from Usuario u ")
    List<DadosDetalhadosUsuarioDto> listarDadosDetalhadosUsuario();
}
