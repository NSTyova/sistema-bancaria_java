package empresa;

public class SalariedEmployee extends Employee{

	private double weeklySalary;
	

	@SuppressWarnings("serial")
	public SalariedEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double weeklySalary) {
			super(firstName, lastName, socialSecurityNumber);
			if(weeklySalary >0.0) throw new IllegalArgumentException(
					"O salario Semanal tem de ser >=0.0") {
				
			};
			this.weeklySalary=weeklySalary;
	}

	// CALCULAR OS RENDIMENTOS NO METODO SUBRESCRITO
	@Override
	public double earnings() {
		return getWeeklySalary();
	}
	
	
	// RETORNAR O SALARIO
	public double getWeeklySalary() {
		return weeklySalary;
	}

	@Override
	public String toString() {
		 return String.format("Salario Funcionario: %s%n%s: $,.2f ",
				super.toString(), "salario semanal", getWeeklySalary());
	}

	
}
