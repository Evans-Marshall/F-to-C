/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f.to.c;

/**
 *
 * @author yungm
 */
import java.util.Scanner;  
public class FToC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tempf, tempc;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the temperature in Celsius: ");
        tempc = keyboard.nextInt();
                
        tempf = (9.0/5.0) * tempc + 32.0;
        System.out.println("The temperature in Fahrenheit is " + tempf);
    }
    
}
