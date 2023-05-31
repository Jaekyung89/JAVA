package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("C:\\Windows\\system.ini");
			int i;
			while( ( i = reader.read()) != -1 ) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
