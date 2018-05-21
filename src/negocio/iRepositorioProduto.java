package negocio;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author EDVALDO
 */
public interface iRepositorioProduto {
    public List<Produto> getLista() throws SQLException;
    public boolean cadastrarProduto(Produto produto) throws SQLException;
    public boolean removerProduto(Produto produto) throws SQLException;
    public boolean editarProduto(Produto produto) throws SQLException;
    public boolean salvarProduto(Produto produto) throws SQLException;
    public Produto localizarProduto(String nome) throws SQLException;
}
