package Exercicios;

import java.util.Scanner;

import java.util.Scanner;

public class Exercicios01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe o ano de nascimento: ");
        int anoNasc = sc.nextInt();

        int idade = 2026 - anoNasc;

        System.out.println("Olá " + nome + " você tem " + idade + " anos");

        sc.close();
    }
}

