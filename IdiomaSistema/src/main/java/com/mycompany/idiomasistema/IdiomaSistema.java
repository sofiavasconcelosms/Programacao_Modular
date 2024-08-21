package com.mycompany.idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        // Obtém o locale do sistema
        Locale locale = Locale.getDefault();
        
        // Exibe o idioma do sistema
        System.out.println("O seu sistema esta em:");
        System.out.println("Idioma: " + locale.getDisplayLanguage());
    }
}
