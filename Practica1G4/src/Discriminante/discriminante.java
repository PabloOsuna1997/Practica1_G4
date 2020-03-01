/*
 *  Proyecto de Mario Morales
 *  mmario_93@hotmail.es
 *  USAC
 */
package Discriminante;

/**
 *
 * @author Mario Morales
 */
public class discriminante {

    public void Operar(double a, double b, double c) {
        double discriminante, x1, x2;

        discriminante = ((b * b) - 4 * (a) * (c));

        if (discriminante < 0) {
            System.out.println("No exiten soluciones reales");
        }

        if (discriminante == 0) {
            System.out.println("Existe una sola solución para esta ecuacion.");
            x1 = (-b) / (2 * a);
            System.out.println("\tSolucion: X1 = X2 : " + x1);
        }

        if (discriminante > 0) {
            System.out.println("Existen dos soluciones para esta Ecuacion");
            x1 = ((-b) + Math.sqrt(discriminante)) / (2 * a);
            x2 = ((-b) - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("\tX1 = " + x1 + " \n\tX2 = " + x2);
        }

    }
}
