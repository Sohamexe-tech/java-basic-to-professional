// wap to read Length and Breadth of reactangle and print its area and perimeter using  if else 

import java.util.*;
class p5
{
    public static void main (String args[])
    {
        double length,breadth,area,perimeter;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Length of the Rectangle: ");
        length= scanner.nextDouble();
        System.out.println("Enter the Breadth of the Rectangle: ");
        breadth= scanner.nextDouble();

        if (length<0 || breadth<0)
        {
            System.out.println("Length or breadth cannot be zero");

        }
        else
        {
            area = length * breadth;
            perimeter = 2 * (length + breadth);
            System.out.printf("Area of Rectangle is: %.2f\n",area);
            System.out.printf("Perimeter of Rectangle is: %.2f\n",perimeter);
         }
    }
}