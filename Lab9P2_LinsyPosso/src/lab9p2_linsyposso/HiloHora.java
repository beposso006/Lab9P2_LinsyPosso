/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_linsyposso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author 29164
 */
public class HiloHora implements Runnable {

    private JLabel hora;

    public HiloHora(JLabel hora) {
        this.hora = hora;
    }


    public void run() {
        while (true) {
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("hh:mm:ss");
            hora.setText(f.format(h));
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {

            }
        }
    }
}
