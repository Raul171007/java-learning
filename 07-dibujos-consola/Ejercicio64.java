package relacion6;

import java.util.Scanner;

public class Ejercicio64 {
    static void main() {
        Scanner s = new Scanner(System.in);

        int altura = 3;
        int anchura = 6;
        int menu = 0;

        for (int fila = 1; fila<=altura; fila ++) {
            for (int columna = 1; columna<=anchura; columna++) {
                if (fila == 1 || columna == 1 || fila == altura || columna == anchura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        do {
            System.out.println("1. Agrandarlo");
            System.out.println("2. Achicarlo");
            System.out.println("3. Cambiar orientación");
            System.out.println("4. Salir");
            menu = s.nextInt();

            if (menu < 1 || menu > 4) {
                System.out.println("Ese número no es válido para este menú.");
            } else if (menu == 1 ){
                altura +=1;
                anchura+=1;

                for (int fila = 1; fila<=altura; fila ++) {
                    for (int columna = 1; columna<=anchura; columna++) {
                        if (fila == 1 || columna == 1 || fila == altura || columna == anchura) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            if (menu == 2) {


                if (altura == 2 || anchura == 2) {
                    System.out.println("El valor mínimo de la altura y anchura es 2");
                } else {
                    altura-=1;
                    anchura-=1;
                    for (int fila = 1; fila<=altura; fila ++) {
                        for (int columna = 1; columna<=anchura; columna++) {
                            if (fila == 1 || columna == 1 || fila == altura || columna == anchura) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                }
            }
            if (menu == 3) {

                for (int fila = 1; fila<=anchura; fila ++) {
                    for (int columna = 1; columna<=altura; columna++) {
                        if (fila == 1 || columna == 1 || fila == anchura || columna == altura) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        } while (menu != 4);
    }
}
