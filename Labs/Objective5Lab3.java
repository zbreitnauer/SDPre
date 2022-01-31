import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    System.out.println("Please enter a number.");
    Double num = kb.nextDouble();

    if(num >= 0){
      System.out.println("The number is positive.");
}
      else{
        System.out.println("The number is negative.");
      }


  }
}
