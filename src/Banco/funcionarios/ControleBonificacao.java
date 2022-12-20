package Banco.funcionarios;

public class ControleBonificacao {

	private Double totalBonificacao=0.0D;
	
	public void registra(Funcionarios funcionarios) {
		this.totalBonificacao +=funcionarios.getBonificacao();
	}
}
