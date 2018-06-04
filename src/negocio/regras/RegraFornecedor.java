package negocio.regras;

import java.sql.SQLException;
import java.util.List;
import negocio.Fornecedor;
import negocio.iRepositorioFornecedor;
import persistencia.RepositorioFornecedor;

/**
 *
 * @author EDVALDO
 */
public class RegraFornecedor {
    iRepositorioFornecedor fornecedor = new RepositorioFornecedor();
    
    public List getLista() throws SQLException{
        return fornecedor.getLista();        
    }
    
    public boolean removerFornecedor(Fornecedor f) throws SQLException{
        return fornecedor.removerFornecedor(f);
    }
    
    public boolean salvarFornecedor(Fornecedor f) throws SQLException{
        return fornecedor.salvarFornecedor(f);
    }
}
