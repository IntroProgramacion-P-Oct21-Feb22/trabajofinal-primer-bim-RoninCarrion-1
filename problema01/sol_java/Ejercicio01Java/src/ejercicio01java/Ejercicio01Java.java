/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01java;

import java.util.Scanner;

/**
 *
 * @author ronni
 */
public class Ejercicio01Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int A;
        int B;
        int C;
        String a = "Triángulo Rectángulo";
        String b = "Triángulo Obtusángulo";
        String c = "Triángulo Acutángulo";
        String triangulo;

        System.out.println("Ingresar el valor del primer Ángulo");
        A = entrada.nextInt();

        System.out.println("Ingresar el valor del segundo Ángulo");
        B = entrada.nextInt();

        System.out.println("Ingresar el valor del tercer Ángulo");
        C = entrada.nextInt();

        if ((A == 90) || (B == 90) || (C == 90)) {
            triangulo = a;
        } else {
            if (((A > 90) && (A < 180)) || ((B > 90) && (B < 180))
                    || ((C > 90) && (C < 180))) {
                triangulo = b;
            } else {
                triangulo = c;
            }
        }
        System.out.printf("Los datos ingresados pertenecen a un:\n%s\n"
                , triangulo);
    }

}
