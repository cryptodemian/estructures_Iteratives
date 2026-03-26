/*
* Program.java        1.0 09/26/2025
*  
* Make two variables swap each other.
* 
* Copyright 2025 Demian Melnyk 
*/

import java.util.Scanner;

public class Program3TUI {
    
    /**
     * Make two variables swap each other.
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double var1;
		double var2;
		double swap;
		System.out.print(" Introdueix la primera variable si us plau: ");
		var1 = s.nextDouble();
		System.out.print(" Introdueix la segona variable si us plau: ");
		var2 = s.nextDouble();
		System.out.print(" Donali al ESPAI per fer SWAP ");
		swap = var1;
		var1 = var2;
		var2 = swap;
		System.out.print(" La primera variable serà: " + var1 + ". La segona serà: " + var2 + ". Gracies per usar mi programa.");
	}
}
