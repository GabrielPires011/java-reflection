package br.com.reflection;

import br.com.model.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectToJsonTest {

    private Usuario usuario = new Usuario(1L, "Teste", 12345678912L);

    @Test
    void deveriaTransformarObjectParaJson() {
        var json = new ObjectToJson().transformar(usuario);

        assertInstanceOf(String.class, json);
    }

}