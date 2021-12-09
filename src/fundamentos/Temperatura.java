package fundamentos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor em Fahrenheit:");
        double fahrenheit = scan.nextInt();
        final double AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;
        System.out.println("O valor em Celsius é:" + ((fahrenheit - AJUSTE) * FATOR));
        scan.close();
    }
}
