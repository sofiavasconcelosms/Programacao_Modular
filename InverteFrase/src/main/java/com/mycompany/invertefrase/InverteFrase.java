/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invertefrase;

/**
 *
 * @author sofia
 */
import java.util.ArrayList;
import java.util.List;

public class InverteFrase {

    public static void main(String[] args) {
        // Frase de exemplo
        String frase = "PUC minas";
        
        // Chama o método para inverter a ordem das palavras
        String fraseInvertida = inverterOrdem(frase);
        
        // Exibe o resultado
        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida: " + fraseInvertida);
    }
    
    public static String inverterOrdem(String frase) {
        // Lista para armazenar as palavras
        List<String> palavras = new ArrayList<>();
        
        // Variável para construir uma palavra temporária
        StringBuilder palavra = new StringBuilder();
        
        // Percorre cada caractere da frase
        for (char c : frase.toCharArray()) {
            // Se o caractere for um espaço, adiciona a palavra à lista e reinicia o StringBuilder
            if (c == ' ') {
                if (palavra.length() > 0) {
                    palavras.add(palavra.toString());
                    palavra.setLength(0); // Limpa o StringBuilder
                }
            } else {
                // Adiciona o caractere à palavra
                palavra.append(c);
            }
        }
        
        // Adiciona a última palavra à lista (se houver)
        if (palavra.length() > 0) {
            palavras.add(palavra.toString());
        }
        
        // Constrói a frase invertida
        StringBuilder fraseInvertida = new StringBuilder();
        for (int i = palavras.size() - 1; i >= 0; i--) {
            fraseInvertida.append(palavras.get(i));
            if (i > 0) {
                fraseInvertida.append(' ');
            }
        }
        
        return fraseInvertida.toString();
    }
}
