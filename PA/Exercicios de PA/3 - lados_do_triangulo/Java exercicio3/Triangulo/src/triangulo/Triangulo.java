/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Digite o primeiro número: ");
            double num1 = teclado.nextDouble();
            System.out.println("Digite o segundo número: ");
            double num2 = teclado.nextDouble();
            System.out.println("Digite o terceiro número: ");
            double num3 = teclado.nextDouble();
       
            if ((num1 + num2 > num3) && (num1 + num3 > num2) && (num2 + num3 > num1)){    
                if((num1 == num2) && (num2 == num3))
                    System.out.println("Equilátero");
                else 
                    if((num1 == num2) || (num2 == num3) || (num1 == num3))
                        System.out.println("Isósceles"); 
                    else
                        if((num1 != num2) && (num1 != num3) && (num2 != num3))
                            System.out.println("Escaleno");
            }else{
                System.out.println("Não é um triângulo");
        }
    }
}

    
