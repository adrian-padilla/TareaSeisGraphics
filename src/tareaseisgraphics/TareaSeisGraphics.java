/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaseisgraphics;


import GUI.MyPanel;
import GUI.VentanaPrincipal;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author adria
 */
public class TareaSeisGraphics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(new Dimension(800, 600));
        ventanaPrincipal.setVisible(true);
    
    }
}
