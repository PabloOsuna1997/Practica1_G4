/*
 *  Proyecto de Mario Morales
 *  mmario_93@hotmail.es
 *  USAC
 */
package Fun_Discriminante;

import NumeroPrimo.esPrimo;

import Mult_Div.*;

/**
 *
 * @author Mario Morales
 */
public class discriminante {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void Operar(double a, double b, double c) {

        double discriminante;
        discriminante = getValor(a, b, c);

        if (discriminante < 0) {
            cero(discriminante, a, b);
        }
        if (discriminante == 0) {
            igualCero(a, b);
        }

        if (discriminante > 0) {
            mayorCero(discriminante, a, b);
        }
    }

    private double getValor(double a, double b, double c) {
        return ((b * b) - 4 * (a) * (c));
    }
 
    // Funcion extra - 201213283
    public void cero(double d, double a, double b) {
        double r;
        double i;

        r = ((-b) / (2 * a));
        i = Math.sqrt(d * (-1)) / (2 * a);

        System.out.println(ANSI_RED + "\tSin soluciones reales" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "\tRaiz Imaginaria 1: " + (r * 1000d) / 1000d + "+" + (i * 1000d) / 1000d + "i" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "\tRaiz Imaginaria 2: " + (r * 1000d) / 1000d + "-" + (i * 1000d) / 1000d + "i" + ANSI_RESET);

    }

    public void igualCero(double a, double b) {
        double x_1;
        System.out.println(ANSI_CYAN + "Existe una sola solución para esta ecuacion." + ANSI_RESET);
        x_1 = (-b) / (2 * a);

        System.out.print(ANSI_GREEN + "\tSolucion: X_1 = X_2: " + x_1 + ", Aproximacion:+" + (int) x_1 + "y " + ANSI_RESET);
        esPrimo primo = new esPrimo((int) x_1);
        System.out.println();
    }

    public void mayorCero(double d, double a, double b) {
        double x_1, x_2;
        System.out.println(ANSI_CYAN + "Existen dos soluciones para esta Ecuacion: " + ANSI_RESET);
        x_1 = ((-b) + Math.sqrt(d)) / (2 * a);
        x_2 = ((-b) - Math.sqrt(d)) / (2 * a);

        //INFORMACION DEL NUMERO SI ES PRIMO O NO Y SI ES IMPAR O NO - 201503911
        System.out.print(ANSI_GREEN + "\tX1 = " + x_1 + ", Aproximacion: " + (int) x_1 + " y " + ANSI_RESET);
        esPrimo primo = new esPrimo((int) x_1);
        System.out.print(ANSI_YELLOW + " \n\tX2 = " + x_2 + ", Aproximacion: " + (int) x_2 + " y " + ANSI_RESET);
        esPrimo primo2 = new esPrimo((int) x_2);
        System.out.println();
    }

    //FUNCION DEL VALOR ABSOLUTO
    public void valorAbsoluto(double numero) {
        System.out.println(ANSI_BLUE + "Valor Absoluto: |" + numero + "| = " + calcularValAbs(numero));
        System.out.println("\nTambien se pueden hacer operaciones dentro del valor absoluto:");       //funcion extra: 201503911

        //Valores a multuplicar
        Mult_y_Div multi = new Mult_y_Div();
        int a = -2;
        int b = 3;
        System.out.println(ANSI_RESET + " ->" + ANSI_BLUE + " Valor Absoluto de : | " + a + "*" + b + "| = " + calcularValAbs(multi.multiplicacion1(a, b)) + ANSI_RESET);
    }

    public double calcularValAbs(double numero) {
        return numero > 0 ? numero : -numero;
    }

}
