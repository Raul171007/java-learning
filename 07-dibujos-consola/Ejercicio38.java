package relacion6;

import java.util.Scanner;

public class Ejercicio38 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        int altura = s.nextInt();

        if (altura % 2 == 0 || altura < 3) {
            System.out.println("La altura no es válida.");
        } else {
            int fila = 1;
            while (fila<=altura/2+1) {
                int e = 1;
                while (e <= fila-1 ) {
                    System.out.print(" ");
                    e++;
                }
                int as = altura - (2*(fila-1));
                while (as>0) {
                    System.out.print("*");
                    as--;
                }

                fila ++;
                System.out.println();
            }
            fila = altura/2;
            while (fila>=1) {
                int e = fila -1;
                while (e <= fila-1 && e>0 ) {
                    System.out.print(" ");
                    e--;
                }
                int as = altura - (2*(fila-1));
                while (as>0) {
                    System.out.print("*");
                    as--;
                }
                fila--;
                System.out.println();
            }

        }
    }
}