package com.mycompany.parimparvetor;

/**
 *
 * @author sofia
 */
import java.util.Scanner;

public class ParImparVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do vetor A com 10 elementos inteiros
        int[] A = new int[10];
        System.out.println("Digite 10 numeros inteiros:");

        for (int i = 0; i < A.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        // Criação do vetor ParImpar com 2 posições
        int[] ParImpar = new int[2];

        // Contagem dos números pares e ímpares
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                ParImpar[0]++; // Incrementa a contagem de pares
            } else {
                ParImpar[1]++; // Incrementa a contagem de ímpares
            }
        }

        // Impressão do vetor ParImpar
        System.out.println("\nVetor ParImpar:");
        System.out.println("Quantidade de pares: " + ParImpar[0]);
        System.out.println("Quantidade de impares: " + ParImpar[1]);

        scanner.close();
    }
}

