package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;

public class Deserialazer {
    private String file_name;
    private TypeReference typeReference;

    public Deserialazer(String file_name, TypeReference typeReference) {
        this.file_name = file_name;
        this.typeReference = typeReference;
    }

    public Object read() throws IOException {
        return new ObjectMapper().readValue(new FileInputStream(file_name),
                typeReference);
    }
}
