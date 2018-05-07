package negocio.regras;

import negocio.Cliente;
import negocio.LoginCadastroException;

public class RegrasCadastroClientes extends Cliente {

    public void ValidarCadastroCliente() throws LoginCadastroException {
        if (getUsuario().equals("") || getSenha().equals("") || getNome().equals("") || getCpf().equals("") || getEmail().equals("") || getTelefone().equals("") || getDataNascimento().equals("")) {
            throw new LoginCadastroException();
        }
    }
}
