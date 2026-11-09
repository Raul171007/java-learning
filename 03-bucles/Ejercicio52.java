package relacion6;

import java.util.Scanner;

public class Ejercicio52 {
    static void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        String numero = s.nextLine();

        int digitofinal = Character.getNumericValue(numero.charAt(0));
        String cadenaNueva = "";

        for (int i = 1; i<numero.length(); i++) {
            int digito = Character.getNumericValue(numero.charAt(i));

            cadenaNueva+=digito;
        }

        cadenaNueva+=digitofinal;

        System.out.println("El número resultado es " + cadenaNueva);
    }
}
