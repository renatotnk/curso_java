package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :) ");
    }
    
    // Nao checada ou nao verifica
    // Se nao quiser, nao precisa especificar que lança exceção
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro bem legal #01");
    }

    // Exceção checada ou verificada
    // Se nao for exceção em tempo de execução,
        // deve-se verificar exceção na assinatura da funções 
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro bem legal #02");
    }
}
