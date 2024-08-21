/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inverteletras;

/**
 *
 * @author sofia
 */
public class InverteLetras {

    public static void main(String[] args) {
        // Frase de exemplo
        String frase = "puc minas";
        
        // Chama o método para inverter a ordem das letras
        String fraseInvertida = inverterOrdemLetras(frase);
        
        // Exibe o resultado
        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida: " + fraseInvertida);
    }
    
    public static String inverterOrdemLetras(String frase) {
        // Constrói a string invertida usando StringBuilder
        StringBuilder fraseInvertida = new StringBuilder();
        
        // Percorre cada caractere da frase de trás para frente
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida.append(frase.charAt(i));
        }
        
        return fraseInvertida.toString();
    }
}