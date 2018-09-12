/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * MDI JFrame.VentanaPrincipal
 * @author adria
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    JMenu jmArchivo;
    JMenu jmUsuario;
    JMenu jmAyuda;
    JMenu jmAmortiguador;
    JMenuItem jmiAbrir;
    JMenuItem jmiCerrar;
    JMenuItem jmiPreferencias;
    JMenuItem jmiSalir;
    JMenuItem jmiRegistrarse;
    JMenuItem jmiDialogo;
    JCheckBoxMenuItem jmiNotificasion;
    JMenuItem jmiUpptD;
    JFileChooser jfcEjemplo;
    JTabbedPane jtpPixel;
    JDesktopPane jdpPrincipal;
    MyPanel myPanel = new MyPanel();
    JPanel jpIzquierdo;
    
    
    VentanaPreferencias vpConfiguracion;
    
    public VentanaPrincipal() {
        
        super("Ejemplo de Graphics");
        JMenuBar jmb = new JMenuBar();
        this.setJMenuBar(jmb);
        this.setSize(new Dimension(800, 600));
        this.setLayout(null);
        this.init();
        this.pack();
        
    } // Fin constructor
    
    public void init() {
        this.myPanel.setN(1);
        this.myPanel.setM(1);
        this.myPanel.setLado(30);
        this.jmiPreferencias = new JMenuItem("Ajustes");
        this.vpConfiguracion = new VentanaPreferencias();
        this.jpIzquierdo = new JPanel();
        this.jfcEjemplo = new JFileChooser("PixelArt.doc");
        this.jdpPrincipal = new JDesktopPane();
        
        jmiPreferencias.addActionListener(this);
        
        
        String s =  "do80".trim();
        System.err.println(s);
        
        
        
        
        
        this.jtpPixel = new JTabbedPane();
        this.jmArchivo = new JMenu("Archivo");
        this.jmUsuario = new JMenu("Usuario");
        this.jmAyuda = new JMenu("Compromiso");
        this.jmAmortiguador = new JMenu("Alertas");
        
        this.jmiAbrir = new JMenuItem("Abrir");
        this.jmiCerrar = new JMenuItem("Vaciar");
        
        this.jmiSalir = new JMenuItem("Bloquear");
        this.jmiRegistrarse = new JMenuItem("Cuentas login");
        this.jmiDialogo = new JMenuItem("Indicasiones");
        this.jmiNotificasion = new JCheckBoxMenuItem("Datos del usuario");
        this.jmiUpptD = new JMenuItem("Valorar esta app");
        
        this.jmArchivo.add(this.jmiAbrir);
        this.jmArchivo.add(this.jmiCerrar);
        this.jmUsuario.add(this.jmiPreferencias);
        this.jmUsuario.add(this.jmiSalir);
        this.jmAyuda.add(this.jmiRegistrarse);
        this.jmAyuda.add(this.jmiDialogo);
        this.jmAmortiguador.add(this.jmiNotificasion);
        this.jmAmortiguador.add(this.jmiUpptD);
        
        this.getJMenuBar().add(jmArchivo);
        this.getJMenuBar().add(jmUsuario);
        this.getJMenuBar().add(jmAyuda);
        this.getJMenuBar().add(jmAmortiguador);
        
        
        this.setContentPane(this.jdpPrincipal);
        
        this.jdpPrincipal.setBackground(Color.PINK);
        
        this.jdpPrincipal.add(this.jtpPixel);
        jdpPrincipal.setBackground(Color.yellow);
        this.jtpPixel.add(this.myPanel);
        
        this.jtpPixel.setBounds(120, 0, 800, 600);
        
        
        
        this.myPanel.jbtnAZoom.addActionListener(myPanel);
        this.myPanel.jbtnAZoom.addActionListener(this);
        this.myPanel.jbtnBZoom.addActionListener(myPanel);
        this.myPanel.jbtnBZoom.addActionListener(this);
        this.jmiAbrir.addActionListener(this);
        this.jpIzquierdo.setBounds(0, 0, 100, 200);
        this.jdpPrincipal.add(this.jpIzquierdo);
        this.jpIzquierdo.add(this.myPanel.jbtnAZoom);
        this.jpIzquierdo.add(this.myPanel.jbtnBZoom);
        
        
//        this.vpConfiguracion.add(this.myPanel.jbtnAZoom);
//        this.vpConfiguracion.add(this.myPanel.jbtnBZoom);
        
        this.myPanel.jbtnAZoom.setSize(50, 30);
        this.myPanel.jbtnAZoom.setAlignmentX(0);
        this.myPanel.jbtnAZoom.setAlignmentY(0);
        this.myPanel.jbtnBZoom.setSize(50, 30);
        this.myPanel.jbtnBZoom.setAlignmentX(0);
        this.myPanel.jbtnBZoom.setAlignmentY(31);
        
        
        // This.addActionListener

        
    } // Fin init

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(myPanel.jbtnAZoom)) {
            
        } else {
            if (ae.getSource().equals(myPanel.jbtnBZoom)) {
                
                
            }
        }
        if (ae.getSource().equals(jmiAbrir)) {
            this.jfcEjemplo.setFileSelectionMode(JFileChooser.FILES_ONLY);
            this.jtpPixel.add(this.jfcEjemplo);
            
        } else {
            if (ae.getSource().equals(jmiPreferencias)) {
                if (!vpConfiguracion.isShowing()) {
                    jdpPrincipal.add(vpConfiguracion);
                    vpConfiguracion.setVisible(true);
                    vpConfiguracion.jbtnAplicar.addActionListener(this);
                    
                }

            } else {
                if (ae.getSource().equals(vpConfiguracion.jbtnAplicar)) {
                    this.myPanel.setN(Integer.parseInt(vpConfiguracion.
                            jtfEjeN.getText()));
                    this.myPanel.setM(Integer.parseInt(vpConfiguracion.
                            jtfEjeM.getText()));
                    this.myPanel.setLado(Integer.parseInt(vpConfiguracion.
                            jtfLadoCuadro.getText()));
                    vpConfiguracion.doDefaultCloseAction();
                    
                }
            }
        }
    } // Fin de actionPerformed
} // Fin VentanaPrincipal
