package relacion5;

import java.util.Scanner;

public class Ejercicio12 {
    static void main() {
        Scanner s = new Scanner(System.in);

        System.out.printf("¿Qué es un algoritmo según el material del curso?\na) Un programa escrito exclusivamente en lenguaje Java.\n b) Una secuencia ordenada de pasos sin ambigüedades para solucionar un problema.\n c) Un error de compilación que impide la ejecución del código.\n");
        String pregunta1 = s.nextLine();

        System.out.printf("\n¿En qué fase de la programación se esboza la solución utilizando diagramas de flujo o pseudocódigo?\n a) Análisis.\n b) Pruebas y validación.\n c) Diseño.\n");
        String pregunta2 = s.nextLine();

        System.out.printf("\n¿Cuál es el principal objetivo de la programación estructurada frente a la convencional?\n a) Solventar problemas de lectura y mantenimiento estructurando el código y usando funciones.\n b) Describir el problema detallando qué se quiere solucionar, pero no el cómo.\n c) Convertir el código de alto nivel directamente a lenguaje ensamblador.\n");
        String pregunta3 = s.nextLine();

        System.out.printf("\n¿Qué característica define a los lenguajes de programación interpretados (como Python)?\n a) Generan un archivo ejecutable (.exe) que es independiente del código fuente.\n b) Requieren un programa (intérprete) que traduzca y ejecute cada instrucción en tiempo real.\n c) Se comunican directamente con el procesador a través de código binario (0 y 1).\n");
        String pregunta4 = s.nextLine();

        System.out.printf("\nEn el proceso de compilación y ejecución de Java, ¿para qué sirve la Máquina Virtual de Java (JVM)?\n a) Para interpretar el bytecode (.class) y traducirlo al código máquina del ordenador actual.\n b) Para compilar el código fuente (.java) directamente a código binario.\n c) Para subir de forma automática el código a un repositorio en la nube.\n");
        String pregunta5 = s.nextLine();

        System.out.printf("\n¿Cuál es la principal diferencia entre las versiones OpenJDK y Oracle JDK de Java?\n a) OpenJDK es un lenguaje interpretado y Oracle JDK es un lenguaje compilado.\n b) OpenJDK es solo para aplicaciones móviles y Oracle JDK para aplicaciones de consola.\n c) Oracle JDK se basa en OpenJDK, pero añade optimizaciones, soporte y licencia comercial.\n");
        String pregunta6 = s.nextLine();

        System.out.printf("\nAl utilizar un sistema de control de versiones como Git, ¿qué acción realiza el comando git commit?\n a) Guarda un cambio concreto en el historial local junto con un mensaje descriptivo.\n b) Descarga la última versión del código desde el repositorio remoto.\n c) Sube todo nuestro código local a los servidores de GitHub.\n");
        String pregunta7 = s.nextLine();

        System.out.printf("\nCuando utilizamos herramientas de Inteligencia Artificial para programar, ¿qué riesgo o mala práctica debemos evitar?\n a) Usar la IA para que nos explique qué hace un fragmento de código que no entendemos.\n b) Copiar y pegar el código generado sin entenderlo, ya que la IA puede \"alucinar\" o equivocarse.\n c) Pedirle a la IA que nos ayude a escribir las pruebas unitarias del programa.\n");
        String pregunta8 = s.nextLine();

        System.out.printf("\nSegún el documento, ¿cuál de los siguientes es uno de los cuatro conceptos clave para resolver un problema de programación?\n a) Divide y vencerás.\n b) Compilación just-in-time.\n c) Ejecución en paralelo.\n");
        String pregunta9 = s.nextLine();

        System.out.printf("\n¿Qué comando de terminal se utiliza en Java para compilar un archivo de texto plano (ej. Main.java) y generar su bytecode?\n a) java Main\n b) git add Main.java\n c) javac Main.java\n");
        String pregunta10 = s.nextLine();

        int nota = 0;

        if (pregunta1.equalsIgnoreCase("b")) {
            nota = nota + 1;
        } else {
            nota = nota;
        }
        if (pregunta2.equalsIgnoreCase("c")) {
            nota = nota + 1;
        } else {
            nota = nota;
        }
        if (pregunta3.equalsIgnoreCase("a")) {
            nota = nota + 1;
        } else {
            nota = nota;
        }
        if (pregunta4.equalsIgnoreCase("b")) {
            nota = nota + 1;
        } else {
            nota = nota;
        }
        if (pregunta5.equalsIgnoreCase("a")) {
            nota = nota + 1;
        } else {
            nota = nota;
        }
        if (pregunta6.equalsIgnoreCase("c")) {
            nota = nota + 1;
        } else {
            nota = nota;
        }
        if (pregunta7.equalsIgnoreCase("a")) {
            nota = nota + 1;
        } else {
            nota = nota;
        }
        if (pregunta8.equalsIgnoreCase("b")) {
            nota = nota + 1;
        } else {
            nota = nota;
        }
        if (pregunta9.equalsIgnoreCase("a")) {
            nota = nota + 1;
        } else {
            nota = nota;
        }
        if (pregunta10.equalsIgnoreCase("c")) {
            nota = nota + 1;
        } else {
            nota = nota;
        }

        System.out.println("Has sacado un " + nota);
    }
}
