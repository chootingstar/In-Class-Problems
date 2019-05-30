import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;
public class CardStack {
	public static void main(String[] args) {
		Stack<String> deck = new Stack<>();
	
		deck.push("Jack");
		deck.push("Queen");
		deck.push("King");
		deck.push("Ace");
		
		System.out.println(deck.pop());
		System.out.println(deck);
		System.out.println(deck.peek());
		System.out.println(deck);
		
		deck.push("Ace");
		
		System.out.println();
		System.out.println(deck.search("Queen"));
		System.out.println(deck.empty());
		System.out.println(deck.size());
		
		System.out.println();
		deck.forEach((n) -> System.out.println(n));
		
		
		
	}
}
