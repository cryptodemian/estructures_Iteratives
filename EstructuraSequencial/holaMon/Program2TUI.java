/*
* Program.java        1.0 09/26/2025
*  
* Say the name of the user his weight and his age.
* 
* Copyright 2025 Demian Melnyk 
*/

import java.util.Scanner;

public class Program2TUI {
    
    /**
     * Say the name of the user his weight and his age.
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int edat;
		double pes;
		System.out.println("Com et dius ?");
		String name = s.nextLine();
		System.out.println("Hola " + name + "!!!");
		System.out.println("Quina edat tens?");
		edat = s.nextInt();
		System.out.println("Quan peses ?");
		pes = s.nextDouble();
		System.out.println("En " + name + " té " + edat + " anys i pesa " + pes + " Kilos");
	}
}
