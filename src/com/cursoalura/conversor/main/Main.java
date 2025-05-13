package com.cursoalura.conversor.main;
import com.cursoalura.conversor.api.ApiCliente;
import com.cursoalura.conversor.model.Moneda;
import com.cursoalura.conversor.view.MenuConversor;
import java.util.Scanner;
//Clase principal que inicia la aplicacion.
public class Main {
    //Metodo principal que ejecuta la aplicacion
    public static void main(String[] args) {
        //Lee la entrada por consola del usuario
        Scanner scanner = new Scanner(System.in);
        //Inicializa la Api
        ApiCliente apiCliente = new ApiCliente();
        //Obtiene los datos de la Api
        Moneda moneda = apiCliente.LlamadaApiCliente("USD");
        //Inyecta las dependencias
        MenuConversor menu = new MenuConversor(scanner,moneda);
        //LLama al menu y ejecuta la logica
        menu.mostrarMenu();
        //Mensaje de finailzacion del sistema
        System.out.println("Finalización de la ejecución del programa");

    }
}
