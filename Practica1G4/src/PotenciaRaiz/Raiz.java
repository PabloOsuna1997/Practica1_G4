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
public class Raiz
{
    /**
     * @param base numero base
     * @param exp  numbero exponente
     * @return 
     */
    public static double sqrt(double base, double exp)
    {
        return Math.pow(base, 1/exp);
    }
}
