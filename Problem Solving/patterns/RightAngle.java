package patterns;

public class RightAngle {
    public static void main(String[] args) {
        System.out.println("Right Angle Triangle");
        
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
