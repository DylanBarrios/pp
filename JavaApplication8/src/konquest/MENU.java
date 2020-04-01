package konquest;

import Mapas.DisenioMapas;

import java.util.Scanner;

public class MENU {

    Scanner leer = new Scanner(System.in);
    Scanner imprimir = new Scanner(System.in);

    public void MENU() {

        int respuesta;

        System.out.println("BIENVENIDO A JUEGOS GYF \n"
                + "Le presentamos nuestro nuevo juego llamado: Konquest, que consiste en lo siguiente: \n"
                + "Dos jugadores pueden conquistar planetas, enviando naves con guerreros, \n"
                + "para poder construir un gran imperio al conquistar todos los planetas  disponibles.\n"
                + "elija un numero de opcion ");
        System.out.println("1. Iniciar juego \n"
                + "2. Salir del sistema ");
        respuesta = leer.nextInt();
        if (respuesta == 1) {
            MenuInicio();
        } else if (respuesta == 2) {
            System.out.println("falta programar ");
        }

    }

    public void MenuInicio() {
        int filas, columnas, planetasNeutrales;
        String Jugador1, Jugador2;
        DisenioMapas M1 = new DisenioMapas();

        System.out.println("ingrese el numero de filas para el mapa ");
        filas = leer.nextInt();
        System.out.println("ingrese el numero de columnas para el mapa");
        columnas = leer.nextInt();
        System.out.println("ingrese la cantidad de planetas neutrales para el mapa");
        planetasNeutrales = leer.nextInt();
        System.out.println("ingrese el nombre del Jugador numero 1");
        Jugador1 = imprimir.nextLine();
        System.out.println("ingrese el nombre del Jugador numero 2");
        Jugador2 = imprimir.nextLine();
        System.out.println("Diseño del mapa:\n1) Aleatorio\n2) Manual");
        int opcionMapa = leer.nextInt();

        switch (opcionMapa) {
            case 1:
                M1.MapaAleatorio(filas, columnas, planetasNeutrales, Jugador1, Jugador2);
                break;
            case 2:
                M1.MapaManual(filas, columnas, planetasNeutrales, Jugador1, Jugador2);
                break;
            default:
                System.out.println("La opcion no existe, elija una de las opciones");
        }
    }

}
