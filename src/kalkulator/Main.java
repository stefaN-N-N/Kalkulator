package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while (true) {
			Scanner s1 = new Scanner(System.in);
			String a;
			a = s1.nextLine();
			if(a.equals("")) {
				continue;
			}
			if(a.equals("exit") || a.equals("kraj")) {
				break;
			}
			String[] b = a.split(" "); // parsira ulaz i vraca listu stringova
			if(b.length != 3) {
				System.out.println("Ulaz nema tri parametra!");
				continue;
				
			}
			int x = Integer.parseInt(b[0]); //uzimanje prvog u listi i konvertovanje u int
			int y = Integer.parseInt(b[2]);
			if(b[1].equals("+")) {
				addition(x, y);
			} 
			else if(b[1].equals("-")) {
				substraction(x, y);
			}

			else if(b[1].equals("*")) {
				multiplication(x, y);
				}
			else if(b[1].equals("/") || b[1].equals(":")) {
				division(x, y);

			}
			else  {
				System.out.println("Unsupported operation.");
			}
			
		}

	}
	// staticka f-ja moze da se pozove iz bilo
	// kog dela projekta
	public static void addition(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void substraction(int a, int b) {
		System.out.println(a - b);

	}
	public static void multiplication(int a, int b) {
		System.out.println(a * b);

	} 
	
	public static void division(int a, int b) {
		System.out.println(a / b);	

	}
}
