package exercise;

import java.util.Arrays;
import java.util.ArrayList;

// BEGIN
class App{
    public static boolean scrabble(String symbols, String word) {
        if (word.isEmpty()) {
            return true;
        }
        if (symbols.isEmpty()) {
            return false;
        }
        var lowerCaseWorld = word.toLowerCase();
        char[] letters = lowerCaseWorld.toCharArray();
        for (char letter :
                letters) {
            if (!symbols.contains(Character.toString(letter))) return false;
            symbols = symbols.replaceFirst(Character.toString(letter), "");
        }
        return true;
    }
}
//END
