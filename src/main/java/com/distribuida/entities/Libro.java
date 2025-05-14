package com.distribuida.entities;

import java.util.Date;

public class Libro {

    private int idLibro;

    private String titulo;
    private String editorial;
    private String num_paguinas;
    private String edicion;
    private String idioma;
    private Date fecha_publicacion;
    private String descripcion;
    private String tipo_pasta;
    private String isbn;
    private int num_ejemplares;
    private String portada;
    private String presentacion;
    private Double precio;

    public Libro() {
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNum_paguinas() {
        return num_paguinas;
    }

    public void setNum_paguinas(String num_paguinas) {
        this.num_paguinas = num_paguinas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(Date fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_pasta() {
        return tipo_pasta;
    }

    public void setTipo_pasta(String tipo_pasta) {
        this.tipo_pasta = tipo_pasta;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNum_ejemplares() {
        return num_ejemplares;
    }

    public void setNum_ejemplares(int num_ejemplares) {
        this.num_ejemplares = num_ejemplares;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "idLibro=" + idLibro +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", num_paguinas='" + num_paguinas + '\'' +
                ", edicion='" + edicion + '\'' +
                ", idioma='" + idioma + '\'' +
                ", fecha_publicacion=" + fecha_publicacion +
                ", descripcion='" + descripcion + '\'' +
                ", tipo_pasta='" + tipo_pasta + '\'' +
                ", isbn='" + isbn + '\'' +
                ", num_ejemplares=" + num_ejemplares +
                ", portada='" + portada + '\'' +
                ", presentacion='" + presentacion + '\'' +
                ", precio=" + precio +
                '}';
    }
}

