/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Cliente;

/**
 *
 * @author EDVALDO
 */
public class RepositorioCliente {
    
     public List<Cliente> getList(){
        return Dados.listaCliente;
        
    }
    
    public boolean salvar(Cliente obj){
        if(obj.getId()== null){
            int codigo = Dados.listaCliente.size() + 1;
            obj.setId(codigo);
            Dados.listaCliente.add(obj);
        }
        return true;
    }
    
    public boolean remover(Cliente obj){
        Dados.listaCliente.remove(obj);
        return true;
    }
   
}
