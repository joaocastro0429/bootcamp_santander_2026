package EstruturaCondicionaisERepeticao.Exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int primeiroNumero = sc.nextInt();

        int numero;

        do {

            System.out.println("Digite outro numero:");
            numero = sc.nextInt();

            // ignora numeros menores
            if (numero < primeiroNumero) {
                System.out.println("Numero ignorado");
            }

        } while (numero < primeiroNumero || numero % primeiroNumero == 0);

        System.out.println("Programa encerrado");

        sc.close();
    }
}