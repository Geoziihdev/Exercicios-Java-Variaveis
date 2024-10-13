package exercicios.variaveis.basico;

import java.util.Scanner;

public class ContadorDigitos9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String numero = scanner.nextLine(); // Lê o número como uma String

        int contador = 0;

        // Verifica se o número é negativo e ajusta o contador
        if (numero.charAt(0) == '-') {
            contador = -1; // Para não contar o sinal de menos
        }

        // Conta os dígitos
        for (char c : numero.toCharArray()) {
            if (Character.isDigit(c)) {
                contador++;
            }
        }

        System.out.println("O número de dígitos é: " + contador);
        scanner.close(); // Fecha o scanner
    }
}



/*
 * Explicação do Código Importação de Scanner: Importa a classe Scanner para ler
 * a entrada do usuário. Entrada do Usuário: O programa pede ao usuário para
 * digitar um número e lê como uma String. Contagem de Dígitos: Verifica se o
 * primeiro caractere é um sinal de menos (para números negativos) e ajusta o
 * contador. Usa um loop para iterar sobre cada caractere da String, verificando
 * se é um dígito com Character.isDigit(). Saída: Imprime o número total de
 * dígitos encontrados. Considerações O programa conta apenas os dígitos e
 * ignora sinais e caracteres não numéricos. Pode ser expandido para incluir
 * validações, como garantir que o usuário insira apenas números.
 */
