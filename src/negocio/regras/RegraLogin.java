package negocio.regras;

import java.sql.SQLException;
import negocio.Login;
import negocio.excecoes.LoginException;
import negocio.iRepositorioCliente;
import persistencia.RepositorioCliente;

/**
 *
 * @author EDVALDO
 */
public class RegraLogin {

    public void validarLogin(Login login) throws LoginException {

        if (login.getUsuario().equals("") || login.getSenha().equals("")) {
            throw new LoginException();

        }

    }

    public void efetuarLogin(Login login) throws LoginException, SQLException {
        validarLogin(login);
        if (login.isAdm()) {
            //código pra verificar no repositorio de adms se o login existe
        } else {
            //Códico pra verificar no repositorio de clientes se o login existe             
            iRepositorioCliente r = new RepositorioCliente();
            r.logarCliente(login);

        }

    }
}
