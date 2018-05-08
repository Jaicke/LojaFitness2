/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.regras;

import negocio.Produto;

/**
 *
 * @author EDVALDO
 */
public class RegraCadastroProduto {
    
    public void somaEstoque(Produto produto){
        produto.setEstoqueAtual(produto.getEstoqueAtual() + produto.getQuantidade());
    }
}
