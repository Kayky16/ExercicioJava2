/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

package par.e.impar;

import java.util.Scanner;

public class ParEImpar {
    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = entrada.nextInt();
        
        System.out.println(n%2==0? "Par": "Ímpar");
    }
    
}
