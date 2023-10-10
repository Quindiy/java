package org.deserialize;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.University;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

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
