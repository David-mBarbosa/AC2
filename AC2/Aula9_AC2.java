package AC2;

import java.util.Scanner;

public class Aula9_AC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos alunos terão suas notas calculadas?");
        int alunos = scanner.nextInt();

        for (int contA = 1; contA <= alunos; contA++) {
            System.out.println("Digite o nome do aluno " + contA);
                String nomealuno = scanner.next();
            System.out.println("Calculadora de média ponderada");
            System.out.println("Quantas notas e pesos serão inseridos?");
                int fim = scanner.nextInt();
                double soma = 0.0, pesoTotal = 0.0;

            for (int contB = 1; contB <= fim; contB++) {
                System.out.println("Qual o peso da nota " + contB + "?");
                    double peso = scanner.nextDouble();
                        pesoTotal += peso;
                System.out.println("Qual a nota " + contB + "?");
                    double nota = scanner.nextDouble();
                        soma += nota * peso;
            }

            double media = soma / pesoTotal;
            System.out.println("O aluno " + nomealuno + " teve média: " + media);

            System.out.println("Qual a média mínima da instituição?");
            float mediamin = scanner.nextFloat();

            if (media <= 2) {
                System.out.println("O aluno " + nomealuno + " foi reprovado");
            } else if (media < mediamin) {
                System.out.println("O aluno " + nomealuno + " precisa fazer a prova substitutiva");
            } else {
                System.out.println("O aluno " + nomealuno + " foi aprovado");
            }
        }
    }
}
