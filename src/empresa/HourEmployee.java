package empresa;

public class HourEmployee extends Employee {
	
	private double wage; // SALARIO POR HORAS
	private double hours; // HORAS TRABALHADAS DURANTE A SEMANA
	
	
	public HourEmployee(String firstName, String lastName, 
						String socialSecurityNumber,
						double hours, double wage) {
		super(firstName, lastName, socialSecurityNumber);
		
		if(wage < 0.0)  
			throw new  IllegalArgumentException(
				"Horariode remuneracao de tem ser  >= 0.0");
			
		if((hours <0.0) || (hours > 168.0))
			throw new IllegalArgumentException(
				"Horas de trabalho tem de ser >=0.0 and <=168.0");
		
		this.wage=wage;
		this.hours=hours;
	}
	
	@Override
	public double earnings() {
		if (getHours() <= 40) // NENHUMA HORA EXTRA
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage < 0.0)
			throw new IllegalArgumentException(
				"Hourly wage must be >= 0.0");
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0))
			throw new IllegalArgumentException(
				"Hours worked must be >= 0.0 and <= 168.0");
		this.hours = hours;
	}
	
	
	@Override
	public String toString() {
		return String.format("Historico do funcionario: %s%n%s: $%,.2f; %s: %,.2f",
			super.toString(), "Salrio por hora", getWage(),
				"horas trabalhadas", getHours());
	}
	
	

}
