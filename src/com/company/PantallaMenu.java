package com.company;

public class PantallaMenu {
    boolean mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("AGENDA");

        MenuAgenda menuAgenda = new MenuAgenda();
        String[] opciones = {"Crear contacto", "Lista de contactos", "Editar contactos", "Eliminar contacto", "Salir"};//jjgfk
        String opcion = menuAgenda.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            CrearContacto crearContacto = new CrearContacto();
            crearContacto.mostrar();
        } else if("2".equals(opcion)){
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrar();
        } else if("3".equals(opcion)){
            PantallaEditar pantallaEditar = new PantallaEditar();
            pantallaEditar.mostrar();
        }else if("4".equals(opcion)){
            PantallaEliminar pantallaEliminar = new PantallaEliminar();
            pantallaEliminar.mostrar();
        }else if("5".equals(opcion)){
            return false;
        }
        return true;
    }
}

