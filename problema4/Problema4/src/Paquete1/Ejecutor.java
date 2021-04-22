/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;
import Paquete2.DispositivosElectronicos;
/**
 *
 * @author Smart
 */
public class Ejecutor {

    public static void main(String[] args) {
        DispositivosElectronicos ob1 = new DispositivosElectronicos();     
        ob1.establecerSistemaoperativo("Juan");
        ob1.establecerTamañodepantalla(30.5);
        ob1.establecerCosto(20);
        ob1.establecerDirecciónmac("00:1e:c2:9e:28:6b");
        ob1.establecerInformaciónIMEI("juan@gmail.com");
        
        DispositivosElectronicos ob2 = new DispositivosElectronicos();     
        ob2.establecerSistemaoperativo("Pedro");
        ob2.establecerTamañodepantalla(10.3);
        ob2.establecerCosto(14);
        ob2.establecerDirecciónmac("00:1e:c2:9e:28:6b");
        ob2.establecerInformaciónIMEI("pedro123@gmail.com");
        
        System.out.printf("En el primer dispositivo electrónico tenmos: \n"
                + "Sistema Operativo: %s\nTamaño de pantalla: %.2f\n"
                + "Costo: $ %.2f\nDirección Mac: %s\n"
                + "IMEI: %s\n\n",
                ob1.obtenerSistemaoperativo(),
                ob1.obtenerTamañodepantalla(),
                ob1.obtenerNumerCosto(),
                ob1.obtenerDirecciónmac(),
                ob1.obtenerInformaciónIMEI());
        
        System.out.printf("En el segundo dispositivo electrónico tenmos: \n"
                + "Sistema Operativo: %s\nTamaño de pantalla: %.2f\n"
                + "Costo: $ %.2f\nDirección Mac: %s\n"
                + "IMEI: %s\n\n",
                ob2.obtenerSistemaoperativo(),
                ob2.obtenerTamañodepantalla(),
                ob2.obtenerNumerCosto(),
                ob2.obtenerDirecciónmac(),
                ob2.obtenerInformaciónIMEI());
       
     }    

    }
    

