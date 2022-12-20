package Banco.funcionarios;

public abstract class Funcionarios {

	private String nome;
	private Double salario;
	private String telefone;
	
	/**
	 * metdo que calcuca a bonificacao de cada funcionario com base ao seu salario
	 * @return
	 */
	public abstract double getBonificacao() ;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
