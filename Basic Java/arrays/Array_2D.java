package arrays;

public class Array_2D {

	public static void main(String[] args) {
		int arr[][] = {
						{1,2,3,4}, 
						{2,4,4}, 
						{3,6,5,7}
					};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

}
