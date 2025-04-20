/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correccionexamenentornos;

/**
 *
 * @author adriancastilla
 */
public class ACC_Circulo {
    
    // Atributos
    int id;
    double radio;
    String color;

    // Constructores
    public ACC_Circulo() {
    }

    public ACC_Circulo(int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }

    // Getters
    public int getId() {
        return id;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // To string
    @Override
    public String toString() {
        return "ACC_Circulo{" + "id=" + id + ", radio=" + radio + ", color=" + color + '}';
    }
    
    
}
