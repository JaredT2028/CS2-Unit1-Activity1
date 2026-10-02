import java.util.Scanner;
public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");
      Scanner scan = new Scanner(System.in);

      String adjective1 = "very";
      String place1 = "Harvard Pre-College";
      String verb1 = "Study";
      String adjective2 = "delicous!";
      String place2 = "pizza places";
      String verb2 = "went";
      String adjective3 = "hard";
      String place3 = "home";
      String verb3 = "went";
      String adjective4 = "incredibly";

      String sentence1 = "Over the summer, I went to " + place1 + " to " + verb1 +" economics! ";
      String sentence2 = "I went to Harvard with a friend which made it " + adjective1 + " exiting and fun. ";
      String sentence3 = " We " + verb2 + " to all of the very famous " + place2 + " and they were all incredibly " + adjective2;
      String sentence4 = " When it was over me and my friend " + verb3 + place3 + " and spent the rest of our summers doing our " + adjective3 + " computer science summer work. ";
      String sentence5 = " Now I am at schoold and I am " + adjective4 + " bored. ";

      System.out.print(sentence1);
      System.out.print(sentence2);
      System.out.print(sentence3);
      System.out.print(sentence4);
      System.out.print(sentence5);

      System.out.print("Enter an adjective: ");
      adjective1 = scan.nextLine();

      System.out.print(adjective1);
   }
}
