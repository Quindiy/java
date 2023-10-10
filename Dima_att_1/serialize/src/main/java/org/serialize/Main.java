package org.serialize;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.generator.Generator;

import java.io.File;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        new Serializer("university.json", new Generator(10).randomGenerations()).write();


    }
}