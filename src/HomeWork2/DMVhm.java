package HomeWork2;

import java.util.Scanner;

public class DMVhm {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("How old are you?");

        int age= scan.nextInt();
        if (age>=18) {
            System.out.println("You can get a driver license");
        }else{
            System.out.println("You can get a learning permit");
        }
    }
}
