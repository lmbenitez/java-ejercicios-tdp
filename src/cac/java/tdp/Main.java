/*
 * Ejercicio 13: Programa que pase una velocidad en Km/h a m/s.
 * La velocidad se lee por teclado.
 */
package cac.java.tdp;

import javax.swing.JOptionPane;


/**
 *
 * @author Rhaynel Parra Aguiar <mail@rhynl.io>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String km = JOptionPane.showInputDialog("Instroduzca los Km/h");
        
        int kmH = Integer.parseInt(km);
        
        double mS;
        
        mS=(double)kmH/3.6;
        
        JOptionPane.showMessageDialog(null,"El resultado en m/s es: "+ mS);
        
    }
    
}
