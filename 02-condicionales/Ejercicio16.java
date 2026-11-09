package relacion5;

import java.util.Scanner;

public class Ejercicio16 {
    static void main() {
        Scanner s = new Scanner(System.in);

        int puntos = 0;

        System.out.println("Todas las preguntas de este test deben ser respondidas con V o F.");

        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        String pregunta = s.nextLine();

        if (pregunta.equalsIgnoreCase("v"))
            puntos = puntos + 3;

        System.out.println("Ha aumentado sus gastos de vestuario.");
        pregunta = s.nextLine();

        if (pregunta.equalsIgnoreCase("v"))
            puntos = puntos + 3;

        System.out.println("Ha perdido el interés que mostraba anteriormente por ti.");
        pregunta = s.nextLine();

        if (pregunta.equalsIgnoreCase("v"))
            puntos = puntos + 3;

        System.out.println("Ahora se asea con más frecuencia.");
        pregunta = s.nextLine();

        if (pregunta.equalsIgnoreCase("v"))
            puntos = puntos + 3;

        System.out.println("No te deja que mires la agenda de su teléfono móvil.");
        pregunta = s.nextLine();

        if (pregunta.equalsIgnoreCase("v"))
            puntos = puntos + 3;

        System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
        pregunta = s.nextLine();

        if (pregunta.equalsIgnoreCase("v"))
            puntos = puntos + 3;

        System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        pregunta = s.nextLine();

        if (pregunta.equalsIgnoreCase("v"))
            puntos = puntos + 3;

        System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        pregunta = s.nextLine();

        if (pregunta.equalsIgnoreCase("v"))
            puntos = puntos + 3;

        System.out.println("Has notado que últimamente se perfuma más.");
        pregunta = s.nextLine();

        if (pregunta.equalsIgnoreCase("v"))
            puntos = puntos + 3;

        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        pregunta = s.nextLine();

        if (pregunta.equalsIgnoreCase("v"))
            puntos = puntos + 3;

        if (puntos <= 10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if (puntos <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente,\naunque seguramente será algo sin importancia.");
        } else {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona.\nTe aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }
}
