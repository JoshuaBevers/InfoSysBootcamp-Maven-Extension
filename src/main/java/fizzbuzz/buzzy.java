package fizzbuzz;

public class buzzy {
    public static String fizzybuzz() {
        int num = 9;
        String word = "";
        if (num % 3 == 0) {
            word += "fizz";
        }
        if (num % 5 == 0) {
            word += "buzz";
        }

        return word;
    }
}
