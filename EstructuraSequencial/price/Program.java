/*
* Program.java        1.0 09/26/2025
*  
* Calculates the final price after IVA and discount.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {

	/**
	 * Calculate the final price after the IVA and Discount.
	 * 
	 * @param a an real number to be added.
	 * @param b an real number to be added.
	 * @param c an real number to be added.
	 * @return price_start multiplied by iva and multiplied by discount
	 */
	 // Putted variabls "price_start" is for price, "iva" for percentatge of IVA and "discount" for discount
    public double price(double price_start, double iva, double discount) {
		double d;
		d = price_start * (1 - iva / 100) * (1 - discount / 100);
		return d;
    }
    
    /**
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		double price_start, iva, discount, price;
		
		//Print the title of the program
		System.out.print("\nCALCULAR PRECIO FINAL CON IVA Y DESCUENTO. DEMIAN\n\n");
		//Read the input data
		price_start = 66.6;
		iva = 21;
		discount = 20;
		//PRocess the data
		Program p = new Program();
		price = p.price(price_start, iva, discount);
		System.out.print(price);
	}
}

