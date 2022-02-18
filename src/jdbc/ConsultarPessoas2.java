package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();
        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%"+ nome + "%");

        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while(resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nomeTabela = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nomeTabela));
        }

        for(Pessoa p: pessoas){
            System.out.println(p.getCodigo() + "=>" + p.getNome());
        }

        entrada.close();
        stmt.close();
        conexao.close();
    }
}
