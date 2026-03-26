/*
* Program.java        1.0 10/06/2025
*  
* Calculate area lateral and volume of the cilindre.
* 
* Copyright 2025 Demian Melnyk 
*/

import java.util.Scanner;

public class ProgramTUI {
	
	/**
     * Calculate area lateral and volume of the cilindre.
     * 
     * @param radius a real number.
     * @param height a real number.
     * @param args not used.
     * @return the area and volume of the cilindre.
     */
    public double average2(double x1, double y1, double x2, double y2) {
        double m1 = x1 + x2 / 2;
        double m2 = y1 + y2 / 2;
        return nem double[] { m1, m2 };
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		double x1 = 1.2;
		double x2 = 2.2;
		double y1 = 3.7;
		double y2 = 7.7;
		double m1;
		double m2;
		System.out.println("\n\nMID POINT.\n\n");
        System.out.println("Introduce las coordenadas x1 = " + x1);
        x1 = s.nextDouble();
        System.out.println("\nIntroduce las coordenadas x2 = " + x2);
        x2 = s.nextDouble();
        System.out.println("\nIntroduce las coordenadas y1 = " + y1);
        y1 = s.nextDouble();
        System.out.println("\nIntroduce las coordenadas y2 = " + y2);
		y2 = s.nextDouble();
        System.out.println("\nMid point between ("+ x1 +","+ x2 +") and ("+ y1 +","+ y2 +") = ("+ m1 +","+ m2 +")");
    }
}

