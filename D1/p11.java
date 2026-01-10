// wapp to read temprature in celcius and convert it into farenheit

import java.util.*;
 
class p11
{

    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Double celcius, farenheit;

        System.out.print("Enter the Temprature in celcius: ");
        celcius = scanner.nextDouble();
        farenheit = (celcius * 9/5) + 32;
        System.out.println("Temparature in Farenheit: "+farenheit);

        
    }
}