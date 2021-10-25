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
		}

	}

}
