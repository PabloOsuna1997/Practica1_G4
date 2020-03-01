/*
 *  Proyecto de Mario Morales
 *  mmario_93@hotmail.es
 *  USAC
 */
package Fun_Discriminante;

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
            cero();
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

    public void cero() {
        System.out.println(ANSI_RED + "Sin soluciones reales" + ANSI_RESET);
    }

    public void igualCero(double a, double b) {
        double x_1;
        System.out.println(ANSI_CYAN + "Existe una sola solución para esta ecuacion." + ANSI_RESET);
        x_1 = (-b) / (2 * a);
        System.out.println(ANSI_GREEN + "\tSolucion: X_1 = X_2: " + x_1 + ANSI_RESET);
    }

    public void mayorCero(double d, double a, double b) {
        double x_1, x_2;
        System.out.println(ANSI_CYAN + "Existen dos soluciones para esta Ecuacion: " + ANSI_RESET);
        x_1 = ((-b) + Math.sqrt(d)) / (2 * a);
        x_2 = ((-b) - Math.sqrt(d)) / (2 * a);
        System.out.println(ANSI_GREEN + "\tX1 = " + x_1 + ANSI_RESET + ANSI_YELLOW + " \n\tX2 = " + x_2 + ANSI_RESET);
    }
    
    
    
    //FUNCION DEL VALOR ABSOLUTO
    public void valorAbsoluto(double numero){
        
    }
    
    public double calcularValAbs( double numero){
        return numero > 0 ? numero : -numero;
    }
            
}
