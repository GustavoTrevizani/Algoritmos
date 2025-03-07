/*
Considerando que a poupança está rendendo um juro fixo de 0,70% ao mês,
faça um programa que receba o valor que foi depositado e exiba ao final o rendimento
e o valor que ficou na poupança.
*/

import java.util.Scanner;

public class RendimentoPoupanca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor depositado na poupança: ");
        double valorDepositado = scanner.nextDouble();

        // Cálculo do rendimento e valor final
        double rendimento = valorDepositado * (0.70 / 100);
        double valorFinal = valorDepositado + rendimento;

        // Exibição do resultado
        System.out.println("\nRendimento da Poupança:");
        System.out.println("Rendimento no mês: R$ " + rendimento);
        System.out.println("Valor final na poupança: R$ " + valorFinal);

        scanner.close();
    }
}
