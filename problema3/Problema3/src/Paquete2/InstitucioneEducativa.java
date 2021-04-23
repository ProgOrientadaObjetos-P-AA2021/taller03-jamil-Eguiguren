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
public class InstitucioneEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    
    
    public void establecerNombre(String nom){
        nombre = nom;
    }
    
    public void establecerTipoInstitucion(String ins){
        tipoInstitucion = ins;
    }
    
    public void establecerNumeroAlumnos(int alum){
        numeroAlumnos = alum;
        
    }
     public void establecerNumeroDocentes(int doce){
        numeroDocentes = doce;
        
    }
    public void establecerNumeroSedes(int sed){
        numeroSedes = sed;
        
    }
    public String obtenerNombre(){
        return nombre;
        
    }
    
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
        
    }
     public int obtenerNumeroDocentes(){
        return numeroDocentes;
        
    }
    public int obtenerNumeroSedes(){
        return numeroSedes;
        
    }
     
    
    
}
