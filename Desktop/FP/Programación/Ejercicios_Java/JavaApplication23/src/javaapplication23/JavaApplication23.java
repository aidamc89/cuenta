/*Crear un programa que permita calcular o soldo dun empregado sabendo o
seu soldo base, cantos anos leva traballando na empresa e canto é o plus por
cada trienio. Os tres datos introduciranse polo teclado.*/
package javaapplication23;

import java.util.Scanner;

public class JavaApplication23 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Cual es tu sueldo base mensual?");
        int sueldoMes=teclado.nextInt();
        
        System.out.println("Cuantos años llevas trabajando en la empresa?");
        int año=teclado.nextInt();
        
        System.out.println("Cual es el plus por cada trienio?");
        int plusTrienio=teclado.nextInt();
        
        int sueldoAnual=(sueldoMes*12);
        int trienio=año/3;
        int sueldoTotal=sueldoAnual+(trienio*plusTrienio*12);
        
        System.out.println("Tu sueldo anual total es "+sueldoTotal);
        
        
        
        
    }
    
}
