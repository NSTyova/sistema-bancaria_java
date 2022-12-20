package Banco.funcionarios;

public class Gerentes extends Funcionarios{

	
	private int senha;
	private Integer codigo;
	
	
	public boolean autenticar(int senha) {
		if(this.senha==senha) {
			System.out.println("Acesso Permitido");
			return true;
		}
		System.out.println("Acesso Negado");
		return false;
	}
	
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
}
