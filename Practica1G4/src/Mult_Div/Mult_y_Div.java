/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mult_Div;

import java.text.DecimalFormat;

/**
 *
 * @author hernandez
 */
public class Mult_y_Div {

    public Mult_y_Div() {
    }

    public Mult_y_Div(double numero1, double numero2) {

        multiplicacion(numero1, numero2);
        divicion(numero1, numero2);

    }

    private void multiplicacion(double numero1, double numero2) {
        double resultado = numero1 * numero2;

        System.out.println("La multiplicacion de " + numero1 + "*" + numero2 + " es " + resultado);
        lista="";
        primos_divisibles_extactos(resultado, 1);
        if (lista=="") {
            lista="No tiene";
        }
        System.out.println(" Sus numeros divisibles exactos son "+ lista);
        if (numero1 == 0 || numero2 == 0) {     //funcion extra: 201503911
            System.out.println(" -> toda multiplicacion con el numero 0 dara como resultado 0.");
        }
    }

    public double multiplicacion1(double numero1, double numero2) {
        double resultado = (numero1 * numero2);
        DecimalFormat df = new DecimalFormat("#.0000");

        System.out.print("La multiplicacion de " + numero1 + "*" + numero2 + " es " + df.format(resultado));

        if (numero1 == 0 || numero2 == 0) {     //funcion extra: 201503911
            System.out.println(" -> toda multiplicacion con el numero 0 dara como resultado 0.");
        }

        return resultado;
    }

    private void divicion(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        if (numero1 != 0) {
            if (numero2 == 0) {
                System.out.println("No es posible dividir " + numero1 + "/" + numero2 + " forma indefinida ");
            } else {
                System.out.println();
                System.out.println("La Division de " + numero1 + "/" + numero2 + " es " + resultado);
            }
        } else {      //201503911
            System.out.println();
            System.out.println("Division: Si el divisor es 0 es resultado siempre dara 0.");
        }
    }

    String lista;

    public String primos_divisibles_extactos(double numero, int contador) {
        if (contador>numero) {
            return lista;
        }
        double temp = numero / contador;
        System.out.println(" ---   " +temp%2);
        if (temp % 2 == 1) {

            lista += contador;
            contador = contador + 2;
            return primos_divisibles_extactos(numero, contador);
        } else {
            contador = contador + 2;
            return primos_divisibles_extactos(numero, contador);

        }

    }

}
