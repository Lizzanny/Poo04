/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.util.Scanner;

/**
 *
 * @author LizzW
 *
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Perímetro =
 * (base + altura) * 2.
 */
public class Rectangulo {
     private Scanner sc = new Scanner(System.in);
     private int base;
     private int altura;

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
     
     public void crearRectangulo(){
         System.out.println("Ingrese la base:");
         this.setBase(sc.nextInt());
         
         System.out.println("Ingrese la altura:");
         this.setAltura(sc.nextInt());
     }
     
     public int perimetro(){
         return this.base + this.altura * 2;
     }
     
     public double superficie(){
         return ((double)this.base * (double)this.altura) / perimetro();
     }
     
     public void pintar(){
         for (int i = 0; i < this.altura; i++) {
             for (int j = 0; j < this.base; j++) {
                 System.out.print(" * ");
             }
             System.out.println("");
         }
     }
}
