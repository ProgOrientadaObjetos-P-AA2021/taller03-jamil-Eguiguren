/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;
import Paquete2.InstitucioneEducativa;
/**
 *
 * @author Smart
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
       
        InstitucioneEducativa ob1 = new InstitucioneEducativa();     
        ob1.establecerNombre("Juan");
        ob1.establecerTipoInstitucion("Tecnico");
        ob1.establecerNumeroAlumnos(15);
        ob1.establecerNumeroDocentes(10);
        ob1.establecerNumeroSedes(5);
        
        InstitucioneEducativa ob2 = new InstitucioneEducativa();     
        ob2.establecerNombre("Pedro");
        ob2.establecerTipoInstitucion("APC");
        ob2.establecerNumeroAlumnos(20);
        ob2.establecerNumeroDocentes(5);
        ob2.establecerNumeroSedes(24);
        
        System.out.printf("En la primera institucion tenmos: \n"
                + "Nombre: %s\nTipo institucion: %s\n"
                + "Numero alumnos: %d\nNumero docentes: %d\n"
                + "Numero edes: %d\n\n",
                ob1.obtenerNombre(),
                ob1.obtenerTipoInstitucion(),
                ob1.obtenerNumeroAlumnos(),
                ob1.obtenerNumeroDocentes(),
                ob1.obtenerNumeroSedes());
        
        System.out.printf("En la segunda institucion tenmos: \n"
                + "Nombre: %s\nTipo institucion: %s\n"
                + "Numero alumnos: %d\nNumero docentes: %d\n"
                + "Numero edes: %d\n\n",
                ob2.obtenerNombre(),
                ob2.obtenerTipoInstitucion(),
                ob2.obtenerNumeroAlumnos(),
                ob2.obtenerNumeroDocentes(),
                ob2.obtenerNumeroSedes());
       
     }
   }
    

