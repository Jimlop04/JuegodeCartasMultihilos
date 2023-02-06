/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_multihilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Jimmy
 */
public class MaquinaDos extends Thread {

    private int time;
    public static int MaqCarta2;

    public MaquinaDos(int milisegundos) {
        this.time = milisegundos;
    }

    public void run() {
        while (true) {
            int num = (int) (Math.random() * (13) + 1);
            String ruta = "src\\Cartas\\" + num + ".png";
            ImageIcon newImage = new ImageIcon(ruta);
            View.PantallaPrincipal.lblCartaMaquinaDos.setIcon(newImage);
            MaqCarta2 = num;
            try {
                Thread.sleep(this.time);
            } catch (InterruptedException ex) {
                Logger.getLogger(JugadorUno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
