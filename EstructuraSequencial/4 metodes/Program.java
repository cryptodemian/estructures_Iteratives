/*
* Program.java        1.0 10/06/2025
*  
* Add, subtract, multiply, divide two numbers.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {
	
	/**
     * Add, substract, multiply, divide two numbers.
     * 
     * @param a a real number.
     * @param b a real number.
     * @param args not used.
     * @return the sum of a and b.
     */
    
    public double add(double a, double b) {
        return a + b;
    }
	/**
     * 
     * @param a a real number.
     * @param b a real number.
     * @param args not used.
     * @return the rest of a and b.
     */
    public double subtract(double a, double b) {
        return a - b;
    }
	/**
     * 
     * @param a a real number.
     * @param b a real number.
     * @param args not used.
     * @return the multiplicacion of a and b.
     */
    public double multiply(double a, double b) {
        return a * b;
    }
	/**
     * 
     * @param a a real number.
     * @param b a real number.
     * @param args not used.
     * @return the division of a and b.
     */
    public double divide(double a, double b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        Program p = new Program();
        double add = p.add(3.1, 4.8);
        double subtract = p.subtract(1.1, 4.4);
        double multiply = p.multiply(3.2, 1.4);
        double divide = p.divide(2.1, 4.5);

        System.out.println("Suma = " + add 
            + " Resta = " + subtract 
            + " Multiplicació = " + multiply 
            + " Divisió = " + divide);
    }
}

