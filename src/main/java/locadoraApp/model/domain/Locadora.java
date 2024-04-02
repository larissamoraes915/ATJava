package locadoraApp.model.domain;

import java.util.List;

public class Locadora {
      private String nome;
      private String localização;
      private int anoInicialFuncionamento;
      private Funcionario funcionario;
      private List<Filme> filmes;
      
      
      @Override
    public String toString() {
    	return "Locadora" + nome;
    }
      
      
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalização() {
		return localização;
	}
	public void setLocalização(String localização) {
		this.localização = localização;
	}
	public int getAnoInicialFuncionamento() {
		return anoInicialFuncionamento;
	}
	public void setAnoInicialFuncionamento(int anoInicialFuncionamento) {
		this.anoInicialFuncionamento = anoInicialFuncionamento;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public List<Filme> getFilmes() {
		return filmes;
	}


	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
}
