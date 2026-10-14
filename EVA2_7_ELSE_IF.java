/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_else_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_7_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int temp;
        Scanner captu = new Scanner (System.in);
        System.out.println("Cual es la tempreatura??");
        temp = captu.nextInt();
        if (temp >= 35)
        System.out.println("Muy calido!!");
        else if (temp >= 20)
            System.out.println("agradable!!");
        else if (temp >= 10 )
            System.out.println("Fresco!!");
        
        else 
            System.out.println("Congelate!!");
            
        
    }
    
}
