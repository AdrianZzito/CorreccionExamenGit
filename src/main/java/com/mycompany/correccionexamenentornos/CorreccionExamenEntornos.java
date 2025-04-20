/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.correccionexamenentornos;

/**
 *
 * @author adriancastilla
 */
public class CorreccionExamenEntornos {

    public static void main(String[] args) {
        
        ACC_Circulo circulo1 = new ACC_Circulo(3, 4, "Naranja");
        ACC_Rectangulo rectangulo1 = new ACC_Rectangulo(2, 7, 3, "Azul");
        
        double ladoA = rectangulo1.getLadoA();
        double ladoB = rectangulo1.getLadoB();
        double areaRectangulo = ladoA * ladoB;
        System.out.println("Area rectangulo: " + areaRectangulo);
        
        double radio1 = circulo1.getRadio();
        double areaCirculo = radio1 * 3.14;
        System.out.println("Area circulo: " + areaCirculo);
        
        double dif = areaRectangulo - areaCirculo;
        System.out.println("Diferencia: " + dif);
        
        System.out.println("Rectangulo: " + rectangulo1);
        System.out.println("Circulo: " + circulo1);
        
    }
}
