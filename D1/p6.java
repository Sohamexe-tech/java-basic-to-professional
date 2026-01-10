import java.util.*;
class p6
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        Double a,b,c,result;

        System.out.println("Enter the First no= ");
        a=scanner.nextDouble();

        System.out.println("Enter the Second no= ");
        b=scanner.nextDouble();
        
        System.out.println("Enter the Third no= ");
        c=scanner.nextDouble();
        result=a*b*c;

        System.out.println("Result= "+result);

    }
}