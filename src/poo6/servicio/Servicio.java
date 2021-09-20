package poo6.servicio;

import java.util.Scanner;
import poo6.Cafetera;

public class Servicio {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public Cafetera Consultar() {
        System.out.println("Ingrese la cantidad actual de Café: ");
        int cant = teclado.nextInt();
        int max = cant;

        return new Cafetera(cant, max);
    }

    public void servirTaza(Cafetera val) {
        System.out.println("Ingrese el tamaño de la taza vacía");
        int taza = teclado.nextInt();

        if (val.getCapacidadMaxima() >= taza) {
            System.out.println("La taza se lleno");
        } else {
            System.out.println("No alcanza, se sirve lo que queda");
        }

        val.setCantidadActual(val.getCantidadActual() - taza);
        val.setCapacidadMaxima(val.getCantidadActual());
        System.out.println("La Cafetera tiene para servir " + val.getCantidadActual() + " cantidad de tazas");
    }

    public void vaciarCafetera(Cafetera val) {
        val.setCantidadActual(0);
        System.out.println("La cafetera se vacío");
    }

    public void agregarCafe(Cafetera val) {
        System.out.println("Ingrese la cantidad de cafe que quiere agregar: ");
        int agregar = teclado.nextInt();

        val.setCantidadActual(val.getCantidadActual() + agregar);
        val.setCapacidadMaxima(val.getCantidadActual());
        System.out.println("La cantidad actual es de: " + val.getCantidadActual());
    }

    public void Actividad(Cafetera valores) {
        boolean flag = false;

        do {
            System.out.print("--Programa Nespresso--\n\t1-Servir taza\n\t2-Vaciar Cafetera\n\t3-Agregar Café\n\t4-SALIR\n\tSelección: ");
            int x1 = teclado.nextInt();

            switch (x1) {
                case 1:
                    servirTaza(valores);
                    break;
                case 2:
                    vaciarCafetera(valores);
                    break;
                case 3:
                    agregarCafe(valores);
                    break;
                case 4:
                    System.out.println("Realmente quiere salir? (S/N)");
                    String salir = teclado.next();

                    salir = salir.toLowerCase();

                    if (salir.equals("s")) {
                        System.out.println("SALUDOS!");
                        flag = true;
                    } else {
                        break;
                    }
            }

        } while (!flag);
    }
}
