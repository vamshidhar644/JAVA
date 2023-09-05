package TCS;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1609;

        if (n % 9 == 0) {
            System.out.println("9");
        } else {
            System.out.println(n % 9);
        }

    }
}
