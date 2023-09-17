package practices;

public class SearchingChallenge {
    public static String searchingchallenge(String str) {
        String longestPattern = "";
        
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (substring.matches("(.+)\\1")) {
                    String repeatedPart = substring.replaceAll("(.+)\\1", "$1");
                    
                    if (repeatedPart.length() > longestPattern.length()) {
                        longestPattern = repeatedPart;
                    }
                }
            }
        }
        
        if (!longestPattern.isEmpty()) {
            return "yes " + longestPattern;
        } else {
            return "no null";
        }
    }

    public static void main(String[] args) {
        System.out.println(searchingchallenge("da2kr32a2")); // Output: yes a2
        System.out.println(searchingchallenge("sskfssbbb9bbb")); // Output: yes bbb
    }
}
