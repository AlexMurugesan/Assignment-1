import java.io.*;
public class FileCopy1{

	public static void main(String args[]) 
		    throws FileNotFoundException,IOException 
		    { 
		        FileInputStream source = new FileInputStream("C:\\Users\\alex.pandian\\eclipse-workspace\\FileHandling\\file1.txt"); 		  
		        FileOutputStream dest = new FileOutputStream("C:\\Users\\alex.pandian\\eclipse-workspace\\Tele\\file3.txt"); 
		  
		        int b; 
		        while  ((b=source.read()) != -1) 
		            dest.write(b); 		  
		        source.close(); 
		        dest.close(); 
		    } 
	
}