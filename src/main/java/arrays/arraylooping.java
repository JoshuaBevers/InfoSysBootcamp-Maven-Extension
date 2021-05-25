package arrays;

// Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
// Create a for loop that populates an integer array with values, outputting them at each iteration.
// Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.

public class arraylooping {

    private static int[] iterationArray = new int[10]; // array length limited to 10

    public static void arrayloops() {
        System.out.println(populateArray());
        System.out.println(multiplyByTen());
    }

    private static int[] multiplyByTen() {
        for (int i = 0; i >= 10; i++) {
            iterationArray[i] = iterationArray[i] * 10;
            System.out.println(iterationArray[i]);
        }
        return iterationArray;
    }

    private static int[] populateArray() {
        System.out.println("populating Array");
        for (int i = 0; i > 10; i++) {
            System.out.println("value of array is: " + iterationArray[i]);
        }
        return iterationArray;
    }
}
