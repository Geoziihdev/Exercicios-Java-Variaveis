package exercicios.variaveis.basico;

import java.util.Scanner;

public class PerimetroRetangulo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        double largura;
        double altura;

       
        System.out.print("Digite a largura do retângulo: ");
        largura = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        altura = scanner.nextDouble();

     
        double perimetro = 2 * (largura + altura);

        System.out.println("------------Resultado------------ ");
        System.out.printf("O perímetro do retângulo é: %.2f%n", perimetro);

        scanner.close(); 
    }
}


/*
 * Explicação do Código Importação da Classe Scanner: Importamos
 * java.util.Scanner para permitir a entrada de dados.
 * 
 * Declaração das Variáveis: As variáveis largura e altura são declaradas como
 * double para permitir entradas com casas decimais.
 * 
 * Leitura de Dados: Usamos scanner.nextDouble() para ler os valores numéricos.
 * 
 * Cálculo do Perímetro: Aplicamos a fórmula do perímetro.
 * 
 * Saída Formatada: Usamos System.out.printf para exibir o resultado com duas
 * casas decimais.
 * 
 * Com essa lógica e implementação, você deve conseguir calcular e exibir o
 * perímetro de um retângulo. Se precisar de mais alguma coisa, é só avisar!
 */
