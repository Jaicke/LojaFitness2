/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.regras;

import java.sql.SQLException;
import java.util.List;
import negocio.Produto;
import negocio.excecoes.CadastroProdutoException;
import negocio.iRepositorioProduto;
import persistencia.RepositorioProduto;

/**
 *
 * @author EDVALDO
 */
public class RegraProduto {
    iRepositorioProduto produto = new RepositorioProduto();
    
    public List getLista() throws SQLException{
        return produto.getLista();        
    }
    
    public boolean removerProduto(Produto p) throws SQLException{
        return produto.removerProduto(p);
    }
    
    public boolean salvarProduto(Produto p) throws SQLException{
        return produto.salvarProduto(p);
    }

    public void somaEstoque(Produto produto) {
        produto.setEstoqueAtual(produto.getEstoqueAtual() + produto.getQuantidade());
    }

    public void calculaValorTotal(Produto produto) {
        if (!(produto.getDesconto() == 0)) {
            produto.setValorTotal(produto.getValor() - ((produto.getDesconto()/100) * produto.getValor()));//Calulo de desconto
        }else{
            produto.setValorTotal(produto.getValor());//caso o desconto seja zero, considerar o valor base
        }
    }
    
    
}
