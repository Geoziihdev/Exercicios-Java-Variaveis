package exercicios.variaveis.basico;

import java.util.Scanner;

public class ConversaoUnidades8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("\nEscolha uma conversão:");
            System.out.println("1. Metros para Quilômetros");
            System.out.println("2. Quilômetros para Milhas");
            System.out.println("3. Gramas para Quilogramas");
            System.out.println("4. Quilogramas para Libras");
            System.out.println("5. Litros para Galões");
            System.out.println("6. Galões para Litros");
            System.out.println("7. Celsius para Fahrenheit");
            System.out.println("8. Fahrenheit para Celsius");
            System.out.println("9. Celsius para Kelvin");
            System.out.println("10. Kelvin para Celsius");
            System.out.println("11. Dólares para Reais");
            System.out.println("12. Dólares para Euros");
            System.out.println("13. Reais para Dólares");
            System.out.println("0. Sair");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor em metros: ");
                    double metros = scanner.nextDouble();
                    double quilometros = metros / 1000;
                    System.out.printf("%.2f metros é igual a %.2f quilômetros%n", metros, quilometros);
                    break;

                case 2:
                    System.out.print("Digite o valor em quilômetros: ");
                    double km = scanner.nextDouble();
                    double milhas = km * 0.621371;
                    System.out.printf("%.2f quilômetros é igual a %.2f milhas%n", km, milhas);
                    break;

                case 3:
                    System.out.print("Digite o valor em gramas: ");
                    double gramas = scanner.nextDouble();
                    double quilogramas = gramas / 1000;
                    System.out.printf("%.2f gramas é igual a %.2f quilogramas%n", gramas, quilogramas);
                    break;

                case 4:
                    System.out.print("Digite o valor em quilogramas: ");
                    double kg = scanner.nextDouble();
                    double libras = kg * 2.20462;
                    System.out.printf("%.2f quilogramas é igual a %.2f libras%n", kg, libras);
                    break;

                case 5:
                    System.out.print("Digite o valor em litros: ");
                    double litros = scanner.nextDouble();
                    double galoes = litros * 0.264172;
                    System.out.printf("%.2f litros é igual a %.2f galões%n", litros, galoes);
                    break;

                case 6:
                    System.out.print("Digite o valor em galões: ");
                    double galoesInput = scanner.nextDouble();
                    double litrosFromGaloes = galoesInput / 0.264172;
                    System.out.printf("%.2f galões é igual a %.2f litros%n", galoesInput, litrosFromGaloes);
                    break;

                case 7:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsius * 9 / 5 + 32;
                    System.out.printf("%.2f graus Celsius é igual a %.2f graus Fahrenheit%n", celsius, fahrenheit);
                    break;

                case 8:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    double fahrenheitInput = scanner.nextDouble();
                    double celsiusFromFahrenheit = (fahrenheitInput - 32) * 5 / 9;
                    System.out.printf("%.2f graus Fahrenheit é igual a %.2f graus Celsius%n", fahrenheitInput, celsiusFromFahrenheit);
                    break;

                case 9:
                    System.out.print("Digite a temperatura em Celsius: ");
                    celsius = scanner.nextDouble();
                    double kelvin = celsius + 273.15;
                    System.out.printf("%.2f graus Celsius é igual a %.2f Kelvin%n", celsius, kelvin);
                    break;

                case 10:
                    System.out.print("Digite a temperatura em Kelvin: ");
                    double kelvinInput = scanner.nextDouble();
                    double celsiusFromKelvin = kelvinInput - 273.15;
                    System.out.printf("%.2f Kelvin é igual a %.2f graus Celsius%n", kelvinInput, celsiusFromKelvin);
                    break;

                case 11:
                    System.out.print("Digite o valor em Dólares: ");
                    double dolares = scanner.nextDouble();
                    double reais = dolares * 5.25; // Exemplo de taxa de câmbio
                    System.out.printf("%.2f Dólares é igual a %.2f Reais%n", dolares, reais);
                    break;

                case 12:
                    System.out.print("Digite o valor em Dólares: ");
                    dolares = scanner.nextDouble();
                    double euros = dolares * 0.93; // Exemplo de taxa de câmbio
                    System.out.printf("%.2f Dólares é igual a %.2f Euros%n", dolares, euros);
                    break;

                case 13:
                    System.out.print("Digite o valor em Reais: ");
                    double reaisInput = scanner.nextDouble();
                    double dolaresFromReais = reaisInput / 5.25; // Exemplo de taxa de câmbio
                    System.out.printf("%.2f Reais é igual a %.2f Dólares%n", reaisInput, dolaresFromReais);
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close(); // Fechando o scanner
    }
}

