package introducao;

import java.util.Locale;
import java.util.Scanner;

public class estrutura {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n1,n2,media;
        int n = 0;
        System.out.println("Quando valos deseja digitar? ");
        n = sc.nextInt();
        double soma = 0.0;

        for(int i=0;i<n;i++){
            System.out.println("Digite o valor " + (i+1));
            soma += sc.nextDouble();
        }
        media = soma/n;

        if(media > 7){
            System.out.printf("Média = %.2f Aprovado",media);
        }else if(media > 5 && media < 8){
            System.out.printf("Média = %.2f Recuperação",media);
        }else{
            System.out.printf("Média: %.2f Reprovado",media);
        }
    }
}
