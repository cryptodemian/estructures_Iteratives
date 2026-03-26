/*
* Program.java        1.0 09/26/2025
*  
* Calculates average of three numbers.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {

	/**
	 * Calculate the average of 3 numbers.
	 * 
	 * @param a an real number to be added.
	 * @param b an real numner to be added.
	 * @param c an real numner to be added.
	 * @return the average of a, b and c.
	 */
    public double average(double a, double b, double c) {
		double media;
		media = (a + b + c) / 3;
		return media;
    }
    
    /**
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		double a, b, c, media;
		
		//Print the title of the program
		System.out.print("\nCALCULAR MEDIA DE TRES NOMBRES REALES. DEMIAN\n\n");
		//Read the input data
		a = 6.2;
		b = 4.3;
		c = 3.2;
		//PRocess the data
		Program p = new Program();
		media = p.average(a, b, c);
		System.out.print(media);
	}
}

