//wap to convert dollars to rupees
import java.util.*;
class p9{
    public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);

        Double dollars, rupees;

        System.out.print("Enter the amount in Dollars: $ ");
        dollars=scanner.nextDouble();

        rupees= dollars*90;
        System.out.println(" Rs : "+rupees);

    }
}
