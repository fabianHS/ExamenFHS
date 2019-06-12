/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ets.examen;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
/**
 *
 * @author Fabian
 */
public class EtsExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Todo en una sola clase
        /* Resultados calculadoos
        Cálculo del Área Cuadrado
        Cálculo del¨Área rectangulo
        Cálculo del áreacirculo
        Cálculo del Área del Triangulo
        */
        
        AreaDeUnCuadrado();
        
        
        AreaDeUnRectangulo();
        
        AreaDeUnCirculo();
        
        AreaDeUnTrinangulo();
        
    }

    public static void AreaDeUnTrinangulo() throws NumberFormatException, HeadlessException {
        int baseTriangulo=0;
        int alturaTriangulo=0;
        baseTriangulo = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero","Base del Triangulo",JOptionPane.WARNING_MESSAGE));
        alturaTriangulo = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero","Altura del Triangulo",JOptionPane.WARNING_MESSAGE));
        int areaTriangulo=((baseTriangulo*alturaTriangulo)/2);
        System.out.println(areaTriangulo);
    }

    public static void AreaDeUnCirculo() throws NumberFormatException, HeadlessException {
        int radioCirculo=0;
        double Pi=3.14;
        radioCirculo = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero","Radio Circulo",JOptionPane.WARNING_MESSAGE));
        double areaCirculo=(Pi * Math.pow(radioCirculo,2));
        System.out.println(areaCirculo);
    }

    public static void AreaDeUnRectangulo() throws HeadlessException, NumberFormatException {
        double baseRectangulo=0;
        int alturaRectangulo=0;
        baseRectangulo =Double.parseDouble(JOptionPane.showInputDialog(null,"Escribe un numero","Base del Rectangulo",JOptionPane.WARNING_MESSAGE));
        alturaRectangulo= Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero","Altura del Rectangulo",JOptionPane.WARNING_MESSAGE));
        double areaRectangulo=alturaRectangulo*baseRectangulo;
        System.out.println(areaRectangulo);
    }

    public static void AreaDeUnCuadrado() throws HeadlessException, NumberFormatException {
        
        
        int alturaCuadrado=0;
        double baseCuadrado=0;
        alturaCuadrado = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero","Altura del Cuadrado",JOptionPane.WARNING_MESSAGE));
        double areaCuadrado=Math.pow(alturaCuadrado,2);
        System.out.println(areaCuadrado);
    }
    
}
