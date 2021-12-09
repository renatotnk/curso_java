package fundamentos;

public class Ternario {
    public static void main(String[] args) {
        double media = 7.6;
        String resultadoRecuperacao = media >= 5.0 ? "em recuperacao" : "reprovado.";
        String resultado = media >= 7.0 ? "aprovado" : resultadoRecuperacao;

        System.out.println("O aluno esta " + resultado);
    }
}
