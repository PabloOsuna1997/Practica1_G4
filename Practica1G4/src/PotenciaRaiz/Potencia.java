/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PotenciaRaiz;

import static NumeroPrimo.esPrimo.ANSI_YELLOW;

/**
 *
 * @author Jhona
 */
public class Potencia {

    /**
     * @param base numero base
     * @param exp numbero exponente
     * @return
     */
    public double pow(double base, double exp) {
        
        return Math.pow(base, exp);
    }

    /**
     * @param num numero para realizar la potencia
     */
    public void powAlCubo(double num) {
        if (num != 0) {                             //validacion para no hacer una potencia al numero 0 -  201503911
            double pow = this.pow(num, 3);
            System.out.println("Potencia al cubo de " + num + ": " + pow);
        } else {
            System.out.println("El numero 0 elevado a cualquier potencia siempre da como resultado 0.");
        }
    }

    /**
     * potencia en forma recursiva 201325583
     *
     * @param base
     * @param exp
     * @return
     */
    public int pow(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * pow(base, exp - 1);
        }
    }

    public void powEntero(double base, double exp) {
        double res = Math.pow(base, exp);
        if (exp < 0) {

            System.out.println(ANSI_YELLOW + "Si el exponente es negativo se puede reescribir como " + base + "^(1/" + (-1 * exp) + ")");

        }
        System.out.println(ANSI_YELLOW + "Potencia (" + base + "^" + exp + ") = " + res);

    }
}
