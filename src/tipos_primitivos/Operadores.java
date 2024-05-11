package tipos_primitivos;

import java.util.Locale;
import java.util.Scanner;

public class Operadores {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a operação opções: + ou - ou / ou * ");
        String opcao = sc.nextLine();

        int numInt1, numInt2;
        double numDouble1, numDouble2, result;
        switch (opcao) {
            case "+":
                System.out.println("Numero 1");
                numInt1 = sc.nextInt();
                System.out.println("Numero 2");
                numInt2 = sc.nextInt();
                result = numInt1 + numInt2;
                System.out.println("Resultado: " +result );
                break;
            case "-":
                System.out.println("Numero 1");
                numInt1 = sc.nextInt();
                System.out.println("Numero 2");
                numInt2 = sc.nextInt();
                result = numInt1 - numInt2;
                System.out.println("Resultado: " +result );
                break;
            case "/":
                System.out.println("Numero 1");
                numDouble1 = sc.nextInt();
                System.out.println("Numero 2");
                numDouble2 = sc.nextInt();
                result = numDouble1 / numDouble2;
                System.out.println("Resultado: " +result );
                break;
            case "*":
                System.out.println("Numero 1");
                numDouble1 = sc.nextInt();
                System.out.println("Numero 2");
                numDouble2 = sc.nextInt();
                result = numDouble1 * numDouble2;
                System.out.println("Resultado: " +result );
                break;
            default:
                System.out.println("Escolha uma opção valida!!!!");
        }








    }
}
