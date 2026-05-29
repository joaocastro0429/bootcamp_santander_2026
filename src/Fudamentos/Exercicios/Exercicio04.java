package Fudamentos.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro nome: ");
        String nome1 = sc.nextLine();

        System.out.println("Digite a primeira idade: ");
        int idade1 = sc.nextInt();

        sc.nextLine(); // limpa o buffer

        System.out.println("Digite o segundo nome: ");
        String nome2 = sc.nextLine();

        System.out.println("Digite a segunda idade: ");
        int idade2 = sc.nextInt();

        int diferencaDeIdade = Math.abs(idade1 - idade2);

        System.out.println("A diferença de idade entre "
                + nome1 + " e " + nome2
                + " é: " + diferencaDeIdade + " anos");

        sc.close();
    }
}