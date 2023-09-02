package practices;

import java.util.*;

public class ValidIp {

    public static boolean checkIP(String str) {

        String[] ips = str.split("\\.");

        if (ips.length == 4) {
            boolean isValid = true;
            for (int i = 0; i < 4; i++) {
                try {
                    int value = Integer.parseInt(ips[i]);
                    System.out.println(value);
                    if (value < 0 || value > 255) {
                        isValid = false;
                        break;
                    }
                } catch (NumberFormatException e) {
                    isValid = false;
                    break;
                }
            }
            return isValid;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // while (sc.hasNext()) {
            String ip = "249.249.249.256";

            System.out.println(checkIP(ip) ? "true" : "false");
        // }
    }
}