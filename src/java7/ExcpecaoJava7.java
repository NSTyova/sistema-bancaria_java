package java7;

public class ExcpecaoJava7 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		throw new NullPointerException("Desculpa! Mas tens um nullPointerException");
	}
	public void readFromResource() {
		throw new RuntimeException("Sinto muito! mas tenho um erro");
	}

}
