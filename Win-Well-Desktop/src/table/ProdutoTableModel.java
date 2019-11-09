package table;
import model.Pessoa;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ProdutoTableModel extends AbstractTableModel{

    public static final int COL_ID = 0;    
    public static final int COL_NOME = 1;
    public static final int COL_TELEFONE = 2;    
    public static final int COL_EMAIL = 3;
    public static final int COL_CEP = 4;
    public static final int COL_LOGRADOURO = 5;
    public static final int COL_BAIRRO = 6;
    public static final int COL_CIDADE = 7;
    public static final int COL_ESTADO = 8;

    public ArrayList<Pessoa> lista;
      
    public ProdutoTableModel(ArrayList<Pessoa>l){
        lista = new ArrayList<Pessoa>(l);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Pessoa pessoa = lista.get(linhas);
        if(colunas == COL_ID) return pessoa.getId();
        if(colunas == COL_NOME) return pessoa.getNome();
        if(colunas == COL_TELEFONE) return pessoa.getTelefone();
        if(colunas == COL_EMAIL) return pessoa.getEmail();
        if(colunas == COL_CEP) return pessoa.getCep();
        if(colunas == COL_LOGRADOURO) return pessoa.getLogradouro();
        if(colunas == COL_BAIRRO) return pessoa.getBairro();
        if(colunas == COL_CIDADE) return pessoa.getCidade();
        if(colunas == COL_ESTADO) return pessoa.getEstado();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas == COL_ID) return "Código";
        if(colunas == COL_NOME) return "Nome";
        if(colunas == COL_TELEFONE) return "Telefone";
        if(colunas == COL_EMAIL) return "E-mail";
        if(colunas == COL_CEP) return "Cep";
        if(colunas == COL_LOGRADOURO) return "Logradouro";
        if(colunas == COL_BAIRRO) return "Bairro";
        if(colunas == COL_CIDADE) return "Cidade";
        if(colunas == COL_ESTADO) return "Estado";
        
        return "";
    }
    
}
