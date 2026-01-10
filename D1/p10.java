// wap to convert Dollars to Rupees

import java.util.*;
class p10
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);

        Double Dollars,Rupees ;
        System.out.println("Enter the amount of money: ");
        Dollars= scanner.nextDouble();

        Rupees = Dollars / 90 ; 
        System.out.println("Rupees: "+Rupees);



    }
}