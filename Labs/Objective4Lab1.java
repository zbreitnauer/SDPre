import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your name");
    String fname = keyboard.nextLine();

    System.out.println("What is your last name.");
    String lname = keyboard.nextLine();

    System.out.println("What is your favorite animal.");
    String animal = keyboard.nextLine();

    System.out.println("What is your favorite food.");
    String food = keyboard.nextLine();

    System.out.println("What is your favorite song.");
    String song = keyboard.nextLine();

    System.out.println("My name is " + fname + " " + lname + ".");
    System.out.println("My favorite animal is " + animal + ".");
    System.out.println("My favorite food is " + food + ".");
    System.out.println("My favorite song is " + song + ".");




  }
}
