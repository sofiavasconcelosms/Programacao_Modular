package com.mycompany.fatorialvetores;

/**
 *
 * @author sofia
 */
import java.util.Scanner;

public class FatorialVetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação e leitura do vetor A
        int[] A = new int[15];
        System.out.println("Digite 15 numeros inteiros:");

        for (int i = 0; i < A.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        // Criação do vetor B para armazenar os fatoriais
        long[] B = new long[15];

        // Preenchimento do vetor B com os fatoriais
        for (int i = 0; i < A.length; i++) {
            B[i] = calcularFatorial(A[i]);
        }

        // Impressão dos vetores A e B
        System.out.println("\nVetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\n\nVetor B (Fatoriais):");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

        scanner.close();
    }

    // Método para calcular o fatorial de um número
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            return -1; // Retorna -1 para valores negativos, fatorial não definido
        }

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
