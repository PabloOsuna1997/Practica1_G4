/*
 *  Proyecto de Mario Morales
 *  mmario_93@hotmail.es
 *  USAC
 */
package Fun_Discriminante;

import NumeroPrimo.esPrimo;

import Mult_Div.*;
import java.util.Locale;
import java.util.Scanner;

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

    public static double a_1, b_2, c_3;
    public static int activador = 0;
    
    public void printJhonny() {
        System.out.println("Jhonatan Lopez - 201325583");
    }

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
            // Indico que se graficara la funcion ingresada
            activador = 1;
            mayorCero(discriminante, a, b);
        }
    }

    private double getValor(double a, double b, double c) {
        c_3 = c;
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
        a_1 = a;
        b_2 = b;
        System.out.println();
    }

    //FUNCION DEL VALOR ABSOLUTO
    public void menuValorAbsoluto() {
        boolean bandera = true;
        double numeroValorAbs;
        Scanner reader = new Scanner(System.in);
        int continuar = 2;

        while (bandera == true) {
            System.out.print("Ingrese un numero para calcular el valor absoluto del mismo: ");
            numeroValorAbs = reader.nextDouble();
            valorAbsoluto(numeroValorAbs);

            while (true) {
                System.out.print(ANSI_GREEN + " \n ¿Desea probar con otro numero? 0(no)/1(si): " + ANSI_RESET);
                continuar = reader.nextInt();
                if (continuar == 0) {
                    bandera = false;
                    break;
                } else if (continuar == 1) {
                    break;
                } else {
                    System.out.println(ANSI_RED + "Ingrese un valor valido" + ANSI_RESET);
                }
            }
        }

        //----FIN DEL VALOR ABSOLUTO
        System.out.println("\nTambien se pueden hacer operaciones dentro del valor absoluto\npor ejemplo:");       //funcion extra: 201503911
        //Valores a multuplicar
        Mult_y_Div multi = new Mult_y_Div();
        int a = -2;
        int b = 3;
        System.out.println(ANSI_RESET + " ->" + ANSI_BLUE + " Valor Absoluto de : | " + a + "*" + b + "| = " + calcularValAbs(multi.multiplicacion1(a, b)) + ANSI_RESET);
        System.out.println(ANSI_RED + "\nHA CULMINADO LA FUNCION VALOR ABSOLUTO" + ANSI_RESET);
        //Hago la pausa de 3 segundo
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

    }

    public void valorAbsoluto(double numero) {
        System.out.println(ANSI_BLUE + "Valor Absoluto: |" + numero + "| = " + calcularValAbs(numero));
    }

    public double calcularValAbs(double numero) {
        return numero > 0 ? numero : -numero;
    }

}
