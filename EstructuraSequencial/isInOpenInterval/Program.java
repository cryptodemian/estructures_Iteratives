/*
* Program.java        1.0 09/26/2025
*  
* Verify if real number is inside the interval or not.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {

	/**
	 * Verify if real number is inside the interval or not.
	 * 
	 * @param start_int an double to be added.
	 * @param end_int an double number to be added.
	 * @return the number is between start_int & end_int
	 */
    public boolean isInOpenInterval(double start_int, double end_int) {
		boolean isInOpenInterval = start_int < end_int && end_int > start_int;
		return isInOpenInterval;
    }
    
    /**
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		double start_int;
		double end_int;
		boolean isInOpenInterval;
		//Print the title of the program
		System.out.print("\nVERIFY IF NUMBER IS INSIDE THE INTERVAL OR NOT. DEMIAN\n\n");
		start_int = 3.1;
		end_int = 3.0;
		//PRocess the data
		Program p = new Program();
		isInOpenInterval = p.isInOpenInterval(start_int, end_int);
		System.out.print(isInOpenInterval);
	}
}

