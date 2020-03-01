/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1g4;

import NumeroPrimo.esPrimo;
import PotenciaRaiz.Potencia;
import PotenciaRaiz.Raiz;
import Fun_Discriminante.discriminante;
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

        // Funcion #2 Discriminante
        discriminante dis = new discriminante();
        dis.Operar(1, -1, -12);
        // potencia y raiz
        Potencia pow = new Potencia();
        Raiz sqrt = new Raiz();

        pow.powAlCubo(numero);
        sqrt.sqrtAlCubo(numero);
    }

}
