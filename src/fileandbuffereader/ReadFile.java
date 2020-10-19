package fileandbuffereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		String file = "/Users/ahmed/eclipse-workspace/HW7/txtfile/Liv.txt";
		
		
		BufferedReader bReader = new BufferedReader (new FileReader(file));
		
		String data = ""; 
		
		while ((data = bReader.readLine()) != null ) {
			System.out.println (data);
		}
			
	}
}

