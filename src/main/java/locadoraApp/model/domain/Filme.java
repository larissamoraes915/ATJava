package locadoraApp.model.domain;

public class Filme {
       
	   private String titulo;
       private String diretor;
       private int anoLancamento;
       private String genero;
       private boolean disponibilidade;
       
       @Override
    public String toString() {
    	return "Filme" + titulo;
    }
       
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoLancamento = anoLancamento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
}
