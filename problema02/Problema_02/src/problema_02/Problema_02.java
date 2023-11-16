/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String tipo;
        String tipo2;
        int valor;
        double porcentaje;
        double costo_peaje;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Elija el numero de acuerdo a su tipo de vehiculo"
                + "\n tipo 1: vehículo liviano particular"
                + "\n tipo 2: vehículo grande particular"
                + "\n tipo 3: taxi"
                + "\n tipo 4: bus urbano");
        tipo = entrada.nextLine();
        System.out.println("Ingrese el valor de su vehiculo");
        valor = entrada.nextInt();

        switch (tipo) {
            case "1":
                porcentaje = valor * 0.01;
                costo_peaje = porcentaje + 2;
                tipo2 = "vehículo liviano particular";
                System.out.printf("Peaje \"Buena vía\" Propietario: %s"
                + " Tipo: %s Valor: $%d Peaje: $%.2f",nombre, tipo2
                        ,valor,costo_peaje);
                break;
            case "2":
                porcentaje = valor * 0.02;
                costo_peaje = porcentaje + 2.5;
                tipo2 = "vehículo grande particular";
                System.out.printf("Peaje \"Buena vía\" Propietario: %s"
                + " Tipo: %s Valor: $%d Peaje: $%.2f",nombre, tipo2,
                valor,costo_peaje);
                break;
            case "3":
                porcentaje = valor * 0.04;
                costo_peaje = porcentaje + 1.5;
                tipo2 = "taxi";
                System.out.printf("Peaje \"Buena vía\" Propietario: %s"
                + " Tipo: %s Valor: $%d Peaje: $%.2f",nombre, tipo2,
                valor,costo_peaje);
                break;
            case "4":
                porcentaje = valor * 0.05;
                costo_peaje = porcentaje + 2.2;
                tipo2 = "bus urbano";
                System.out.printf("Peaje \"Buena vía\" Propietario: %s"
                + " Tipo: %s Valor: $%d Peaje: $%.2f",nombre, tipo2,
                valor,costo_peaje);
                break;
            default:
                System.out.println("El numero que digito no esta en el rango "
                        + "de las opciones presentadas");
                
        }
        
        
    }
}
