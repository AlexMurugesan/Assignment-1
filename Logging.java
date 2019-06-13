
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
 
public class Logging {
	
public static void main(String[] args) throws SecurityException, IOException {
	
    Logger logger = Logger.getLogger("Logging");
	
	try {
	int x=100/0;
	String[] y=new String[5];
	System.out.println(y[5]);
	FileInputStream f=new FileInputStream("C:\\Users\\alex.pandian\\eclipse-workspace\\ExceptionHandling\\file1.txt");
	int c=f.read();
	}
	catch(ArithmeticException e)
	{
		System.out.println("divide by zero");
        FileHandler handler = new FileHandler("ArithmeticException.log");
        logger.addHandler(handler);
        logger.info(e.toString());		
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exceeded the boundary of array");				
        FileHandler handler = new FileHandler("ArrayBoundException.log");
        logger.addHandler(handler);
        logger.info(e.toString());				
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
		System.out.println("File is not found in the directory");
        FileHandler handler = new FileHandler("FileNotFoundException.log");
        logger.addHandler(handler);
        logger.info(e.toString());				
		
	}
	}

}