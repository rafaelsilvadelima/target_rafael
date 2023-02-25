package Exercicios;

import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de dias do mês que possuem rendimento superior a zero (0): ");
        int numDias = scanner.nextInt();
        double[] faturamentoDiario = new double[numDias];

        for (int i = 0; i < numDias; i++) {
            System.out.printf("Digite o faturamento do dia: ", i+1);
            faturamentoDiario[i] = scanner.nextDouble();
        }
        scanner.close();

        // Cálculo do menor e maior faturamento
        double menorFaturamento = faturamentoDiario[0];
        double maiorFaturamento = faturamentoDiario[0];

        for (int i = 1; i < numDias; i++) {
            if (faturamentoDiario[i] < menorFaturamento) {
                menorFaturamento = faturamentoDiario[i];
            }
            if (faturamentoDiario[i] > maiorFaturamento) {
                maiorFaturamento = faturamentoDiario[i];
            }
        }

        // Média mensal de faturamento
        double somaFaturamento = 0;
        for (int i = 0; i < numDias; i++) {
            somaFaturamento += faturamentoDiario[i];
        }
        double mediaMensal = somaFaturamento / numDias;

        // Faturamento diário superior à média mensal
        int numDiasAcimaDaMedia = 0;
        for (int i = 0; i < numDias; i++) {
            if (faturamentoDiario[i] > mediaMensal) {
                numDiasAcimaDaMedia++;
            }
        }

        // Resultados
        System.out.println("Menor faturamento diário: " + menorFaturamento);
        System.out.println("Maior faturamento diário: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento diário acima da média mensal: " + numDiasAcimaDaMedia);
    }
}
