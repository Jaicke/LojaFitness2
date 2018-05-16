/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lukas
 */
public interface iRepositorioFornecedor {
    public List<Fornecedor> getLista() throws SQLException;
    public boolean cadastrarFornecedor(Fornecedor fornecedor) throws SQLException;
    public boolean removerFornecedor(Fornecedor fornecedor) throws SQLException;
    public boolean editarFornecedor(Fornecedor fornecedor) throws SQLException;
    public boolean salvarFornecedor(Fornecedor fornecedor) throws SQLException;
}
