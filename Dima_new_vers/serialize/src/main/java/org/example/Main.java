package org.example;


import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        new Serializer("./university.json", new Generator(10).randomGenerations()).write();



    }
}