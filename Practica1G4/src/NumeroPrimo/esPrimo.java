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

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public esPrimo(int numero) {
        if (esPrimo(numero)) {
            System.out.print(ANSI_BLUE + "El numero: " + numero + " es un numero primo " + ANSI_RESET);

        } else {
            System.out.print(ANSI_BLUE + "El numero: " + numero + " es un numero compuesto " + ANSI_RESET);
        }

        if (numero % 2 == 0) {              //verifica si el numero es para o impar - 201503911
            System.out.println(ANSI_BLUE + "y es par." + ANSI_RESET);
        } else {
            System.out.println(ANSI_BLUE + "y es impar." + ANSI_RESET);
        }

        // Crea un rango del numero dado, con los numero primos - 201213283
        if (numero >= 0) {
            System.out.print(ANSI_GREEN + "\tLos numeros primos del rango de 1 a " + numero + " son: " + ANSI_RESET);
            if (numero == 1) {
                System.out.print(ANSI_YELLOW + "Primo Unico " + ANSI_RESET);
            } else {
                System.out.print(ANSI_YELLOW + "1, " + ANSI_RESET);
                for (int i = 2; i <= numero; i++) {
                    if (esPrimo(i)) {
                        System.out.print(ANSI_YELLOW + i + ", " + ANSI_RESET);
                    }
                }
            }

            System.out.println("");
        } else{
            System.out.println(ANSI_YELLOW + "\tPor definicion, los numeros negativos no tiene numeros primos" + ANSI_RESET);
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
