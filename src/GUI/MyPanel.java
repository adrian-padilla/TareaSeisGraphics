/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 * Component Graphics'MyPanel'
 * @author adria
 */
public class MyPanel extends JPanel implements ActionListener {
    int n, m, lado;
    JButton jbtnAZoom = new JButton("  + Zoom");
    JButton jbtnBZoom = new JButton("  - Zoom");
    JInternalFrame jInternalFrame = new JInternalFrame("FPS");
    Frame fVentanaPrincipal = new Frame("Graphics");
    JPanel jpBotones = new JPanel();
    private int[][] matriz = {
        {6, 0, 1, 9},
        {1, 0, 2, 0},
        {0, 3, 4, 5},
        {7, 8, 9, 0}
    };
    
    public MyPanel() {
    
        
        
    } // Constructor default

    public MyPanel(int n, int m, int lado) {
        this.n = n;
        this.m = m;
        this.lado = lado;
        
    } // Constructor int n,m,lado
    
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        matrizG(n, m, lado, g);
        drop(g);
    
    } // Fin paintComponent
    
    private void drop(Graphics g) {
        
        
        
    } // Fin drop
    
    public static Color getColorG(int coordenada) {
        Color myColor = null;
        
        try {
            switch (coordenada) {
                
                case 0:
                    myColor = new Color(255, 255, 255);
                    
                break;
                case 1:
                    myColor = new Color(0, 102, 102);

                break;
                case 2:
                    myColor = new Color(51, 51, 51);

                break;
                case 3:
                    myColor = new Color(255, 0, 51);

                break;
                case 4:
                    myColor = new Color(204, 0, 102);

                break;
                case 5:
                    myColor = new Color(0, 102, 255);

                break;
                case 6:
                    myColor = new Color(51, 255, 0);

                break;
                case 7:
                    myColor = new Color(255, 255, 153);

                break;
                case 8:
                    myColor = new Color(102, 0, 102);

                break;
                case 9:
                    myColor = new Color(0, 204, 153);

                break;
                default :
                    System.err.println("Solo diez colores");

                break;
            
            } // Fin switch
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
            myColor = new Color(0, 204, 255);
        
        }
        
        return myColor;
    
    } // Fin getColorG
    
    public void matrizG(int n, int m, int lado, Graphics g) {
        
        int resta = 0;
        int banderaX = 1;
        int banderaY = 1;
        int contador = 0;
        int centinela = 0;
        int x = 0;
        int y = 0;
        String numero;

        do {
            do {            
                for (int i = x; i < ((lado * 4) + 4) * banderaX; i = i + lado) {
                    if (x != y) {

                        y = 0;

                    }
                        for (int j = y; j < ((lado * 4) + 4) * banderaY; j = j + lado) {
                            if (matriz[contador][centinela] != 0) {

                                g.setColor(getColorG(matriz[contador][centinela]));
                                numero = "  " + String.valueOf(matriz[contador][centinela]);
                                g.fillRect(i, j, lado, lado);
                                g.setColor(getColorG(0));
                                g.drawString(numero, i , j + lado - (lado / 4));

                            }

                            contador++ ;
                            j++;

                            if (contador > 3) {

                                contador = 0;

                            }

                            if ((lado * 4) + 4 <= x) {

                                y = j;

                            }
                        }

                        centinela++ ;
                        i++ ;

                        if (centinela > 3) {
                            centinela = 0;

                        }
                    } 

                    contador = 0;
                    centinela = 0;
                    n--;
                    resta++;
                    x = y;
                    banderaX++;

            } while (n != 0);
            
            contador = 0;
            centinela = 0;
            n = resta;
            resta = 0;
            m--;
            x = y;
            banderaY++;
            banderaX = 1;
        
        } while (m != 0);
    } // Fin matrizG

    public int getN() {
        return n;
        
    }

    public void setN(int n) {
        this.n = n;
        
    }

    public int getM() {
        return m;
        
    }

    public void setM(int m) {
        this.m = m;
        
    }

    public int getLado() {
        return lado;
        
    }

    public void setLado(int lado) {
        this.lado = lado;
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(jbtnAZoom)) {
            setLado(getLado()+ 2);
            this.updateUI();
            
        } else {
            if (ae.getSource().equals(jbtnBZoom)) {
                setLado(getLado()- 2);
                this.updateUI();
                
            }            
        }
    } // Fin actionPerformed
} // Fin MyPanel
