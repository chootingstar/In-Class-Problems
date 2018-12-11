public class Age {

  public static void main(String[] args) {        
    int a = 17;
    int b = 0;
   
    String punk = "old enough to get a tattoo";
    String drunk = "old enough to get a tattoo";
    String JFK = "old enough to run for President of the U.S.";
    String mood = "(cool)";
    
    if (a < 18){
        punk = "too young to get a tattoo";
        b++;
    }
    
    if (a < 21){
        drunk = "too young to drink alchol";
        b++;
    }
    
    if (a < 33){
        JFK = "too young to run for President of the U.S.";
        b++;
    }
    
    if (b == 3){
        mood = "(How sad!)";
    } else if(b == 0){
        mood = "(How great!)";
    }
    
    System.out.println("How old are you? " + a);
    System.out.println("");
    System.out.println("You are:");
    System.out.println("");
    System.out.println("    " + punk);
    System.out.println("");
    System.out.println("    " + drunk);
    System.out.println("");
    System.out.println("    " + JFK);
    System.out.println("");
    System.out.println("        " + mood);
  }

}