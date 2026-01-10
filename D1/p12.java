//wapp to read Length in meters and convert it into kilometers 

import java.util.*;

class p12 
{
        public static void main (String args[])
        {
            Scanner scanner= new Scanner (System.in);
            Double meter, kilometer;
            System.out.print("Enter the Lenght in meters: ");
            meter=scanner.nextDouble();
            kilometer= meter / 1000;
            System.out.println("Length in kilometers: "+kilometer);
            

        }
    
}