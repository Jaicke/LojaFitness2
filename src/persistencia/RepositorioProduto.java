package persistencia;


import java.util.List;
import negocio.Produto;


public class RepositorioProduto {

    public List<Produto> getLista(){
        return Dados.listaProduto;
        
    }
    
    public boolean salvar(Produto obj){
        if(obj.getCodigo() == null){
            int codigo = Dados.listaProduto.size() + 1;
            obj.setCodigo(codigo);
            Dados.listaProduto.add(obj);
        }
        return true;
    }
    
    public boolean remover(Produto obj){
        Dados.listaProduto.remove(obj);
        return true;
    }
    

}
