import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToyMain {
	public static void main(String[] args) throws IOException {
		BufferedReader tb = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Type sparrow");
		String bird = tb.readLine();
			PlasticDuck quack = new PlasticDuck();
			quack.sound(bird);
	}
}
