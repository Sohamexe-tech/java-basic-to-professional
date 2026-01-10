//  wapp to ask for user name anf the name is entered welcome them 

import java.util.*;
class p3
{
        public static void main(String args[])
        {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name= scanner.nextLine();
            if(name.isEmpty()){
                    System.out.println ("Name cannot be Empty");
            }
            
            System.out.println("Welcome, " + name + "!");

        }
}