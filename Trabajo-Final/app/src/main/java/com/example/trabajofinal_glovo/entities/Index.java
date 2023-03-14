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

    public ArrayList<Restaurantes> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(ArrayList<Restaurantes> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public ArrayList<Compras> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compras> compras) {
        this.compras = compras;
    }

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
