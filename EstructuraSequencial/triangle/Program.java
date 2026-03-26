/*
* Program.java        1.0 09/26/2025
*  
* Calculates area of the triangle.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {

	/**
	 * Calculate the area of the triangle.
	 * 
	 * @param a an real number to be added.
	 * @param b an real numner to be added.
	 * @return the area of triangle a and b.
	 */
    public double area(double base, double height) {
		double area_tri;
		area_tri = (base * height) / 2;
		return area_tri;
    }
    
    /**
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		double a, b, area_tri;
		
		//Print the title of the program
		System.out.print("\nCALCULAR AREA DE UN TRIANGULO. DEMIAN\n\n");
		//Read the input data
		base = 6.6;
		height = 7.7;
		//PRocess the data
		Program p = new Program();
		area_tri = p.area(a, b);
		System.out.print(area_tri);
	}
}

