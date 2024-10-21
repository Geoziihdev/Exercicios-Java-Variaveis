package exercicios.variaveis.basico;

import java.util.Scanner;

public class CalculoSalario10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita informações do usuário
        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Digite o número de horas extras trabalhadas: ");
        int horasExtras = scanner.nextInt();

        System.out.print("Digite o valor da hora extra: ");
        double valorHoraExtra = scanner.nextDouble();

        System.out.print("Digite o percentual de descontos (em %): ");
        double percentualDesconto = scanner.nextDouble();

        // Calcula o total de horas extras
        double totalHorasExtras = horasExtras * valorHoraExtra;

        // Calcula o salário bruto
        double salarioBruto = salarioBase + totalHorasExtras;

        // Calcula os descontos
        double desconto = (percentualDesconto / 100) * salarioBruto;

        // Calcula o salário líquido
        double salarioLiquido = salarioBruto - desconto;

        // Exibe o resultado
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        scanner.close(); // Fecha o scanner
    }
}




/*
 * Explicação do Código Importação de Scanner: Importa a classe Scanner para ler
 * a entrada do usuário. Entrada de Dados: O programa solicita o salário base,
 * horas extras, valor da hora extra e percentual de desconto. Cálculos: Calcula
 * o total de horas extras, o salário bruto, os descontos e o salário líquido.
 * Saída: Exibe o salário bruto, o valor dos descontos e o salário líquido
 * formatado com duas casas decimais. Considerações O programa é simples e pode
 * ser expandido para incluir mais funcionalidades, como diferentes tipos de
 * desconto ou benefícios. Certifique-se de validar as entradas para garantir
 * que o usuário insira valores válidos.
 * 
 */