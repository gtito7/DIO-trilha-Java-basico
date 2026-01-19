package edu.dio.operadores;
public class TiposOperadores {
    public static void main(String[] args) throws Exception {
        System.out.println("Tipos de Operadores em Java:");
        System.out.println("1. Operadores Aritméticos: +, -, *, /, %");
        System.out.println("2. Operadores Relacionais: ==, !=, >, <, >=, <=");
        System.out.println("3. Operadores Lógicos: &&, ||, !");
        System.out.println("4. Operadores de Atribuição: =, +=, -=, *=, /=, %=");
        System.out.println("5. Operadores Unários: ++, --");
        System.out.println("6. Operadores Ternários: ? :");
        System.out.println("7. Operadores de Bit a Bit: &, |, ^, ~, <<, >>, >>>"); 
        System.out.println("8. Operadores de Instância: instanceof");

        // Exemplo de uso de alguns operadores
        int a = 10;
        int b = 5;
        int soma = a + b; // Operador Aritmético
        boolean resultado = a > b; // Operador Relacional
        boolean logico = (a > b) && (b < 20); // Operador Lógico
        a += 2; // Operador de Atribuição
        a++; // Operador Unário
        String mensagem = (a > b) ? "A é maior que B" : "A não é maior que B"; // Operador Ternário
        boolean instancia = mensagem instanceof String; // Operador de Instância

        // Exibição dos resultados
        System.out.println("Soma: " + soma);  
        System.out.println("Resultado da comparação (a > b): " + resultado);
        System.out.println("Resultado lógico: " + logico);
        System.out.println("Valor de a após atribuição e incremento: " + a);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Mensagem é uma instância de String: " + instancia);

        // Exemplo de repetição usando operador de incremento
        System.out.println("Contagem de 1 a 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }   


        
    }
}
