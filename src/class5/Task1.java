package class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        write a program ti find the largest number among three
         */
        int number1=1000, number2=200, number3=3000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter 3 numbers ");
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();



        if(number1>number2){
            if(number1>number3){
                System.out.println("Number is largest "+number1);
            }
        }
        if(number2>number1){
            if(number2>number3){
                System.out.println("Number 2 is largest "+number2);
            }
        }
      if(number3>number1){
          if(number3>number2){
              System.out.println("Number 3 is largest "+number3 );
          }
      }
    }
}
