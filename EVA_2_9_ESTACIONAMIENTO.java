/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA_2_9_ESTACIONAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //SOLICITA EL NUMNERO DE HORAS DE ESTACIONAMIENTO Y CALCULA EL COSTO:
        
        int Horas;
        double Costo=0;
        Scanner Captu = new Scanner(System.in);
        
               
        System.out.println ("CUANTO TIEMPO PIENSAS ESTAR?");
          Horas = Captu.nextDouble();
          
          if{Horas <= 2) {
          Costo = Horas * 25;
          }else if(Horas<=5){
          Costo = Horas * 20;
          }else if (Horas<= 10){
          Costo = Horas* 15;
          }else{
          Costo = Horas* 150;
          }
               
    
          
     
            
              
            
    
            
       
        
       
        
        
        
       
       
       
       
      
       
        
        
        
        
    }
    
}
