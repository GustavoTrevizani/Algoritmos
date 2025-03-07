/*
    Você foi a uma loja de celulares e está avaliando as formas de pagamento. Considere
    a possibilidade de parcelar o valor de um celular novo. Qual o valor que seria pago a 
    cada mês ? Construa um algoritmo que solicita o valor total do celular e em quantas
    vezes o valor será pago (o número de parcelas). O algoritmo deve imprimir então o valor
    das parcelas.

*/

import java.util.Scanner;

public class ParcelasCelular{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        double celular, numparcelas, parcelas;
        
        System.out.println("Seja bem-vindo! Vamos comprar um celular novo?");
        System.out.println("Informe o valor do celular: ");
        celular = scanner.nextDouble();
        System.out.println("Informe o número de parcelas: ");
        numparcelas = scanner.nextDouble();
        
        parcelas = celular / numparcelas ;
        
        System.out.println("Cada parcela do seu celular novo custará " + parcelas);
        
        scanner.close();
    }
}