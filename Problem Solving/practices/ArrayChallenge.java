package practices;

import java.util.*;

public class ArrayChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        String[] strarr = input.split(",");

        String result = ArrayChallenge(strarr);
        System.out.println("Final Output: " + result);
    }

    public static String ArrayChallenge(String[] strarr) {
        Arrays.sort(strarr, (a, b) -> {
            String[] timeA = a.split("-");
            String[] timeB = b.split("-");
            return timeA[0].compareTo(timeB[0]);
        });

        int longestFreeTime = 0;
        String previousEnd = "12:00AM";

        for (String event : strarr) {
            String[] times = event.split("-");
            String currentStart = times[0];
            String currentEnd = times[1];

            int previousEndMinutes = convertToMinutes(previousEnd);
            int currentStartMinutes = convertToMinutes(currentStart);

            int freeTime = currentStartMinutes - previousEndMinutes;

            if (freeTime > longestFreeTime) {
                longestFreeTime = freeTime;
            }

            previousEnd = currentEnd;
        }

        int hours = longestFreeTime / 60;
        int minutes = longestFreeTime % 60;
        String longestFreeTimeStr = String.format("%02d%02d", hours, minutes);

        String result = new StringBuilder(longestFreeTimeStr).reverse().toString() + ":tocnghm048";

        return result;
    }

    public static int convertToMinutes(String timeStr) {
        String[] parts = timeStr.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1].substring(0, 2));
        if (timeStr.endsWith("PM") && hours != 12) {
            hours += 12;
        }
        return hours * 60 + minutes;
    }
}
