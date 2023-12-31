package inheritance;

class Calculator{ // Super class
	public int add(int i, int j) {
		return i+j;
	}
}

class AdvCalc extends Calculator{ // Sub class
	public int sub(int i, int j) {
		return i-j;
	}
}

class VeryAdvCalc extends AdvCalc{
	public int multi(int i, int j) {
		return i*j;
	}
}

public class Inheritance {
	public static void main(String[] args) {
		VeryAdvCalc c1 = new VeryAdvCalc();
		
		int res1 = c1.add(5, 4);
		int res2 = c1.sub(8, 3);
		int res3 = c1.multi(3, 9);
		
		System.out.println(res1+" "+ res2+" "+res3  );
	}
}
