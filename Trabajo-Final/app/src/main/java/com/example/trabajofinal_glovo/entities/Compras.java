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

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(int restaurante) {
        this.restaurante = restaurante;
    }

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
