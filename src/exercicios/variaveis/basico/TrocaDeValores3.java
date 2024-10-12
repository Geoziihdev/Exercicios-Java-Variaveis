package exercicios.variaveis.basico; // Pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class TrocaDeValores3 { // Declaração da classe
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        
        System.out.println("Digite o primeiro valor: "); // Solicita ao usuário o primeiro valor
        int a = scanner.nextInt(); // Lê o primeiro número inteiro e armazena na variável 'a'
        
        System.out.println("Digite o segundo valor: "); // Solicita ao usuário o segundo valor
        int b = scanner.nextInt(); // Lê o segundo número inteiro e armazena na variável 'b'
         
        System.out.println("Antes da troca: a = " + a + ", b = " + b); // Mostra os valores de 'a' e 'b' antes da troca
         
        // Realiza a troca dos valores
        int temp = a; // Armazena o valor de 'a' em uma variável temporária 'temp'
        a = b; // Atribui o valor de 'b' para 'a'
        b = temp; // Atribui o valor armazenado em 'temp' (originalmente de 'a') para 'b'
         
        System.out.print("Após a troca: a = " + a + ", b = " + b); // Mostra os valores de 'a' e 'b' após a troca
                   
        scanner.close(); // Fecha o scanner para liberar recursos
    }
}



/*
 * Explicação do Código Pacote e Importação:
 * 
 * O código está organizado em um pacote chamado exercicios.variaveis.basico. A
 * classe Scanner é importada para facilitar a leitura de entradas do usuário.
 * Método Principal:
 * 
 * public static void main(String[] args) é o ponto de entrada do programa. Tudo
 * o que está dentro deste método será executado quando o programa for iniciado.
 * Entrada do Usuário:
 * 
 * Usamos o Scanner para capturar entradas do teclado. As mensagens solicitam
 * que o usuário digite dois valores inteiros. Troca de Valores:
 * 
 * Antes da troca, o programa exibe os valores atuais de a e b. A troca é
 * realizada usando uma variável temporária (temp) para evitar perder o valor
 * original de a. Saída dos Valores Após a Troca:
 * 
 * Após a troca, os novos valores de a e b são exibidos. Fechamento do Scanner:
 * 
 * O scanner.close() é chamado para liberar os recursos que estavam sendo usados
 * pelo objeto Scanner. Conclusão Esse código é um bom exemplo de como trabalhar
 * com variáveis e manipulação simples de dados em Java. Ele demonstra entrada e
 * saída, bem como o uso de variáveis temporárias para realizar operações. Se
 * tiver mais perguntas ou quiser mais detalhes, fique à vontade para perguntar!
 * 
 */













