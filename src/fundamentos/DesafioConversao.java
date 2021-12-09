package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro salário:");
        String primeiro = teclado.next().replace(",", ".");

        System.out.println("Digite o segundo salário:");
        String segundo = teclado.next().replace(",", ".");;

        System.out.println("Digite o terceiro salário:");
        String terceiro = teclado.next().replace(",", ".");;

        double media = (Double.parseDouble(primeiro) + Double.parseDouble(segundo) + Double.parseDouble(terceiro)) / 3;

        System.out.printf("Média do Salário: %f\n", media);

        teclado.close();
    }
}
