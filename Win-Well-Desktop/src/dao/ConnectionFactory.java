package dao;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
    
    public Connection getConexao(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/agenda", "root", "");
        }catch(Exception erro){
            throw new RuntimeException("Erro 1: " + erro);
        }
    }
}
