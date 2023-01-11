package HomeWork2;

public class TNumber1 {
    public static void main(String[] args) {

        boolean diploma = true;
        double gpa = 3.4;
        if (diploma) {
            System.out.println("Congratulation!");
            if (gpa > +3.5) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should studied harder ");
            }
        } else {
            System.out.println("You should get a degree");
        }
    }

}

