package relacion2;

public class Ejercicio11 {
    public static void main(String[] args) /* Metodo main */ {

        boolean casado = true;//1. Si un empleado este casado o no.
        final int MAXIMO = 999999;//2. Valor máximo no modificable: 999999.
        int diaSemana = 1;//3. Dia de la semana.
        short diaAnio = 300;//4. Dia del año.
        char sexo = 'M';//5. Sexo: con dos valores posibles 'V' o 'M'.
        long miliseg1970 = 1298332800000L;//6. Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
        float factura = 10350.678F;//7. Almacenar el total de una factura.
        long pobPlaneta = 6775235741L;//8. Población mundial del planeta tierra.

        System.out.println("El valor de la variable casado es " + casado);
        System.out.println("\tEl valor de la variable MAXIMO es " + MAXIMO);
        System.out.println("\tEl valor de la variable diaSemana es " + diaSemana);
        System.out.println("\tEl valor de la variable diaAnio es " + diaAnio);
        System.out.println("\tEl valor de la variable miliseg1970 es " + miliseg1970);
        System.out.println("\tEl valor de la variable factura es " + factura);
        System.out.println("\tEl valor de la variable pobPlaneta es " + pobPlaneta);
        System.out.println("\tEl valor de la variable sexo es " + sexo + "\n");

        System.out.printf("El valor de la variable casado es %s", casado);
        System.out.printf("\n\tEl valor de la variable MAXIMO es %s", MAXIMO);
        System.out.printf("\n\tEl valor de la variable diaSemana es %s", diaSemana);
        System.out.printf("\n\tEl valor de la variable diaAnio es %s", diaAnio);
        System.out.printf("\n\tEl valor de la variable miliseg1970 es %s", miliseg1970);
        System.out.printf("\n\tEl valor de la variable factura es %s", factura);
        System.out.printf("\n\tEl valor de la variable factura en notación científica es %e", factura);
        System.out.printf("\n\tEl valor de la variable pobPlaneta es %s", pobPlaneta);
        System.out.printf("\n\tEl valor de la variable sexo es %s", sexo);


    }//Llave cierre main
}//Llave cierre class