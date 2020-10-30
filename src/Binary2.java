import java.util.InputMismatchException;
import java.util.Scanner;

public class Binary2 {

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

        int binaryArray[] = new int[32]; //Array with 32 spaces, because we use 32bit integer
        int index = binaryArray.length-1; //used to store value
        while(posint != 0) { //loop runs aslong as not 0
            binaryArray[index] = posint % 2; //math to store residual

            posint = posint/2; //countdown for entry amount
            index--;  //index countdown
        }

        for (int n : binaryArray) {  //code which is used with for loop in arrays to sort
            System.out.print(n); //print of array
        }

    }
}
