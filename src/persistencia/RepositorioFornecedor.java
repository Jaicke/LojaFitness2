/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Fornecedor;


/**
 *
 * @author EDVALDO
 */
public class RepositorioFornecedor {
    
     public List<Fornecedor> getList(){
        return Dados.listaFornecedor;
        
    }
    
    public boolean salvar(Fornecedor obj){
        if(obj.getId()== null){
            int codigo = Dados.listaFornecedor.size() + 1;
            obj.setId(codigo);
            Dados.listaFornecedor.add(obj);
        }
        return true;
    }
    
    public boolean remover(Fornecedor obj){
        Dados.listaFornecedor.remove(obj);
        return true;
    }
}
