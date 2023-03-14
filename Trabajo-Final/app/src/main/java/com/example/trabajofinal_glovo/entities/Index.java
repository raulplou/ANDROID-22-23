package com.example.trabajofinal_glovo.entities;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Index {

    @SerializedName("restaurantes")
    private ArrayList<Restaurantes> restaurantes;

    @SerializedName("usuarios")
    private ArrayList<Usuarios> usuarios;

    @SerializedName("productos")
    private ArrayList<Productos> productos;

    @SerializedName("compras")
    private ArrayList<Compras> compras;

    @Override
    public String toString() {
        return "Index{" +
                "restaurantes=" + restaurantes +
                ", usuarios=" + usuarios +
                ", productos=" + productos +
                ", compras=" + compras +
                '}';
    }
}
