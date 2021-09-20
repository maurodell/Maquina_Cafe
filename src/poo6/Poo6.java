
package poo6;

import poo6.servicio.Servicio;

public class Poo6 {

    public static void main(String[] args) {
        Servicio servi = new Servicio();
        Cafetera cant = servi.Consultar();
        
        System.out.println(cant.toString());
        servi.Actividad(cant);
        
    }
    
}
