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
import Mult_Div.Mult_y_Div;
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
        dis.Operar(2, -2, 5);
        System.out.println();
        
        //--Funcion valor absoluto
        System.out.println(ANSI_RED + "======= FUNCION VALOR ABSOLUTO =======");
        dis.valorAbsoluto(015.156);
        System.out.println();
        
        // potencia y raiz
        System.out.println(ANSI_RED + "======= FUNCION POTENCIA Y RAIZ =======");
        Potencia pow = new Potencia();
        Raiz sqrt = new Raiz();
        pow.powAlCubo(9);
        
        pow.powEntero(9, -0.3);
        pow.powEntero(5, -6);
        sqrt.sqrtAlCubo(-8.3);
         sqrt.sqrtAlCubo(5);
        sqrt.sqrtImg(-2);
        System.out.println();
        
         System.out.println(ANSI_RED + "======= FUNCION MULTIPLICACION Y DIVISION =======");
         Mult_y_Div op = new Mult_y_Div(8.25, 3.25);
         System.out.println();
    }

}
