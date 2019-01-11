
public class Tree extends Plant{
	@Override
	public void gros() {
		System.out.println("Tree is growing");
	}
	
	public void shedLeave() {
		System.out.println("Tree is dying. Dying because you didn't give it water. "
				+ "All its leaves fell off in the summer.\n Try again.");
	}
	
}
