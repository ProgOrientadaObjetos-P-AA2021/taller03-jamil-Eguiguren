/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;
import Paquete2.EquivalenteHora;
/**
 *
 * @author Smart
 */
public class Ejecutor {

    public static void main(String[] args) {
        // TODO code application logic here
        EquivalenteHora ob1 = new EquivalenteHora();     
        ob1.obternerHoras(36);
        ob1.calcularMinutos();
        ob1.calcularSegundos();
        ob1.calculardia();
        
       EquivalenteHora ob2 = new EquivalenteHora();     
        ob2.obternerHoras(48);
        ob2.calcularMinutos();
        ob2.calcularSegundos();
        ob2.calculardia();
        
        
        System.out.printf("Con la primera hora :%.2f\nTenemos que: \n"
                + "Minutos: %.2f\nSegundos: %.2f\nDias: %.2f\n\n",
                ob1.obtenerHoras(),
                ob1.obtenerMinutos(),
                ob1.obtenerSegundos(),
                ob1.obtenerDias());
        
       
        System.out.printf("Con la segunda hora :%.2f\nTenemos que: \n"
                + "Minutos: %.2f\nSegundos: %.2f\nDias: %.2f\n\n",
                ob2.obtenerHoras(),
                ob2.obtenerMinutos(),
                ob2.obtenerSegundos(),
                ob2.obtenerDias());  
     }
    }
    

