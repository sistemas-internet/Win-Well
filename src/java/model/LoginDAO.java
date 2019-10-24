/**
 * model/PessoaDAO.java
 */
package model;

import model.bean.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.ConnectionFactory;

/**
 * Classe Model para o objeto Pessoa (CRUD)
 */
public class LoginDAO {

    // Variável para receber a conexão do banco de dados
    private final Connection conexao;

    /**
     * Método construtor da classe que recebe uma conexão ao ser instanciada
     *
     * @throws java.sql.SQLException
     */
    public LoginDAO() throws SQLException {
        // Recebe a conexão com o banco de dados
        this.conexao = ConnectionFactory.getInstance().getConnection();
    }
    /**
     * Método Pesquisar - Realiza a pesquisa de um registro específico pelo ID
     *
     * @param p Objeto Pessoa
     * @return List Lista com registros encontrados
     * @throws java.sql.SQLException
     */
    public List<Login> pesquisar(Login l) throws SQLException {

        // Instrução SQL para recuperar os registros
        String sql = "SELECT * FROM usuarios where email = ? AND senha = ?";

        // Lista para receber os registros recuperados
        List lstPessoas = new ArrayList();

        try ( // Prepara a instrução SQL para ser enviada ao banco de dados
                PreparedStatement ps = conexao.prepareStatement(sql)) {
            // Inclui o valor informado a ser atribuido à instrução SQL
            ps.setString(1, l.getEmail());
            ps.setString(2, l.getSenha());

            try ( // Objeto que armazenará os dados recuperados (recordSet)
                    ResultSet rs = ps.executeQuery()) {
                /**
                 * Percorre os registros retornados do banco e coloca em uma
                 * lista
                 */
                while (rs.next()) {
                    // Cria um objeto Pessoa (bean)
                    l = new Login();

                    // Atribui ao objeto Pessoa os valores retornados do banco
                    l.setEmail(rs.getString("email"));
                    l.setEmail(rs.getString("senha"));
                    l.setEmail(rs.getString("nome"));
                    

                    // Adiciona o objeto Pessoa na lista de pessoas
                    lstPessoas.add(l);
                }
            }
        }

        // Fecha a conexão
        conexao.close();

        // Retorna a lista com as pessoas encontradas
        return lstPessoas;
    }
}
