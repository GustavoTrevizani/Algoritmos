/*
O preço de custo de um produto pode ser considerado o valor gasto para sua confecção.
Este é diferente do preço de venda, uma vez que deve ser acrescentado um percentual de lucro.
Faça um programa que receba o preço de custo de um produto, o percentual de lucro
e calcule o valor de venda do produto.
 */

import java.util.Scanner;

public class CalculoPrecoVenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o preço de custo do produto: ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Digite o percentual de lucro desejado (%): ");
        double percentualLucro = scanner.nextDouble();

        // Cálculo do preço de venda
        double lucro = (precoCusto * percentualLucro) / 100;
        double precoVenda = precoCusto + lucro;

        // Exibição do resultado
        System.out.println("\nCálculo do Preço de Venda:");
        System.out.println("Lucro: R$ " + lucro);
        System.out.println("Preço de venda do produto: R$ " + precoVenda);

        scanner.close();
    }
}
