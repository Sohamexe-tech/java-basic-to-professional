//Wapp to chant mantras multiple times

import java.util.*;

class p5
{
    public static void main(String args[]) throws InterruptedException
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
                System.out.println("*".repeat(20));
                Thread.sleep(500);
                System.out.println("Ganpati bappa Morya");
                System.out.println("*".repeat(20));
                count=count+1;
                Thread.sleep(500);
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }

    }
}