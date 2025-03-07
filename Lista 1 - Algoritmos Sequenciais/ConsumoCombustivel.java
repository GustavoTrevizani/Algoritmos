/* Determine o consumo médio de combustível de um carro. Para isso, faça um programa que receba a
distância total percorrida pelo automóvel e o total de combustível gasto.
Escreva ao final a distância, o combustível gasto e o consumo médio.*/

import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a distância percorrida (em km): ");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.print("Digite o total de combustível gasto (em litros): ");
        double combustivelGasto = scanner.nextDouble();

        // Cálculo do consumo médio
        double consumoMedio = distanciaPercorrida / combustivelGasto;

        // Exibição dos resultados
        System.out.println("\nResultados:");
        System.out.println("Distância percorrida: " + distanciaPercorrida + " km");
        System.out.println("Combustível gasto: " + combustivelGasto + " litros");
        System.out.println("Consumo médio: " + consumoMedio + " km/l");

        scanner.close();
    }
}
