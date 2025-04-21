package input_output;

import java.io.File;

public class program2 {
	public static void main(String[] args) {
		File f = new File("index.html");
		try {
			if(f.createNewFile()) {
			System.out.println("File is suceesfully created");
			}
			else {
				System.out.println("file is not created");
			}
			System.out.println("absolute path:"+f.getAbsolutePath());
			System.out.println("read"+f.canRead());
			System.out.println("write"+f.canWrite());
			System.out.println("length"+f.length());
			System.out.println("file"+f.isFile());
			System.out.println("directory"+f.isDirectory());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
