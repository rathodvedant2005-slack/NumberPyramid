import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 0;

        while (rows < 1 || rows > 9) {
            System.out.print("Enter number of rows (1-9): ");
            String input = sc.nextLine().trim();

            try {
                rows = Integer.parseInt(input);

                if (rows < 1 || rows > 9) {
                    System.out.println("Please enter a number from 1 to 9.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
                rows = 0;
            }
        }

        boolean isCorrect = true;

        System.out.println();

        for (int i = 1; i <= rows; i++) {
            String line = "";

            for (int j = 1; j <= rows - i; j++) {
                line += " ";
            }

            for (int j = 1; j <= i; j++) {
                line += j;
            }

            for (int j = i - 1; j >= 1; j--) {
                line += j;
            }

            System.out.println(line);

            if (!checkRow(line, i, rows)) {
                isCorrect = false;
            }
        }

        System.out.println();

        if (isCorrect) {
            System.out.println("Verification passed: every row is correct (rows checked: " + rows + ")");
        } else {
            System.out.println("Verification failed.");
        }

        sc.close();
    }

    static boolean checkRow(String line, int row, int totalRows) {
        int spaces = 0;

        while (spaces < line.length() && line.charAt(spaces) == ' ') {
            spaces++;
        }

        String numbers = line.substring(spaces);

        if (spaces != totalRows - row) {
            return false;
        }

        if (numbers.length() != 2 * row - 1) {
            return false;
        }

        if (numbers.charAt(row - 1) != (char) ('0' + row)) {
            return false;
        }

        for (int i = 0; i < numbers.length() / 2; i++) {
            if (numbers.charAt(i) != numbers.charAt(numbers.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}