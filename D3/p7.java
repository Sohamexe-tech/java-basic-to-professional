//wapp to find factorial of the nummbers 

// wapp to find sum of first "n" positive integers 
//Ex:- i/p:5 1+2+3+4+5=15

import java.util.*;

class p7
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
            double factorial=1;

            while (i<=no)
            {
                factorial=factorial*i;
                i=i+1; 
            }
            System.out.println("sum= "+factorial);
        }
        else 
        {
            System.out.println("Invalid Number ");
        }
        
    }
}