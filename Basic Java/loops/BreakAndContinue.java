package loops;

public class BreakAndContinue {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i == 7) {
				continue;
			}
			System.out.println("value: "+i);
		}
	}
}
