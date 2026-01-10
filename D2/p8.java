import java.util.*;

class p8
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        double amount, finalAmount;

        System.out.println("Enter Amount: ");
        amount = scanner.nextDouble();

        if (amount < 1)
        {
            System.out.println("Enter correct number");
        }
        else if (amount > 1000)
        {
            finalAmount = amount * 0.90;
            System.out.printf("Final Amount with Discount is: %.2f", finalAmount);
        }
        else if (amount > 500)
        {
            finalAmount = amount * 0.95;
            System.out.printf("Final Amount with Discount is: %.2f", finalAmount);
        }
        else
        {
            finalAmount = amount;
            System.out.printf("Final Amount with No Discount is: %.2f", finalAmount);
        }
    }
}
