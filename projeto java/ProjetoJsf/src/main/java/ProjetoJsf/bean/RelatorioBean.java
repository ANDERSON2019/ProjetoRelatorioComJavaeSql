package ProjetoJsf.bean;

import java.sql.SQLException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;

import ProjetoJsf.dao.RelatorioDao;
import ProjetoJsf.doman.relatorioDomain;


@ViewScoped
@ManagedBean
public class RelatorioBean {

        protected  List<relatorioDomain> rela;
         
	public List<relatorioDomain> getRela() {
			return rela;
		}
	public void setRela(List<relatorioDomain> rela) {
			this.rela = rela;
		}


// executa o select e constroi na tela antes de ser exibida
	@PostConstruct
	public void listar() {

			try {
				RelatorioDao rl = new RelatorioDao();
				rela = rl.lista();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	
			
	
}

	
}