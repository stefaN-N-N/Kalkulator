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
			
			
		}

	}

}
