package AC2;

import java.util.Scanner;

public class Aula10_AC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos alunos terão suas notas calculadas?");
        int alunos = scanner.nextInt();
        String sim = "sim";
        
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
                    boolean reinserirPeso;
                do {
                    System.out.println("Precisa reinserir o peso? (sim/não)");
                        String res = scanner.next();
                            reinserirPeso = res.equalsIgnoreCase(sim);
                    if (reinserirPeso) {
                        System.out.println("Digite o peso da nota " + contB + " novamente:");
                            peso = scanner.nextDouble();
                            pesoTotal -= peso;
                            pesoTotal += peso;
                    }
                } while (reinserirPeso);
                System.out.println("Qual a nota " + contB + "?");
                    double nota = scanner.nextDouble();
                        soma += nota * peso;
                    boolean reinserirNota;
                do {
                    System.out.println("Precisa reinserir a nota? (sim/não)");
                        String res = scanner.next();
                            reinserirNota = res.equalsIgnoreCase(sim);
                    if (reinserirNota) {
                        System.out.println("Digite a nota " + contB + " novamente:");
                            nota = scanner.nextDouble();
                            soma -= (nota * peso);
                            soma += (nota * peso);
                    }
                } while (reinserirNota);
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
