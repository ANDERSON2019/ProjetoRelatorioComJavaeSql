package Projetojsf.Teste;

import java.sql.SQLException;
import java.util.List;

import ProjetoJsf.dao.RelatorioDao;
import ProjetoJsf.doman.relatorioDomain;

public class RelatorioTeste {
	
	public static void main(String[] args) {
		
		
		RelatorioDao rdao = new RelatorioDao();
		
		try {
			List<relatorioDomain> r = rdao.lista();
			
			for (relatorioDomain relatorioDomain : r) {
				System.out.println(relatorioDomain);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
