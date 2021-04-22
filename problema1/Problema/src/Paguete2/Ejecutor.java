/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paguete2;
import Paquete1.Terreno;
/**
 *
 * @author Smart
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Terreno ob1 = new Terreno();     
        ob1.establecerAncho(15.5);
        ob1.establecerLargo(20);
        ob1.establecerValorMetroCuadrado(15);
        ob1.calcularArea();
        ob1.calcularCosto();
        
      Terreno ob2 = new Terreno();     
        ob2.establecerAncho(24.3);
        ob2.establecerLargo(30);
        ob2.establecerValorMetroCuadrado(10);
        ob2.calcularArea();
        ob2.calcularCosto();
        
        System.out.printf("El primer terreno tiene un valor de: $ %.2f\n"
                + "Con una dimension de:\n"
                + "Area: %.2f\nLargo: %.2f\nAncho: %.2f\n\n",
                ob1.obtenerCosto(),
                ob1.obtenerArea(),
                ob1.obtenerLargo(),
                ob1.obtenerAncho());
        
         System.out.printf("El segundo terreno tiene un valor de: $ %.2f\n"
                + "Con una dimension de:\n"
                + "Area: %.2f\nLargo: %.2f\nAncho: %.2f\n\n",
                ob2.obtenerCosto(),
                ob2.obtenerArea(),
                ob2.obtenerLargo(),
                ob2.obtenerAncho());

        
        
    }
    
}
