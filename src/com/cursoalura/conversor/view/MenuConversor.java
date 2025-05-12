package com.cursoalura.conversor.view;

import com.cursoalura.conversor.model.Moneda;

import java.util.Scanner;

public class MenuConversor {
    private final Scanner scanner;
    private final Moneda moneda;

    public MenuConversor(Scanner scanner, Moneda moneda) {
        this.scanner = scanner;
        this.moneda = moneda;
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("""
                    *********************************************************        
                    Sea bienvenido al conversor de monedas =]

                    1) Dólar =>> Peso argentino
                    2) Peso Argentino =>> Dólar
                    3) Dólar =>> Real brasileño
                    4) Real brasileño =>> Dólar                
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano =>> Dólar
                    7) Salir
                    Elija una opción válida
                    *********************************************************                       
                    """);
            var opcionUsuario = scanner.next();
            if (opcionUsuario.equals("1") ) {
                System.out.println("Ingrese la cantidad de dolares que quiere convertir a pesos argentinos:");
                Double dolares = scanner.nextDouble();
                scanner.nextLine();
                Double tasa = moneda.obtenerTasa("ARS");
                Double conversorDolarPesosArgentinos = dolares * tasa;
                System.out.printf("EL valor de %.2f [USD] corresponde al valor final  de =>>> %.2f [ARS])",dolares,conversorDolarPesosArgentinos);
            }else if (opcionUsuario.equals("2")) {
                System.out.println("Ingrese la cantidad de pesos argentinos que quiere convertir a dolares:");
                Double pesosArgentinos = scanner.nextDouble();
                scanner.nextLine();
                Double tasa = moneda.obtenerTasa("ARS");//
                Double conversionPesosArgentinoDolar = pesosArgentinos / tasa;
                System.out.printf("EL valor de %.2f [ARS] corresponde al valor final  de =>>> %.2f [USD])",pesosArgentinos,conversionPesosArgentinoDolar);
            }else if (opcionUsuario.equals("3")) {
                System.out.println("Ingrese la cantidad de dolares que quiere convertir a reales brasileños:");
                Double dolares = scanner.nextDouble();
                scanner.nextLine();
                Double tasa = moneda.obtenerTasa("BRL");//
                Double conversorDolarRealesBrasilenos = dolares * tasa;
                System.out.printf("EL valor de %.2f [USD] corresponde al valor final  de =>>> %.2f [BRL])",dolares,conversorDolarRealesBrasilenos);
            }else if (opcionUsuario.equals("4")) {
                System.out.println("Ingrese la cantidad de Reales brasileños que quiere convertir a Dolares:");
                Double realesBrasilenos = scanner.nextDouble();
                scanner.nextLine();
                Double tasa = moneda.obtenerTasa("BRL");
                Double conversioRealBrasileno = realesBrasilenos / tasa;
                System.out.printf("EL valor de %.2f [BRL] corresponde al valor final  de =>>> %.2f [USD])",realesBrasilenos,conversioRealBrasileno);
            }else if (opcionUsuario.equals("5")) {
                System.out.println("Ingrese la cantidad de dolares que quiere convertir a pesos colombianos:");
                Double dolares = scanner.nextDouble();
                scanner.nextLine();
                Double tasa = moneda.obtenerTasa("COP");
                Double conversionDolares = dolares * tasa;
                System.out.printf("EL valor de %.2f [USD] corresponde al valor final  de =>>> %.2f [COP])",dolares,conversionDolares);
            }else if (opcionUsuario.equals("6")) {
                System.out.println("Ingrese la cantidad de pesos colombianos que quiere convertir a dolares:");
                Double pesosColombianos = scanner.nextDouble();
                scanner.nextLine();
                Double tasa = moneda.obtenerTasa("COP");//
                Double conversionPesosColombianos = pesosColombianos / tasa;
                System.out.printf("EL valor de %.2f [COP] corresponde al valor final  de =>>> %.2f [USD])",pesosColombianos,conversionPesosColombianos);
            } else if (opcionUsuario.equals("7") ||  opcionUsuario.equals("salir")) {
                break;
            } else {
                System.out.println("Opción no valida");
            }
        }
    }
}
