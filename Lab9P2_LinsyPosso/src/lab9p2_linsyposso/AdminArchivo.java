/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_linsyposso;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author 29164
 */
public class AdminArchivo {

    private File archivo = null;

    public AdminArchivo(File archivo) {
        this.archivo = archivo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void escribirArchivo(String texto) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (archivo.exists()) {
            try {
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                bw.write(texto);
                bw.flush();
            } catch (Exception ex) {
            }
            bw.close();
            fw.close();
        }else{
            System.out.println("No existe");
        }
    }

    public void cargarArchivo() {
        Scanner leer = null;
        if (archivo.exists()) {
            try {
                leer = new Scanner(archivo);
                leer.useDelimiter(";");
                while (leer.hasNext()) {
                }
            } catch (Exception ex) {
            }
            leer.close();
        }
    }
}
