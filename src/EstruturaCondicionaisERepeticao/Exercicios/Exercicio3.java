package EstruturaCondicionaisERepeticao.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        int primeiroNumero = sc.nextInt();

        System.out.println("Informe o segundo numero:");
        int segundoNumero = sc.nextInt();

        // validação
        if (segundoNumero <= primeiroNumero) {
            System.out.println("O segundo numero deve ser maior que o primeiro.");
            return;
        }

        System.out.println("Escolha uma opcao:");
        System.out.println("1 - Par");
        System.out.println("2 - Impar");

        int opcao = sc.nextInt();

        // ordem decrescente
        for (int i = segundoNumero; i >= primeiroNumero; i--) {

            switch (opcao) {

                case 1:
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                    break;

                case 2:
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                    break;

                default:
                        System.out.println("Opcao invalida");
                    return;
            }
        }

        sc.close();
    }
}