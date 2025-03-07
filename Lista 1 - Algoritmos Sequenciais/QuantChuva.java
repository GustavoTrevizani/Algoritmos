/*
    Em uma semana chuvosa podemos ter um grande acúmulo de chuva, o que pode provocar 
    deslizamentos e enchentes. Elabore um algoritmo que solicite a quantidade de chuva ao 
    longo de 5 dias (um valor para cada dia). Ao final o algoritmo deve imprimir a soma e 
    a média dos valores lidos.
    
*/

import java.util.Scanner;

public class QuantChuva{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        double dia1, dia2, dia3, dia4, dia5, soma, media;
        
        System.out.println("Informe a quantidade de chuva ao longo de 5 dias!");
        System.out.println("Quantidade de chuva no dia 1:");
        dia1 = scanner.nextDouble();
        System.out.println("Quantidade de chuva no dia 2:");
        dia2 = scanner.nextDouble();
        System.out.println("Quantidade de chuva no dia 3:");
        dia3 = scanner.nextDouble();
        System.out.println("Quantidade de chuva no dia 4:");
        dia4 = scanner.nextDouble();
        System.out.println("Quantidade de chuva no dia 5:");
        dia5 = scanner.nextDouble();
        
        // Some o total dos cinco dias e faça a média
        soma = dia1 + dia2 + dia3 + dia4 + dia5;
        media = soma / 5;
        
        System.out.println("A média da quantidade de chuva ao longo dos 5 dias anteriores: " + media);
        
        scanner.close();
    }
}