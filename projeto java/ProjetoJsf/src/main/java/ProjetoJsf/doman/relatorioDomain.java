package ProjetoJsf.doman;

public class relatorioDomain {
	
	private String COD_ESTIPULANTE,NUM_PROPOSTA,NUM_PARCELA,DAT_RETORNO_AGENTE,COD_AGENTE,COD_RETORNO;

	public String getCOD_ESTIPULANTE() {
		return COD_ESTIPULANTE;
	}

	public void setCOD_ESTIPULANTE(String cOD_ESTIPULANTE) {
		COD_ESTIPULANTE = cOD_ESTIPULANTE;
	}

	public String getNUM_PROPOSTA() {
		return NUM_PROPOSTA;
	}

	public void setNUM_PROPOSTA(String nUM_PROPOSTA) {
		NUM_PROPOSTA = nUM_PROPOSTA;
	}

	public String getNUM_PARCELA() {
		return NUM_PARCELA;
	}

	public void setNUM_PARCELA(String nUM_PARCELA) {
		NUM_PARCELA = nUM_PARCELA;
	}

	public String getDAT_RETORNO_AGENTE() {
		return DAT_RETORNO_AGENTE;
	}

	public void setDAT_RETORNO_AGENTE(String dAT_RETORNO_AGENTE) {
		DAT_RETORNO_AGENTE = dAT_RETORNO_AGENTE;
	}

	public String getCOD_AGENTE() {
		return COD_AGENTE;
	}

	public void setCOD_AGENTE(String cOD_AGENTE) {
		COD_AGENTE = cOD_AGENTE;
	}

	public String getCOD_RETORNO() {
		return COD_RETORNO;
	}

	public void setCOD_RETORNO(String cOD_RETORNO) {
		COD_RETORNO = cOD_RETORNO;
	}
	
	
	@Override
	public String toString() {
		String saida = COD_ESTIPULANTE + " " +NUM_PROPOSTA + " " + NUM_PARCELA + " " + DAT_RETORNO_AGENTE + " " + COD_AGENTE + " " + COD_RETORNO; 
		return saida;
	}
	
	
	
	
	
	
}
