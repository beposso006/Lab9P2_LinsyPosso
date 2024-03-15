/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_linsyposso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author 29164
 */
public class HiloCarga implements Runnable {

    private JProgressBar barra;
    private boolean vive;
    private JTextArea txt;
    File fichero = null;

    public HiloCarga(JProgressBar barra, JTextArea txt) {
        this.barra = barra;
        this.txt = txt;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showOpenDialog(null);
            while (true) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == 100) {
                    break;
                }
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
            }
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                txt.setText("");
                while ((linea = br.readLine()) != null) {
                    txt.append(linea);
                    txt.append("\n");
                }
            } //fin if

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (IOException ex) {
        }
            
       
            
        
    }
    
    public File getFichero (){
        return fichero;
    }
}

