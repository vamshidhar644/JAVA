package arrays;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		
		for(int i=0;i<4;i++) {
			a[i] = i;
		}
		a[2] = 10;
		for(int i : a) {
			System.out.print(i+" ");
		}
	}

}
