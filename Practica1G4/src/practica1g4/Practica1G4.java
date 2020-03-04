/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1g4;

import Fun_Discriminante.Ventana;
import NumeroPrimo.esPrimo;
import PotenciaRaiz.Potencia;
import PotenciaRaiz.Raiz;
import Fun_Discriminante.discriminante;
import static Fun_Discriminante.discriminante.ANSI_RED;
import Fun_Discriminante.plano;
import Mult_Div.Mult_y_Div;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author juanp
 */
public class Practica1G4 {

    //Importante, plano debe ser publico y estatico
    public static plano plano;

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
        dis.Operar(8, -30, 7);
        
        if (discriminante.activador == 1) {
            //Creando la ventana y el plano de dibujo
            Ventana frame = new Ventana();
            frame.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
            frame.setBounds(300, 300, 510, 600);
            frame.setLayout(new BorderLayout());
            plano = new plano();

            //Configuración del Boton
            JButton start = new JButton("Graficar");
            start.addActionListener(frame);
            start.setText("Graficar");

            //Bordes al panel
            frame.add(plano, BorderLayout.CENTER);
            frame.add(start, BorderLayout.SOUTH);

            frame.setVisible(true);
        }
        // si no existen soluciones reales el programa continua
        System.out.println();

        //--Funcion valor absoluto
        System.out.println(ANSI_RED + "======= FUNCION VALOR ABSOLUTO =======");
         dis.menuValorAbsoluto();

        // potencia y raiz
        System.out.println(ANSI_RED + "======= FUNCION POTENCIA Y RAIZ =======");
        Potencia pow = new Potencia();
        Raiz sqrt = new Raiz();
        pow.powAlCubo(9);
        pow.powEntero(9, -0.3);
        pow.powEntero(5, -6);
        pow.descomponerPotencia10(1025236);
        sqrt.sqrtAlCubo(-8.3);
        sqrt.sqrtAlCubo(5);
        sqrt.sqrtImg(-2);
        System.out.println();

        System.out.println(ANSI_RED + "======= FUNCION MULTIPLICACION Y DIVISION =======");
        Mult_y_Div op = new Mult_y_Div(45, 3);
        System.out.println(ANSI_RED + ">>>>>>>>>>>>\t\t\n\nFin Funciones, se puede cerrar las ventanas" + Raiz.ANSI_RESET);

    }

}
