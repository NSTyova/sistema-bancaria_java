package empresa;

public class CommissionEmployee extends Employee{
	
	private double grossSales;// VENDAS BRUTAS SEMANAIS
	private double commissionRate; // PERCENTAGEM DA COMISSAO
	

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			 double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0)// VALIDA
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		if (grossSales < 0.0) // VALIDA
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		 this.grossSales=grossSales;
		 this.commissionRate=commissionRate;
			
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getCommissionRate() * getGrossSales();
	}

	public double getGrossSales() {
		return grossSales;
	}

	// CONFIGURAR A QUANTIDA DE VENDAS BRUTAS
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) // valida
			throw new IllegalArgumentException("vendas brutas tem de ser maior que >= 0.0");
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	// CONFIGURACAO DA TAXA DE COMISSAO
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) // valida
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		this.commissionRate = commissionRate;
	}

	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
				"commission employee", super.toString(),
				"gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	}
	
}
