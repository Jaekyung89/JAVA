package file;

import java.io.File;

public class FileEx {
	
	public static void main(String[] args) {
		
	File f = new File("c:/windows");
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
		File[] listFiles = f.listFiles();
		
		System.out.println(listFiles.length);
		for (int i = 0; i < listFiles.length; i++) {
			if (listFiles[i].isDirectory()) {
				System.out.println(listFiles[i].getName());
			}
		}
	}
}
