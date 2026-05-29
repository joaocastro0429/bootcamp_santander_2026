package EstruturaCondicionaisERepeticao;

import java.util.Scanner;

public class EstruturaDeRepeticao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // WHILE
        System.out.println("Informe o seu número:");
        int numero = sc.nextInt();

        while (numero < 5) {
            System.out.println("Número: " + numero);
            numero++;
        }

        // DO WHILE
        do {
            System.out.println("Informe outro número:");
            numero = sc.nextInt();

        } while (numero < 5);

        // FOR
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        // FOR EACH
        String[] nomes = {"João", "Maria", "Pedro"};

        for (String nome : nomes) {
            System.out.println(nome);
        }

        sc.close();
    }
}