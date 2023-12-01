public class ValidWordsCounter {
    public static int countValidWords(String s) {
        String[] words = s.split(" ");
        int validWords = 0;

        for (String word : words) {
            if (isValidWord(word)) {
                validWords++;
            }
        }

        return validWords;
    }

    public static boolean isValidWord(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        return hasVowel && hasConsonant;
    }

    public static boolean isVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }

    public static void main(String[] args) {
        String s = "This is an example string 234";
        int validWords = countValidWords(s);
        System.out.println(validWords);
    }
}
