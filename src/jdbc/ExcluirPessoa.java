package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();

        System.out.println("Informe o codigo da pessoa: ");
        int codigo = entrada.nextInt();

        String delete = "DELETE FROM pessoas where codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(delete);
        stmt.setInt(1, codigo);

        if(stmt.executeUpdate() > 0){
            System.out.println("Pessoa excluida com sucesso!");
        } else {
            System.out.println("A operacao falhou!");
        }
        
        conexao.close();
        entrada.close();
    }
}
