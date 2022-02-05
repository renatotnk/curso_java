package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(123.4);
        System.out.println(caixaA.abrir());

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(1234);
        System.out.println(caixaB.abrir());
    }
}
