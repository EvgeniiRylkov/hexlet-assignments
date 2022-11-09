package exercise;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        if (word.isEmpty()) {
            return true;
        }
        if (symbols.isEmpty()) {
            return false;
        }
        var lowerCaseWorld = word.toLowerCase();
        String[] letters = lowerCaseWorld.split("");
        for (String letter
                : letters) {
            if (!symbols.contains((letter))) {
                return false;
            }
            symbols = symbols.replaceFirst((letter), "");
        }
        return true;
    }
}
//END
