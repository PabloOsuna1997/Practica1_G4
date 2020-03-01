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
import static Fun_Discriminante.discriminante.ANSI_RED;
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
        System.out.println(ANSI_RED + "======= FUNCION PRIMO =======");
        int numero = 11;
        esPrimo numeroPrimo = new esPrimo(numero);
        System.out.println();

        // Funcion #2 Discriminante
        System.out.println(ANSI_RED + "======= FUNCION DISCRIMINANTE =======");
        discriminante dis = new discriminante();
        dis.Operar(1, -1, -12);
        System.out.println();
        
        // potencia y raiz
        System.out.println(ANSI_RED + "======= FUNCION POTENCIA Y RAIZ =======");
        Potencia pow = new Potencia();
        Raiz sqrt = new Raiz();
        pow.powAlCubo(numero);
        sqrt.sqrtAlCubo(numero);
        System.out.println();
        
    }

}
