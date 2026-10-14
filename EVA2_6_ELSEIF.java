/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_elseif;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_6_ELSEIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
         Scanner captu = new Scanner(System.in);
        System.out.println("Número del dia de la semana: [1 - 7 ]");
                
         dia = captu.nextInt();
               
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Lunes");
            case 3 -> System.out.println("Martes");
            case 4 -> System.out.println("Miercoles");
            case 5 -> System.out.println("Jueves");
            case 6 -> System.out.println("Viernes");
            case 7 -> System.out.println("Sabado");
            default -> {
            }
        }
               
    }
    
}
