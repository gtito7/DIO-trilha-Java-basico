package edu.dio.variaveis;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Tipos de Variáveis em Java:");
            System.out.println("1. int - para números inteiros");
            System.out.println("2. double - para números decimais");
            System.out.println("3. boolean - para valores lógicos (true/false)");
            System.out.println("4. char - para caracteres únicos");
            System.out.println("5. String - para sequências de caracteres");
            System.out.println("6. float - para números decimais com precisão simples");
            System.out.println("7. long - para números inteiros grandes");
            System.out.println("8. byte - para números inteiros muito pequenos");
            System.out.println("9. short - para números inteiros pequenos");

        // Variáveis x Constantes
        final double PI = 3.14159; // Constante
        int raio = 5; // Variável
        double area = PI * raio * raio; // Cálculo da área do círculo
        System.out.println("Área do círculo com raio " + raio + " é: " + area);
        

    }
}
