/*
 * EJERCICIO 02: Programa java que realice lo siguiente:
 *  declarar dos variables X e Y de tipo int,
 *  dos variables N y M de tipo double y
 *  asigna a cada una un valor. A continuación realiza y muestra por pantalla
 *  una serie de operaciones entre ellas. 
 */
package cac.java.tdp;

/**
 *
 * @author Rhaynel Parra Aguiar <mail@rhynl.io>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int X;
        X=2;        
        int Y;
        Y=3;                
        double N;
        N=4.2;        
        double M;
        M=5.3;
        
        int B;        
        double G;
               
        
        B = Y+X;        
        System.out.println("El resutaldo X+Y es: "+B);
        
        G = B*M;        
        System.out.println("El resultado de B*M es: "+G);
        
        
        
    }
    
}
