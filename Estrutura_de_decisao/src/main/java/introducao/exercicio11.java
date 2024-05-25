package introducao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        int cod = 0;

        System.out.print("Digite sua escolha: ");
        cod = sc.nextInt();
        String lanche = "";
        Double valor = 0.0;

        switch (cod) {
            case 1:
                lanche = "Mc Lanche Feliz";
                valor = 27.9;
                break;
            case 15:
                lanche = "Panqueca";
                valor = 10.55;
                break;
            case 32:
                lanche = "Waffle";
                valor = 9.99;
                break;
            case 25:
                lanche = "Chocotone";
                valor = 15.22;
                break;
            case 46:
                lanche = "Java Coffe";
                valor = 12.3;
                break;
            case 2:
                lanche = "Whopper";
                valor = 15.0;
                break;
            default:
                lanche = "Escolha um código valido";
        }
                System.out.print("Digite a quantidade: ");
                int quantidade = sc.nextInt();


                double resultado = quantidade * valor;

                System.out.printf("O item %s comprando %d unidades, saira por %.2f", lanche, quantidade, resultado);

                sc.close();

    }
}
