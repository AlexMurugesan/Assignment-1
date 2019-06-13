import java.io.*;
public class FileCopy{

	public static void main(String args[]) 
		    throws FileNotFoundException,IOException 
		    { 
		        FileInputStream source = new FileInputStream("file1.txt"); 		  
		        FileOutputStream dest = new FileOutputStream("file2.txt"); 
		  
		        int b; 
		        while  ((b=source.read()) != -1) 
		            dest.write(b); 		  
		        source.close(); 
		        dest.close(); 
		    } 
	
}