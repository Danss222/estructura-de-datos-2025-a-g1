package main;

import model.Cliente;
import model.Empleado;

public class main {
    public static void main (String[] args) {
        Cliente cliente1 = new Cliente("juan perez", 30, "calle falsa 123", 101, "compra de laptop, celular \n");
        Empleado empleado1 = new Empleado("Ana Gomez", 25, "avenida siempre viva 456", 202, "desarrollador", 3000.0);
        System.out.println("Informacion cliente: \n");

        cliente1.mostrarInformacion();

        System.out.println("\nInformacion del empleado:\n");
        empleado1.mostrarInformacion();


    }

    }
