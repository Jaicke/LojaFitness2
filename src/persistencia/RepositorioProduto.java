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
    public List<Produto> getLista() throws SQLException {
        String sql = "select * from produto";
        List<Produto> lista = new ArrayList<>();

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
            obj.setValorTotal(rs.getFloat("total"));
            lista.add(obj);
        }
        return lista;
    }

    @Override
    public boolean cadastrarProduto(Produto produto) throws SQLException {
        String sql = "insert into produto(nome, marca,categoria,quantidade,estoqueMinimo,estoqueAtual,valor,desconto,total)"
                + "values(?,?,?,?,?,?,?,?,?)";

        PreparedStatement pst = ConexaoBanco.getPreparedStatement(sql);

        pst.setString(1, produto.getNome());
        pst.setString(2, produto.getMarca());
        pst.setString(3, produto.getCategoria());
        pst.setInt(4, produto.getQuantidade());
        pst.setInt(5, produto.getEstoqueMinimo());
        pst.setInt(6, produto.getEstoqueAtual());
        pst.setFloat(7, produto.getValor());
        pst.setFloat(8, produto.getDesconto());
        pst.setFloat(9, produto.getValorTotal());
        if (pst.executeUpdate() > 0) {            
            return true;
        }else{
            return false;
        }

    }

    @Override
    public boolean removerProduto(Produto produto) throws SQLException {
        String sql = "delete from produto where codigo = ?";

        PreparedStatement pst = ConexaoBanco.getPreparedStatement(sql);
        pst.setInt(1, produto.getCodigo());
        if (pst.executeUpdate() > 0) {            
            return true;
        } else {            
            return false;
        }

    }

    @Override
    public boolean editarProduto(Produto produto) throws SQLException {
        String sql = "update produto set nome = ?, marca = ?, categoria = ?, quantidade = ?, estoqueMinimo = ?, estoqueAtual = ?, valor = ?, desconto = ?, total = ? where codigo = ?";

        PreparedStatement pst = ConexaoBanco.getPreparedStatement(sql);
        pst.setString(1, produto.getNome());
        pst.setString(2, produto.getMarca());
        pst.setString(3, produto.getCategoria());
        pst.setInt(4, produto.getQuantidade());
        pst.setInt(5, produto.getEstoqueMinimo());
        pst.setInt(6, produto.getEstoqueAtual());
        pst.setFloat(7, produto.getValor());
        pst.setFloat(8, produto.getDesconto());
        pst.setFloat(9, produto.getValorTotal());
        pst.setInt(10, produto.getCodigo());

        if (pst.executeUpdate() > 0) {            
            return true;
        } else {            
            return false;
        }

    }

    @Override
    public boolean salvarProduto(Produto produto) throws SQLException {
        if (produto.getCodigo() == null) {
            cadastrarProduto(produto);
        } else {
            editarProduto(produto);
        }
        return false;
    }

    @Override
    public Produto localizarProduto(String nome) throws SQLException {
        String sql = "select * from produto where nome like '%" + nome + "%';";
        Produto obj = new Produto();

        PreparedStatement pst = ConexaoBanco.getPreparedStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            obj.setCodigo(rs.getInt("codigo"));
            obj.setNome(rs.getString("nome"));
            obj.setMarca(rs.getString("marca"));
            obj.setCategoria(rs.getString("categoria"));
            obj.setQuantidade(rs.getInt("quantidade"));
            obj.setEstoqueMinimo(rs.getInt("estoqueMinimo"));
            obj.setEstoqueAtual(rs.getInt("estoqueAtual"));
            obj.setValor(rs.getFloat("valor"));
            obj.setDesconto(rs.getFloat("desconto"));
            obj.setValorTotal(rs.getFloat("total"));
            return obj;
        }

        return null;
    }
}
