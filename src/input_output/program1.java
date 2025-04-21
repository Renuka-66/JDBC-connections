package input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//thses will be used to save it in the backend
public class program1 {
	public static void main(String[] args) {
		String source_path="C:/Users/kavya/Downloads/IMG-20230205-WA0072.jpg";
		String destination_path="C:/Users/kavya/Downloads/renuka.jpg";
		try (
				
			FileInputStream fis = new FileInputStream(source_path);
			FileOutputStream fos = new FileOutputStream(destination_path);
			)
		{
		byte[] buffer = new byte[2024]	;
		int byteread;
		while((byteread=fis.read(buffer))!=-1) {
			fos.write(buffer,0,byteread);
		}
		System.out.println("successfully created");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
