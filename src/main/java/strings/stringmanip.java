package strings;

public class stringmanip {
    public static void strings(String arg[]) {
        String raining = "yesterday it was raining";
        String sunny = "today it is sunny";
        System.out.println(sunny.toUpperCase() + ", " + raining.toUpperCase());
        System.out.println(sunny.substring(0, 11) + raining.substring(16, 24));
        System.out.println("  ");
        String manipulatableString = "Mortal Kombat was a bit contrived.";
        System.out.println(countLetters(manipulatableString));
        printLetters(manipulatableString);
        printLettersReverse(manipulatableString);
        String trueComparator = "Mortal Kombat was a bit contrived.";
        String falseComparator = "Mortal Kombat was a bit contrived";

        System.out.println(containsString(manipulatableString, falseComparator));
    }

    private static int countLetters(String string) {
        return string.length();
    }

    private static void printLetters(String string) {
        for (int letter = 0; letter < countLetters(string); letter++) {
            System.out.println(string.substring(letter, letter + 1));
        }
    }

    private static void printLettersReverse(String string) {
        for (int letter = countLetters(string); letter > 0; letter--) {
            System.out.println(string.substring(letter - 1, letter));
        }
    }

    private static boolean containsString(String string, String comparator) {
        boolean value = string.equals(comparator);
        return value;
    }
}
