package com.example.trabajofinal_glovo.entities;


import com.google.gson.annotations.SerializedName;

public class Restaurantes {

    /*"quote": "I live in a single room above a bowling alley...and below another bowling alley.",
            "character": "Frank Grimes",
            "image": "https://cdn.glitch.com/3c3ffadc-3406-4440-bb95-d40ec8fcde72%2FFrankGrimes.png?1497567511887",
            "characterDirection": "Left"*/

    @SerializedName("idRestaurante")
    private int idRestaurante;

    @SerializedName("nombreRestaurante")
    private String nombreRestaurante;

    @SerializedName("categoria")
    private String categoria;

    @SerializedName("descripcion")
    private String descripcion;

    @SerializedName("menu")
    private String menu;

    public Restaurantes(int idRestaurante, String nombreRestaurante, String categoria, String descripcion, String menu) {
        this.idRestaurante = idRestaurante;
        this.nombreRestaurante = nombreRestaurante;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.menu = menu;
    }

    public Restaurantes(String nombreRestaurante, String categoria) {
        this.nombreRestaurante = nombreRestaurante;
        this.categoria = categoria;
    }

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurantes{" +
                "idRestaurante=" + idRestaurante +
                ", nombreRestaurante='" + nombreRestaurante + '\'' +
                ", categoria='" + categoria + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", menu='" + menu + '\'' +
                '}';
    }
}
