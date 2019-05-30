
public class PlasticDuck implements ToyFace {
	public void sound(String bird) {
		Sparrow egg = new Sparrow();
		if(bird.equals("sparrow")) {
			egg.makeSound();
		}
		else {
			System.out.println("Squeak!");
		}
	}
}
