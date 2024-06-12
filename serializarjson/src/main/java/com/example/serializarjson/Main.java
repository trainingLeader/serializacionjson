package com.example.serializarjson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    private static final String FILE_PATH = "familia.json";

    public static void main(String[] args) {
        // Crear algunos miembros de la familia
        List<Persona> miembros = Arrays.asList(
                new Persona(1, "Juan", 45),
                new Persona(2, "Ana", 42),
                new Persona(3, "Carlos", 18),
                new Persona(4, "Lucia", 16)
        );

        // Crear una instancia de Familia
        Familia familia = new Familia("Gomez", miembros);

        // Serializar la familia a JSON y guardar en un archivo
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(familia, writer);
            System.out.println("Familia serializada y guardada en familia.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserializar la familia desde el archivo JSON
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Familia familiaDeserializada = gson.fromJson(reader, Familia.class);
            System.out.println("Familia deserializada desde familia.json:");
            System.out.println(familiaDeserializada);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}