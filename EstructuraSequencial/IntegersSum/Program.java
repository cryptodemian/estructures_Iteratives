/*
* Program.java        1.0 09/26/2025
*  
* Adds two integer numbers.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {

	/**
	 * Adds two integer numbers.
	 * 
	 * @param a an integer number to be added.
	 * @param b an integer numner to be added.
	 * @return the sum of a and b.
	 */
    public int add(int a, int b) {
		int c;
		c = a + b;
		return c;
    }
    
    /**
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		int a, b, suma;
		
		//Print the title of the program
		System.out.print("\nSUMA DE DOS NOMBRES.\n\n");
		//Read the input data
		a = 3;
		b = 7;
		//PRocess the data
		Program p = new Program();
		suma = p.add(a, b);
		System.out.print(suma);
	}
}

