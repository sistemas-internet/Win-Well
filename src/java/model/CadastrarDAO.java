package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.Cadastrar;
import utils.ConnectionFactory;


/**
 *
 * @author Rodriigo Santos
 */
public class CadastrarDAO {
    
    // Variável para receber a conexão do banco de dados
    private final Connection conexao;
    
    /**
     * Método construtor da classe que recebe uma conexão ao ser instanciada
     *
     * @throws java.sql.SQLException
     */
    public CadastrarDAO() throws SQLException {
        // Recebe a conexão com o banco de dados
        this.conexao = ConnectionFactory.getInstance().getConnection();
    }
    
    public String inserir(Cadastrar c) throws SQLException {

        // Instrução SQL para inclusão do registro
        String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";

        try {
            try ( // Prepara a instrução SQL para ser enviada ao banco de dados
                    PreparedStatement ps = conexao.prepareStatement(sql)) {

                // Inclui os valores a serem atribuidos à instrução SQL
                ps.setString(1, c.getNome());
                ps.setString(2, c.getEmail());
                ps.setString(3, c.getSenha());
                
                /*
                ps.setString(1, "rodrigo");
                ps.setString(2, "Rodrigo@gmail.com");
                ps.setString(3, "senha");
                */

                // Executa a instrução de inclusão do registro
                ps.execute();
            }

            // Fecha a conexão
            conexao.close();

            // Retorna uma mensagem de sucesso
            return "Registro incluído com sucesso! <a href='index.html'>Clique aqui para fazer login</a>";

        } catch (SQLException e) {

            // Retorna uma mensagem de erro
            return e.getMessage();
        }
    }
    
}
