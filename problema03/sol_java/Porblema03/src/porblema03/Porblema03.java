/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package porblema03;

import java.util.Scanner;

/**
 *
 * @author ronni
 */
public class Porblema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int tipo_empleado;
        double horas_trabajadas;
        double cuota_hora;
        double pago_extra = 0;

        System.out.println("Ingresar nombre del empleado");
        nombre = entrada.nextLine();

        System.out.println("Ingresar el tipo de empleado"
                + "(Solo se admite un número: 1, 2, 3 o 4)");
        tipo_empleado = entrada.nextInt();

        // Solo se admite horas, por lo tanto será un valor entero
        System.out.println("Ingresar número de horas extras laboradas");
        horas_trabajadas = entrada.nextInt();

        if (tipo_empleado == 1) {
            cuota_hora = 1.5;
            pago_extra = horas_trabajadas * cuota_hora;
        } else {
            if (tipo_empleado == 2) {
                cuota_hora = 2;
                pago_extra = horas_trabajadas * cuota_hora;
            } else {
                if (tipo_empleado == 3) {
                    cuota_hora = 2.5;
                    pago_extra = horas_trabajadas * cuota_hora;
                } else {
                    if (tipo_empleado == 1) {
                        cuota_hora = 3;
                        pago_extra = horas_trabajadas * cuota_hora;
                    }
                }
            }
        }
        System.out.printf("El pago por las horas trabajadas es: %.2f\n"
                ,pago_extra);
 
    }

}
