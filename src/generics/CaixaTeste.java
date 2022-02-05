package generics;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Segredo");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.14159265);

        String coisaB = caixaA.abrir();
        System.out.println(coisaB);
    }
}
