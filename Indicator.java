/*
Assignment Number: 7
Assignment Title: Dice Roller Stats
Program Author: Steve Defendre
date due: 11/30/2023
*/

package DiceRoller;

// an Indicator object holds information
// about how many times a specific pair total
// has rolled in a series of dice pair rolls
public class Indicator implements Comparable<Indicator> {
    //-------------------------------
    // data attributes
    //-------------------------------

    // given that we have a pair of cube dice,
    // the dice pair total can be one of the following:
    // 1+1, 1+2, ..., 1+6,
    // 2+1, 1+2, ..., 2+6,
    // ...
    // 6+1, 6+2, ..., 6+6
    // We make dicePairTotal a constant variable,
    // because each indicator object holds count
    // for a specific pair total:
    private final int dicePairTotal;
    
    // pair count indicates how many times
    // each specific dice pair has rolled
    // in a series of dice pair rolls:
    private int dicePairCount;
    
    //-------------------------------
    // constructors
    //-------------------------------
    public Indicator( int dicePairTotal ) {
        this.dicePairTotal = dicePairTotal;
        this.dicePairCount = 0;
    }//Indicator
    
    //-------------------------------
    // operations
    //-------------------------------
    public void updateStats() {
        ++dicePairCount;
    }//updateStats
    
    //-----------------------------------------
    // Comparable<Indicator> implementation
    //-----------------------------------------
    @Override
    public int compareTo( Indicator another ) {
        if ( this.dicePairCount < another.dicePairCount ) {
            return -1;
        } else if ( this.dicePairCount == another.dicePairCount ) {
            return 0;
        } else {
            return 1;
        }
    }//compareTo

    //-------------------------------
    // getters for data attributes
    //-------------------------------
    public int getDicePairTotal() {
        return dicePairTotal;
    }

    public int getDicePairCount() {
        return dicePairCount;
    }

}//class Indicator
