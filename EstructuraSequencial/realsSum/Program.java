/*
* Program.java        1.0 09/26/2025
*  
* Adds two real numbers.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {

	/**
	 * Adds two double numbers.
	 * 
	 * @param a an real number to be added.
	 * @param b an real numner to be added.
	 * @return the sum of a and b.
	 */
    public double add(double a, double b) {
		double c;
		c = a + b;
		return c;
    }
    
    /**
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		double a, b, suma;
		
		//Print the title of the program
		System.out.print("\nSUMA DE DOS NOMBRES REALES.\n\n");
		//Read the input data
		a = 3.2;
		b = 7.3;
		//PRocess the data
		Program p = new Program();
		suma = p.add(a, b);
		System.out.print(suma);
	}
}

