package relacion6;

import java.util.Scanner;

public class Ejercicio54 {
    static void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la altura: ");
        int altura = s.nextInt();

        for (int fila = 1; fila<=altura; fila++) {
            for (int columna = 1; columna<=altura; columna++) {
                if (fila == 1 || columna == 1|| columna + fila == altura + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
