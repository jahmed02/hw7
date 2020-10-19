package nestedclasshw;

import java.util.Scanner;

public class Record {
	public Input input;
	public Record() {}
	 public Record (Input input) {
		 this.input = input;
	 }
	public void print () {
		System.out.println("Enter your Name:");
		switch(input) {
		case Name:
			Name.printName();
			break;}
	}
	public void print2() {
		System.out.println("Enter your ID: ");
		switch (input) {
		case ID:
			ID.printID();
			break;
		}
	}
	public void print3() {
		System.out.println("Enter your section: ");
		switch(input) {
		case Section:
			Section.printSection();
			break;
		}
	}
	private  static class Name {
		private static void printName () {
			Scanner sc = new Scanner (System.in);
			String nm = sc.nextLine();
			System.out.println("Name: "+nm+"\n");	
		}
	}
	private  static class ID {
		private static void printID() {
			Scanner sc = new Scanner (System.in);
			int id = sc.nextInt();
			System.out.println("ID: "+id+"\n");	
		}
	}
	private  static class Section{
		private static void printSection() {
			Scanner sc = new Scanner (System.in);
			String section = sc.nextLine();
			System.out.println("Section: "+section);	
		}
	}
}
