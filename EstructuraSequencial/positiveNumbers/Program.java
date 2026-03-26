/*
* Program.java        1.0 09/26/2025
*  
* Verify if real number is positive or not.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {

	/**
	 * Verify if real number is positive or not.
	 * 
	 * @param hours an integer to be added.
	 * @param minuts an integer number to be added.
	 * @return verify if boolean is positive or not
	 */
    public boolean isPositive(double number) {
		return number > 0;
    }
    
    /**
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		double number;
		boolean isPositive;
		//Print the title of the program
		System.out.print("\nVERIFY IF NUMBER IS POSITIVE OR NOT. DEMIAN\n\n");
		number = 1.1;
		//PRocess the data
		Program p = new Program();
		isPositive = p.isPositive(number);
		System.out.print(number);
		System.out.println("Number is" + number + "positive?")
	}
}

