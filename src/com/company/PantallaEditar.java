package com.company;

public class PantallaEditar {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("Editar Contactos");

        System.out.println("Escriba el nombre del contacto que quiere editar: ");
        String search = Main.scanner.nextLine();
        boolean found = false;
        Contacto foundcontacto = null;

        for(Contacto contacto: Main.agenda.contactos){
            if (contacto.nombre.equals(search)) {
                found = true;
                foundcontacto = contacto;
            }
        }
        if (!found){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarError("Contacto no existente");

//            mensaje.mostrarOpcion("Que desea hacer a continuacion");

            MenuAgenda menuAgenda = new MenuAgenda();
            String[] opciones = {"Editar otro contacto", "Volver al menu principal"};
            String opcion = menuAgenda.elegirOpcion(opciones);


             if ("1".equals(opcion)) {
                PantallaEditar pantallaEditar = new PantallaEditar();
                pantallaEditar.mostrar();
            } else if("2".equals(opcion)){
                PantallaMenu pantallaMenu = new PantallaMenu();
                pantallaMenu.mostrar();
            }
        }
        else {
            EditarContacto editarContacto = new EditarContacto();
            editarContacto.mostrar(foundcontacto);
        }
    }
}
