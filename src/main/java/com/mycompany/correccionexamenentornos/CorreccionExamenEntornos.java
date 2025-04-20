/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.correccionexamenentornos;

/**
 *
 * @author adriancastilla
 */
public class CorreccionExamenEntornos {

    
    
    
    public static double calculoDiferencia(double area1, double area2) {
        double dif = area1 - area2;
        return dif;
    }
    
    public static void printValues(double rectangulo, double circulo, double diferencia) {
        System.out.println("Rectangulo: " + rectangulo);
        System.out.println("Circulo: " + circulo);
        System.out.println("Diferencia: " + diferencia);
    }
    
    public static void main(String[] args) {
        
        ACC_Circulo circulo1 = new ACC_Circulo(3, 4, "Naranja");
        ACC_Rectangulo rectangulo1 = new ACC_Rectangulo(2, 7, 3, "Azul");
        
        double areaRectangulo = rectangulo1.calculoAreaRectangulo(rectangulo1);
        double areaCirculo = circulo1.calculoAreaCirculo(circulo1);
        double diferencia = calculoDiferencia(areaCirculo, areaCirculo);
        
        printValues(areaRectangulo, areaCirculo, diferencia);
        
    }
}
