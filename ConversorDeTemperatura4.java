package exercicios.variaveis.basico;

import java.util.Scanner;

public class ConversorDeTemperatura4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int escolha; // Declara a variável escolha aqui, fora do loop
        do {
            // Exibe as opções de conversão
            System.out.println("\nQual tipo de conversão deseja realizar? :");
            System.out.println("1: Celsius para Fahrenheit");
            System.out.println("2: Fahrenheit para Celsius");
            System.out.println("3: Celsius para Kelvin");
            System.out.println("4: Kelvin para Celsius");
            System.out.println("5: Fahrenheit para Kelvin");
            System.out.println("6: Kelvin para Fahrenheit");
            System.out.println("0: Sair"); 
            System.out.println("Digite Sua Escolha: ");
            
            escolha = scanner.nextInt(); 
            double temperatura, resultado; 
            switch (escolha) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    temperatura = scanner.nextDouble();
                    resultado = (temperatura * 9 / 5) + 32;
                    System.out.println("Temperatura em Fahrenheit: " + resultado);
                    break;
                    
                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    temperatura = scanner.nextDouble();
                    resultado = (temperatura - 32) * 5 / 9;
                    System.out.println("Temperatura em Celsius: " + resultado);
                    break;
                    
                case 3:
                    System.out.print("Digite a temperatura em Celsius: ");
                    temperatura = scanner.nextDouble();
                    resultado = temperatura + 273.15;
                    System.out.println("Temperatura em Kelvin: " + resultado);
                    break;
                    
                case 4:
                    System.out.print("Digite a temperatura em Kelvin: ");
                    temperatura = scanner.nextDouble();
                    resultado = temperatura - 273.15;
                    System.out.println("Temperatura em Celsius: " + resultado);
                    break;
                    
                case 5:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    temperatura = scanner.nextDouble();
                    resultado = (temperatura - 32) * 5 / 9 + 273.15;
                    System.out.println("Temperatura em Kelvin: " + resultado);
                    break;
                    
                case 6:
                    System.out.print("Digite a temperatura em Kelvin: ");
                    temperatura = scanner.nextDouble();
                    resultado = (temperatura * 9 / 5) - 459.67;
                    System.out.println("Temperatura em Fahrenheit: " + resultado);
                    break;
                
                case 0: 
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                    
                default: 
                    System.out.println("Opção inválida. Tente novamente.");
                    
                 
                    
            }
        } while (escolha != 0);

        scanner.close(); 
    }
}






	/*
	 * package exercicios.variaveis.basico; // Define o pacote do código
	 * 
	 * import java.util.Scanner; // Importa a classe Scanner para ler a entrada do
	 * usuário
	 * 
	 * public class ConversorDeTemperatura4 { // Declaração da classe principal
	 * public static void main(String[] args) { // Método principal que inicia a
	 * execução do programa Scanner scanner = new Scanner(System.in); // Cria um
	 * objeto Scanner para ler a entrada do usuário
	 * 
	 * // Exibe as opções de conversão para o usuário
	 * System.out.println("Qual tipo de conversão deseja realizar? :");
	 * System.out.println("1: Celsius para Fahrenheit");
	 * System.out.println("2: Fahrenheit para Celsius");
	 * System.out.println("3: Celsius para Kelvin");
	 * System.out.println("4: Kelvin para Celsius");
	 * System.out.println("5: Fahrenheit para Kelvin");
	 * System.out.println("6: Kelvin para Fahrenheit");
	 * 
	 * int escolha = scanner.nextInt(); // Lê a escolha do usuário double
	 * temperatura, resultado; // Declara variáveis para armazenar a temperatura e o
	 * resultado da conversão
	 * 
	 * // Switch para determinar a ação com base na escolha do usuário switch
	 * (escolha) { case 1: // Celsius para Fahrenheit
	 * System.out.print("Digite a temperatura em Celsius: "); // Solicita a
	 * temperatura em Celsius temperatura = scanner.nextDouble(); // Lê a
	 * temperatura resultado = (temperatura * 9/5) + 32; // Converte Celsius para
	 * Fahrenheit System.out.println("Temperatura em Fahrenheit: " + resultado); //
	 * Exibe o resultado break; // Sai do switch
	 * 
	 * case 2: // Fahrenheit para Celsius
	 * System.out.print("Digite a temperatura em Fahrenheit:"); // Solicita a
	 * temperatura em Fahrenheit temperatura = scanner.nextDouble(); // Lê a
	 * temperatura resultado = (temperatura - 32) * 5/9; // Converte Fahrenheit para
	 * Celsius System.out.println("Temperatura em Celsius: " + resultado); // Exibe
	 * o resultado break; // Sai do switch
	 * 
	 * case 3: // Celsius para Kelvin
	 * System.out.print("Digite a temperatura em Celsius: "); // Solicita a
	 * temperatura em Celsius temperatura = scanner.nextDouble(); // Lê a
	 * temperatura resultado = temperatura + 273.15; // Converte Celsius para Kelvin
	 * System.out.println("Temperatura em Kelvin: " + resultado); // Exibe o
	 * resultado break; // Sai do switch
	 * 
	 * case 4: // Kelvin para Celsius
	 * System.out.print("Digite a temperatura em Kelvin: "); // Solicita a
	 * temperatura em Kelvin temperatura = scanner.nextDouble(); // Lê a temperatura
	 * resultado = temperatura - 273.15; // Converte Kelvin para Celsius
	 * System.out.println("Temperatura em Celsius: " + resultado); // Exibe o
	 * resultado break; // Sai do switch
	 * 
	 * case 5: // Fahrenheit para Kelvin
	 * System.out.print("Digite a temperatura em Fahrenheit: "); // Solicita a
	 * temperatura em Fahrenheit temperatura = scanner.nextDouble(); // Lê a
	 * temperatura resultado = (temperatura - 32) * 5/9 + 273.15; // Converte
	 * Fahrenheit para Kelvin System.out.println("Temperatura em Kelvin: " +
	 * resultado); // Exibe o resultado break; // Sai do switch
	 * 
	 * case 6: // Kelvin para Fahrenheit
	 * System.out.print("Digite a temperatura em Kelvin: "); // Solicita a
	 * temperatura em Kelvin temperatura = scanner.nextDouble(); // Lê a temperatura
	 * resultado = (temperatura * 9/5) - 459.67; // Converte Kelvin para Fahrenheit
	 * System.out.println("Temperatura em Fahrenheit: " + resultado); // Exibe o
	 * resultado break; // Sai do switch
	 * 
	 * case 0: // Sair System.out.println("Saindo do programa. Até logo!"); break;
	 * 
	 * default: // Caso o usuário digite uma opção inválida
	 * System.out.println("Opção inválida. Tente novamente."); }
	 * 
	 * } while (escolha != 0); // Continua o loop até que o usuário escolha sair
	 * 
	 * scanner.close(); // Fecha o scanner para liberar recursos
	 * 
	 * default: // Caso o usuário digite uma opção inválida
	 * System.out.println("Opção inválida."); // Informa que a opção é inválida }
	 * 
	 * scanner.close(); // Fecha o scanner para liberar recursos } }
	 * 
	 */
