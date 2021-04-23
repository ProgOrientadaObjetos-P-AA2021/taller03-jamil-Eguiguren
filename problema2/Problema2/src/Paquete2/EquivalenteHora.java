/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

/**
 *
 * @author Smart
 */
public class EquivalenteHora {
    
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    
    public void obternerHoras(double i){
        horas = i;
    }
    
    public void calcularMinutos(){
        minutos = horas * 60;
    }
    
    public void calcularSegundos(){
        segundos = horas * 3600;
        
    }
     public void calculardia(){
        dias = horas / 24;
        
    }

    public double obtenerHoras(){
        return horas;
        
    }
    
    public double obtenerMinutos(){
        return minutos;
    }
    
    public double obtenerSegundos(){
        return segundos;
        
    }
     public double obtenerDias(){
        return dias;
        
    }

    
}
