package lambdas;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Function<Produto, Double> desconto = 
                (Produto p) -> p.preco * (1 - p.desconto);

        UnaryOperator<Double> imposto = 
                (Double preco) -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete = 
                (Double preco) -> preco >= 3000 ? preco + 100 : preco + 50;
        
        UnaryOperator<Double> arredondar = 
                (Double preco) -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", preco));

        Function<Double, String> formatar = 
                (Double preco) -> ("R$ " + preco).replace(".",",");

        Produto p = new Produto("iPad", 3253.89, 0.13); 

        String preco = desconto
            .andThen(imposto)
            .andThen(frete)
            .andThen(arredondar)
            .andThen(formatar)
            .apply(p);
        System.out.println("O preco final eh: " + preco);
    }
}
