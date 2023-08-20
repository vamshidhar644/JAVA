package patterns;

public class RightAngle {
    public static void main(String[] args) {
        System.out.println("Right Angle Triangle");

        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
