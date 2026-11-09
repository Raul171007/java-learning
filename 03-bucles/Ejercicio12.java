package relacion6;

import java.util.Scanner;

public class Ejercicio12 {
    static void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("¿Cuántos números de la serie Fibonacci quieres saber?: ");
        int numerosPedidos = s.nextInt();

        int num1 = 0;
        int num2 = 1;
        int num3;

        for (int i=0; i<numerosPedidos; i++) {

            System.out.print(num1 + ", ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
