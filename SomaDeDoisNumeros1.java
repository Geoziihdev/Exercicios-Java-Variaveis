package exercicios.variaveis.basico;

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class SomaDeDoisNumeros1 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble(); // Lê o primeiro número

        // Solicita ao usuário que insira o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble(); // Lê o segundo número

        // Realiza a soma dos dois números
        double soma = numero1 + numero2;

        // Exibe o resultado da soma
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + soma);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
