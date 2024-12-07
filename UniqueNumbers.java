import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 0;

        while (count < 5) {
            System.out.print("Enter a number between 10 and 100: ");
            int input = scanner.nextInt();

            if (input < 10 || input > 100) {
                System.out.println("Error: Number must be between 10 and 100. Try again.");
                continue;
            }

            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (numbers[i] == input) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                numbers[count] = input;
                count++;
            }

            System.out.print("Unique values entered so far: ");
            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
