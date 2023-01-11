package HomeWork2;

import java.util.Scanner;

public class LoanSpecialistHM {
    public static void main(String[] args) {
        /*
          	You are a loan specialist and you need to ask user what is the amount of loan is needed. If loan is
           less or equal to 200,000 then you would lend the money otherwise you would reject the client.
         */

        Scanner Scan=new Scanner(System.in);
        System.out.println("What is amount of loan is needed");
        int need=Scan.nextInt();

        if (need<=200000) {
            System.out.println("I will lend the money");
        }else{
            System.out.println("I will reject the loan");
        }
    }
}
