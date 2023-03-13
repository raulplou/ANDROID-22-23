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
