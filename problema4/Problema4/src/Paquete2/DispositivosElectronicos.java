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
public class DispositivosElectronicos {
    private String sistemaoperativo;
    private double tamañodepantalla;
    private double costo;
    private String direcciónmac;
    private String informaciónIMEI;
    
    
    public void establecerSistemaoperativo(String i){
        sistemaoperativo = i;
    }
    
    public void establecerTamañodepantalla(double i){
        tamañodepantalla = i;
    }
    
    public void establecerCosto(int i){
        costo = i;
        
    }
     public void establecerDirecciónmac(String i){
        direcciónmac = i;
        
    }
    public void establecerInformaciónIMEI(String i){
        informaciónIMEI = i;
        
    }
    public String obtenerSistemaoperativo(){
        return sistemaoperativo;
        
    }
    
    public double obtenerTamañodepantalla(){
        return tamañodepantalla;
    }
    
    public double obtenerNumerCosto(){
        return costo;
        
    }
     public String obtenerDirecciónmac(){
        return direcciónmac;
        
    }
    public String obtenerInformaciónIMEI(){
        return informaciónIMEI;
        
    }
     
    
}
