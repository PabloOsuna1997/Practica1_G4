/*
 *  Proyecto de Mario Morales
 *  mmario_93@hotmail.es
 *  USAC
 */
package Fun_Discriminante;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import practica1g4.Practica1G4;
import java.awt.event.ActionListener;

/**
 *
 * @author Mario Morales
 */
public class Ventana extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        discriminante d = new discriminante();
        Practica1G4.plano.paintSQRFunc(Practica1G4.plano.getGraphics(), d.a_1, d.b_2, d.c_3, -200, 200);
    }
}
