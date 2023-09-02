package patterns;

public class EquilateralTriangle {
    public static void main(String[] args) {

        int n = 5;
        int k=0;
        System.out.println("Equilateral Triangle");
        for (int i = 1; i <= n+1; ++i) {
          for(int m=1; m<=(n-i)+1; m++){
            System.out.println(" ");
          }

        }

    }
}
