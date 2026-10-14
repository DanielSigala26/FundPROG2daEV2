/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_10_calificaciones;

/**
 *
 * @author bisonte
 */
public class EVA_2_10_CALIFICACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  CUAL ES TU CALIFICACION?????¡?'
    
     int Cal;
        Scanner captu = new Scanner(System.in);
        System.out.println("DIME TU PROMEDIO DE ESTUDIANTE");
        
        Cal = captu.nextInt();
        if (Cal < 0){
            System.out.println("Opcion Incorrecta");
            
        }else if (Cal == 70){
            System.out.println("Insuficiente: " + Cal);
            
        }else if (Cal == 80){
            System.out.println("Aceptable: " + Cal);
            
        }else if (Cal >= 90){
            
            System.out.println("Sobresaliente:" + Cal);
            
        }else if (Cal <= 100){
            System.out.println("Opcion Incorrecta");
        }else{
            System.out.println("Opcion Incorrecta");
        }
        
    }
    
}

