package locadoraApp.model.domain;

public class FilmeRomance extends Filme {
       private String elenco;
       private String premios;
       private String indicacoes;
       
       @Override
    public String toString() {
    	return super.toString() + "; Romance: " + elenco;
    }
       
	public String getElenco() {
		return elenco;
	}
	public void setElenco(String elenco) {
		this.elenco = elenco;
	}
	public String getPremios() {
		return premios;
	}
	public void setPremios(String premios) {
		this.premios = premios;
	}
	public String getIndicacoes() {
		return indicacoes;
	}
	public void setIndicacoes(String indicacoes) {
		this.indicacoes = indicacoes;
	}
}
