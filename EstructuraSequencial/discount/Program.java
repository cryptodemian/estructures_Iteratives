/*
* Program.java        1.0 09/26/2025
*  
* Calculate percentatge of discount of price.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {

	/**
	 * Calculate the percentatge of discount of price.
	 * 
	 * @param a an real number to be added.
	 * @param b an real number to be added.
	 * @return a plus b divided by 100 which is the percentatge
	 */
	 // Puse las variables "a" es para el precio que ha pagado, "b" para la tarifa
    public double discount(double a, double b) {
		double c;
		c = (a + b) / 100;
		return c;
    }
    
    /**
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		double a, b, descuento;
		
		//Print the title of the program
		System.out.print("\nCALCULAR EL DESCUENTO A PARTIR DEL PRECIO DE LA TARIFA Y PRECIO PAGADO. DEMIAN\n\n");
		//Read the input data
		a = 6.6;
		b = 10;
		//PRocess the data
		Program p = new Program();
		descuento = p.discount(a, b);
		System.out.print(descuento);
	}
}

