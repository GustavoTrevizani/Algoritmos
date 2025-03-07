/* Sabendo que a temperatura em Fahrenheit é calculada pela fórmula: Fahrenheit = (9 * Celsius + 160) / 5
Faça um programa que receba a temperatura em graus Celsius e apresente a mesma convertida para graus Fahrenheit. */

import java.util.Scanner;

public class ConversaoTemp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Cálculo da temperatura em Fahrenheit
        double fahrenheit = (9 * celsius + 160) / 5;

        // Exibição do resultado
        System.out.println("\nTemperatura convertida:");
        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");

        scanner.close();
    }
}
