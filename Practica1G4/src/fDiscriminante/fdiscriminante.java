/*
 *  Proyecto de Mario Morales
 *  mmario_93@hotmail.es
 *  USAC
 */
package fDiscriminante;

/**
 *
 * @author Mario Morales
 */
public class fdiscriminante {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void Operar(double a, double b, double c) {

        double discriminante, x1, x2;

        discriminante = ((b * b) - 4 * (a) * (c));

        if (discriminante < 0) {
            System.out.println(ANSI_RED + "No exiten soluciones reales" + ANSI_RESET);
        }

        if (discriminante == 0) {
            System.out.println(ANSI_CYAN + "Existe una sola solución para esta ecuacion." + ANSI_RESET);
            x1 = (-b) / (2 * a);
            System.out.println(ANSI_GREEN + "\tSolucion: X1 = X2 : " + x1 + ANSI_RESET);
        }

        if (discriminante > 0) {
            System.out.println(ANSI_CYAN + "Existen dos soluciones para esta Ecuacion" + ANSI_RESET);
            x1 = ((-b) + Math.sqrt(discriminante)) / (2 * a);
            x2 = ((-b) - Math.sqrt(discriminante)) / (2 * a);
            System.out.println(ANSI_GREEN + "\tX1 = " + x1+ ANSI_RESET + ANSI_YELLOW +  " \n\tX2 = " + x2 + ANSI_RESET);
        }
    }

}
