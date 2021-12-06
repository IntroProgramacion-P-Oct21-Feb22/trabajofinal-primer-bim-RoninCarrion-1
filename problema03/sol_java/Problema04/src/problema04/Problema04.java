/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ronni
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int n1;
        int n2;
        int n3;

        System.out.println("Ingrese el primer número");
        n1 = entrada.nextInt();

        System.out.println("Ingrese el segundo número");
        n2 = entrada.nextInt();

        System.out.println("Ingrese el tercer número");
        n3 = entrada.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println("Error, los números ingresados son iguales");

        } else if (n1 > n2 && n1 > n3) {
            System.out.println("El número mayor es:" + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("El número mayor es:" + n2);
        } else {
            System.out.println("El número mayor es:" + n3);
        }
    }

}
