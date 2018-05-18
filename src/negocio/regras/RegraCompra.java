package negocio.regras;

import negocio.Produto;

/**
 *
 * @author EDVALDO
 */
public class RegraCompra {
    public float addProduto(Produto p){
        float total = 0;
        total = p.getQuantidade()*p.getValorTotal();
        return total;
                
    }
    public float calculaTotal(Produto p){
        
        float totalCompra =+ addProduto(p);
        return totalCompra;
    }
    
}
