import java.util.InputMismatchException;
import java.util.Scanner;


public class Binary {

    public static void main(String[] args) {

        int posint = 0; //assigned variable

        System.out.println("\n this program will convert a positive integer to binary number");
        Scanner console = new Scanner(System.in);  //scanner
        console.useDelimiter("\n");  //give error with entered space (new line entered with white space)


        boolean tjek = false; //start out as false and boolean will only stop if true

        while(tjek == false) {
            try {
                System.out.println("\n Please enter a positive integer (max 32bits)");
                posint = console.nextInt();

                if (posint >= 0) {  //kontrollere for negative tal
                    tjek = true;
                }
            }


            catch (InputMismatchException e) {
                System.out.println(("You did not enter a positive integer of maximum 32bits, pls try again")); //exception
                console.nextLine(); //call scanner method
            }
        }


        String binaryString = Integer.toBinaryString(posint);
        System.out.println(binaryString);

    }
}
