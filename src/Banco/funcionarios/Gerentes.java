package Banco.funcionarios;

public class Gerentes extends Funcionarios implements Autenticavel{

	
	private int senha;
	private Integer codigo;
	
	

	
	/*@Override
	public double getBonificacao() {
		return super.getBonificacao() + 100;
	}*/
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public double getBonificacao() {
		return super.getSalario()  *0.1;
	}
	@Override
	public boolean senha(int senha) {
		return false;
	}
}
