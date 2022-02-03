import java.util.Scanner;
public class Objective9Lab3{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
      printmenu();

      selection = scanner.nextInt();

      if(selection == 1){
      System.out.println("Whats up my dude.");
}
      else if(selection == 2){
      System.out.println("Wings, Tacos & Spaghetti.");
}
      else if(selection == 3){
      System.out.println("Hasta luego.");
      break;
    }
    }
    scanner.close();
  }

  public static void printmenu(){
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }


}
