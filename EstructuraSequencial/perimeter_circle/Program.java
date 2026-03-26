/*
* Program.java        1.0 10/06/2025
*  
* Calculate area and perimeter of the circle.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {
	
	/**
     * Calculate area and perimeter of the circle.
     * 
     * @param radius a real number.
     * @param args not used.
     * @return the area and perimeter of the circle.
     */
    
    public double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double perimeter(double radius) {
        return (Math.PI * 2) * radius;
    }
    
    public static void main(String[] args) {
        Program p = new Program();
        double area = p.area(3.1);
        double perimeter = p.perimeter(1.1);

        System.out.println("Perimeter = " + perimeter
            + " Area = " + area);
    }
}

