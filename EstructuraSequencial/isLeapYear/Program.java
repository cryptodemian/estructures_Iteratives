/*
* Program.java        1.0 09/26/2025
*  
* Verify if year is Leap or not.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {

	/**
	 * Verify if year is Leap or not.
	 * 
	 * @param traspas an int to be added.
	 * @return the year is leap
	 */
    public boolean isLeapYear(int traspas) {
		return (traspas % 400 == 0) || ((traspas % 4 == 0) && !(traspas % 100 == 0));
    }
    
    /**
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		int traspas;
		boolean isLeapYear;
		//Print the title of the program
		System.out.print("\nVERIFY IF THE YEAR IS LEAP OR NOT. DEMIAN\n\n");
		traspas = 2005;
		//PRocess the data
		Program p = new Program();
		isLeapYear = p.isLeapYear(traspas);
		System.out.print(isLeapYear);
	}
}

