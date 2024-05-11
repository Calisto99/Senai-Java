package tipos_primitivos;
import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.time.temporal.IsoFields;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quando Hello World? ");
        int n = sc.nextInt();

        for(int i = 0; i<n;i++){

            System.out.println("#"+ (i+1)+" Hello World!");
        }

        System.out.print("Informe o nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Infome a idade: ");
        int idade = sc.nextInt();
        System.out.print("Informe a altura: ");
        double altura = sc.nextDouble();

        System.out.print("Nome: " + nome + "\nIdade: "+ idade + "\nAltura: " + altura);




        sc.close();
    }


}