package relacion6;

import java.util.Scanner;

public class Ejercicio45 {
    static void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("Inroduzca un número entero positivo: ");
        String numero = s.nextLine();
        System.out.println("Introduzca la posición que desea cambiar: ");
        int posicion = s.nextInt();
        System.out.println("Introduzca el nuevo dígito: ");
        String digitoLetra = s.next();

        String izquierda = "";
        String derecha = "";

        for (int i = 0; i<posicion-1; i++ ) {
            int digito = Character.getNumericValue(numero.charAt(i));
            izquierda+=digito;
        }
        izquierda+=digitoLetra;
        for (int d = posicion; d<=numero.length()-1; d++) {
            int digito = Character.getNumericValue(numero.charAt(d));
            derecha+=digito;
        }
        System.out.println(izquierda + derecha);
    }
}
