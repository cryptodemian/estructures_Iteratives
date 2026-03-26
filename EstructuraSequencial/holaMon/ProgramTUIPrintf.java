/*
* Program.java        1.0 10/10/2025
*  
* Say the name of the user, weight, age and project the table.
* 
* Copyright 2025 Demian Melnyk 
*/

import java.util.Scanner;

public class ProgramTUIPrintf {
    
    /**
     * Say the name of the user, weight, age and project the table.
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int edat;
		int edat1;
		double pes;
		double pes1;
		String name;
		String name1;
		System.out.println("\n1) Hola usuari 1. Com et dius ?");
		name = s.nextLine();
		System.out.println("1) Hola " + name + "!!!");
		System.out.println("\n1) Quina edat tens?");
		edat = s.nextInt();
		System.out.println("\n1) Quan peses ?");
		pes = s.nextDouble();
		System.out.println("\n2) Com et dius ?");
		name1 = s.nextLine();
		name1 = s.nextLine();
		System.out.println("\n2) Hola usuari 2. Hola " + name1 + "!!!");
		System.out.println("\n2) Quina edat tens?");
		edat1 = s.nextInt();
		System.out.println("\n2) Quan peses ?");
		pes1 = s.nextDouble();
		System.out.println("\nEn " + name + " té " + edat + " anys i pesa " + pes + " Kilos.\nEn " + name1 + " té " + edat1 + " anys i pesa " + pes1 + " Kilos.");
		System.out.printf("\n\nTAULA INFORMACIÓ PERSONAL\n\n");
		System.out.println("---------------------");
		System.out.printf("|%-8s:%10s|\n", "NOM1", name);
		System.out.printf("|%-8s:%10s|\n", "NOM2", name1);
		System.out.printf("|%-8s:%010o|\n", "EDAT1", edat);
		System.out.printf("|%-8s:%010o|\n", "EDAT2", edat1);
		System.out.printf("|%-8s:%10.2f|\n", "PES1", pes, "Kg");
		System.out.printf("|%-8s:%10.2f|\n", "PES2", pes1, "Kg");
		System.out.println("---------------------\n\n");
	}
}
