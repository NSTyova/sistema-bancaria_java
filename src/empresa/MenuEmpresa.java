package empresa;

public class MenuEmpresa {
	
	public static void main(String[] args) {
		// CRIAR OS OBJECTOS DAS SUBCLASSES
		SalariedEmployee salariedEmployee=
				new SalariedEmployee("Salvador", "Tyova", "424-202-0", 800.00);
		HourEmployee hourEmployee= 
				new HourEmployee("Alira", "Tyova", "471-54.0", 160.5, 40);
		CommissionEmployee commissionEmployee= 
				new CommissionEmployee("Delfina", "Tyova", "410-414.0", 10000, .06);
		
		BasePlusComissionEmployee basePlusComissionEmployee=
				new BasePlusComissionEmployee("Isaac", "Tyova", "474-54.0", 5000, .40, 160);
		
		System.out.println("Employees processed individually:");
		System.out.printf("%n%s%n%s: $%,.2f%n%n",
				salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",
				hourEmployee, "earned", hourEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",
				commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",
				basePlusComissionEmployee,
				"earned", basePlusComissionEmployee.earnings());
		
		//CRIA UM ARRAY EMPRESAS DE QUATRO ELEMENTOS
		Employee[] employees= new Employee[4];
		
		// INICIALIZAR O ARRAY COM OS ELEMENTOS
		employees[0]=salariedEmployee;
		employees[1]=commissionEmployee;
		employees[2]=hourEmployee;
		employees[3]=basePlusComissionEmployee;
		
		System.out.printf("Employees processed polymorphically:%n%n");
		
		// processa genericamente cada elemento no employees
		for(Employee currenteEmployee : employees) {
			System.out.println(currenteEmployee); //INVOCA O TOSTRING
			
			// determina se elemento é um BasePlusCommissionEmployee
			if (currenteEmployee instanceof BasePlusComissionEmployee ) {
				// downcast da referência de Employee para
				// referência a BasePlusCommissionEmployee
				BasePlusComissionEmployee employee =
						(BasePlusComissionEmployee) currenteEmployee;
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				
				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f%n",
						employee.getBaseSalary());
			 // fim do if
			}
			System.out.printf(
					"earned $%,.2f%n%n", currenteEmployee.earnings());
		} // for final
		// obtém o nome do tipo de cada objeto no array employees
		for (int j = 0; j < employees.length; j++)
			System.out.printf("Employee %d is a %s%n", j,
					employees[j].getClass().getName());
		}// fim de main
		
	

}
