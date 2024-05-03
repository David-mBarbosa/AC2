package AC2;

import java.util.Scanner;

public class Aula7_AC2 {

    public static void main(String[] args) {

        float Peso1 = (0.15f), Peso2 = (0.30f), Peso3 = (0.10f), Peso4 = (0.45f), Pesos = (Peso1 + Peso2 + Peso3 + Peso4);
            Scanner scanner = new Scanner(System.in);
            float soma, media = 0.0f;

            System.out.println("Calculadora de média FACENS");

            System.out.println("Digite a nota da AC1");
                soma = Peso1 * scanner.nextFloat();
            System.out.println("Digite a nota da AC2");
                soma = soma + Peso2 * scanner.nextFloat();
            System.out.println("Digite a nota da AG");
                soma = soma + Peso3 * scanner.nextFloat();
            System.out.println("Digite a nota da AF");
                soma = soma + Peso4 * scanner.nextFloat();

        media = soma/Pesos;
            System.out.println("Qual a media minima da FACENS?");
                float mediamin = scanner.nextFloat();
            System.out.println("O aluno teve media : " + media);
            if (media <= 2) {
                System.out.println("O aluno foi reprovado");
            }else if (media > 2 && media < mediamin) {
                System.out.println("O aluno precisa fazer a prova substitutiva");
            }else{
                System.out.println("O aluno foi aprovado");
            }
        
        scanner.close();
    }
       
    }