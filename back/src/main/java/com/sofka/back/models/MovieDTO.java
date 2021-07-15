package com.sofka.back.models;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class MovieDTO {

    @NotBlank
    private String id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String Duracion;
    @NotBlank
    private String link;
    @NotBlank
    private String idTipo;

    public MovieDTO() {
    }

    public MovieDTO(String id, String nombre, String duracion, String link, String idTipo) {
        this.id = id;
        this.nombre = nombre;
        Duracion = duracion;
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
        return Duracion;
    }

    public void setDuracion(String duracion) {
        Duracion = duracion;
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
        return Objects.equals(id, movieDTO.id) && Objects.equals(nombre, movieDTO.nombre) && Objects.equals(Duracion, movieDTO.Duracion) && Objects.equals(link, movieDTO.link) && Objects.equals(idTipo, movieDTO.idTipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, Duracion, link, idTipo);
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Duracion='" + Duracion + '\'' +
                ", link='" + link + '\'' +
                ", idTipo='" + idTipo + '\'' +
                '}';
    }
}
