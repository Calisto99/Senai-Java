package tipos_primitivos;

import java.util.Locale;

public class Exercicio {
    public static void main(String[] args){

        String gameRPG = "LOL";
        String gameIndie = "Vava";

        int age = 35, code = 2367;
        char gender = 'M';

        double priceRPG = 107.80;
        double priceIndie = 46.99;

        double media = (priceRPG + priceIndie) / 2;

        System.out.println("Produtos:");
        System.out.printf(gameRPG + ", "+ "está custando: %.2f%n" , priceRPG);
        System.out.printf(gameIndie + ", " + "está custando: %.2f%n", priceIndie);
        System.out.println();

        System.out.println("O comprador tinha: " + age + " anos, " + "code " + code + " e genero: " + gender );

        System.out.printf("Média de valor de: %.6f%n", media );
        System.out.printf("Média de valor arredondado: %.2f%n", media);


        Locale.setDefault(Locale.US);

        System.out.printf("Média de valor arredondado no valor americano: %.2f", media);
    }
}
