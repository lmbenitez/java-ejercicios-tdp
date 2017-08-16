/*
 * Ejercicio 12: Programa que
 * Lee por teclado el valor del radio de una circunferencia y calcula y muestra
 * por pantalla la longitud y el área de la circunferencia. Longitud de la
 * circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2  
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
        
        String ra = JOptionPane.showInputDialog("Instroduzca el radio en milimetros");
        
        int  radio = Integer.parseInt(ra);
        
        double longitud;
        
        double area;
        
        double PI = 3.1416;
        
        longitud=(double)2*PI*radio;
        
        area = (double)(PI*radio)*(PI*radio);
        
        JOptionPane.showMessageDialog(null,"La longitud de la circunferencia en milimetro es: "+ longitud
        +"\n El area de la circunferencia en milimetros es: "+area);
        
    }
    
}
