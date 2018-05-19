package negocio;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author EDVALDO
 */
public interface iRepositorioCliente {
    public List<Cliente> getLista() throws SQLException;
    public boolean cadastrarCliente(Cliente cliente) throws SQLException;
    public boolean removerCliente(Cliente cliente) throws SQLException;
    public boolean editarCliente(Cliente cliente) throws SQLException;
    public boolean salvarCliente(Cliente cliente) throws SQLException;
    public void logarCliente(Login login) throws SQLException;
    
}
