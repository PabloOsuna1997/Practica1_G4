/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mult_Div;

/**
 *
 * @author hernandez
 */
public class Mult_y_Div {
    
    public Mult_y_Div(double numero1,double numero2){
     
        multiplicacion(numero1,numero2);
        divicion(numero1,numero2);
    
    }

    private void multiplicacion(double numero1, double numero2) {
       double resultado = numero1 * numero2;
       
        System.out.println("La multiplicacion de "+ numero1+"*"+numero2 +" es "+ resultado);
    }

    private void divicion(double numero1, double numero2) {
         double resultado = numero1 / numero2;
       
        System.out.println("La Division de "+ numero1+"/"+numero2 +" es "+ resultado);
    }
}
