package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ImageCopy {

	public static void main(String[] args) {
		
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(null);
		File f = fc.getSelectedFile();
		
		System.out.println(f.getAbsolutePath());
		File src = new File(f.getAbsolutePath());
		File dst = new File("c:/temp/my3.exe");
		FileInputStream fr = null;
		FileOutputStream fw = null;
		
		
		
		try {
			
			byte[] buffer = new byte[1024 * 10];
			
			fr = new FileInputStream(src);
			fw = new FileOutputStream(dst);
			
			int i =0;
			
			while(true) {
				int n = fr.read(buffer);
				fw.write(buffer, 0, n);
				if(n < buffer.length) {
					break;
				}
			}
			System.out.println("Copy end!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}