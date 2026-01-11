//Wap to read two integers and print minimum of two numbers
import java.util.*;
class p3
{
    public static void main (String args[])
    {
        Double n1 ,n2,n3,n4;
        Double min;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the First number: ");
        n1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        n2 = scanner.nextDouble();
        System.out.println("Enter the Third number: ");
        n3 = scanner.nextDouble();
        System.out.println("Enter the Fourth number: ");
        n4 = scanner.nextDouble();

        min = Math.min(Math.min(n1,n2),Math.min(n3,n4));

        System.out.println("Smallest number is : "+ min);




    }
}