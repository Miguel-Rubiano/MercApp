package com.example.pacho.mercapp.Adaptadores.Entidades;

import java.io.Serializable;

public class Productos implements Serializable {

    private String nombre;
    private double precio;
    private String peso;
    private double existencia;

    public Productos() {
    }

    public Productos(String nombre, double precio, String peso, double existencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.existencia = existencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }


}

