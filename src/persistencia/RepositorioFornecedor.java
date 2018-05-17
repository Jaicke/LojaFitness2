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
import negocio.Fornecedor;
import negocio.iRepositorioFornecedor;


/**
 *
 * @author EDVALDO
 */
public class RepositorioFornecedor implements iRepositorioFornecedor{

    @Override
    public List<Fornecedor> getLista() throws SQLException {
        String sql = "select * from fornecedor";
        List<Fornecedor> lista = new ArrayList<>();
        try {
            PreparedStatement pst = ConexaoBanco.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Fornecedor obj = new Fornecedor();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome_representante"));
                obj.setRua(rs.getString("rua"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));
                obj.setCep(rs.getString("cep"));
                obj.SetCelular(rs.getString("celular_representante"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setNomeEmpresa(rs.getString("nome_empresa"));
                obj.setTelefoneEmpresa(rs.getString("telefone_empresa"));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
        }
        return lista;
    }

    @Override
    public boolean cadastrarFornecedor(Fornecedor fornecedor) throws SQLException {
        String sql = "insert into fornecedor(nome_representante, rua, complemento, bairro, cidade, uf, cep, celular_representante, cnpj, nome_empresa, telefone_empresa)"
                + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = ConexaoBanco.getPreparedStatement(sql);
            
            pst.setString(1, fornecedor.getNome());
            pst.setString(2, fornecedor.getRua());
            pst.setString(3, fornecedor.getComplemento());
            pst.setString(4, fornecedor.getBairro());
            pst.setString(5, fornecedor.getCidade());
            pst.setString(6, fornecedor.getUf());
            pst.setString(7, fornecedor.getCep());
            pst.setString(8, fornecedor.getCelular());
            pst.setString(9, fornecedor.getCnpj());
            pst.setString(10, fornecedor.getNomeEmpresa());
            pst.setString(11, fornecedor.getTelefoneEmpresa());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado com êxito");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Fornecedor não Cadastrado, tente novamente");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro de SQL:" + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean removerFornecedor(Fornecedor fornecedor) throws SQLException {
        String sql = "delete from fornecedor where id = ?";
        try{
            PreparedStatement pst = ConexaoBanco.getPreparedStatement(sql);
            pst.setInt(1, fornecedor.getId());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Fornecedor deletado com êxito");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Fornecedor não deletado");
                return false;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de SQL:" + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean editarFornecedor(Fornecedor fornecedor) throws SQLException {
        String sql = "update produto set nome_representante = ?, rua = ?, complemento = ?, bairro = ?, cidade = ?, uf = ?, cep = ?, celular_representante = ?, cnpj = ?, nome_empresa = ?, telefone_empresa = ? where id = ?";
                 
        try{
            PreparedStatement pst = ConexaoBanco.getPreparedStatement(sql);
            pst.setString(1, fornecedor.getNome());
            pst.setString(2, fornecedor.getRua());
            pst.setString(3, fornecedor.getComplemento());
            pst.setString(4, fornecedor.getBairro());
            pst.setString(5, fornecedor.getCidade());
            pst.setString(6, fornecedor.getUf());
            pst.setString(7, fornecedor.getCep());
            pst.setString(8, fornecedor.getCelular());
            pst.setString(9, fornecedor.getCnpj());
            pst.setString(10, fornecedor.getNomeEmpresa());
            pst.setString(11, fornecedor.getTelefoneEmpresa());
            
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor Alterado com êxito");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Fornecedor não Alterado, tente novamente");
                return false;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de SQL:" + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean salvarFornecedor(Fornecedor fornecedor) throws SQLException {
        if (fornecedor.getId() == null) {
            cadastrarFornecedor(fornecedor);
        } else {
            editarFornecedor(fornecedor);
        }
        return false;
    }
    
    
}
