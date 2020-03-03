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
         DecimalFormat df = new DecimalFormat("#.0000");
        if(num != 0){                                       //si el numero es 0 siempre dara como resultado el cero. - 201503911
            double sqrt = this.sqrt(num, 3);
            System.out.println("Raiz cubica de " + num + ": " + df.format(sqrt));
        }else{
            System.out.println("Cualquiera Raiz aplicada al numero 0  siempre da como resultado 0");
        }
        
    }
}
