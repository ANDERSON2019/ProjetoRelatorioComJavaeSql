package ProjetoJsf.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ProjetoJsf.doman.relatorioDomain;

public class RelatorioDao {
	
	public ArrayList<relatorioDomain> lista() throws SQLException {
		
		CallableStatement sql = fabricaDeConexao.Conectar().prepareCall("{call.dbo.BuscaRelatorio}");
		
		ResultSet resultado = sql.executeQuery();
		ArrayList<relatorioDomain> lista = new ArrayList<>();
	    while (resultado.next()) {
		
		relatorioDomain rl = new relatorioDomain();
		
		rl.setCOD_ESTIPULANTE(resultado.getString("COD_ESTIPULANTE"));           
		rl.setNUM_PROPOSTA(resultado.getString("NUM_PROPOSTA"));         
		rl.setNUM_PARCELA(resultado.getString("NUM_PARCELA"));
		rl.setDAT_RETORNO_AGENTE(resultado.getString("DAT_RETORNO_AGENTE"));
		rl.setCOD_AGENTE(resultado.getString("COD_AGENTE"));
		rl.setCOD_RETORNO(resultado.getString("COD_RETORNO"));
		
	    lista.add(rl);
	    
	     }
		
	return lista;
	
	}

}
