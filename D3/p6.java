// wapp to find sum of first "n" positive integers 
//Ex:- i/p:5 1+2+3+4+5=15

import java.util.*;

class p6
{
    public static void main(String args[]) throws InterruptedException
    {
        Scanner scanner = new Scanner(System.in);

        Double no;
        System.out.println("Enter the no. : ");
        no = scanner.nextDouble();
        
        if(no>0)
        {
            double i=1;
            double sum=0;

            while (i<=no)
            {
                sum=sum+i;
                i=i+1; 
            }
            System.out.println("sum= "+sum);
        }
        else 
        {
            System.out.println("Invalid Number ");
        }
        
    }
}