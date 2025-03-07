/*
Faça um programa que receba o valor da cotação do dólar e a 
quantidade de dólares que uma pessoa tem. Em seguida, apresente o valor em reais.
 */

import java.util.Scanner;

public class ConversaoDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares que você tem: ");
        double quantidadeDolares = scanner.nextDouble();

        // Cálculo do valor em reais
        double valorEmReais = cotacaoDolar * quantidadeDolares;

        // Exibição do resultado
        System.out.println("\nConversão:");
        System.out.println("Valor em reais: R$ " + valorEmReais);

        scanner.close();
    }
}
