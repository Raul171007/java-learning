package relacion5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio31 {
    static void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("Usuario 1 elige piedra, papel o tijera: ");
        String elemento1 = s.nextLine();
        System.out.println("Usuario 2 elige piedra, papel o tijera: ");
        String elemento2 = s.nextLine();

        int elemento1Numero = 0;
        int elemento2Numero = 0;
        int puntos1 = 0;
        int puntos2 = 0;

        elemento1Numero = switch (elemento1.toLowerCase()) {
            case "piedra" -> 1;
            case "papel" -> 2;
            case "tijera" -> 3;
            default -> 0;
        };

        elemento2Numero = switch (elemento2.toLowerCase()) {
            case "piedra" -> 1;
            case "papel" -> 2;
            case "tijera" -> 3;
            default -> 0;
        };

        boolean error = (elemento1Numero == 0) || (elemento2Numero == 0) || (elemento1Numero == elemento2Numero);
        boolean gana1 = (elemento1Numero == 1 && elemento2Numero == 3) || (elemento1Numero == 2 && elemento2Numero == 1) || (elemento1Numero == 3 && elemento2Numero == 2);

        if (error) {
            System.out.println("Los elementos elegidos no son válidos o son iguales");
        } else {
            if (gana1) {
                puntos1 += 1;
                System.out.println("Gana jugador 1");
            } else {
                puntos2 += 1;
                System.out.println("Gana jugador 2");
            }
        }

        System.out.println("Usuario 1 elige piedra, papel o tijera: ");
        elemento1 = s.nextLine();
        System.out.println("Usuario 2 elige piedra, papel o tijera: ");
        elemento2 = s.nextLine();


        elemento1Numero = switch (elemento1.toLowerCase()) {
            case "piedra" -> 1;
            case "papel" -> 2;
            case "tijera" -> 3;
            default -> 0;
        };

        elemento2Numero = switch (elemento2.toLowerCase()) {
            case "piedra" -> 1;
            case "papel" -> 2;
            case "tijera" -> 3;
            default -> 0;
        };

        error = (elemento1Numero == 0) || (elemento2Numero == 0) || (elemento1Numero == elemento2Numero);
        gana1 = (elemento1Numero == 1 && elemento2Numero == 3) || (elemento1Numero == 2 && elemento2Numero == 1) || (elemento1Numero == 3 && elemento2Numero == 2);

        if (error) {
            System.out.println("Los elementos elegidos no son válidos o son iguales");
        } else {
            if (gana1) {
                puntos1 += 1;
                System.out.println("Gana jugador 1");
            } else {
                puntos2 += 1;
                System.out.println("Gana jugador 2");
            }
        }

        System.out.println("Usuario 1 elige piedra, papel o tijera: ");
        elemento1 = s.nextLine();
        System.out.println("Usuario 2 elige piedra, papel o tijera: ");
        elemento2 = s.nextLine();

        elemento1Numero = switch (elemento1.toLowerCase()) {
            case "piedra" -> 1;
            case "papel" -> 2;
            case "tijera" -> 3;
            default -> 0;
        };

        elemento2Numero = switch (elemento2.toLowerCase()) {
            case "piedra" -> 1;
            case "papel" -> 2;
            case "tijera" -> 3;
            default -> 0;
        };

        error = (elemento1Numero == 0) || (elemento2Numero == 0) || (elemento1Numero == elemento2Numero);
        gana1 = (elemento1Numero == 1 && elemento2Numero == 3) || (elemento1Numero == 2 && elemento2Numero == 1) || (elemento1Numero == 3 && elemento2Numero == 2);

        if (error) {
            System.out.println("Los elementos elegidos no son válidos o son iguales");
        } else {
            if (gana1) {
                puntos1 += 1;
                System.out.println("Gana jugador 1");
            } else {
                puntos2 += 1;
                System.out.println("Gana jugador 2");
            }
        }

        if (puntos1 > puntos2) {
            System.out.println("Gana el jugador 1 por " + puntos1 + " a " + puntos2);
        } else if (puntos2 > puntos1){
            System.out.println("Gana el jugador 2 por " + puntos2 + " a " + puntos1);
        } else {
            System.out.println("No gana nadie.");
        }
    }
}
