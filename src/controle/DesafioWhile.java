package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double soma = 0;
        int count = 0;
        double nota = 0;

        while(nota != -1){
            System.out.print("Informe a nota: ");
            nota = entrada.nextDouble();
            if(nota >= 0 && nota <= 10){
                soma += nota;
                count++;
            } 
        }

        double media = soma / count;
        System.out.println("Média = " + media);


        entrada.close();
    }
}
