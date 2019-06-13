import java.io.*;

public class FindFiles {

	public void displayFileName(File[] files) {
		for(File file : files)
		{
			if (file.getName().endsWith(".txt")) {
				System.out.println("File : "+file.getName());
				file.delete();
		}
		}
		
	 }
	
	public static void main(String[] args) {
		File currentDir = new File("C:\\Users\\alex.pandian\\eclipse-workspace\\FileHandling\\src"); // current directory
		FindFiles f=new FindFiles();
		File[] files = currentDir.listFiles();
		f.displayFileName(files);
	}

}
