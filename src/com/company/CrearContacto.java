package com.company;

public class CrearContacto {

    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("CREAR CONTACTO");     // titulo = "CREAR NOTA"

        Contacto contacto = new Contacto();
        boolean crear = false;

        System.out.println("Nombre y apellidos: ");
        contacto.titulo = Main.scanner.nextLine();

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
