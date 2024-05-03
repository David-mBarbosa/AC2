package AC2;

import java.util.Scanner;

public class Aula6_AC2 {
    
    public static void main(String[] args) {
        double Peso1 = (0.15), Peso2 = (0.30), Peso3 = (0.10), Peso4 = (0.45), Pesos = (Peso1 + Peso2 + Peso3 + Peso4);
        Scanner scanner = new Scanner(System.in);
        double soma, media = 0.0;

        System.out.println("Calculadora de média FACENS");

        System.out.println("Digite a nota da AC1");
            soma = Peso1 * scanner.nextDouble();
        System.out.println("Digite a nota da AC2");
            soma = soma + Peso2 * scanner.nextDouble();
        System.out.println("Digite a nota da AG");
            soma = soma + Peso3 * scanner.nextDouble();
        System.out.println("Digite a nota da AF");
            soma = soma + Peso4 * scanner.nextDouble();

        System.out.println("Qual a média da Facens?");
            double mediamin = scanner.nextDouble();
        media = soma/Pesos;
        System.out.println("O aluno teve media : " + media);
        if (media >= mediamin) {
            System.out.println("O Aluno foi aprovado");   
        }else{
            System.out.println("O Aluno foi reprovado");
        }
        scanner.close();
        
    }
}
