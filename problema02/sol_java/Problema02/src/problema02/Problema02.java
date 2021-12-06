/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author ronni
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero_trajes;
        double costo_traje;
        double subtotal = 0;
        double total = 0;
        double porcentaje_1 = 20;
        double porcentaje_2 = 25;
        double porcentaje_3 = 40;
        double porcentaje_4 = 50;
        double descuento = 0;


        System.out.println("Ingresar la cantidad de trajes a comprar");
        numero_trajes = entrada.nextInt();

        System.out.println("Ingresar el costo de los trajes a comprar");
        costo_traje = entrada.nextDouble();

        if (numero_trajes == 1) {
            subtotal = costo_traje * numero_trajes;
            descuento = (subtotal * porcentaje_1) / 100;
            total = subtotal - descuento;
        } else {
            if (numero_trajes == 2) {
                subtotal = costo_traje * numero_trajes;
                descuento = (subtotal * porcentaje_2) / 100;
                total = subtotal - descuento;
            } else {
                if (numero_trajes == 3) {
                    subtotal = costo_traje * numero_trajes;
                    descuento = (subtotal * porcentaje_3) / 100;
                    total = subtotal - descuento;
                } else {
                    if (numero_trajes > 3) {
                        subtotal = costo_traje * numero_trajes;
                        descuento = (subtotal * porcentaje_4) / 100;
                        total = subtotal - descuento;
                    }
                }
            }
        }
        System.out.printf("Subtotal: %.2f\n" + "Descuento aplicado: %.2f\n"
                + "El total a pagar por la compra del/los trajes es: %s\n",
                subtotal,
                descuento,
                total);
    }

}
