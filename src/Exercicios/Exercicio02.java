package Exercicios;

import java.util.Scanner;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o lado do quadrado: ");
        int lado = sc.nextInt();

        int area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

        sc.close();
    }
}
