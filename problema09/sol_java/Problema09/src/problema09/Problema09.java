/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema09;

/**
 *
 * @author ronni
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String signo = "";
        String signo1 = "-";
        String signo2 = "+";
        String cadenaFinal = "";
        int numero1 = 12;
        int numero2 = 11;
        int limite = 48;
        int limite2 = 44;
        while ((numero2 <= limite2) || (numero1 <= limite)) {
            cadenaFinal = String.format("%s %s%d %s%d", cadenaFinal, signo2, numero1, signo1, numero2);
            numero1 = numero1 + 12;
            numero2 = numero2 + 11;
            if (numero1 % 12 == 0) {
                signo = signo2;
            } else {
                if ((numero2 == 11) || (numero2 % 11 == 0)) {
                    signo = signo1;

                }
            }

        }
        System.out.println(cadenaFinal);
    }
}
