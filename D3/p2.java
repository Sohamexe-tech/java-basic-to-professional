//Wap to read two integers and print minimum of two numbers
import java.util.*;
class p1
{
    public static void main (String args[])
    {
        Double n1 ,n2;
        Double min;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the First number: ");
        n1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        n2 = scanner.nextDouble();

        min = Math.min(n1,n2);

        System.out.println("Smallest number is : "+ min);




    }
}