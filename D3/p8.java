// Wap to print table

import java.util.Scanner;

class p8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired number = ");
        int n = scanner.nextInt();

        if (n > 0) {
            int i = 1;
            while (i <= 10) {
                int ans = n * i;
                System.out.println(n + " x " + i + " = " + ans);
                i++;
            }
        } 
        else
        {
            System.out.println("Invalid number");
        }
    }
}
