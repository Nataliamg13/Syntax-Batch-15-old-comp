package HomeWork2;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        /*
       	Create a Java program that will ask if user has a credit card or not.
       If you user does not have a credit card then offer them. If they do have one ask what is balance on the
        card? If balance of the card is larger than 1000, tell them to pay off immediately, otherwise you can
        tell  them that they can spend more.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Do you have a credit card with us?");
        String card=input.next();

        if(card.equals("No")) {
            System.out.println("Would you like to apply?");
        }else{
            System.out.println("What is your current balance?");
        }

        int balance=input.nextInt();
        if(balance>1000) {
            System.out.println("Pay off the balance immediately!");
        }else{
            System.out.println("Your total of your limit is... ");
        }

    }
}
