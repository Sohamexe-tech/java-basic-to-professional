//wap to read marks between 0 to 100 and print A if marks >80 , B if marks>60 , C if marks > 40 else D .

import java.util.*;

class p7
{
    public static void main (String aargs[])
    {
        Scanner scanner= new Scanner(System.in);
        double marks;
        System.out.print("Enter your marks: ");
        marks = scanner.nextDouble();

        if(marks<0||marks>100)
        {
            System.out.println("Enter correct nunmber");
        }

        else if (marks>80)
        {
            System.out.println("A");
        }
        else if (marks>60)
        {
            System.out.println("B");
        }
        else if (marks>40)
        {
            System.out.println("C");
        }
        else if (marks>0)
        {
            System.out.println("D");
        }
        

    }
}