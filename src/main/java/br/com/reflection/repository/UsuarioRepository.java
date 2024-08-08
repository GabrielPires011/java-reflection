package br.com.reflection.repository;

import br.com.reflection.dto.DadosDetalhadosUsuarioDto;
import br.com.reflection.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("select new br.com.reflection.dto.DadosDetalhadosUsuarioDto(u.nome, u.cpf) from Usuario u ")
    List<DadosDetalhadosUsuarioDto> listarDadosDetalhadosUsuario();
}
