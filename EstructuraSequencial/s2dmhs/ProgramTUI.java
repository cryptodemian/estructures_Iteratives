/*
* Program.java        1.0 10/10/2025
*  
* Converts a given number of seconds into hours, minutes, and seconds in the format h:m:s.
* 
* Copyright 2025 Demian Melnyk 
*/

import java.util.Scanner;

public class ProgramTUI {
    /**
     * Converts a given number of seconds into hours, minutes, and seconds in the format h:m:s.
     *
     * @param args not used.
     */
     
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
ProgramTUI p = new ProgramTUI();
int sec_a;
int sec_b;
int min;
int hour;
       
System.out.println("Introduce los segundos: ");
sec_a = s.nextInt();

hour = sec_a / 3600;
min = (sec_a % 3600)/ 60;
sec_b = (sec_a % 3600) % 60;
       
System.out.printf("\n%d:%d:%d\n", hour, min, sec_b);
    }
}
