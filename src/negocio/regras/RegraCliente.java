package negocio.regras;

import java.sql.SQLException;
import java.util.List;
import negocio.Cliente;
import negocio.iRepositorioCliente;
import persistencia.RepositorioCliente;

/**
 *
 * @author EDVALDO
 */
public class RegraCliente {
    iRepositorioCliente cliente = new RepositorioCliente();
    
    public List getLista() throws SQLException{
        return cliente.getLista();        
    }
    
    public boolean removerCliente(Cliente c) throws SQLException{
        return cliente.removerCliente(c);
    }
    
    public boolean salvarCliente(Cliente c) throws SQLException{
        return cliente.salvarCliente(c);
    }
}
