package locadoraApp.model.domain;

public class FilmeAventura extends Filme {
       private String nome;
       private String descricao;
       private int popularidade;
       
       @Override
    public String toString() {
    	return super.toString() + "; Aventura: " + nome;
    }
       
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPopularidade() {
		return popularidade;
	}
	public void setPopularidade(int popularidade) {
		this.popularidade = popularidade;
	}
}
