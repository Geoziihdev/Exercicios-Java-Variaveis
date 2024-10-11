package exercicios.variaveis.basico;
//Classe principal do programa
public class CalculoDaMedia2 {

 // Método principal que é executado quando o programa é iniciado
 public static void main(String[] args) {
     
     // Declaração de variáveis para armazenar os números e a média
     double numero1, numero2, numero3, media;
     
     // Criação de um objeto Scanner para ler a entrada do usuário
     java.util.Scanner scanner = new java.util.Scanner(System.in);
     
     // Solicita ao usuário que insira o primeiro número
     System.out.print("Digite o primeiro número: ");
     numero1 = scanner.nextDouble(); // Lê o primeiro número
     
     // Solicita ao usuário que insira o segundo número
     System.out.print("Digite o segundo número: ");
     numero2 = scanner.nextDouble(); // Lê o segundo número
     
     // Solicita ao usuário que insira o terceiro número
     System.out.print("Digite o terceiro número: ");
     numero3 = scanner.nextDouble(); // Lê o terceiro número
     
     // Calcula a média dos três números
     media = (numero1 + numero2 + numero3) / 3;
     
     // Exibe o resultado da média
     System.out.printf("A média de %.2f, %.2f e %.2f é: %.2f%n", numero1, numero2, numero3, media);
     
     // Fecha o scanner para evitar vazamento de recursos
     scanner.close();
 }
}


/*Explicação do código:
Classe: CalculoDaMedia é a classe principal que contém o programa.

Método main: Este é o ponto de entrada do programa, onde a execução começa.

Variáveis: Declaramos numero1, numero2, numero3 e media para armazenar os números fornecidos pelo usuário e o resultado da média.

Scanner: Utilizamos a classe Scanner para ler a entrada do usuário a partir do console.
Leitura dos números: Usamos scanner.nextDouble() para ler os números fornecidos pelo usuário.

Cálculo da média: A média é calculada somando os três números e dividindo o resultado por 3.

Saída: O resultado é exibido formatado com duas casas decimais usando System.out.printf().

Fechamento do Scanner: O método scanner.close() é chamado para liberar os recursos.

*/
