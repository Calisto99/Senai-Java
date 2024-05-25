package introducao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        int dia;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dia da semana de hoje: ");
        dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Hoje é segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabadão");
                break;
            case 7:
                System.out.println("Domingão");

            default:
                System.out.println("Digite um dia valido");
        }

    }
}
