/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_multihilos;

import View.PantallaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Jimmy
 */
public class JugadorUno extends Thread {

    private int time;
    public static int JugCarta1;

    public JugadorUno(int milisegundos) {
        this.time = milisegundos;
    }
   
    public void run() {
        while (true) {
            int num = (int) (Math.random() * (13) + 1);
            String ruta = "src\\Cartas\\" + num + ".png";
            System.out.println("Son los numeros de 1 :" + num);
            ImageIcon newImage = new ImageIcon(ruta);
            View.PantallaPrincipal.lblCartaJudadorUno1.setIcon(newImage);
            JugCarta1 = num;
            try {
                Thread.sleep(this.time);
            } catch (InterruptedException ex) {
                Logger.getLogger(JugadorUno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
  

}
