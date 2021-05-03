package lockedMe.com;

import java.io.File;
import java.io.IOException;

public class FileDelete {

	public static void main(String[] args) throws IOException {{
		
		
		File f1=new File("LockedMeFolder");
		File f2=new File("LockedMetest1.txt");
		
		f1.mkdir();
		f2.DeleteLockedMetest1());
		System.out.println("File deleted");

}
	}
}
