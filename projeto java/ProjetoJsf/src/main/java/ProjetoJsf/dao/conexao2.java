package ProjetoJsf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class fabricaDeConexao {
	
	// teste 2 tetette
	
	private static final String URL = "jdbc:sqlserver://xxxxxx:xxxxxx;databaseName=xxxxxx";
	private static final String Senha = "xxxxxx";
	private static final String Login = "xxxxxxx";


	public static Connection Conectar() throws SQLException {
		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		Connection connection = DriverManager.getConnection(URL, Login, Senha);
		
		
		return connection;
		
	
	}
}
