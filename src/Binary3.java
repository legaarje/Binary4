import java.util.InputMismatchException;
import java.util.Scanner;

public class Binary3 {

    public static void main(String[] args) {

        int posint = 0;

        System.out.println("\n this program will convert a positive integer to binary number");
        Scanner console = new Scanner(System.in);
        console.useDelimiter("\n");


        boolean tjek = false;

        while(tjek == false) {
            try {
                System.out.println("\n Please enter a positive integer (max 32bits)");
                posint = console.nextInt();

                if (posint >= 0) {
                    tjek = true;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("You did not enter a positive integer of maximum 32bits, pls try again");
                console.nextLine(); //why does this have to be nextLine and not nextInt??
            }
        }

        String str = "";
        while(posint != 0) {
            int rem = posint % 2;
            str = rem + str;
            posint = posint / 2;
        }

        System.out.println(str);

    }
}
