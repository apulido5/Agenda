package com.company;

public class EditarContacto {
    void mostrar(Contacto contacto){
        Titulo titulo = new Titulo();
        titulo.mostrar("Editar contacto");


            System.out.println("Nuevo nombre del contacto: ");
            contacto.nombre = Main.scanner.nextLine();

            System.out.println("Nuevos apellidos: ");
            contacto.apellidos = Main.scanner.nextLine();

            System.out.println("Nuevo numero de telefono: ");
            contacto.numero = Main.scanner.nextLine();

            System.out.println("Nuevo correo electronico: ");
            contacto.correo = Main.scanner.nextLine();

            Mensaje mensaje = new Mensaje();
            mensaje.mostrarInfo("Contacto actualizado!");



            MenuAgenda menuAgenda = new MenuAgenda();
            String[] opciones = {"Editar otro contacto", "Volver al menu principal"};
            String opcion = menuAgenda.elegirOpcion(opciones);

            if ("1".equals(opcion)) {
                PantallaEditar pantallaEditar = new PantallaEditar();
                pantallaEditar.mostrar();
            }else if("2".equals(opcion)){
                PantallaMenu pantallaMenu = new PantallaMenu();
                pantallaMenu.mostrar();
            }
    }
}


