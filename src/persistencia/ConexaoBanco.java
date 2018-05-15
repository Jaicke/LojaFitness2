package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBanco {

    private static final String banco = "jdbc:mysql://localhost:3306/mydb";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String usuario = "root";
    private static final String senha = "";
    private static Connection con = null;

    public ConexaoBanco() {

    }

    public static Connection getConexao(){
        if (con == null) {
            try {
                con = DriverManager.getConnection(banco, usuario, senha);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro de SQL:" + ex.getMessage());
            }
            
        }
        return con;
        
    }

    public static PreparedStatement getPreparedStatement(String sql) throws SQLException {
        if (con == null) {
            con = getConexao();
        }
        try {
            return con.prepareStatement(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
        }
        return null;
    }

}
