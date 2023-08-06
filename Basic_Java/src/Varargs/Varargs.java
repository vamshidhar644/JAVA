package varargs;

class Calc{
	public int add(int ... n) {
		int sum = 0;
		for(int i : n) {
			sum = sum + i;
		}
		return sum;
	}
}

public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc obj = new Calc();
		System.out.println(obj.add(2, 5, 5, 7, 3));
	}

}
