package relacion6;

import java.util.Scanner;

public class Ejercicio07 {
    static void main() {

        Scanner s = new Scanner(System.in);

        int contrasenia = 6767;
        int intentos = 3;

        System.out.println("Introduce el código de la caja: ");
        int numUsuario = s.nextInt();

        while (numUsuario != contrasenia && intentos>0) {
            System.out.println("Lo siento no es la combinación");

            System.out.println("Te quedan " + intentos + " intentos.");

            intentos--;

            System.out.println("Introduce el código de la caja: ");
            numUsuario = s.nextInt();
        }

        if (intentos == 0) {
            System.out.println("Te has quedado sin oportunidades.");
        }

        if (numUsuario == contrasenia) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        }


    }
}
