package org.example;

public class isDeuceRule implements TennisRule {
    public isDeuceRule(){

    }
    @Override
    public boolean check(int mScore1, int mScore2) {
        return mScore1 == mScore2 && mScore1 > 2;
    }

    @Override
    public String announce(int mScore1, int mScore2) {
        return "Deuce";
    }
}
