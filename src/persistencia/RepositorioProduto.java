package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import negocio.Produto;
import negocio.iRepositorioProduto;


public class RepositorioProduto implements iRepositorioProduto {

    @Override
    public List<Produto> getLista()  {
       String sql = "select * from produto";
        List<Produto> lista = new ArrayList<>();
        try {
            PreparedStatement pst = ConexaoBanco.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Produto obj = new Produto();
                obj.setCodigo(rs.getInt("codigo"));
                obj.setNome(rs.getString("nome"));
                obj.setMarca(rs.getString("marca"));
                obj.setCategoria(rs.getString("categoria"));
                obj.setQuantidade(rs.getInt("quantidade"));
                obj.setEstoqueMinimo(rs.getInt("estoqueMinimo"));
                obj.setEstoqueAtual(rs.getInt("estoqueAtual"));
                obj.setValor(rs.getFloat("valor"));
                obj.setDesconto(rs.getFloat("desconto"));
                obj.setValorTotal(rs.getFloat("valorTotal"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public boolean cadastrarProduto(Produto produto) throws SQLException {
        return false;
    }

    @Override
    public boolean removerProduto(Produto produto) throws SQLException {
        return false;
    }

    @Override
    public boolean atualizarProduto(Produto produto) throws SQLException {
     
       return false; 
    }



    @Override
    public boolean salvarProduto(Produto produto) throws SQLException {
        if(produto.getCodigo() == null){
            cadastrarProduto(produto);
        }else{
            atualizarProduto(produto);
        }
        return false;
    }
}
