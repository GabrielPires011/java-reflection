package br.com.reflection;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ObjectToJson {

    public String transformar(Object object) {
        var objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        Map<String, Object> mapper = new HashMap<>();
        var classATransformar = object.getClass();

        Arrays.stream(classATransformar.getDeclaredFields())
                .toList()
                .forEach(field -> {
                    field.setAccessible(true);
                    var key = field.getName();
                    try {
                        var value = field.get(object);
                        mapper.put(key, value);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Falha ao acessar o valor do campo", e);
                    }
                });
        try {
            return objectMapper.writeValueAsString(mapper);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Falha ao transformar objeto para json", e);
        }
    }
}
