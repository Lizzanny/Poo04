/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo04;

import Operaciones.Rectangulo;

/**
 *
 * @author LizzW
 */
public class GuiaPoo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();
        rect.crearRectangulo();
        System.out.println("La superficie es:"+rect.superficie());
        System.out.println("El perimetro es:"+rect.perimetro());
        rect.pintar();
    }
    
}
