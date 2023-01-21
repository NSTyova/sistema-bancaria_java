package empresa;

public class BasePlusComissionEmployee  extends CommissionEmployee{

	private double baseSalary; // SALARIO BASE SEMANAL
	
	// calcula os vencimentos; sobrescreve o método earnings em CommissionEmployee
	public BasePlusComissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double commissionRate, double grossSales, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, commissionRate, grossSales);
		
		if (baseSalary < 0.0) // valida baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary=baseSalary;
	}

	@Override
	public double earnings() {
		return getBaseSalary() * super.earnings();
	}

	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	// retorna a representação String do objeto BasePlusCommissionEmployee
	@Override
	public String toString()
	{
		return String.format("%s %s; %s: $%,.2f",
				"base-salaried", super.toString(),
				"base salary", getBaseSalary());
	}
	

}
