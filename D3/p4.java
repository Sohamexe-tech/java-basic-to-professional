//Wapp to chant mantras multiple times

import java.util.*;

class p4
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        Double no;
        System.out.println("Enter the no. : ");
        no = scanner.nextDouble();

        if(no>0)
        {
            double count = 1;
            while(count<=no)
            {
                System.out.println("Shree Swami Samarth");
                count = count + 1 ;
            }
            
        }
        else
        {
            System.out.println("Invalid Input");
        }

    }
}