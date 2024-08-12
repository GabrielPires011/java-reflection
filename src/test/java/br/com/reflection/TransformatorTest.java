package br.com.reflection;

import br.com.dto.DadosDetalhadosUsuarioDto;
import br.com.model.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TransformatorTest {

    private Usuario usuario = new Usuario(1L, "Teste", 12345678912L);

    @Test
    void deveriaTransformarClasseModelParaRecordDto() {
        DadosDetalhadosUsuarioDto dadosDetalhados = new Transformator().transformarModelEmRecordDto(usuario,
                "DadosDetalhadosUsuario");

        assertNotNull(dadosDetalhados);
        assertEquals(dadosDetalhados.nome(), usuario.getNome());
        assertEquals(dadosDetalhados.cpf(), usuario.getCpf());
    }

    @Test
    void deveriaLancarException() {
        assertThrows(RuntimeException.class, () -> new Transformator().transformarModelEmRecordDto(usuario,
                null));
    }

    @Test
    void deveriaTransformarClasseModelParaRecordDtoComCampoNull() {
        var usuario = new Usuario(1L, "Teste", null);
        DadosDetalhadosUsuarioDto dadosDetalhados = new Transformator().transformarModelEmRecordDto(usuario,
                "DadosDetalhadosUsuario");

        assertNotNull(dadosDetalhados);
        assertEquals(dadosDetalhados.nome(), usuario.getNome());
        assertNull(dadosDetalhados.cpf());
    }
}