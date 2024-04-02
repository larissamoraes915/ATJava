package locadoraApp.model.domain;

public class Funcionario {
	  private Integer id;
      private String nome;
      private String cargo;
      private float salario;
      
      public Funcionario() {
    	  this.setNome("Larissa");
    	  this.setCargo("Atendente");
    	  this.setSalario(1599);
      }
      
      public Funcionario(String nome) {
    	  this();
    	  this.setNome(nome);
      }
      
      
      @Override
    public String toString() {
    	return String.format ("%d", id, nome, cargo, salario);
    }
      
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
