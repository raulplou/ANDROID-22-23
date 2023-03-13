package com.example.trabajofinal_glovo.entities;

import com.google.gson.annotations.SerializedName;

public class Compras {

    @SerializedName("idCompra")
    private int idCompra;

    @SerializedName("fecha")
    private String fecha;

    @SerializedName("precio")
    private double precio;

    @SerializedName("usuario")
    private int usuario;

    @SerializedName("restaurante")
    private int restaurante;

    @Override
    public String toString() {
        return "Compras{" +
                "idCompra=" + idCompra +
                ", fecha='" + fecha + '\'' +
                ", precio=" + precio +
                ", usuario=" + usuario +
                ", restaurante=" + restaurante +
                '}';
    }
}
