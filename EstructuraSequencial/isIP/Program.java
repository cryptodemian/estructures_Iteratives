/*
* Program.java        1.0 09/26/2025
*  
* Verify if the IP is correct.
* 
* Copyright 2025 Demian Melnyk 
*/

public class Program {

	/**
	 * Verify if the IP is correct.
	 * 
	 * @param byte1 an real to be added.
	 * @param byte2 an real number to be added.
	 * @param byte3 an real number to be added.
	 * @param byte4 an real number to be added.
	 * @return iP
	 */
    public boolean isIp(int byte1, int byte2, int byte3, int byte4) {
		boolean iP;
		iP = byte1 >= 0 && byte1 <= 128 && byte2 >= 0 && byte2 <= 143 && byte3 >= 0 && byte3 <= 137 && byte4 >= 0 && byte4 <= 144;
		return iP;
    }
    
    /**
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
		int byte1;
		int byte2;
		int byte3;
		int byte4;
		//Print the title of the program
		System.out.print("\nVERIFY IF THE IP IS CORRECT. DEMIAN\n\n");
		byte1 = 111;
		byte2 = 141;
		byte3 = 131;
		byte4 = 144;
		//PRocess the data
		Program p = new Program();
		isIp = p.isIp(byte1,byte2,byte3,byte4);
		System.out.print(isIp);
	}
}

