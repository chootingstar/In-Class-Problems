
public class Botony {
	public static void main(String args[]) {
		
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		Orchid orch = new Orchid();
		Oak oak = new Oak();
		Tree tree2 = new Oak();
		
		//polymorphism guarantees that we can use a child class wherever a parent class is expected.
		Plant plant2 = tree;
		Plant plant3 = orch;
		
		plant2.gros();//plant2 references a Tree, so the Tree gros() method is called.
		plant1.gros();
		plant3.gros();
		
		//type of reference decides what methods you can actually call
		//we need a Tree-type reference to call tree-specific methods
		tree.shedLeave();
		
		orch.blooms();
		
		oak.growNuts();
		tree2.shedLeave();
		
		//doesn't work for the reason above. For this is a Plant-type reference
		//plant2.shedLeave();
		
		//It calls doGrow with the plant parameter. tree is a plant, and has implicitly done the same
		//as Plant plant2 = tree;
		doGrow(tree);
		doGrow(orch);
		doGrow(oak);
		doGrow(tree2);
	}
	
	public static void doGrow(Plant plant) {
		plant.gros();
	}
}
