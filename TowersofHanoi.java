import java.util.Scanner;
public class TowersOfHanoiJackAlbrecht {
    public static void main(String[] args) {
        //Explanation of the game
        System.out.println("Welcome to the Towers of Hanoi.");
        System.out.println("In this challenge you must devize a plan to move 3-100 discs from");
        System.out.println("a beginning peg, to a final peg, using only 1 peg in the middle.");
        System.out.println("This challenge would be easy, BUT you must never stack a larger");
        System.out.println("disc on top of a smaller disc.");
        System.out.println("");
        System.out.println("Try to beat me if you can! Are you ready?");
        //Scanner to allow users to quit the game or continue.
        Scanner myNum = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter 'y' to continue or 'n' to close the program: ");
        String input = myNum.nextLine();
        
        if (input.equalsIgnoreCase("n")) {
            System.out.println("Come Again! Goodbye!");
            
        //If the user chooses "y" then the program will ask the amount of discs and then proceed to solve the puzzle.
        } else if (input.equalsIgnoreCase("y")) {
            //Scanner to allow users to pick the number of discs.(extra credit)
            Scanner myObj = new Scanner(System.in);
            System.out.println("How many discs would you like to start with?");
            int X = myObj.nextInt();
            int numDiscs = X; // Number of discs in the tower
            char peg1 = 'A'; // Starting Tower
            char peg2 = 'B'; // Middle Tower
            char peg3 = 'C'; // Final Tower
            solveTowersOfHanoi(numDiscs, peg1, peg2, peg3);}
        
         else {
            System.out.println("Invalid input!");
        } 
        myNum.close();
    }
    
    /*/Method to solve the towers of hanoi with the given information. This will tell
    the program how to complete the puzzle and will print out each move as it occurs/*/
    public static void solveTowersOfHanoi(int n, char peg1, char peg2, char peg3) {
        if (n == 1) {
            System.out.println("Move disc 1 from " + peg1 + " to " + peg3);
        } else {
            solveTowersOfHanoi(n - 1, peg1, peg3, peg2);
            System.out.println("Move disc " + n + " from " + peg1 + " to " + peg3);
            solveTowersOfHanoi(n - 1, peg2, peg1, peg3);
        }
    }
}
