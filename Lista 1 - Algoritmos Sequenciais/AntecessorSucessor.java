/*
    Programa que informa o sucessor e o antecessor de um número
*/

import java.util.Scanner;

public class AntecessorSucessor{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero, sucessor, antecessor;
        
        System.out.print("Informe um número inteiro: ");
        numero = scanner.nextInt();
        
        antecessor = numero - 1;
        sucessor = numero + 1;
        
        System.out.println("O antecessor do número " + numero + " é " + antecessor + " e o seu sucessor é " + sucessor);
        
        scanner.close();
    }
    
}