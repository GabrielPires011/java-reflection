package br.com.reflection;

import br.com.dto.DadosDetalhadosUsuarioDto;
import br.com.model.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformatorTest {

    @Test
    void deveTransformarClasseModelParaDto() {
        var usuario = new Usuario(1L, "Teste", 12345678912L);

        var transformator = new Transformator();

        DadosDetalhadosUsuarioDto dadosDetalhados = transformator.transformarModelEmRecord(usuario,
                "DadosDetalhadosUsuario");

        assertNotNull(dadosDetalhados);
        assertEquals(dadosDetalhados.nome(), usuario.getNome());
        assertEquals(dadosDetalhados.cpf(), usuario.getCpf());
    }
}