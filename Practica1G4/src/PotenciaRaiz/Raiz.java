/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PotenciaRaiz;

import java.text.DecimalFormat;

/**
 *
 * @author Jhona
 */
public class Raiz {

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    /**
     * @param base numero base
     * @param exp numbero exponente
     * @return
     */
    public double sqrt(double base, double exp) {
        return Math.pow(base, 1 / exp);

    }

    /**
     * @param num numero para realizar la raiz
     */
    public void sqrtAlCubo(double num) {
        DecimalFormat df = new DecimalFormat("#.0000");
        if (num != 0) {                                       //si el numero es 0 siempre dara como resultado el cero. - 201503911
            if (num < 0) {
                 double sqrt = this.sqrt(num*-1, 3);
                 sqrt = sqrt*-1;
                System.out.println("Raiz cubica de " + num + ": " + df.format(sqrt));
            } else {
                double sqrt = this.sqrt(num, 3);
                System.out.println("Raiz cubica de " + num + ": " + df.format(sqrt));
            }

        } else {
            System.out.println("Cualquiera Raiz aplicada al numero 0  siempre da como resultado 0");
        }

    }

    /**
     * Funcion extra 201213283 Raiz cuadrada con numeros imaginarios
     *
     * @param num
     */
    public void sqrtImg(double num) {
        double i;
        DecimalFormat df = new DecimalFormat("#.000");
        i = Math.sqrt(num * (-1));
        System.out.println(ANSI_YELLOW + "\tRaiz Imaginaria 1: " + df.format(i) + "i" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "\tRaiz Imaginaria 2: -" + df.format(i) + "i" + ANSI_RESET);
    }
}
