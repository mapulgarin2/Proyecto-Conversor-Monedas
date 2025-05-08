package com.cursoalura.conversor.main;

import com.cursoalura.conversor.model.Moneda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApiCliente apiCliente = new ApiCliente();
        Scanner scanner = new Scanner(System.in);
        Moneda moneda = apiCliente.LlamadaApiCliente("USD");


        while (true) {
            System.out.println("""
                    *********************************************************        
                    Sea bienvenido al conversor de monedas =]

                    "1) Dólar =>> Peso argentino
                    "2) Peso Argentino =>> Dólar
                    "3) Dólar =>> Real brasileño
                    "4) Real brasileño =>> Dólar                
                    "5) Dólar =>> Peso colombiano
                    "6) Peso colombiano =>> Dólar
                    "7) Salir
                    "Elija una opción válida");
                    *********************************************************                       
                    """);
            var opcionUsuario = scanner.nextLine();
            if (opcionUsuario.equals("1") ) {
                System.out.println("Ingrese la cantidad de dolares que quiere apiCliente a pesos argentinos:");
                Double dolares = scanner.nextDouble();
                scanner.nextLine();
                Double tasa = moneda.obtenerTasa("ARS");
                Double conversorDolarPesosArgentinos = dolares * tasa;
                System.out.printf("EL valor de %.2f [USD] corresponde al valor final  de =>>> %.2f [ARS])",dolares,conversorDolarPesosArgentinos);
                System.out.println("La tasa de cambio de peso argentino es "+tasa);
                System.out.println(moneda);
            }else if (opcionUsuario.equals("2")) {
                System.out.println("Ingrese la cantidad de pesos argentinos que quiere apiCliente a dolares:");
                Double pesosArgentinos = scanner.nextDouble();
                scanner.nextLine();
                Double tasa = moneda.obtenerTasa("ARS");//
                Double conversionPesosArgentinoDolar = pesosArgentinos / tasa;
                System.out.printf("EL valor de %.2f [ARS] corresponde al valor final  de =>>> %.2f [USD])",pesosArgentinos,conversionPesosArgentinoDolar);
                System.out.println("La tasa de cambio de peso argentino es "+tasa);
                System.out.println(moneda);
            }else if (opcionUsuario.equals("3")) {
                System.out.println("Ingrese la cantidad de dolares que quiere apiCliente a reales brasileños:");
                Double dolares = scanner.nextDouble();
                scanner.nextLine();
                Double tasa = moneda.obtenerTasa("BRL");//
                Double conversorDolarRealesBrasilenos = dolares * tasa;
                System.out.printf("EL valor de %.2f [USD] corresponde al valor final  de =>>> %.2f [BRL])",dolares,conversorDolarRealesBrasilenos);
                System.out.println("La tasa de cambio de Brazil es " + tasa);
                System.out.println(moneda);
            }else if (opcionUsuario.equals("4")) {
                System.out.println("Ingrese la cantidad de Reales brasileños que quiere apiCliente a Dolares:");
                Double realesBrasilenos = scanner.nextDouble();
                scanner.nextLine();
                Double tasa = moneda.obtenerTasa("BRL");
                Double conversioRealBrasileno = realesBrasilenos / tasa;
                System.out.println("La tasa de cambio de real brasileño es "+tasa);
                System.out.printf("EL valor de %.2f [BRL] corresponde al valor final  de =>>> %.2f [USD])",realesBrasilenos,conversioRealBrasileno);
                System.out.println(moneda);
            }else if (opcionUsuario.equals("5")) {
                System.out.println("Ingrese la cantidad de dolares que quiere apiCliente a pesos colombianos:");
                Double dolares = scanner.nextDouble();
                scanner.nextLine();
                Double tasa = moneda.obtenerTasa("COP");
                Double conversionDolares = dolares * tasa;
                System.out.println("La tasa de cambio de pesos colombianos es "+tasa);
                System.out.printf("EL valor de %.2f [USD] corresponde al valor final  de =>>> %.2f [COP])",dolares,conversionDolares);
                //System.out.println(moneda);
            }else if (opcionUsuario.equals("6")) {
                System.out.println("Ingrese la cantidad de pesos colombianos que quiere apiCliente a dolares:");
                Double pesosColombianos = scanner.nextDouble();
                scanner.nextLine();
                Double tasa = moneda.obtenerTasa("COP");//
                Double conversionPesosColombianos = pesosColombianos / tasa;
                System.out.printf("EL valor de %.2f [COP] corresponde al valor final  de =>>> %.2f [USD])",pesosColombianos,conversionPesosColombianos);
                System.out.println("La tasa de cambio de pesos colombianos es "+tasa);//
                System.out.println(moneda);
            } else if (opcionUsuario.equals("7") ||  opcionUsuario.equals("salir")) {
                break;
            } else {
                System.out.println("Opción no valida");
            }
        }
        System.out.println("Finalización de la ejecución del programa");
    }
}
