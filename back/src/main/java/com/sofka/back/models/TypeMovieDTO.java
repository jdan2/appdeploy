package com.sofka.back.models;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class TypeMovieDTO {

    @NotBlank
    private String id;
    @NotBlank
    private String nombre;

    public TypeMovieDTO() {

    }

    public TypeMovieDTO(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TypeMovieDTO{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeMovieDTO that = (TypeMovieDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
}
