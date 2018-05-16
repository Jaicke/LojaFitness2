/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import negocio.Cliente;
import negocio.iRepositorioCliente;

/**
 *
 * @author EDVALDO
 */
public class RepositorioCliente implements iRepositorioCliente {

    @Override
    public List<Cliente> getLista() throws SQLException {
        String sql = "select * from cliente";
        List<Cliente> lista = new ArrayList<>();
        try {
            PreparedStatement pst = ConexaoBanco.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Cliente obj = new Cliente();
                obj.setNome(rs.getString("nome"));
                obj.setRua(rs.getString("rua"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));
                obj.setCep(rs.getString("cep"));
                obj.SetCelular(rs.getString("celular"));
                obj.setDataNascimento(rs.getString("dataNascimento"));
                obj.setCpf(rs.getString("cpf"));
                obj.setRg(rs.getString("rg"));
                obj.setEmail(rs.getString("email"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public boolean cadastrarCliente(Cliente cliente) throws SQLException {
        String sql = "insert into cliente(nome, rua, complemento, bairro, cidade, uf, cep, celular, dataNascimento, cpf, rg, email)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = ConexaoBanco.getPreparedStatement(sql);

            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getRua());
            pst.setString(3, cliente.getComplemento());
            pst.setString(4, cliente.getBairro());
            pst.setString(5, cliente.getCidade());
            pst.setString(6, cliente.getUf());
            pst.setString(7, cliente.getCep());
            pst.setString(8, cliente.getCelular());
            pst.setString(9, cliente.getDataNascimento());
            pst.setString(10, cliente.getCpf());
            pst.setString(11, cliente.getRg());
            pst.setString(12, cliente.getEmail());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente Cadastrado com êxito");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não Cadastrado, tente novamente");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL:" + ex.getMessage());
            return false;
        }

    }

    @Override
    public boolean removerCliente(Cliente cliente) throws SQLException {
        String sql = "delete from produto where codigo = ?";
        try {
            PreparedStatement pst = ConexaoBanco.getPreparedStatement(sql);
            pst.setInt(1, cliente.getId());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente deletado com êxito");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não deletado");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL:" + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean editarCliente(Cliente cliente) throws SQLException {
        String sql = "update cliente set nome = ?, rua = ?, complemento = ?, bairro = ?, cidade = ?, uf = ?, cep = ?, celular = ?, dataNascimento = ?, cpf = ?, rg = ?, email = ? where id = ?";

        try {
            PreparedStatement pst = ConexaoBanco.getPreparedStatement(sql);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getRua());
            pst.setString(3, cliente.getComplemento());
            pst.setString(4, cliente.getBairro());
            pst.setString(5, cliente.getCidade());
            pst.setString(6, cliente.getUf());
            pst.setString(7, cliente.getCep());
            pst.setString(8, cliente.getCelular());
            pst.setString(9, cliente.getDataNascimento());
            pst.setString(10, cliente.getCpf());
            pst.setString(11, cliente.getRg());
            pst.setString(12, cliente.getEmail());
            pst.setInt(13, cliente.getId());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente Alterado com êxito");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não Alterado, tente novamente");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL:" + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean salvarCliente(Cliente cliente) throws SQLException {
        if (cliente.getId() == null) {
            cadastrarCliente(cliente);
        } else {
            editarCliente(cliente);
        }
        return false;
    }

}
