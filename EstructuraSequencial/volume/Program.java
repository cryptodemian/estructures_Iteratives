/*
* Program.java        1.0 10/06/2025
*  
* Calculate area lateral and volume of the cilindre.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {
	
	/**
     * Calculate area lateral and volume of the cilindre.
     * 
     * @param radius a real number.
     * @param height a real number.
     * @param args not used.
     * @return the area and volume of the cilindre.
     */
    
    public double volume(double height, double radius) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    public double areal(double height, double radius) {
        return 2 * Math.PI * radius * height;
    }
    
    public static void main(String[] args) {
        Program p = new Program();
        double areal = p.areal(2.1,7.7);
        double volume = p.volume(6.6,12.2);

        System.out.println("Area lateral de este cilindro es = " + areal
            + " el volumen es = " + volume);
    }
}

