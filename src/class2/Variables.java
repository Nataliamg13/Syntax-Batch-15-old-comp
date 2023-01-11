package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Bellow line is reserving a box in the computers memory .
        We are calling it a box1 if we need the information that we are storing inside this box
        we can simple say to the computer give us the contents of box1...
        int=> what type of data we  want to store
        box1 is the name of the box
        = sign will take whatever we write after it and will store it inside the box1
        10=> is what we store it inside the box
         */
      int box1=10;

        System.out.println(box1);// bring the contents of the box1 and print them on the console
        /* To store whole numbers(Numbers without decimals points) we have 4 different types of boxes.
        for example numbers 10 20 3000 100000 330000
        1) byte 2) short 3) int 4) long
         */
        byte box2=127;  // range for byte is from -128 to 127 if we need to store larger numbers we should try short
        byte box3=-128;
        short box4=32767;
        short box5=-3256;
        int biggerBox=123456484;  // most common type of the box
        long  maxBox=1215651614654l;

        short myBox=10000;
      System.out.println(myBox);


    }
}
