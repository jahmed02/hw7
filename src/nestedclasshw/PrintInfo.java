package nestedclasshw;

public class PrintInfo {

	public static void main(String[] args) {
		
		Record rd = new Record (Input.Name);
		rd.print();
		
		Record rd2 = new Record (Input.ID);
		rd2.print2();
		
		Record rd3 = new Record (Input.Section);
		rd3.print3();
	}

}
