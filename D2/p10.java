//wap to read reating betweeb 1 to 5 and print 
//excellent if the rating is 5/4 , ok if the rating is 3/2,  else poor

//wap to read rating betweeb 1 to 5 and print 
//excellent if the rating is 5/4 , ok if the rating is 3/2,  else poor
import java.util.*;

class p9
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        float rating;
        System.out.println("Enter the rating : ");
        rating=scanner.nextFloat();

        if(rating<1||rating>5)
        {
            System.out.println("Invalid rating");
        }
        else if(rating==5)
        {
            System.out.println("Excellent");
        }
        else if(rating==4)
        {
            System.out.println("Excellent");
        }
        else if(rating==3)
        {
            System.out.println("OK");
        }
        else if(rating==2)
        {
            System.out.println("OK");
        }
        else if(rating==1)
        {
            System.out.println("Poor");
        }




    }
}