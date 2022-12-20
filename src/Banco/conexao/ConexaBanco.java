package Banco.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaBanco {
	
	
    private String driver="org.hibernate.dialect.MySQL5InnoDBDialect";
    private String URL= "jdbc:mysql://localhost:3306/banco";
    private String USER= "root";
    private String SENHA="1234567890";
    
	private Connection conn;
 
    public ConexaBanco() {
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(URL, USER, SENHA);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Connection getConn() {
        return conn;
    }
}
