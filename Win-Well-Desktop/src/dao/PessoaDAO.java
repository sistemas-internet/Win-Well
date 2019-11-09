package dao;
import java.sql.Connection;
import model.Pessoa;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Rodriigo Santos
 */
public class PessoaDAO {
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Pessoa> lista = new ArrayList<Pessoa>(); 
    
    public PessoaDAO(){
        conn = new ConnectionFactory().getConexao();
    }
    
    public void inserir(Pessoa pessoa){
        String sql = "INSERT INTO pessoa (nome, telefone, cep, logradouro, bairro, cidade, estado, email)"
                    +" VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    
        try{
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getTelefone());
            stmt.setInt(3, pessoa.getCep());
            stmt.setString(4, pessoa.getLogradouro());
            stmt.setString(5, pessoa.getBairro());
            stmt.setString(6, pessoa.getCidade());
            stmt.setString(7, pessoa.getEstado());
            stmt.setString(8, pessoa.getEmail());
            
            stmt.execute();
            stmt.close();
        }catch(Exception erro){
            throw new RuntimeException("Erro 2: " + erro);
        }
    }
    
    public void alterar(Pessoa pessoa){
        String sql = "UPDATE pessoa SET nome=?, telefone=?, cep=?, logradouro=?, bairro=?, cidade=?,"
                + " estado=?, email=? WHERE id=?";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setInt(2, pessoa.getTelefone());
            stmt.setInt(3, pessoa.getCep());
            stmt.setString(4, pessoa.getLogradouro());
            stmt.setString(5, pessoa.getBairro());
            stmt.setString(6, pessoa.getCidade());
            stmt.setString(7, pessoa.getEstado());
            stmt.setString(8, pessoa.getEmail());
            stmt.setInt(9, pessoa.getId());
            
            stmt.execute();
            stmt.close();
        }catch(Exception erro){
            throw new RuntimeException("Erro 3: " + erro);
        }
    }
    
    public void excluir(int valor){
        String sql = "DELETE FROM pessoa WHERE id = "+valor;
    
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
            
        }catch(Exception erro){
            throw new RuntimeException("Erro 4: " + erro);
        }
    }
    
    public ArrayList<Pessoa> listarTodos(){
        String sql = "SELECT * FROM pessoa";
                
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setTelefone(rs.getInt("telefone"));
                pessoa.setCep(rs.getInt("cep"));
                pessoa.setLogradouro(rs.getString("logradouro"));
                pessoa.setBairro(rs.getString("bairro"));
                pessoa.setCidade(rs.getString("cidade"));
                pessoa.setEstado(rs.getString("estado"));
                pessoa.setEmail(rs.getString("email"));
                
                
                
                lista.add(pessoa);
            }
        }catch(Exception erro){
            throw new RuntimeException("Erro 5: " + erro);
        }
        return lista;
    }
    
    public ArrayList<Pessoa> listarTodosDescricao(String valor){
        String sql = "SELECT * FROM pessoa WHERE nome LIKE '%"+valor+"%'";
                
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setTelefone(rs.getInt("telefone"));
                pessoa.setCep(rs.getInt("cep"));
                pessoa.setLogradouro(rs.getString("logradouro"));
                pessoa.setBairro(rs.getString("bairro"));
                pessoa.setCidade(rs.getString("cidade"));
                pessoa.setEstado(rs.getString("estado"));
                pessoa.setEmail(rs.getString("email"));
                
                lista.add(pessoa);
            }
        }catch(Exception erro){
            throw new RuntimeException("Erro 5: " + erro);
        }
        return lista;
    }
}
