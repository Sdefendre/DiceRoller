# Dice Roller Stats

## Project Overview
Dice Roller Stats is a Java-based application that simulates the rolling of a pair of six-sided dice. It calculates and displays statistics about the outcomes of a series of dice rolls, highlighting the probability distribution of the sums of the dice.

### Author
- Steve Defendre

### Date Due
- 11/30/2023

## Features
- Simulates rolling a pair of dice a user-defined number of times.
- Calculates and displays the frequency of each dice sum that occurs.
- Shows the percentage representation of each sum in relation to the total rolls.
- Filters out dice sums that do not occur in the series of rolls.

## How to Run
1. Ensure you have Java installed on your machine.
2. Download the source files (`DiceRoller.java`, `Indicator.java`, `MainApp.java`, `Validator.java`) from the project repository.
3. Compile the Java files. You can do this using a command like `javac MainApp.java` in your terminal or command prompt.
4. Run the compiled program using `java MainApp`.
5. Follow the on-screen prompts to enter the number of dice rolls.

## Components
- `MainApp.java`: The entry point of the application. Handles user input and overall program flow.
- `DiceRoller.java`: Responsible for simulating dice rolls and collecting statistics.
- `Indicator.java`: Manages the data structure for each dice pair total.
- `Validator.java`: Handles user input validation.

## Testing
The application has been tested with various input scenarios to ensure accuracy, especially in percentage calculations and the filtering mechanism.

## Modifications and Enhancements
- Filtering mechanism to exclude non-occurring dice sums.
- Addition of a descriptive report header in the output.
- Implementation of percentage calculations for each dice sum.

## Future Improvements
- Enhance the user interface for a more interactive experience.
- Implement additional statistical measures such as median, mode, and standard deviation.
- Allow for different types of dice to be used, not just six-sided.

## License
this project is open sourced and available under the MIT license . 

