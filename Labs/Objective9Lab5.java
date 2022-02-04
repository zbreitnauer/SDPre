import java.util.Scanner;
public class Objective9Lab5{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    double num1, num2;
    boolean Keepgoing = true;
    int choice;
    double answer = 0.0;

    System.out.print("Please enter a number: ");
    num1 = kb.nextDouble();

    System.out.print("Please enter another number: ");
    num2 = kb.nextDouble();

    while (Keepgoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {

            default: System.out.print("Invalid, Please choose a number between 1 - 4 ");
                     break;
            case 1:  answer = findsum(num1 , num2);
                      System.out.print(num1 + " + " + num2 + " = " + answer);
                     break;
            case 2:  answer = findavg( num1 , num2);
                      System.out.print("The average of " + num1 + " and " + num2 + " is: " + answer);
                     break;
            case 3:  answer = calctax(num1 , num2);
                      System.out.print("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + answer);
                     break;
            case 4:  System.out.print("You chosen to quit");
                     return;


}
}
}
    public static void printMenu(){
      System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();

    }

    public static double findsum(double x, double y){
      double sum = x + y;
      return sum;
    }
    public static double findavg( double x , double y){
      double avg = (x + y)/2;
      return avg;
    }
    public static double calctax( double x, double y){
      double tax = (x + y)*.0831;
      return tax;
    }
}
