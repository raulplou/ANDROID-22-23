package com.example.trabajofinal_glovo.entities;

import com.google.gson.annotations.SerializedName;

public class Usuarios {

    @SerializedName("idUsuario")
    private int idUsuario;

    @SerializedName("nombre")
    private String nombre;

    @SerializedName("password")
    private String password;

    @SerializedName("correo")
    private String correo;

    @Override
    public String toString() {
        return "Usuarios{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
