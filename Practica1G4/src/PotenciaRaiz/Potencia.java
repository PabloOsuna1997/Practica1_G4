/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PotenciaRaiz;

/**
 *
 * @author Jhona
 */
public class Potencia {
    /**
     * @param base numero base
     * @param exp  numbero exponente
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
}
