/*
* Program.java        1.0 09/26/2025
*  
* Calculate seconds from hours and minutes.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {

	/**
	 * Calculate seconds from hours and minutes.
	 * 
	 * @param hours an integer to be added.
	 * @param minuts an integer number to be added.
	 * @return hours multiplied by 3600 to pass to seconds and minutes by 60 then plus everything
	 */
    public int hms2s(int hours, int minuts) {
		int seconds;
		int hour_to_minuts;
		hour_to_minuts = hours * 3600;
		seconds = hour_to_minuts + (minuts * 60);
		return seconds;
    }
    
    /**
     * 
     * @param args not used. 
     */ 
    public static void main(String[] args) {
		int hours, minuts, hms2s;
		
		//Print the title of the program
		System.out.print("\nCALCULAR LOS SEGUNDOS. DEMIAN\n\n");
		//Read the input data
		hours = 1;
		minuts = 17;
		//PRocess the data
		Program p = new Program();
		hms2s = p.hms2s(hours, minuts);
		System.out.print(hms2s);
	}
}

