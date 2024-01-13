package com.mycompany.prototipodestilaria;

import java.util.Scanner;

/**
 *
 * @author ricsasse
 */
public class PrototipoDestilaria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de Bombonas de alcool que serão compradas:");
        int qtdBombonas = teclado.nextInt();
        System.out.println("DIgite a quantidade de Alcool para cada receita:");
        double qtdAlcoolReceita = teclado.nextDouble();

        //Consideramos que cada bombona de alcool tenha 30L de aslcool
        double qtdAlcool = (qtdBombonas * 30) / qtdAlcoolReceita;
        
        System.out.println("Digite a quantidade de igredientes para a receita:");
        int qtdIgre = teclado.nextInt();
        
        double vetor[] = new double[qtdIgre];
        String vetor2[] = new String[qtdIgre];
        int i;
        double qtdBotReceita;
        
    //Entrada das quantidade para cada receita
    for (i=0; i<qtdIgre; i++) {
      System.out.println("Informe o nome do botanico");
      vetor2[i] = teclado.next();
      System.out.println("Informe a quantidade de gramas do botanico para cada receita");
      qtdBotReceita = teclado.nextDouble();
      vetor[i] = qtdBotReceita * qtdAlcool;
    }
        //Saida
    System.out.println("A quantidade de botanicos para: " + qtdBombonas + " Bombonas é de:");
    for (i=0; i<qtdIgre; i++) {
    System.out.println(vetor2[i] + ": " + vetor[i] + " Gramas");
    }
    }
}
