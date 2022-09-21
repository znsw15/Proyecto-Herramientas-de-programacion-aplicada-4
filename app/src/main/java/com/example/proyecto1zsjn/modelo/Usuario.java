package com.example.proyecto1zsjn.modelo;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String cedula;

    public Usuario() {


    }

    public Usuario(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }
}
