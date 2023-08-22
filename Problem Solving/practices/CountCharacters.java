import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input data and coder character
        String data = scanner.nextLine();
        char coder = scanner.nextLine().charAt(0);

        // Calculate the count and print
        int characterCount = countCharacter(data, coder);
        System.out.println(characterCount);
    }

    public static int countCharacter(String data, char coder) {
        int count = 0;
        for (char c : data.toCharArray()) {
            if (c == coder) {
                count++;
            }
        }
        return count;
    }
}
