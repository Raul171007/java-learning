package relacion6;

import java.util.Scanner;

public class Ejercicio63 {
    static void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca la altura de la primera pirámide: ");
        int altura1 = s.nextInt();
        System.out.println("Introduzca la altura de la segunda pirámide: ");
        int altura2 = s.nextInt();

        int mayor = 0;
        int menor = 0;

        if (altura1>= altura2) {
            mayor = altura1;
            menor = altura2;
        } else {
            mayor = altura2;
            menor = altura1;
        }

        for (int filat1 = 1; filat1 <= mayor; filat1++) {
            for (int columna1t1 = 1; columna1t1<=mayor; columna1t1++) {
                if (filat1 + columna1t1 >= mayor + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            for (int columna2t1 = mayor - 1; columna2t1>0; columna2t1--) {
                if (filat1 + columna2t1 >= mayor + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.print(" ");

            for (int columna1t2 = 1; columna1t2 <= menor; columna1t2++) {
                if (filat1 + columna1t2 >= menor + (mayor - menor) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int columna2t2 = menor - 1; columna2t2 > 0; columna2t2--) {
                if (filat1 + columna2t2 >= menor  + (mayor - menor) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int filat2 = 1; filat2 <= altura2; filat2++) {

            System.out.println();
        }

    }
}
