package Virtusa;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "VamshidharDawoor";

        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (s.indexOf(str.charAt(i)) == -1) {
                s += str.charAt(i);
            }
        }

        System.out.println(s);
    }
}
