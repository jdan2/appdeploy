package com.sofka.back.models;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class MovieDTO {

    @NotBlank
    private String id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String duracion;
    @NotBlank
    private String link;
    @NotBlank
    private String idTipo;

    public MovieDTO() {
    }

    public MovieDTO(String id, String nombre, String duracion, String link, String idTipo) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.link = link;
        this.idTipo = idTipo;
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieDTO movieDTO = (MovieDTO) o;
        return Objects.equals(id, movieDTO.id) && Objects.equals(nombre, movieDTO.nombre) && Objects.equals(duracion, movieDTO.duracion) && Objects.equals(link, movieDTO.link) && Objects.equals(idTipo, movieDTO.idTipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, duracion, link, idTipo);
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Duracion='" + duracion + '\'' +
                ", link='" + link + '\'' +
                ", idTipo='" + idTipo + '\'' +
                '}';
    }
}
