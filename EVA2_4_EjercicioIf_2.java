/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ejercicioif_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_4_EjercicioIf_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
        // VARIABLES
        String nombre;  
        double sal, bono=0, salfin; 
     
        
        //PEDIR LAS VARIABLES
        System.out.print("Ingrese su nombre:");
        nombre = captu.nextLine();
        
        System.out.println("Ingrese su salario mensual:");
        sal = captu.nextDouble();
        
        if(sal< 12000) {
            bono = sal*.1; // se saca lo que es el bono
            salfin =bono+sal;//aqui se le resta y se asigan a la variable pred(el precio con descuento)
            System.out.print("Su salario se le a añadio un bono que le deja un salario de:");
            System.out.println(salfin);
            
        }
        else{
            bono = sal*.5;
            salfin = bono + sal;
            
            System.out.print("Nombre:");
            System.out.println(nombre);
            
            System.out.print("Su salario sin bono es:");
            System.out.println(sal);
            
            System.out.print("Su bono es:");
            System.out.println(bono);
            
            System.out.print("Su salario final es de:");
            System.out.println(salfin);
           
        }
    
    }
    
}
