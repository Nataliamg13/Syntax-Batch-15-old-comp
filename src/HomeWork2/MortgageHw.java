package HomeWork2;

public class MortgageHw {
    public static void main(String[] args) {
        double mortgageRate=4.0;
        int housePrice=38000;
        if(mortgageRate<4.5){
            System.out.println("I will buy a house");
            if(housePrice>20000) {
                System.out.println("I will take a loan");
            }else {
                System.out.println("I will pay cash!");
            }
            }else{
            System.out.println("I will not buy a house :(");

            }
        }


    }

