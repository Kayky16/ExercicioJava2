/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maior.que.tres;
import java.util.Scanner;
public class MaiorQueTres {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = teclado.nextInt();
        
        System.out.println((n <= 3) ? "NÚMERO VÁLIDO" : "NÚMERO INVÁLIDO");
    
    }
    
}
