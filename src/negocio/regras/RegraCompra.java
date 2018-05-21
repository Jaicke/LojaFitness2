package negocio.regras;

import negocio.Produto;

/**
 *
 * @author EDVALDO
 */
public class RegraCompra {

    public float calculaValor(Produto p) {
        float total = 0;
        total += p.getQuantidade() * p.getValorTotal();
        return total;

    }

    public float removerProduto(float total, int qtd, float preco) {
        if (total > 0) {
            total -= qtd * preco;
            return total;
        }
        return total;

    }

    public float geraParcela(float total, int nParcela) {
        float valorParcelado = total / nParcela;
        return valorParcelado;
    }

}
