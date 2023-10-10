package org.serialize;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.generator.Generator;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Serializer {
    private String file_name;
    private Object values;

    public Serializer(String file_name, Object values) {
        this.file_name = file_name;
        this.values = values;
    }

    public void write() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File(file_name), values);
    }
}
