package relacion6;

import java.util.Scanner;

public class Ejercicio59 {
    static void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la altura del árbol de navidad (la altura debe ser mínimo 4): ");
        int altura = s.nextInt();

        if (altura < 4) {
            System.out.println("ERROR");
        } else {
            for (int fila = 0; fila<altura; fila++) {
                for (int columna = 1; columna<=(altura-2); columna ++) {
                    if (fila == 0 && columna == altura - 2) {
                        System.out.print("*");
                    } else if (fila == altura - 1 && columna == altura -2) {
                        System.out.print("Y");
                    } else if (columna + fila == altura - 1) {
                        System.out.print("^");
                    } else if (fila == altura - 2) {
                        System.out.print("^");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int columna2 = (altura - 2) - 1; columna2>=1; columna2--) {
                    if (columna2 + fila == altura - 1) {
                        System.out.print("^");
                    } else if (fila == altura - 2) {
                        System.out.print("^");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }



    }
}
