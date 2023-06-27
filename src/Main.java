import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int first;         //num first
        int second;          //num second

        System.out.print("Enter a number");   //output "Enter a number"
        in.hasNextInt();                    //user input
        first = in.nextInt();
        System.out.print("Enter a second number");  //output enter second number
        in.hasNextInt();                    //user input
        second = in.nextInt();
        if (first == second) {
            System.out.println("Equal");        //if first = second output equal
        } else if (first > second) {              //if first > second
            System.out.println("The lesser number: " + second);  //output lesser number second
        } else if (second > first) {              //if second > first
            System.out.println("The lesser number: " + first);       //output lesser number first
        }
        else {
            System.out.println("You must enter a number. Try again.");
        } //end if
    }//end main
} //end class