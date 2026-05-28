package EstruturaCondicionaisERepeticao;

import java.util.Scanner;

public class EstruturaDeControle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por gentileza informar sua idade:");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        }else if(idade<15){
            System.out.println("adolecente");
        }else {
            System.out.println("Menor de idade");
        }

        switch (idade){
            case 1:
                System.out.println("Maior de idade");
                break;
                case 2:
                    System.out.println("Menor de idade");
                    break;
                    case 3:
                        System.out.println("Maior de idade");
                        break;
                        case 4:
                        System.out.println("Menor de idade");
                        break;
            default:
                    System.out.println("Menor de idade");

        }

        sc.close();
    }
}