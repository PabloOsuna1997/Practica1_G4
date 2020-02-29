/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumeroPrimo;

/**
 *
 * @author juanp
 */
public class esPrimo {

    public esPrimo(int numero) {
        if (esPrimo(numero)) {
            System.out.println("El numero: " + numero + " es un numero primo.");
            return;
        } else {
            System.out.println("El numero: " + numero + " No es un numero primo.");
        }

    }

    public static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) {   //modulo si es 0 es porque si se puede dividir por un numero mayor a 0 lo cual quita la posibilidad que sea primo
                primo = false;
            }
            contador++;
        }
        return primo;
    }
}
