/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author Smart
 */
public class Terreno {
    
    private double costo;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    
    public void calcularCosto(){
        costo = area *valorMetroCuadrado;
    }
    
    public void establecerAncho(double i){
        ancho = i;
    }
    
    public void establecerLargo(double i){
        largo = i;
        
    }
     public void calcularArea(){
        area = ancho * largo;
        
    }
    public void establecerValorMetroCuadrado (double i){
        valorMetroCuadrado = i;
        
    }
    public double obtenerCosto(){
        return costo;
        
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
        
    }
     public double obtenerArea(){
        return area;
        
    }
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
        
    }
     
    
}
