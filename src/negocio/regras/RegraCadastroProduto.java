/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.regras;

import negocio.Produto;
import negocio.excecoes.CadastroProdutoException;

/**
 *
 * @author EDVALDO
 */
public class RegraCadastroProduto {

    public void somaEstoque(Produto produto) {
        produto.setEstoqueAtual(produto.getEstoqueAtual() + produto.getQuantidade());
    }

    public void calculaValorTotal(Produto produto) {
        if (!(produto.getDesconto() == 0)) {
            produto.setValorTotal(produto.getValor() - (produto.getDesconto() * produto.getValor()));//Calulo de desconto
        }else{
            produto.setValorTotal(produto.getValor());//caso o desconto seja zero, considerar o valor base
        }
    }   
    
}
