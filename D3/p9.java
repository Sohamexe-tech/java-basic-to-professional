// WAPP to count n to 0 and print Happy New Year

import java.util.Scanner;

class p9 {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown = ");
        int n = sc.nextInt();

        if (n >= 0) {
            while (n >= 1) {
                System.out.println(n);
                n = n - 1;
                Thread.sleep(1000); 
            }
            System.out.println("Happy New Year");
        } else {
            System.out.println("Invalid no.");
        }

        sc.close();
    }
}
