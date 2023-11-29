/*
Assignment Number: 7
Assignment Title: Dice Roller Stats
Program Author: Steve Defendre
date due: 11/30/2023
*/


package DiceRoller;

import java.util.Arrays;

public class DiceRoller {

    //-------------------------------
    // constants
    //-------------------------------
    public static final int CUBE_DICE_SIDES = 6;
    
    // given that we have a pair of cube dice,
    // and because we roll two dice,
    // all possible dice pair combinations are:
    // 1+1, 1+2, ..., 1+6,
    // 2+1, 2+2, ..., 2+6,
    // 3+1, 3+2, ..., 3+6,
    // ...
    // 6+1, 6+2, ..., 6+6
    // STATS_DISTRIBUTION_LENGTH a constant variable
    // that specifies how many statistical indicators
    // we need to accommodate all statistical data
    // for each possible pair total. Because we store
    // stat indicators in a Java array, we add one to
    // the length because Java arrays are zero-based:
    public static final int STATS_DISTRIBUTION_LENGTH = CUBE_DICE_SIDES * 2 + 1;

    //-------------------------------
    // data attributes
    //-------------------------------
    private int[] rollSeries;
    private Indicator[] statIndicators;

    //-------------------------------
    // constructors
    //-------------------------------
    public DiceRoller(int seriesLength) {
        // simulate a series of dice pair rolls:
        rollSeries = new int[seriesLength];
        for (int idx = 0; idx < seriesLength; ++idx) {
            rollSeries[idx]
                    = Validator.getRandomInt(1, CUBE_DICE_SIDES)
                    + Validator.getRandomInt(1, CUBE_DICE_SIDES);
        }

        // create statistical indicators
        statIndicators = new Indicator[STATS_DISTRIBUTION_LENGTH];
        for (int idx = 0; idx < STATS_DISTRIBUTION_LENGTH; ++idx) {
            statIndicators[idx] = new Indicator(idx);
        }
    }//DiceRoller

    //-------------------------------
    // operations
    //-------------------------------
    public void collectStats() {
        for (int idx = 0; idx < rollSeries.length; ++idx) {
            int dicePairTotal = rollSeries[idx];
            Indicator indicator = statIndicators[dicePairTotal];
            indicator.updateStats();
        }
        Arrays.sort(statIndicators);
    }//collectStats

    public void printIndicators() {
        // Calculate total number of rolls
        int totalRolls = Arrays.stream(rollSeries).sum();

        // Print report header
        System.out.println("Dice Pair Total	Roll Count	Percent");
        System.out.println("---------------	----------	-------");

        for (Indicator indicator : statIndicators) {
            int count = indicator.getDicePairCount();
            if (count > 0) {
                double percent = (double) count / totalRolls * 100;
                System.out.printf("%d		%d		%.2f%%
", indicator.getDicePairTotal(), count, percent);
            }//printIndicators

}//class DiceRoller
