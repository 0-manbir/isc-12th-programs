import java.util.Arrays;

public class Arrange {
  public static void main(String[] args) {
    // Declare and initialize the array
    int[] numbers = {71,40,69,56,19,31,85,99,23,91,59};

    // Sort the array in ascending order
    Arrays.sort(numbers);

    // Find the middle index of the array
    int middleIndex = numbers.length / 2;

    // Create a new array to store the arranged numbers
    int[] arrangedNumbers = new int[numbers.length];

    // Place the highest element in the middle position
    arrangedNumbers[middleIndex] = numbers[numbers.length - 1];

    // Place the 2nd highest element to the left of the middle position
    arrangedNumbers[middleIndex - 1] = numbers[numbers.length - 2];

    // Place the 3rd highest element to the right of the middle position
    arrangedNumbers[middleIndex + 1] = numbers[numbers.length - 3];

    // Place the remaining elements in the array
    for (int i = 0, j = middleIndex - 2, k = middleIndex + 2; i < numbers.length - 3; i++) {
      if (i % 2 == 0) {
        arrangedNumbers[j--] = numbers[i];
      } else {
        arrangedNumbers[k++] = numbers[i];
      }
    }

    // Display the arranged numbers
    for (int num : arrangedNumbers) {
      System.out.print(num + " ");
    }
  }
}
