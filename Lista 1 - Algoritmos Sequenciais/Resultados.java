/*
    Informe dois números para saber a divisão de ambos.
*/

import java.util.Scanner;

public class Resultados{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definição/declaração de variáveis
        double num1, num2, resulta;
        
        // Receber o primeiro número
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        
        // Receber o segundo número
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();
        
        // Dividir dois números
        resulta = num1 / num2;
        
        // Mostrando a soma dos dois números
        System.out.println("O resultado é " + resulta);
        
        scanner.close();
    }
}