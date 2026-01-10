// wapp to read from the user and if the radius is valid print the area and circumference of of the circle

import java.util.*;

class p4
{
    public static void main (String args[])
    {
        double radius,pi, area, circumference;
        Scanner scanner = new Scanner(System.in);

    
        System.out.println ("Enter the radius of the circle:");
        radius = scanner.nextDouble();

        if(radius<0)
        {
            System.out.println("Radius cannot be less than Zero");
            return;

        }
        pi=3.14;
        area= pi*radius*radius;
        circumference= 2*pi*radius;

        System.out.printf("Area of the circle is: %.2f\n",area);
        System.out.printf("Circumference of the circle is: %.2f\n", circumference);
    
        

    }

}