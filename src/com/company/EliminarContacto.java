package com.company;
import java.util.Scanner;

public class EliminarContacto {
    void mostrar(Contacto contacto) {
        System.out.println();

        Scanner VerifyEliminar = new Scanner(System.in);
        System.out.print("\033[31m" + "¿Esta seguro que quiere eliminar el contacto?(Yes/No): " + "\033[0m");
        String next = VerifyEliminar.next();

        if (next.equals("Yes") || next.equals("yes")){
            contacto.nombre = null;
            contacto.apellidos = null;
            contacto.numero = null;
            contacto.correo = null;

            Mensaje mensaje = new Mensaje();
            mensaje.mostrarInfo("Contacto Eliminado!");
        } else if (next.equals("No") || next.equals("no")){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarInfo("Operacion cancelada...");
        }


        MenuAgenda menuAgenda = new MenuAgenda();
        String[] opciones = {"ELiminar otro contacto", "Volver al menu principal"};
        String opcion = menuAgenda.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaEliminar pantallaEliminar = new PantallaEliminar();
            pantallaEliminar.mostrar();
        } else if("2".equals(opcion)){
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();
        }
    }
}