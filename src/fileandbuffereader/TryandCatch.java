package fileandbuffereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryandCatch {

	public static void main(String[] args) throws IOException {
		
		String file1 = "/Users/ahmed/eclipse-workspace/HW7/txtfile/Liv.txt" ;
		
		FileReader fReader = null;
		BufferedReader bReader = null;

		try {
			fReader = new FileReader (file1);
		} 
		catch (FileNotFoundException e) {
			System.out.println("Not found, please check for the correct file");
		}
		
		try {
			
		    bReader = new BufferedReader (fReader);
		    String data1 = "";
		    
			while ((data1 = bReader.readLine()) != null) {
				System.out.println(data1);
			}
		} 
		catch (IOException e) {
			System.out.println("File is not readable !!");
		}
		finally {
			if (bReader != null) {bReader.close();}
			if (fReader != null) {fReader.close();}
		}
	}
}
