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
    public double sqrt(double base, double exp)
    {
        return Math.pow(base, 1/exp);
    }
    
    /**
     * @param num numero para realizar la raiz
     */
    public void sqrtAlCubo(double num)
    {
        double sqrt = this.sqrt(num, 3);
        System.out.println("Raiz cubica de " + num + ": " + sqrt);
    }
}
