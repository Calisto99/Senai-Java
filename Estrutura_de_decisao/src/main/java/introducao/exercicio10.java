package introducao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nome = "", classificacao = "";
        double peso = 0.0, altura = 0.0, imc;

        System.out.print("PFV informe seu nome: ");
        nome = sc.nextLine();

        System.out.println("Olá "+ nome + ", vamos calcular seu IMC");

        System.out.print("Informe seu peso: ");
        peso = sc.nextDouble();

        System.out.println();

        System.out.print("Agora " + nome + " precisamos da sua Altura: ");
        altura = sc.nextDouble();

        imc = peso/(altura*altura);

        if(imc<18.5){
            classificacao = "MAGÃO";
        }else if(imc > 18.5 && imc<24.9 ){
            classificacao = "NORMS";
        }else if(imc > 24.9 && imc<30 ){
            classificacao = "SOBREPESO";
        }else if(imc > 29.9 && imc<35 ){
            classificacao = "OBESIDADE GRAU 1";
        } else if (imc > 34.9 && imc<40 ) {
            classificacao = "OBESIDADE GRAU 2";
        } else if (imc > 40) {
            classificacao = "OBESIDADE GRAU 3";
            
        }


        System.out.println("OBG por utilizar o programa, seu IMC é igual a " + imc + "E sua classificação é: " + classificacao );

    }
}
