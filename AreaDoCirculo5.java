package exercicios.variaveis.basico;

import java.util.Scanner;

public class AreaDoCirculo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = scanner.nextDouble();
		
		double area  = Math.pow(raio, 2);
		
		 System.out.printf("A área do círculo com raio %.2f é: %.2f%n", raio, area); 

	        scanner.close(); 
	    }
	}


	/*
	 * Explicação do Código Importação: import java.util.Scanner; importa a classe
	 * Scanner para ler entradas do usuário. Instância do Scanner: Scanner scanner =
	 * new Scanner(System.in); cria um objeto scanner para ler dados da entrada
	 * padrão. Leitura do Raio: double raio = scanner.nextDouble(); lê um valor
	 * decimal que representa o raio do círculo. Cálculo da Área: double area =
	 * Math.PI * Math.pow(raio, 2); usa Math.PI para obter o valor de π e
	 * Math.pow(raio, 2) para calcular 𝑟 2 r 2 . Exibição do Resultado:
	 * System.out.printf(...) formata a saída, mostrando o raio e a área com duas
	 * casas decimais. Fechamento do Scanner: scanner.close(); fecha o objeto
	 * scanner após o uso.
	 */