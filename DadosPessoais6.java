package exercicios.variaveis.basico;

import java.util.Scanner;

public class DadosPessoais6 {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		int idade;
		String endereco;
		String telefone;
		
		System.out.println("Digite seu nome: ");
		nome = scanner.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o seu indereço: ");
		endereco = scanner.nextLine();
		
		System.out.println("Digite o seu telefone: ");
		telefone = scanner.nextLine();
		
		  System.out.println("\n--- Dados Pessoais ---");
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	        System.out.println("Endereço: " + endereco);
	        System.out.println("Telefone: " + telefone);

	        scanner.close();
		
	
		
	}

}





/*
 * Explicação do Código Importação da Classe Scanner: Importamos
 * java.util.Scanner para permitir a entrada de dados pelo console.
 * 
 * Declaração das Variáveis: Definimos variáveis para armazenar nome, idade,
 * endereço e telefone.
 * 
 * Entrada de Dados: Usamos scanner.nextLine() para ler strings e
 * scanner.nextInt() para ler inteiros.
 * 
 * Exibição dos Dados: Usamos System.out.println() para imprimir os dados na
 * tela.
 */
