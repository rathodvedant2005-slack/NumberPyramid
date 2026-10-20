---Number Pyramid

--About the Project

This is a simple Java program that prints a number pyramid based on the number of rows entered by the user. It uses nested loops to create the pattern and checks each row to make sure the pyramid is printed correctly.

--Pattern Used

The program prints a number pyramid where the numbers increase up to the middle and then decrease.

For example, if the user enters `5`, the output looks like this:

text
    1
   121
  12321
 1234321
123454321


--Features

- The user can choose the number of rows, from 1 to 9.
- The program checks the input and displays an error message if it is invalid.
- It uses nested `for` loops to print spaces and numbers.
- Each row is checked to make sure the spacing and number pattern are correct.
- At the end, the program displays whether the verification passed or failed.

--How It Works

- First, the program asks the user to enter the number of rows.
- It checks whether the input is a valid whole number between 1 and 9.
- It uses loops to print the spaces needed to align the pyramid.
- The numbers increase from 1 to the current row number and then decrease back to 1.
- After printing each row, the `checkRow()` method verifies its spacing, length, middle number, and symmetry.
- Finally, the program displays a message indicating whether all rows passed the verification.

--Concepts Used

- Java basics
- `Scanner` for user input
- `while` loop for input validation
- Nested `for` loops for pattern printing
- `try-catch` for handling invalid input
- Strings and character comparison
- Methods and Boolean values
- Conditional statements for checking the pattern

--How to Run the Program

--Step 1: Save the code in a file named `NumberPyramid.java`.

--Step 2: Open a terminal in the folder where the file is saved.

--Step 3: Compile the program:


javac NumberPyramid.java

--Step 4: Run the program:

java NumberPyramid

--Step 5: Enter a number between 1 and 9 when prompted.

---Example Output

text
Enter number of rows (1-9): 4

   1
  121
 12321
1234321

Verification passed: every row is correct (rows checked: 4)

--What I Learned

While working on this project, I practised using loops to create patterns, handling user input, and checking whether the output follows the expected structure. It also helped me understand how to break a problem into smaller steps and verify the result using a separate method.

This project is a small example of how Java can be used to print patterns and check the correctness of the output. It combines basic programming concepts with input validation and simple verification logic.
