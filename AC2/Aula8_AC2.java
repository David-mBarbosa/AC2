package AC2;

import java.util.Scanner;

public class Aula8_AC2 {
    public static void main(String[] args) {
        int cont;
        Scanner scanner = new Scanner(System.in);
        double soma,peso, media = 0.0;

        System.out.println("Calculadora de média ponderada");
            System.out.println("Quantas notas e pesos serão inseridos ?");
                int fim = scanner.nextInt();
                for (cont = 1; cont <= fim; cont++){
                    System.out.println("Qual o peso da nota "+ cont + " ?");
                        peso = scanner.nextDouble();
                    System.out.println("Qual a nota "+ cont + " ?");
                        soma = scanner.nextDouble()*peso;
                    for (cont = 2; cont <= fim; cont++){
                        System.out.println("Qual o peso da nota "+ cont + " ?");
                            peso = scanner.nextDouble();
                        System.out.println("Qual a nota "+ cont + " ?");
                            soma = soma + scanner.nextDouble()*peso;
                    }
                    media = soma;
                }
            System.out.println("Qual a media minima da instituição?");
                float mediamin = scanner.nextFloat();
            System.out.println("O aluno teve media : " + media);
            if (media <= 2) {
                System.out.println("O aluno foi reprovado");
            }else if (media > 2 && media < mediamin) {
                System.out.println("O aluno precisa fazer a prova substitutiva");
            }else{
                System.out.println("O aluno foi aprovado");
            }
        
        }
}



