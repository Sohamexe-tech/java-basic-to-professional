//wapp to find area and circumference of the circle
import java.util.*;
class p7
{
    public static void main (String args[])
    {
        Scanner scanner= new Scanner(System.in);
        Double radius , area, circumference;

        System.out.println("Enter the radius of the circle: ");
        radius= scanner.nextDouble();

        area= 3.14 *radius * radius;
        circumference= 2*3.14*radius;

        System.out.println("Area of the circle= "+area);
        System.out.println("Circumference of the circle= "+circumference);
    }
}