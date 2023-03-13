package com.example.trabajofinal_glovo.entities;

import com.google.gson.annotations.SerializedName;

public class Productos {

    @SerializedName("idProducto")
    private int idProducto;

    @SerializedName("nombre")
    private String nombre;

    @SerializedName("precio")
    private double precio;

    @Override
    public String toString() {
        return "Productos{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
