import java.util.*;

class LetterDictionary {
    private static Map<Character, PriorityQueue<String>> map = new TreeMap<>(); //automatically sort the keys

    public static void addWord(char letter, String word) {
		
        map.computeIfAbsent(letter, k -> new PriorityQueue<>()).add(word);
		
    }

    public static void printAllWords() {
        for (char letter : map.keySet()) {
            printWordsForLetter(letter);
        }
    }

    public static void printWordsForLetter(char letter) {
        PriorityQueue<String> words = map.get(letter);
        if (words != null) {
            System.out.println(letter + ": " + words);
        } else {
            System.out.println(letter + ": No words found");
        }
    }
}