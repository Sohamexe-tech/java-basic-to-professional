//Wap to find area and perimeter of the rectangle
import java.util.*;
class p8
{
    public static void main (String args[])
    {
        Scanner scanner= new Scanner(System.in);
        Double length, breadth , area , perimeter;
        System.out.print("Enter the value of length: ");
        length= scanner.nextDouble();

        System.out.print("Enter the value  of the breadth: ");
        breadth=scanner.nextDouble();

        area=length*breadth;
        perimeter=2*(length+breadth);

        System.out.println("Area of rectangle= "+area);
        System.out.println("perimeter of the rectangle= "+perimeter);
    }

}