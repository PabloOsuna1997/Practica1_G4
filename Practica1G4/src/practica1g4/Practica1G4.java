/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1g4;

import fDiscriminante.fdiscriminante;
import NumeroPrimo.esPrimo;
import PotenciaRaiz.Potencia;
import PotenciaRaiz.Raiz;

/**
 *
 * @author juanp
 */
public class Practica1G4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 11;
        esPrimo numeroPrimo = new esPrimo(numero);
        
        // potencia y raiz
        Potencia pow = new Potencia();
        Raiz sqrt = new Raiz();
        
        pow.powAlCubo(numero);
        sqrt.sqrtAlCubo(numero);
    }

}
