import java.util.*;

public class WordDictionary {

    public void addWord(String word) {
        if (word.length() > 0) {
            char firstLetter = word.charAt(0);
            LetterDictionary.addWord(firstLetter, word);
        }
    }

    public static void main(String[] args) {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("arm");
		dictionary.addWord("buffalo");
        dictionary.addWord("bicke");
        dictionary.addWord("cat");
        dictionary.addWord("dog");
        

        System.out.println("All words: ");
        LetterDictionary.printAllWords();

        System.out.println("\nWords for letter 'b':");
        LetterDictionary.printWordsForLetter('b');
    }
}