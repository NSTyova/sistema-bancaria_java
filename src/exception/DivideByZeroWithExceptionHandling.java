package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

	// demonstra o lan�amento de uma exce��o quando ocorre uma divis�o por zero
	public static int quotient(int numerator, int denominator) throws ArithmeticException {
		 return numerator / denominator; // poss�vel divis�o por zero
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true; // determina se mais entradas s�o necess�rias
		do {
			try { // l� dois n�meros e calcula o quociente
				System.out.println("digite o numerador inteiro");
				int numerador=scanner.nextInt();
				System.out.println("digite o denominador inteiro");
				int demonador=scanner.nextInt();
				int resultado=quotient(numerador, demonador);
				System.out.printf("%nResult: %d / %d = %d%n", 
						numerador, demonador, resultado);
				continueLoop=false;
			}catch(InputMismatchException inputMismatchException){
				System.err.printf("%nException: %s%n",
						inputMismatchException);
				scanner.nextLine(); // descarta entrada para o usu�rio tentar de novo
				System.out.printf(
						"You must enter integers. Please try again.%n%n");
			}catch (ArithmeticException arithmeticException) {
				// TODO: handle exception
				System.err.printf("%nException: %s%n", arithmeticException);
				System.out.printf(
						"Zero is an invalid denominator. Please try again.%n%n");
			}
		}while(continueLoop);
	}
}
