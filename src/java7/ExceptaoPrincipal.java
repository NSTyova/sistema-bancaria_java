package java7;

import java.util.logging.Logger;

import javax.print.attribute.SupportedValuesAttribute;


public class ExceptaoPrincipal {
	
	private final static Logger LOGGER =Logger.getLogger(null);
	
	 public static void main(String[] args) throws Exception {
		 try {
		 java7();
	    }catch(Exception e){
	    	
	    }
	 }

	
	 /**
     * @throws Exception 
     * 
     */
    public static void java7() throws Exception {
    	try(ExcpecaoJava7 ep = new ExcpecaoJava7()){
    		ep.readFromResource();
    	}catch (Exception e) {
			//LOGGER.getLevel()
		}
    }
}
