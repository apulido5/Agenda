package com.company;

public class CrearContacto {

    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("CREAR CONTACTO");

        Contacto contacto = new Contacto();
        boolean crear = false;

        System.out.println("Nombre: ");
        contacto.nombre = Main.scanner.nextLine();

        System.out.println("Apellidos: ");
        contacto.apellidos = Main.scanner.nextLine();

        System.out.println("Número: ");
        contacto.numero = Main.scanner.nextLine();

        System.out.println("Correo: ");
        contacto.correo = Main.scanner.nextLine();

        crear = true;
        if (crear==true){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarInfo("¡Contacto guardado!");
        }

        Main.agenda.contactos.add(contacto);
    }
}
