package negocio.regras;

import negocio.LoginCadastroException;
import negocio.Usuario;

public class RegrasLogin extends Usuario {

    public void validarLogin() throws LoginCadastroException {

        if (getUsuario().equals("") || getSenha().equals("")) {
            throw new LoginCadastroException();
            
        }
        
    }
}
