/*
* Program.java        1.0 09/26/2025
*  
* Verify the date is correct.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {

	/**
	 * Verify the date is correct.
	 * 
	 * @param day an integer to be added.
	 * @param month an integer number to be added.
	 * @param year an integer number to be added.
	 * @return validDate
	 */
    public boolean isDate(int day, int month, int year) {
		boolean traspas = (year % 400 == 0) || ((year % 4 == 0) && 
						 !(year % 100 == 0)) || (year >= 1) && (year <= 29);
		boolean have31 = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && 
						(day >= 1) && (day <= 31);
		boolean have30 = month == 4 || month == 6 || month == 9 || month == 11 && (day >= 1) && (day <= 30);
		boolean have28 = month == 2 && (day >= 1) && (day <= 28);
		boolean validDate = have31 || have30 || have28 || traspas;
		return validDate;
    }
    
    /**
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		int traspas;
		int day;
		int month;
		int year;
		boolean validDate;
		//Print the title of the program
		System.out.print("\nVERIFY IF THE DATE IS CORRECT. DEMIAN\n\n");
		int day = 29;
		int month = 2;
		int year = 2004;
		//PRocess the data
		Program p = new Program();
		isDate = p.isDate(day, month, year);
		System.out.print(isDate);
	}
}

