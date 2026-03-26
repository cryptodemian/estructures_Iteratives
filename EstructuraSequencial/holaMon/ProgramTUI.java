/*
* Program.java        1.0 09/26/2025
*  
* Say hello world and hello to the user.
* 
* Copyright 2025 Demian Melnyk 
*/

import java.util.Scanner;

public class ProgramTUI {
    
    /**
     * Say hello world and hello to the user.
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		String name;
		int edat;
		System.out.println("Hola mon");
		Scanner s = new Scanner(System.in);
		System.out.print("Com et dius ?");
		name = s.nextLine();
		System.out.println("Hola " + name + "!!!");

	}
}

