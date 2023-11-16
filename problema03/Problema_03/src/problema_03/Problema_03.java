/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String tipoEmpleado;
        double sueldo;
        double porcentaje;
        double valorTotal;
        
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese que tipo de empleado es"
                + ", segun el numero"
                + "\n 1. Tipo empleado 1"
                + "\n 2. Tipo empleado 2"
                + "\n 3. Tipo empleado 3"
                + "\n 4. Tipo empleado 4"
                + "\n 5. Tipo empleado 5");
        tipoEmpleado = entrada.nextLine();
        System.out.println("Ingrese su sueldo");
        sueldo = entrada.nextDouble();
        
        switch (tipoEmpleado){
            case "1":
                porcentaje = (sueldo * 5)/100;
                valorTotal = sueldo + porcentaje;
                System.out.printf("Su sueldo ha incrementado en: %.2f \n"
                        + "Su nuevo sueldo es: %.2f \n", porcentaje
                        , valorTotal);
                break;
            case "2":
                porcentaje = (sueldo * 7)/100;
                valorTotal = sueldo + porcentaje;
                System.out.printf("Su sueldo ha incrementado en: $%.2f \n"
                        + "Su nuevo sueldo es: $%.2f \n", porcentaje
                        , valorTotal);
                break;
            case "3":
                porcentaje = (sueldo * 9)/100;
                valorTotal = sueldo + porcentaje;
                System.out.printf("Su sueldo ha incrementado en: $%.2f \n"
                        + "Su nuevo sueldo es: $%.2f \n", porcentaje
                        , valorTotal);
                break;
            case "4":
                porcentaje = (sueldo * 12)/100;
                valorTotal = sueldo + porcentaje;
                System.out.printf("Su sueldo ha incrementado en: $%.2f \n"
                        + "Su nuevo sueldo es: $%.2f \n", porcentaje
                        , valorTotal);
                break;
            case "5":
                porcentaje = (sueldo * 15)/100;
                valorTotal = sueldo + porcentaje;
                System.out.printf("Su sueldo ha incrementado en: $%.2f \n"
                        + "Su nuevo sueldo es: $%.2f \n", porcentaje
                        , valorTotal);
                break;
            default:
                System.out.println("Usted debe ingresar el tipo "
                        + "de empleado que es del 1 al 5");
        }
                
    }
    
}
