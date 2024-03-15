/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_linsyposso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author 29164
 */
public class HilodeFecha implements Runnable{
    JLabel jl_fecha;

    public HilodeFecha(JLabel jl_fecha) {
        this.jl_fecha = jl_fecha;
    }
    
    
    
    
    public void run() {
         while (true) {
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            jl_fecha.setText(f.format(h));
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {

            }
        }
    }
    }
    

