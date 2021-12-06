/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema08;

import java.util.Scanner;

/**
 *
 * @author ronni
 */
public class Problema08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double yardas;
        double pulgadas ;
        double pies;
        String cadena_1;
        String cadena_2 = " ";
        String cadena_final = " ";
        int base = 1;
        int limite;
        System.out.println("Ingresar una medida en metros: ");
        limite = entrada.nextInt();
        while (base < limite) {
  
            if (limite < 0) {
                System.out.println("Solamente se permite valores "
                        + "positivos y números");
            } else {
                yardas = (base * 1) / 0.9144;
                
                pulgadas = (base * 39.3701) / 1 ;
                
                pies = (base * 3.28084) / 1;
                
                cadena_1 = String.format("| Metros | Yardas | Pulgadas | Pies  |");
                base = base + 1;
                cadena_2 = String.format("%s\n|   %d    |  %.2f  |  %.2f   |  %.2f |"
                        , cadena_2
                        , base
                        , yardas
                        , pulgadas
                        , pies);
                cadena_final = String.format("%s%s", cadena_1, cadena_2);
            }
        }
    System.out.println(cadena_final); 
    }
    
}
