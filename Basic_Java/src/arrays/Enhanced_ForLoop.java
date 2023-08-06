package arrays;

public class Enhanced_ForLoop {
	public static void main(String[] args) {
		int ar[] = {1, 3, 5, 6};
		
		for(int k : ar) {
//			System.out.println(k);
		}
		
		int arr[][] = {
				{1,2,3,4}, 
				{2,4,4}, 
				{3,6,5,7}
			};
		for(int k[] : arr) {
			for(int j : k) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
