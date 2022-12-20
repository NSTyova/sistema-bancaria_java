package java7;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        withJava7();
    }
    
    /**
     * Leitura do ficheiro
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void  withJava7() throws FileNotFoundException, IOException {
    	// caminho para localixar o documenti
    	try(BufferedReader br = new BufferedReader(new FileReader("C:/testo.txt"))) {
    		String sCurrentLine;
    		// linha que vai incrementando o documento
    		while((sCurrentLine =br.readLine()) != null) {
    			System.out.println(sCurrentLine);
    		}
    	}
    }
   
}
