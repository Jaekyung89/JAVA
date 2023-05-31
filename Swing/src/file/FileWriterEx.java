package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		FileWriter fw = new FileWriter("C:\\Temp\\test.txt");
		int i;
		while((i = isr.read()) != -1) {
			fw.write(i);
		}
		fw.close();
		isr.close();
	}

}
