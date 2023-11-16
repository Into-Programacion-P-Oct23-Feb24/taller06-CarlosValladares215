/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double num1;
        double num2;
        double suma;
        double resta;
        double multiplicacion;
        double division;
        double res;

        System.out.println("Ingrese el primer numero");
        num1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo numero");
        num2 = entrada.nextDouble();

        System.out.println("Seleccione la operacion que se quiere realizar"
                + "\n 1. Suma"
                + "\n 2. Resta"
                + "\n 3. Multiplicacion"
                + "\n 4. Division");
        entrada.nextLine();
        String op = entrada.nextLine();

        if (num1 > num2) {
            switch (op) {
                case "1":
                    res = num1 + num2;
                    System.out.printf("El resultado de la suma es: %.2f", res);
                    System.out.println("");
                    break;
                case "2":
                    res = num1 - num2;
                    System.out.printf("El resultado de la resta es: %.2f",
                            res);
                    System.out.println("");
                    break;
                case "3":
                    res = num1 * num2;
                    System.out.printf("El resultado de la multiplicacion %.2f"
                            + "es: ", res);
                    System.out.println("");
                    break;
                case "4":
                    res = num1 / num2;
                    System.out.printf("El resultado de la division %.2f"
                            + " es: ", res);
                    System.out.println("");
                    break;
                default:
                    System.out.println("El numero que digito no esta en el rango "
                            + "de las opciones");
                    break;
            }
        } else {
            System.out.println("El primer numero ingresado "
                    + "es menor que el segundo numero");
        }
    }
}
