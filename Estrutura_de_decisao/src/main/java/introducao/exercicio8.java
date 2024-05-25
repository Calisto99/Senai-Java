package introducao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double minutos = 0.0, franquia = 2.30, limite = 100.0, resultado = 0.0;

        System.out.println("Quantos minutos usou? ");
        minutos = sc.nextDouble();

        if (minutos > limite ) {
            resultado = (minutos - limite) * franquia + 79.30;
            System.out.printf("Valor da fatura: %.2f",resultado);
        }

    }
}
