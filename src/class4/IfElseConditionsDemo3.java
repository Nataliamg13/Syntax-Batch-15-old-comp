package class4;

public class IfElseConditionsDemo3 {
    public static void main(String[] args) {

        int day = 8; // Assign a value to a variable

        if (day == 1) { // we compare two values       //"If" block of code
            System.out.println("Monday");
        } else if (day == 2) {                             // Else Block of code
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }else{
            System.out.println("Please enter a day between 1 and 7");


        }
    }
}
