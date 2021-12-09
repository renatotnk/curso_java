package fundamentos;

public class DesafioLogicos {
    public static void main(String[] args) {
        boolean trab1 = true;
        boolean trab2 = true;

        boolean Tv50 = trab1 && trab2;
        boolean Tv32 = trab1 ^ trab2;
        boolean sorvete = trab1 || trab2;

        System.out.println("Comprou TV 50\"? " + Tv50);
        System.out.println("Comprou TV 32\"? " + Tv32);
        System.out.println("Comprou sorvete\"? " + sorvete);
        

    }
}
