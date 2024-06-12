package com.example.serializarjson;

import java.util.List;

public class Familia {
    private String apellido;
    private List<Persona> miembros;

    public Familia() {}

    public Familia(String apellido, List<Persona> miembros) {
        this.apellido = apellido;
        this.miembros = miembros;
    }

    // Getters y Setters
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<Persona> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Familia{apellido='").append(apellido).append('\'');
        sb.append(", miembros=").append(miembros);
        sb.append('}');
        return sb.toString();
    }
}