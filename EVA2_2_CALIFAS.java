/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_califas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_2_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calif;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cual es tu calificacion?");
        calif = captu.nextInt();
        if (calif >= 70){
            System.out.println("Pasaste la materiaa!!!");
        }else{
            System.out.println("NO ACREDITO");
            }
        }
    }