package ProjetoJsf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class fabricaDeConexao {
	
	private static final String URL = "jdbc:sqlserver://10.0.0.204:1433;databaseName=SYSEG";
	private static final String Senha = "CHk2v3";
	private static final String Login = "db_prod";


	public static Connection Conectar() throws SQLException {
		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		Connection connection = DriverManager.getConnection(URL, Login, Senha);
		return connection;
	}
}
