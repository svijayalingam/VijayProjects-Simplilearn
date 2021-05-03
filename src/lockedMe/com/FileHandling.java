package lockedMe.com;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		File f1=new File("LockedMeFolder");
		File f2=new File("LockedMetest.txt");
		
		f1.mkdir();
		f2.createNewFile();
		System.out.println("Folder and File Created");
	}

}
