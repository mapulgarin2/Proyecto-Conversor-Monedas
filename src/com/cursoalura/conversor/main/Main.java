package com.cursoalura.conversor.main;

import com.cursoalura.conversor.model.Moneda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConversorMoneda convertir = new ConversorMoneda();
        Scanner scanner = new Scanner(System.in);
        Moneda moneda = convertir.ConversorMoneda("USD");


        while (true) {
            System.out.println("***************************************");
            System.out.println("Sea bienvenido al conversor de monedas =]\n" +
                    "1) Dólar =>> Peso argentino\n" +
                    "2) Peso Argentino =>> Dólar\n" +
                    "3) Dólar =>> Real brasileño\n" +
                    "4) Real brasileño =>> Dólar\n" +
                    "5) Dólar =>> Peso colombiano\n" +
                    "6) Peso colombiano =>> Dólar\n" +
                    "7) Salir\n" +
                    "Elija una opción válida");
            System.out.println("***************************************");
            var opcionUsuario = scanner.nextLine();
            if (opcionUsuario.equals("1") ) {
                Double tasa = moneda.obtenerTasa("ARS");
                System.out.println("La tasa de cambio de argentina es "+tasa);
                System.out.println(moneda);
            }else if (opcionUsuario.equals("2")) {
                Double tasa = moneda.obtenerTasa("USD");//
                System.out.println("La tasa de cambio de USA es "+tasa);
                System.out.println(moneda);
            }else if (opcionUsuario.equals("3")) {
                Double tasa = moneda.obtenerTasa("BRL");//
                System.out.println("La tasa de cambio de Brazil es "+tasa);
//                Moneda moneda = convertir.ConversorMoneda("USD");
                System.out.println(moneda);
            }else if (opcionUsuario.equals("4")) {
                Double tasa = moneda.obtenerTasa("USD");//
                System.out.println("La tasa de cambio de USA es "+tasa);
//                Moneda moneda = convertir.ConversorMoneda("BRL");
                System.out.println(moneda);
            }else if (opcionUsuario.equals("5")) {


                Double tasa = moneda.obtenerTasa("COP");
                System.out.println("La tasa de cambio de Colombia es "+tasa);
//                Moneda moneda = convertir.ConversorMoneda("USD");
                //System.out.println(moneda);
            }else if (opcionUsuario.equals("6")) {
                System.out.println("ingese la cantidad de pesos colombianos que quiere convertir  a dolares:");
                Double pesosColombianos = scanner.nextDouble();
                scanner.nextLine();
                Double tasa = moneda.obtenerTasa("COP");//
                Double conversionPesosColombianos = pesosColombianos / tasa;
                System.out.printf("EL valor de %.2f [COP] corresponde al valor final  de =>>> %.2f [USD])",pesosColombianos,conversionPesosColombianos);
                System.out.println("La tasa de cambio de USA es "+tasa);//
                System.out.println(moneda);
            } else if (opcionUsuario.equals("salir")) {
                break;
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }
}
