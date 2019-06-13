import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch {
		
		public static void main(String[] args) {
			try {
			int x=100/0;
			String[] y=new String[5];
			System.out.println(y[5]);
			FileInputStream f=new FileInputStream("C:\\Users\\alex.pandian\\eclipse-workspace\\ExceptionHandling\\file1.txt");
			}
			catch(ArithmeticException e)
			{
				System.out.println("divide by zero");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exceeded the boundary of array");				
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
				System.out.println("File is not found in the directory");
				
			}
			}

}
