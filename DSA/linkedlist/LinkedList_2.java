package linkedlist;
import java.util.LinkedList;

public class LinkedList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animals = new LinkedList<>();
		
		// add() method without the index parameter
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Cow");
	    System.out.println("LinkedList: " + animals);
	    
	    // add() method with the index parameter
	    animals.add(2, "Horse");
	    System.out.println("LinkedList: " + animals);
	    
	    // get the element from the linkedlist
	    String anim = animals.get(1);
	    System.out.println("anim: " + anim);
	    
	    // change element at index 3
	    animals.set(1, "Lion");
	    System.out.println("updated LinkedList: " + animals);
	    
	    // remove elements from index 2
	    animals.remove(2);
	    System.out.println("LinkedList: " + animals);
	    
	}

}
