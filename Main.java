import java.util.Scanner;

/**
 * This program will determine weather they can 
 * drive or not
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    //constant for legal driving age
    final int DRIVING_AGE = 16;
    // constant for legal voting age
    final int VOTING_AGE = 18;

    // get users age 
    System.out.println("Please enter your age:");
    int age = input.nextInt();

    // check to see if they are old enough to drive
    if (age >= VOTING_AGE) {
      System.out.println("You are old enough to drive!");
      System.out.println("You are old enough to vote!");
      else if (age >= DRIVING_AGE) {
        System.out.println("You are old enough to drive!");
        System.out.println("You are not old enough to vote");
      }
    } else {
      System.out.println("Sorry, you are not old enough to drive!");
      System.out.println("You also cant vote...:(");
    }
    
  }
}
