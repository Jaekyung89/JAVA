package file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		byte[] b = {7, 51, 3, 4, -1, 24};
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/abc.out");
		for (int i = 0; i < b.length; i++) {
			fos.write(b[i]);
		}
		fos.close();
	}

}
