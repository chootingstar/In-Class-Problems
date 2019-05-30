import java.util.Scanner;

public class Age {

  public static void main(String[] args) {        
    Scanner a = new Scanner(System.in);
    int b = 0;
   
    String punk = "old enough to get a tattoo";
    String drunk = "old enough to drink alcohol";
    String jfk = "old enough to run for President of the U.S.";
    String mood = "(cool)";
    System.out.println("Please type your age then hit enter/return:");
   
    int c = a.nextInt();
    a.close();
    
    if (c < 18){
        punk = "too young to get a tattoo";
        b++;
    }
    
    if (c < 21){
        drunk = "too young to drink alchol";
        b++;
    }
    
    if (c < 33){
        jfk = "too young to run for President of the U.S.";
        b++;
    }
    
    if (b == 3){
        mood = "(How sad!)";
    } else if(b == 0){
        mood = "(How great!)";
    }
    
    System.out.println("How old are you? " + c);
    System.out.println("");
    System.out.println("You are:");
    System.out.println("");
    System.out.println("    " + punk);
    System.out.println("");
    System.out.println("    " + drunk);
    System.out.println("");
    System.out.println("    " + jfk);
    System.out.println("");
    System.out.println("        " + mood);
  }

}
