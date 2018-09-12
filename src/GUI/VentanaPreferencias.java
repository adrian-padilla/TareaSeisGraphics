/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Configuración de GraphicsMyPanel
 * @author adria
 */
public class VentanaPreferencias extends JInternalFrame {
    protected JTextField jtfLadoCuadro;
    public JLabel jlLadoCuadrado;
    protected JTextField jtfEjeN;
    public JLabel jlEjeN;
    protected JTextField jtfEjeM;
    public JLabel jlEjeM;
    protected JTextField jtfMatriz;
    public JLabel jlMatriz;
    protected JButton jbtnAplicar;
    
    public VentanaPreferencias() {
        this.setSize(new Dimension(395, 250));
        this.setLayout(null);
        this.setClosable(true);
        this.init();
        
    } // Constructor default
    
    public void init() {
       this.jtfLadoCuadro =new JTextField("20");
       this.jlLadoCuadrado = new JLabel("Lado de imagen");
       this.jtfEjeN =new JTextField("1");
       this.jlEjeN = new JLabel("Lado de imagen");
       this.jtfEjeM =new JTextField("1");
       this.jlEjeM = new JLabel("Lado de imagen");
       this.jtfMatriz = new JTextField("0000102003457890");
       this.jlMatriz = new JLabel("Ingresar 16 numeros del 0 al 9");
       this.jbtnAplicar = new JButton("Aplicar cambios");
       
       this.add(jtfLadoCuadro);
       this.add(jlLadoCuadrado);
       this.add(jtfEjeN);
       this.add(jlEjeN);
       this.add(jtfEjeM);
       this.add(jlEjeM);
       this.add(jtfMatriz);
       this.add(jlMatriz);
       this.add(jbtnAplicar);
       
       this.jtfLadoCuadro.setBounds(211, 20, 100, 30);
       this.jlLadoCuadrado.setBounds(20, 20, 200, 30);
       this.jtfEjeN.setBounds(211, 60, 100, 30);
       this.jlEjeN.setBounds(20, 60, 200, 30);
       this.jtfEjeM.setBounds(211, 100, 100, 30);
       this.jlEjeM.setBounds(20, 100, 300, 30);
       this.jtfMatriz.setBounds(211, 140, 150, 30);
       this.jlMatriz.setBounds(20, 140, 200, 30);
       this.jbtnAplicar.setBounds(150, 180, 210, 30);
        
    } // Fin init
} // Fin VentanaPreferencias
