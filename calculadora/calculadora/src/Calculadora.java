import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        
        // Cria um objeto Scanner para capturar entradas do teclado
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis para armazenar os números
        double numero1;
        double numero2;

        // Variável para armazenar o resultado da operação
        double resultado;

        // Variável para armazenar a opção da operação (+, -, *, /)
        char operacao;

        // Solicita o primeiro número ao usuário
        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        // Solicita o segundo número ao usuário
        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        // Solicita a operação desejada
        System.out.print("Escolha a operação (+, -, *, /): ");
        operacao = scanner.next().charAt(0); // Lê o primeiro caractere digitado

        // Estrutura de decisão para identificar a operação escolhida
        switch (operacao) {

            case '+':
                // Soma dos dois números
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                // Subtração dos dois números
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                // Multiplicação dos dois números
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                // Verifica se o divisor é diferente de zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    // Mensagem de erro para divisão por zero
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;

            default:
                // Caso o usuário digite uma operação inválida
                System.out.println("Operação inválida.");
        }

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}