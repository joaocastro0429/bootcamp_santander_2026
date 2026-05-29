package EstruturaCondicionaisERepeticao.Exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu peso:");
        double peso= sc.nextDouble();
        System.out.println("Informe sua altura:");
        double altura= sc.nextDouble();
        double IMC = peso/(altura * altura);
        {
            if (IMC < 18.5){
                System.out.println("Abaixo do peso");
            }
            else if(IMC > 18.6 && IMC <= 24.9){
                System.out.println("Peso ideal");
            }

            else if(IMC > 25 && IMC <= 29.9){
                System.out.println("Peso ideal");
            }
            else if(IMC > 30 && IMC <= 34.9){
                System.out.println("Obesidade Grau I");
            }
            else if(IMC > 35 && IMC <= 39.9){
                System.out.println("Obesidade Grau II");
            }
            else if(IMC > 40 && IMC <= 49.9){
                System.out.println("Obesidade Grau III");
            }
        }


    }
}
