/*
* Program.java        1.0 09/26/2025
*  
* Calculate fahrenheit from celsius.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {

	/**
	 * Calculate fahrenheit from celsius.
	 * 
	 * @param hours an integer to be added.
	 * @param minuts an integer number to be added.
	 * @return the sum of a multiplied by b and result multiplied for c.
	 */
    public double celsius2fahrenheit(double celsius) {
		double fahrenheit;
		fahrenheit = (9.0 / 5 * celsius) + 32;
		return fahrenheit;
    }
    
    /**
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		double celsius, celsius2fahrenheit;
		
		//Print the title of the program
		System.out.print("\nCALCULAR LOS FAHRENHEITS. DEMIAN\n\n");
		//Read the input data
		celsius = 80;
		//PRocess the data
		Program p = new Program();
		celsius2fahrenheit = p.celsius2fahrenheit(celsius);
		System.out.print(celsius2fahrenheit);
	}
}

