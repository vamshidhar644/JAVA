package Virtusa;

public class DateIdentifier {
    public static void main(String[] args) {
        String str = "UN was established on 24-10-1945. India got freedom on 15-08-1947";
        String temp = "";

        int c1 = 0, c2 = 0;

        for (int i = 0; i < str.length(); i++) {
            String dum = "";
            if (str.charAt(i) == '-') {
                c1++;
            }

            if (c1 % 2 == 0 && c1 != 0 && str.charAt(i) == '-') {
                dum += str.charAt(i + 1);
                dum += str.charAt(i + 2);
                dum += str.charAt(i + 3);
                dum += str.charAt(i + 4);

                if (temp.indexOf(dum) == -1) {
                    temp += dum;
                    c2++;
                    i = i + 4;
                }
            }
        }

        System.out.println(c2);
    }
}
