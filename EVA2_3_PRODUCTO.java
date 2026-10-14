/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_producto;

import java.util.Scanner;



/**
 *
 * @author bisonte
 */
public class EVA2_3_PRODUCTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double descuento , subtotal, precio = 0, total = 0;
     
       
      int cantidad;
     
    Scanner captu= new Scanner (System.in);
      
    System.out.println("precio de los productos?");
    precio = captu.nextDouble();
        
     System.out.println("cantidad de los productos? ");
      subtotal = captu.nextDouble();
      
      cantidad = (int) captu.nextDouble();
      subtotal = precio * cantidad;
      
     if(subtotal >= 1000 ){
         descuento = subtotal * 0.1;
         
       total = subtotal - descuento;          
      System.out.println("subtotoal =" + subtotal );
      System.out.println("Descuento =" + descuento);
      System.out.println("total =" + total);
      
      
      
    
      
         
          
        
           
           
           
           
           
     }
     
     
     
        
        
        
     
        
        
        
        
        
        
    }
    
}
