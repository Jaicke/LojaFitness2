package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBanco {

    private static final String banco = "jdbc:mysql://localhost:3306/scriptobviamente";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String usuario = "root";
    private static final String senha = "";
    private static Connection conexao = null;

    public ConexaoBanco() {

    }

    public static Connection getConexao(){
        if (conexao == null) {
            try {
                conexao = DriverManager.getConnection(banco, usuario, senha);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro de SQL:" + ex.getMessage());
            }
            
        }
        return conexao;
        
    }

    public static PreparedStatement getPreparedStatement(String sql) throws SQLException {
        if (conexao == null) {
            conexao = getConexao();
        }
        try {
            return conexao.prepareStatement(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
        }
        return null;
    }

}
