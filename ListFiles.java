import java.io.*;

public class ListFiles {

	public void displayDirectoryContents(File[] files,int n) {
		
			if(n<=files.length && files[n-1].isFile())
			{
				System.out.println("File : "+n+" "+ files[n-1].getName());
				n++;
				displayDirectoryContents(files,n);
			}
		 }
	
	public static void main(String[] args) {
		File currentDir = new File("C:\\Users\\alex.pandian\\eclipse-workspace\\FileHandling\\src"); // current directory
		ListFiles f=new ListFiles();
		File[] files = currentDir.listFiles();
		int n=1;
		f.displayDirectoryContents(files,n);
	}

}
