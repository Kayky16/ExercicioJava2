/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equacao;
import java.util.Scanner;
public class Equacao {

    public static void main(String[] args) {

        int delta;
        int x1;
        int x2;
        int raiz;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        int a = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = entrada.nextInt();
        System.out.println("Digite o valor de C: ");
        int c = entrada.nextInt();
        
        if(a != 0){
            delta = b * b - 4 * a * c;
        
            if(delta >= 0){
                x1 = (int) ((-b + (Math.sqrt(delta))) / (2 * a));
                x2 = (int) ((-b - (Math.sqrt(delta))) / (2 * a));
                
                System.out.println("As raízes da equação são: " + x1 + " e " + x2);
                
            }
        }
                else
                    System.out.println("Não possui raízes reais!");
        
    }
}
