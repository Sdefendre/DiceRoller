/*
Assignment Number: 7
Assignment Title: Dice Roller Stats
Program Author: Steve Defendre
date due: 11/30/2023
*/

package DiceRoller;

import java.util.Arrays;

public class MainApp {
    
    public static void main(String[] args) {
        System.out.println( "Welcome to the Dice Roll Stats Calculator!" );
        int seriesLength = Validator.getInt("How many times to roll the dice? (zero to exit) ");
        while( seriesLength > 0 ) {
            DiceRoller diceRoller = new DiceRoller(seriesLength);
            diceRoller.collectStats();
            diceRoller.printIndicators();
            seriesLength = Validator.getInt("How many times to roll the dice? (zero to exit) ");
        }
    }//main

}//class MainApp
