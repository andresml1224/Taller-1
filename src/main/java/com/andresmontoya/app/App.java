package com.andresmontoya.app;

import com.andresmontoya.domain.DispensadorAgua;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DispensadorAgua dispensador1 = new DispensadorAgua();
        int opcion;
        int cantServida;
        int cantLlenar;
        float nuevaTemp;
        int cantidadLimite = 20000;

        do {
            System.out.println("Ingrese que desea hacer con el dispensador");
            System.out.println("1. Servir");
            System.out.println("2. Llenar");
            System.out.println("3. Vaciar");
            System.out.println("4. Mostrar cantidad actual");
            System.out.println("5. Calentar");
            System.out.println("6. Enfriar");
            System.out.println("7. Mostrar el nivel de temperatura");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("¿Cuanto desea servir?");
                    cantServida = sc.nextInt();
                    dispensador1.servir(cantServida);
                    break;
                case 2:
                    System.out.println("¿Con cuanto dese llenar?");
                    cantLlenar = sc.nextInt();
                    dispensador1.llenar(cantLlenar, cantidadLimite);
                    break;
                case 3:
                    dispensador1.vaciar();
                    System.out.println("Vaciada correctamente");
                    break;
                case 4:
                    System.out.println("La cantidad actual del dispensador es: " + dispensador1.cantAct);
                    break;
                case 5:
                    System.out.println("Ingrese la temperatura a calentar");
                    nuevaTemp = sc.nextFloat();
                    dispensador1.calentar(nuevaTemp);
                    break;
                case 6:
                    System.out.println("Ingrese la temperatura a enfriar (Positiva)");
                    nuevaTemp = sc.nextFloat();
                    dispensador1.enfriar(nuevaTemp);
                    break;
                case 7:
                    System.out.println(dispensador1.mostrarNivel());
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion innexistente");
                    break;
            }
        }while (opcion != 0);

    }
}
